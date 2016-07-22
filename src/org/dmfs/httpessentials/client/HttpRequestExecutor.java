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

package org.dmfs.httpessentials.client;

import java.io.IOException;
import java.net.URI;

import org.dmfs.httpessentials.exceptions.ProtocolError;
import org.dmfs.httpessentials.exceptions.ProtocolException;
import org.dmfs.httpessentials.exceptions.RedirectionException;
import org.dmfs.httpessentials.exceptions.UnexpectedStatusException;


/**
 * The interface of an instance that knows how to execute an {@link HttpRequest}.
 * 
 * @author Marten Gajda <marten@dmfs.org>
 */
public interface HttpRequestExecutor
{

	/**
	 * Sends the given {@link HttpRequest} to the given {@link URI} and returns the result. This method uses a custom {@link OnRedirectCallback} to handle any
	 * redirections.
	 * 
	 * @param uri
	 *            The URI to send this request to.
	 * @param request
	 *            The request to execute.
	 * @param redirectionCallback
	 *            An {@link OnRedirectCallback} that determines how to handle any redirections.
	 * @return The result, i.e. the handled server response.
	 */
	public <T> T execute(URI uri, HttpRequest<T> request, OnRedirectCallback redirectionCallback) throws IOException, ProtocolError, ProtocolException,
		RedirectionException, UnexpectedStatusException;

}
