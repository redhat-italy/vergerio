package org.vergerio.model.persistence;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import org.vergerio.model.Teacher;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class TeacherHelper {
    @Inject
    MongoClient mongoClient;

    public List<Teacher> list(){
        List<Teacher> list = new ArrayList<>();
        MongoCursor<Document> cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                Teacher teacher = new Teacher();
                teacher.setName(document.getString("name"));
                teacher.setEmail(document.getString("email"));
                list.add(teacher);
            }
        } finally {
            cursor.close();
        }
        return list;
    }

    public void add(Teacher teacher){
        Document document = new Document()
                .append("name", teacher.getName())
                .append("email", teacher.getEmail());
        getCollection().insertOne(document);
    }

    private MongoCollection getCollection(){
        return mongoClient.getDatabase("school").getCollection("teachers");
    }
}
