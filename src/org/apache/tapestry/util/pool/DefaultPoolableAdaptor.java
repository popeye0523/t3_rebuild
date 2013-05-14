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

package org.apache.tapestry.util.pool;

/**
 *  Implementation for objects that implement
 *  the {@link org.apache.tapestry.util.pool.IPoolable} interface.
 * 
 *  @author Howard Lewis Ship
 *  @version $Id: DefaultPoolableAdaptor.java,v 1.4 2004/02/19 17:37:40 hlship Exp $
 *  @since 3.0
 *
 **/

public class DefaultPoolableAdaptor implements IPoolableAdaptor
{

    public void resetForPool(Object object)
    {
        IPoolable poolable = (IPoolable)object;
        
        poolable.resetForPool();
    }

    public void discardFromPool(Object object)
    {
        IPoolable poolable = (IPoolable)object;
        
        poolable.discardFromPool();        
    }

}
