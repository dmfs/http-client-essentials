/*
 * Copyright (C) 2016 Marten Gajda <marten@dmfs.org>
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dmfs.httpclient;

import java.net.URI;

import org.dmfs.httpclient.headers.Headers;


/**
 * An interface of an HTTP response object.
 * 
 * @author Marten Gajda <marten@dmfs.org>
 */
public interface HttpResponse
{
	/**
	 * Returns the status of the response.
	 * 
	 * @see HttpStatus
	 * @return The status.
	 */
	public HttpStatus status();


	/**
	 * Returns the response headers.
	 * 
	 * @return A {@link Headers}.
	 */
	public Headers headers();


	/**
	 * Returns an {@link HttpResponseEntity} representing the data in the response.
	 * 
	 * @return An {@link HttpResponseEntity}.
	 */
	public HttpResponseEntity responseEntity();


	/**
	 * Returns the {@link URI} the request was originally sent to.
	 * 
	 * @return The URI of the request.
	 * 
	 * @see #responseUri()
	 */
	public URI requestUri();


	/**
	 * Returns the {@link URI} of the server instance that actually handled the request. If no redirects have been followed this equals the URI passed to the
	 * execute methods of {@link HttpRequestExecutor} otherwise it's the URI of the last location that didn't return a redirect.
	 * 
	 * @return The URI of the responding instance.
	 * 
	 * @see #requestUri()
	 */
	public URI responseUri();
}
