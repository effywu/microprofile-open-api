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
import java.util.Map;

import org.eclipse.microprofile.openapi.models.parameters.Parameter;
import org.eclipse.microprofile.openapi.models.servers.Server;

/**
 * PathItem
 * <p>
 * Describes the operations available on a single path. A Path Item MAY be
 * empty, due to ACL constraints. The path itself is still exposed to the
 * documentation viewer but they will not know which operations and parameters
 * are available.
 * <p>
 * Fixed Fields
 * <table border=1>
 * <tr>
 * <td>Field Name</td>
 * <td>Type</td>
 * <td>Description</td>
 * </tr>
 * <tr>
 * <td>$ref</td>
 * <td>string</td>
 * <td>Allows for an external definition of this path item. The referenced
 * structure MUST be in the format of a Path Item Object. If there are conflicts
 * between the referenced definition and this Path Item's definition, the
 * behavior is undefined.</td>
 * </tr>
 * <tr>
 * <td>summary</td>
 * <td>string</td>
 * <td>An optional, string summary, intended to apply to all operations in this
 * path.</td>
 * </tr>
 * <tr>
 * <td>description</td>
 * <td>string</td>
 * <td>An optional, string description, intended to apply to all operations in
 * this path. CommonMark syntax MAY be used for rich text representation.</td>
 * </tr>
 * <tr>
 * <td>get</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.Operation Operation}
 * Object</td>
 * <td>A definition of a GET operation on this path.</td>
 * </tr>
 * <tr>
 * <td>put</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.Operation Operation}
 * Object</td>
 * <td>A definition of a PUT operation on this path.</td>
 * </tr>
 * <tr>
 * <td>post</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.Operation Operation}
 * Object</td>
 * <td>A definition of a POST operation on this path.</td>
 * </tr>
 * <tr>
 * <td>delete</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.Operation Operation}
 * Object</td>
 * <td>A definition of a DELETE operation on this path.</td>
 * </tr>
 * <tr>
 * <td>options</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.Operation Operation}
 * Object</td>
 * <td>A definition of a OPTIONS operation on this path.</td>
 * </tr>
 * <tr>
 * <td>head</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.Operation Operation}
 * Object</td>
 * <td>A definition of a HEAD operation on this path.</td>
 * </tr>
 * <tr>
 * <td>patch</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.Operation Operation}
 * Object</td>
 * <td>A definition of a PATCH operation on this path.</td>
 * </tr>
 * <tr>
 * <td>trace</td>
 * <td>{@link org.eclipse.microprofile.openapi.models.Operation Operation}
 * Object</td>
 * <td>A definition of a TRACE operation on this path.</td>
 * </tr>
 * <tr>
 * <td>servers</td>
 * <td>[{@link org.eclipse.microprofile.openapi.models.servers.Server Server}
 * Object]</td>
 * <td>An alternative server array to service all operations in this path.</td>
 * </tr>
 * <tr>
 * <td>parameters</td>
 * <td>[{@link org.eclipse.microprofile.openapi.models.parameters.Parameter
 * Parameter} Object |
 * {@link org.eclipse.microprofile.openapi.models.parameters.Parameter
 * Reference} Object]</td>
 * <td>A list of parameters that are applicable for all the operations described
 * under this path. These parameters can be overridden at the operation level,
 * but cannot be removed there. The list MUST NOT include duplicated parameters.
 * A unique parameter is defined by a combination of a name and location. The
 * list can use the Reference Object to link to parameters that are defined at
 * the OpenAPI Object's components/parameters.</td>
 * </tr>
 * </table>
 * 
 * @see <a href=
 *      "https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.md#pathItemObject">OpenAPI
 *      Specification Path Item Object</a>
 */
public interface PathItem extends Constructible, Extensible {

	/**
	 * All of the possible types of methods for this path
	 */
	enum HttpMethod {
	    POST,
	    GET,
	    PUT,
	    PATCH,
	    DELETE,
	    HEAD,
	    OPTIONS,
	    TRACE
	}

	/**
	 * returns the summary property from a PathItem instance.
	 *
	 * @return String summary
	 **/

	String getSummary();

	/**
	 * sets this PathItem's summary property to the given summary.
	 *
	 * @param String summary
	 */
	void setSummary(String summary);

	/**
	* sets this PathItem's summary property to the given summary and
	* returns this instance of PathItem
	*
	* @param String summary
	* @return PathItem
	*/
	PathItem summary(String summary);

	/**
	 * returns the description property from a PathItem instance.
	 *
	 * @return String description
	 **/

	String getDescription();

	/**
	 * sets this PathItem's description property to the given description.
	 *
	 * @param String description
	 */
	void setDescription(String description);

	/**
	* sets this PathItem's description property to the given description and
	* returns this instance of PathItem
	*
	* @param String description
	* @return PathItem
	*/
	PathItem description(String description);

	/**
	 * returns the get property from a PathItem instance.
	 *
	 * @return Operation get
	 **/
	Operation getGet();

	/**
	 * sets this PathItem's get property to the given get.
	 *
	 * @param Operation get
	 */
	void setGet(Operation get);

	/**
	* sets this PathItem's get property to the given get and
	* returns this instance of PathItem
	*
	* @param Operation get
	* @return PathItem
	*/
	PathItem get(Operation get);

	/**
	 * returns the put property from a PathItem instance.
	 *
	 * @return Operation put
	 **/

	Operation getPut();

	/**
	 * sets this PathItem's put property to the given put.
	 *
	 * @param Operation put
	 */
	void setPut(Operation put);

