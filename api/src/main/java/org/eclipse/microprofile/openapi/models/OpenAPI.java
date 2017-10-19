/**
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eclipse.microprofile.openapi.models;

import java.util.List;

import org.eclipse.microprofile.openapi.models.info.Info;
import org.eclipse.microprofile.openapi.models.media.Schema;
import org.eclipse.microprofile.openapi.models.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.models.security.SecurityScheme;
import org.eclipse.microprofile.openapi.models.servers.Server;
import org.eclipse.microprofile.openapi.models.tags.Tag;

/**
 * OpenAPI
 * <p>
 * This is the root document object of the OpenAPI document. It contains the
 * following required and optional fields.
 * <table border=1>
 * <tr>
 * <td>Field Name</td>
 * <td>Type</td>
 * <td>Description</td>
 * </tr>
 * <tr>
 * <td>openapi</td>
 * <td>String</td>
 * <td>REQUIRED. This string MUST be the semantic version number of the OpenAPI
 * Specification version that the OpenAPI document uses. The openapi field
 * SHOULD be used by tooling specifications and clients to interpret the OpenAPI
 * document. This is not related to the API info.version string.</td>
 * </tr>
 * <tr>
 * <td>info</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.info.Info Info}</td>
 * <td>REQUIRED. Provides metadata about the API. The metadata MAY be used by
 * tooling as required.</td>
 * </tr>
 * <tr>
 * <td>servers</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.servers.Server Server}</td>
 * <td>An array of Server Objects, which provide connectivity information to a
 * target server. If the servers property is not provided, or is an empty array,
 * the default value would be a Server Object with a url value of /.</td>
 * </tr>
 * <tr>
 * <td>paths</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.Paths Paths} Object</td>
 * <td>REQUIRED. The available paths and operations for the API.</td>
 * </tr>
 * <tr>
 * <td>components</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.Components Components}</td>
 * <td>An element to hold various schemas for the specification.</td>
 * </tr>
 * <tr>
 * <td>security</td>
 * <td>{@link
 * org.eclipse.microprofile.openapi.models.security.SecurityRequirement SecurityRequirement}</td>
 * <td>A declaration of which security mechanisms can be used across the API.
 * The list of values includes alternative security requirement objects that can
 * be used. Only one of the security requirement objects need to be satisfied to
 * authorize a request. Individual operations can override this definition.</td>
 * </tr>
 * <tr>
 * <td>tags</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.tags.Tag Tag}</td>
 * <td>A list of tags used by the specification with additional metadata. The
 * order of the tags can be used to reflect on their order by the parsing tools.
 * Not all tags that are used by the Operation Object must be declared. The tags
 * that are not declared MAY be organized randomly or based on the tools' logic.
 * Each tag name in the list MUST be unique.</td>
 * </tr>
 * <tr>
 * <td>externalDocs</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.ExternalDocumentation ExternalDocumentation}</td>
 * <td>Additional external documentation.</td>
 * </tr>
 * </table>
 * 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.0.md">OpenAPI Specification</a>
 */
public interface OpenAPI extends Constructible, Extensible {

	/**
	  * Returns the openapi property from an OpenAPI instance.
	  *
	  * @return the semantic version number of the OpenAPI Specification version that the OpenAPI document uses
	  **/

	String getOpenapi();

	/**
	  * Sets this OpenAPI instance's openapi property to the given string.
	  *
	  * @param openapi the semantic version number of the OpenAPI Specification version that the OpenAPI document uses
	  */
	void setOpenapi(String openapi);

	/**
	  * Sets this OpenAPI instance's openapi property to the given string.
	  *
	  * @param openapi the semantic version number of the OpenAPI Specification version that the OpenAPI document uses
	  * @return the current OpenAPI object
	  */
	OpenAPI openapi(String openapi);

	/**
	  * Returns the info property from an OpenAPI instance.
	  *
	  * @return metadata about the API
	  **/

	Info getInfo();

	/**
	  * Sets this OpenAPI instance's info property to the given object.
	  *
	  * @param info metadata about the API
	  */
	void setInfo(Info info);

	/**
	  * Sets this OpenAPI instance's info property to the given object.
	  *
	  * @param info metadata about the API
	  * @return the current OpenAPI object
	  */
	OpenAPI info(Info info);

	/**
	  * Returns the externalDocs property from an OpenAPI instance.
	  *
	  * @return additional external documentation
	  **/
	ExternalDocumentation getExternalDocs();

	/**
	  * Sets this OpenAPI instance's externalDocs property to the given object.
	  *
	  * @param externalDocs additional external documentation.
	  */
	void setExternalDocs(ExternalDocumentation externalDocs);

