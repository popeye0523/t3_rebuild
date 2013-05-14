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
 *  Interface for objects that are
 *  read from resource files, used to backtrace
 *  live objects to the resources they
 *  came from. 
 *
 *  @author Howard Lewis Ship
 *  @version $Id: ILocationHolder.java,v 1.5 2004/02/19 17:37:36 hlship Exp $
 *  @since 3.0
 *
 **/

public interface ILocationHolder extends ILocatable
{
    public void setLocation(ILocation location);
}
