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

package org.dmfs.httpessentials.headers;

/**
 * Represents a header type. That is, it binds a header name to a value type.
 * <p />
 * Two {@link SingletonHeaderType}s are considered to equal if they have the same header name.
 * 
 * @author Marten Gajda <marten@dmfs.org>
 * 
 * @param <ValueType>
 *            The type of the header value.
 */
public interface SingletonHeaderType<ValueType> extends HeaderType<ValueType>
{

}
