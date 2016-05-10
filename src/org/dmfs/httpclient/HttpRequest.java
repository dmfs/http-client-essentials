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

import java.io.IOException;

import org.dmfs.httpclient.exceptions.ProtocolError;
import org.dmfs.httpclient.exceptions.ProtocolException;
import org.dmfs.httpclient.headers.Header;
import org.dmfs.httpclient.headers.Headers;


/**
 * Defines an interface of an HTTP request. The request is typed to the class of the expected response.
 * 
 * @author Marten Gajda <marten@dmfs.org>
 * 
 * @param <T>
 *            The type of the expected response.
 */
public interface HttpRequest<T>
{

	/**
	 * Returns the HTTP method of this request.
	 * 
	 * @return The {@link HttpMethod} this request uses.
	 */
	public HttpMethod method();


	/**
	 * Returns a {@link Headers} containing the {@link Header}s to send with the request.
	 * 
	 * @return A {@link Headers}, never <code>null</code>.
	 */
	public Headers headers();


	/**
	 * Returns an {@link HttpRequestEntity} that contains the body of this request.
	 * 
	 * @return An {@link HttpRequestEntity} object, never <code>null</code>.
	 */
	public HttpRequestEntity requestEntity();


	/**
	 * Returns a handler for the response. If the response can not be handled an exception is thrown.
	 * 
	 * @param response
	 *            The {@link HttpResponse} that needs to be handled.
	 * @return An {@link HttpResponseHandler}.
	 * @throws IOException
	 * @throws ProtocolError
	 *             If the response is an error response as specified by the application protocol.
	 * @throws ProtocolException
	 *             If the response is invalid or malformed and can not be handled properly.
	 */
	public HttpResponseHandler<T> responseHandler(HttpResponse response) throws IOException, ProtocolError, ProtocolException;
}
