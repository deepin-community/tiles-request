/*
 * $Id: NotAvailableFreemarkerServletExceptionTest.java 1066788 2011-02-03 11:49:11Z apetrelli $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.tiles.request.freemarker;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests {@link NotAvailableFreemarkerServletException}.
 *
 * @version $Rev: 1066788 $ $Date: 2011-02-03 12:49:11 +0100 (Thu, 03 Feb 2011) $
 */
public class NotAvailableFreemarkerServletExceptionTest {

    /**
     * Test method for {@link NotAvailableFreemarkerServletException#NotAvailableFreemarkerServletException()}.
     */
    @Test
    public void testNotAvailableFreemarkerServletException() {
        NotAvailableFreemarkerServletException exception = new NotAvailableFreemarkerServletException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    /**
     * Test method for {@link NotAvailableFreemarkerServletException#NotAvailableFreemarkerServletException(String)}.
     */
    @Test
    public void testNotAvailableFreemarkerServletExceptionString() {
        NotAvailableFreemarkerServletException exception = new NotAvailableFreemarkerServletException("my message");
        assertEquals("my message", exception.getMessage());
        assertNull(exception.getCause());
    }

    /**
     * Test method for {@link NotAvailableFreemarkerServletException#NotAvailableFreemarkerServletException(Throwable)}.
     */
    @Test
    public void testNotAvailableFreemarkerServletExceptionThrowable() {
        Throwable cause = new Throwable();
        NotAvailableFreemarkerServletException exception = new NotAvailableFreemarkerServletException(cause);
        assertEquals(cause.toString(), exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    /**
     * Test method for
     * {@link NotAvailableFreemarkerServletException#NotAvailableFreemarkerServletException(String, Throwable)}.
     */
    @Test
    public void testNotAvailableFreemarkerServletExceptionStringThrowable() {
        Throwable cause = new Throwable();
        NotAvailableFreemarkerServletException exception =
            new NotAvailableFreemarkerServletException("my message", cause);
        assertEquals("my message", exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

}
