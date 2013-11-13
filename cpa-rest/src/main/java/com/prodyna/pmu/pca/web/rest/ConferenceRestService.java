/*
 * $Id$
 * Copyright 2013 PRODYNA AG
 */
package com.prodyna.pmu.pca.web.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.prodyna.pmu.cpa.Conference;

/**
 * Interface and JAX-RS definition for the {@code Conference} CRUD REST service.
 *
 * @author <a href="mailto:pmueller@prodyna.com">pmueller@prodyna.com</a>
 */
@Path("conference")
public interface ConferenceRestService extends RestService<Conference> {

	/**
	 * Returns a list of all available object.
	 * <p>
	 * Note that the implementation is free to limit the number of object returned by this service method.
	 *
	 * @return a list of objects, possibly empty.
	 */
	@GET @Produces(MediaType.APPLICATION_JSON)
	public Iterable<Conference> list();
	
	/**
	 * Returns the object with the specified object identifier.
	 *
	 * @param objectId The identifier of the object to return.
	 * @return the corresponding object.
	 */
	@GET @Path("{objectId}") @Produces(MediaType.APPLICATION_JSON)
	public Conference read(@PathParam("objectId") String objectId);
	
	/**
	 * Inserts a new object.
	 *
	 * @param object The object to store.
	 * @return the stored object.
	 */
	@POST @Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
	public Conference create(Conference object);
	
	/**
	 * Updates an existing object identified by the specified identifier.
	 *
	 * @param objectId The identifier of the object to update.
	 * @param object The object with which to update.
	 * @return the updated object.
	 */
	@PUT @Path("{objectId}") @Consumes(MediaType.APPLICATION_JSON) @Produces(MediaType.APPLICATION_JSON)
	public Conference update(@PathParam("objectId") String objectId, Conference object);
	
	/**
	 * Deletes the object with the specified identifier.
	 *
	 * @param objectId The identifier of the object to delete.
	 * @return the deleted object.
	 */
	@DELETE @Path("{objectId}") @Produces(MediaType.APPLICATION_JSON)
	public Conference delete(@PathParam("objectId") String objectId);
}
