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

package org.apache.tapestry.bean;

import org.apache.tapestry.IBeanProvider;
import org.apache.tapestry.IComponent;

/**
 *  A bean initializer that uses a localized string from the containing
 *  component.
 *
 *  @author Howard Lewis Ship
 *  @version $Id: MessageBeanInitializer.java,v 1.3 2004/02/19 17:37:42 hlship Exp $
 *  @since 2.2
 * 
 **/

public class MessageBeanInitializer extends AbstractBeanInitializer
{
    protected String _key;
	

    public void setBeanProperty(IBeanProvider provider, Object bean)
    {
        IComponent component = provider.getComponent();
        String value = component.getMessage(_key);
        
        setBeanProperty(provider.getResourceResolver(), bean, value);
    }
    
    /** @since 3.0 **/
    
    public String getKey()
    {
        return _key;
    }

	/** @since 3.0 **/
	
    public void setKey(String key)
    {
        _key = key;
    }

}
