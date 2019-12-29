package org.vergerio.model.rest;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import org.vergerio.model.Teacher;
import org.vergerio.model.persistence.TeacherHelper;

@Path("/teachers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TeacherResource {

    @Inject
    TeacherHelper helper;

    @GET
    public List<Teacher> list() {
        return helper.list();
    }

    @POST
    public List<Teacher> add(Teacher teacher) {
        helper.add(teacher);
        return list();
    }

}