	/**
	* sets this PathItem's put property to the given put and
	* returns this instance of PathItem
	*
	* @param Operation put
	* @return PathItem
	*/
	PathItem put(Operation put);

	/**
	 * returns the post property from a PathItem instance.
	 *
	 * @return Operation post
	 **/

	Operation getPost();

	/**
	 * sets this PathItem's post property to the given post.
	 *
	 * @param Operation post
	 */
	void setPost(Operation post);

	/**
	* sets this PathItem's post property to the given post and
	* returns this instance of PathItem
	*
	* @param Operation post
	* @return PathItem
	*/
	PathItem post(Operation post);

	/**
	 * returns the delete property from a PathItem instance.
	 *
	 * @return Operation delete
	 **/

	Operation getDelete();

	/**
	 * sets this PathItem's delete property to the given delete.
	 *
	 * @param Operation delete
	 */
	void setDelete(Operation delete);

	/**
	* sets this PathItem's delete property to the given delete and
	* returns this instance of PathItem
	*
	* @param Operation delete
	* @return PathItem
	*/
	PathItem delete(Operation delete);

	/**
	 * returns the options property from a PathItem instance.
	 *
	 * @return Operation options
	 **/

	Operation getOptions();

	/**
	 * sets this PathItem's options property to the given options.
	 *
	 * @param Operation options
	 */
	void setOptions(Operation options);

	/**
	* sets this PathItem's options property to the given options and
	* returns this instance of PathItem
	*
	* @param Operation options
	* @return PathItem
	*/
	PathItem options(Operation options);

	/**
	 * returns the head property from a PathItem instance.
	 *
	 * @return Operation head
	 **/

	Operation getHead();

	/**
	 * sets this PathItem's head property to the given head.
	 *
	 * @param Operation head
	 */
	void setHead(Operation head);

	/**
	* sets this PathItem's head property to the given head and
	* returns this instance of PathItem
	*
	* @param Operation head
	* @return PathItem
	*/
	PathItem head(Operation head);

	/**
	 * returns the patch property from a PathItem instance.
	 *
	 * @return Operation patch
	 **/

	Operation getPatch();

	/**
	 * sets this PathItem's patch property to the given patch.
	 *
	 * @param Operation patch
	 */
	void setPatch(Operation patch);

	/**
	* sets this PathItem's patch property to the given patch and
	* returns this instance of PathItem
	*
	* @param Operation patch
	* @return PathItem
	*/
	PathItem patch(Operation patch);

	/**
	 * returns the trace property from a PathItem instance.
	 *
	 * @return Operation trace
	 **/

	Operation getTrace();

	/**
	 * sets this PathItem's trace property to the given trace.
	 *
	 * @param Operation trace
	 */
	void setTrace(Operation trace);

	/**
	* sets this PathItem's trace property to the given trace and
	* returns this instance of PathItem
	*
	* @param Operation trace
	* @return PathItem
	*/
	PathItem trace(Operation trace);

	/**
	 * Returns a list of all the operation for this path.
	 * 
	 * @return List&lt;Operation&gt; allOperations
	 */
	List<Operation> readOperations();

	/**
	 * Returns a map with all the operations for this path, where the HttpMethods are keys.
	 * 
	 * @return Map&lt;HttpMethod, Operation&gt; result
	 */
	Map<PathItem.HttpMethod, Operation> readOperationsMap();

	/**
	 * returns the servers property from a PathItem instance.
	 *
	 * @return List&lt;Server&gt; servers
	 **/

	List<Server> getServers();

	/**
	 * sets this PathItem's servers property to the given servers.
	 *
	 * @param List&lt;Server&gt; servers
	 */
	void setServers(List<Server> servers);

	/**
	* sets this PathItem's patch servers to the given servers and
	* returns this instance of PathItem
	*
	* @param List&lt;Server&gt; servers
	* @return PathItem
	*/
	PathItem servers(List<Server> servers);

	/**
	 * Adds the given serversItem to this PathItem's list of serversItem, with the given key as its key.
	 *
	 * @param String key
	 * @param Server serversItem
	 * @return PathItem
	*/
	PathItem addServersItem(Server serversItem);

	/**
	 * returns the parameters property from a PathItem instance.
	 *
	 * @return List&lt;Parameter&gt; parameters
	 **/

	List<Parameter> getParameters();

	/**
	 * sets this PathItem's parameters property to the given parameters.
	 *
	 * @param List&lt;Parameter&gt; servers
	 */
	void setParameters(List<Parameter> parameters);

	/**
	 * sets this PathItem's patch parameters to the given parameters and
	 * returns this instance of PathItem
	 *
	 * @param List&lt;Parameter&gt; servers
	 * @return PathItem
	 */
	PathItem parameters(List<Parameter> parameters);

	/**
	 * Adds the given parametersItem to this PathItem's list of parametersItem, with the given key as its key.
	 *
	 * @param String key
	 * @param Parameter parametersItem
	 * @return PathItem
	*/
	PathItem addParametersItem(Parameter parametersItem);

	/**
	 * returns the ref property from a PathItem instance.
	 *
	 * @return String ref
	 **/
	String get$ref();

	/**
	 * sets this PathItem's $ref property to the given $ref.
	 *
	 * @param String $ref
	 */
	void set$ref(String $ref);

	/**
	 * sets this PathItem's $ref parameters to the given $ref and
	 * returns this instance of PathItem
	 *
	 * @param List&lt;String&gt; $ref
	 * @return PathItem
	 */
	PathItem $ref(String $ref);

}