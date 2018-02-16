package main.java.app.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.java.app.data.TranslateService;
import main.java.Processors.Word;

/**
 * Created by snu on 2018-02-15.
 */
@Component
@Path("/translate")
@Produces("application/json")
public class WordSearchEndPoint {
    @Autowired
    private TranslateService translateService;

    @Path("/langcodes/{langCode}")
    @GET
    public Response getByLangCode(@PathParam("langCode") final String langCode) {
        final Word word = translateService.getByLangCode(langCode);
        return Response.ok(word).build();
    }

    @Path("/langcodes")
    @GET
    public Response getAllWords() {
        return Response.ok(translateService.getAllWords()).build();
    }

    @Path("/{text}/{translateTo}")
    @GET
    public Response getTranslation(@PathParam("text") final String text, @PathParam("translateTo") final String translateTo) {
        return Response.ok(translateService.getTranslation(translateTo, text)).build();
    }
}
