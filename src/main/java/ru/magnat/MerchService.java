package ru.magnat;

import ru.magnat.pojo.RefUser;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/merch")
public class MerchService {

    @GET
    @Path("/ref_user")
    @Produces(MediaType.APPLICATION_JSON)
    public RefUser getTrackInJSON() {

        RefUser refUser = new RefUser();
        refUser.setId("1");
        refUser.setLogin("egorova.sr@magnat.ru");
        refUser.setPassword("esr231");

        return refUser;

    }

}