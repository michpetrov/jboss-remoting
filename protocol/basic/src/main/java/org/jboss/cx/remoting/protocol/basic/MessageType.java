/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.cx.remoting.protocol.basic;

/**
 *
 */
public final class MessageType {
    // Initial version & marshaller negotiation
    public static final int VERSION            = 0;
    // One-way request, no return value may be sent
    public static final int REQUEST_ONEWAY     = 1;
    // Two-way request, return value is expected
    public static final int REQUEST            = 2;
    // Reply
    public static final int REPLY              = 3;
    // Attempt to cancel a request
    public static final int CANCEL_REQUEST     = 4;
    // Acknowledge that a request was cancelled
    public static final int CANCEL_ACK         = 5;
    // Request failed due to exception
    public static final int REQUEST_FAILED     = 6;
    // Remote side called .close() on a forwarded RequestHandler
    public static final int CLIENT_CLOSE       = 7;
    // Remote side pulled a new RequestHandler off of a forwarded RequestHandlerSource
    public static final int CLIENT_OPEN        = 8;
    // Remote side called .close() on a forwarded RequestHandlerSource
    public static final int SERVICE_CLOSE      = 9;
    // Remote side brought a new service online
    public static final int SERVICE_ADVERTISE  = 10;
    // Remote side's service is no longer available
    public static final int SERVICE_UNADVERTISE= 11;

    private MessageType() {
    }
}