	/**
	  * Sets this OpenAPI instance's externalDocs property to the given object.
	  *
	  * @param externalDocs additional external documentation
	  * @return the current OpenAPI object
	  */
	OpenAPI externalDocs(ExternalDocumentation externalDocs);

	/**
	  * Returns the Servers defined in the API
	  *
	  * @return Server objects which provide connectivity information to target servers
	  **/

	List<Server> getServers();

	/**
	  * Sets this OpenAPI instance's servers property to the given servers.
	  *
	  * @param servers Server objects which provide connectivity information to target servers
	  */
	void setServers(List<Server> servers);

	/**
	  * Sets this OpenAPI instance's servers property to the given servers.
	  *
	  * @param servers Server objects which provide connectivity information to target servers
	  * @return the current OpenAPI object
	  */
	OpenAPI servers(List<Server> servers);

	/**
	  * Adds the given server to this OpenAPI instance's list of servers.
	  *
	  * @param serversItem Server object which provides connectivity information to a target server
	  * @return the current OpenAPI object
	  */
	OpenAPI addServersItem(Server serversItem);

	/**
	  * Returns the security property from an OpenAPI instance.
	  *
	  * @return which security mechanisms can be used across the API
	  **/

	List<SecurityRequirement> getSecurity();

	/**
	  * Sets this OpenAPI instance's security property to the given list.
	  *
	  * @param security which security mechanisms can be used across the API
	  */
	void setSecurity(List<SecurityRequirement> security);

	/**
	  * Sets this OpenAPI instance's security property to the given list.
	  *
	  * @param security which security mechanisms can be used across the API
	  * @return the current OpenAPI object
	  */
	OpenAPI security(List<SecurityRequirement> security);

	/**
	  * Adds the given security requirement to this OpenAPI instance's list of security requirements.
	  *
	  * @param securityItem security mechanism which can be used across the API
	  * @return the current OpenAPI object
	  */
	OpenAPI addSecurityItem(SecurityRequirement securityItem);

	/**
	  * Returns the tags property from an OpenAPI instance.
	  *
	  * @return tags used by the specification
	  **/

	List<Tag> getTags();

	/**
	  * Sets this OpenAPI instance's tags property to the given Tags.
	  *
	  * @param tags tags used by the specification
	  */
	void setTags(List<Tag> tags);

	/**
	  * Sets this OpenAPI instance's tags property to the given tags.
	  *
	  * @param tags tags used by the specification
	  * @return the current OpenAPI object
	  */
	OpenAPI tags(List<Tag> tags);

	/**
	  * Adds the given tag to this OpenAPI instance's list of tags.
	  *
	  * @param tagsItem a tag used by the specification
	  * @return the current OpenAPI object
	  */
	OpenAPI addTagsItem(Tag tagsItem);

	/**
	  * Returns the paths property from an OpenAPI instance.
	  *
	  * @return the available paths and operations for the API
	  **/
	Paths getPaths();

	/**
	  * Sets this OpenAPI instance's paths property to the given paths.
	  *
	  * @param paths the available paths and operations for the API
	  */
	void setPaths(Paths paths);

	/**
	  * Sets this OpenAPI instance's paths property to the given paths.
	  *
	  * @param paths the available paths and operations for the API
	  * @return the current OpenAPI object
	  */
	OpenAPI paths(Paths paths);

	/**
	  * Adds the given path item to this OpenAPI instance's list of paths
	  * 
	  * @param name a path name in the format valid for a Paths object
	  * @param path the path item added to the list of paths
	  * @return the current OpenAPI object
	  */
	OpenAPI path(String name, PathItem path);

	/**
	  * Returns the components property from an OpenAPI instance.
	  *
	  * @return schemas used in the specification
	  **/
	Components getComponents();

	/**
	  * Sets this OpenAPI instance's components property to the given components.
	  *
	  * @param components schemas used in the specification
	  */
	void setComponents(Components components);

	/**
	  * Sets this OpenAPI instance's components property to the given components.
	  *
	  * @param components schemas used in the specification
	  * @return the current OpenAPI object
	  */
	OpenAPI components(Components components);

	/**
	  * Adds the given schema to this OpenAPI instance's components property.
	  * 
	  * @param name the canonical name of the given schema
	  * @param schema a schema to add to the components property
	  * @return the current OpenAPI object
	  */
	OpenAPI schema(String name, Schema schema);

	/**
	  * Adds the given security scheme to this OpenAPI instance's components property.
	  * This convenience method is similar to Components.addSecuritySchemes. 
	  * 
	  * @param name the canonical name of the given security scheme
	  * @param securityScheme a security scheme to add to the components property
	  * @return the current OpenAPI object
	  */
	OpenAPI securityScheme(String name, SecurityScheme securityScheme);
}