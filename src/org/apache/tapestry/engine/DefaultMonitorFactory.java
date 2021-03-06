//  Copyright 2004 The Apache Software Foundation
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.apache.tapestry.engine;

import org.apache.tapestry.request.RequestContext;

/**
 * Implementation of {@link org.apache.tapestry.engine.IMonitorFactory}
 * that returns the {@link org.apache.tapestry.engine.NullMonitor}.
 *
 * @author Howard Lewis Ship
 * @version $Id: DefaultMonitorFactory.java,v 1.3 2004/02/19 17:38:00 hlship Exp $
 */
public class DefaultMonitorFactory implements IMonitorFactory
{
	public static final IMonitorFactory SHARED = new DefaultMonitorFactory();
	 
    /**
     * Returns {@link NullMonitor#SHARED}.
     */
    public IMonitor createMonitor(RequestContext context)
    {
        return NullMonitor.SHARED;
    }

}
