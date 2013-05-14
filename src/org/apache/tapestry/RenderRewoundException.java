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

package org.apache.tapestry;

/**
 *  A special subclass of {@link ApplicationRuntimeException} that can be thrown
 *  when a component has determined that the state of the page has been
 *  rewound.
 *
 * @author Howard Lewis Ship
 * @version $Id: RenderRewoundException.java,v 1.6 2004/02/19 17:37:36 hlship Exp $
 **/

public class RenderRewoundException extends ApplicationRuntimeException
{
    public RenderRewoundException(Object component)
    {
        super(null, component, null, null);
    }
}