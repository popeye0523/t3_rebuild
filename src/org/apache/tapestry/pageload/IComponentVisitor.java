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

package org.apache.tapestry.pageload;

import org.apache.tapestry.IComponent;

/**
 *  An interface defining an entity that is interested in examining a particular component 
 * 
 *  @author mindbridge
 *  @version $Id: IComponentVisitor.java,v 1.3 2004/02/19 17:38:05 hlship Exp $
 *  @since 3.0
 */
public interface IComponentVisitor
{
    void visitComponent(IComponent component);
}
