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

package org.apache.tapestry.wml;

import org.apache.tapestry.link.DefaultLinkRenderer;
import org.apache.tapestry.link.ILinkRenderer;

/**
 *  Implementation of {@link org.apache.tapestry.link.ILinkRenderer} for
 *  the WML Option element.
 *
 *  The value attribute is reserved.
 *
 *  @version $Id: OptionRenderer.java,v 1.5 2004/02/19 17:37:46 hlship Exp $
 *  @author David Solis
 *  @since 3.0
 *
 **/

public class OptionRenderer extends DefaultLinkRenderer
{
	/**
	 *  A singleton for the option link.
	 **/

	 public static final ILinkRenderer SHARED_INSTANCE = new OptionRenderer();

    protected String getElement()
    {
        return "option";
    }

    protected String getUrlAttribute()
    {
        return "onpick";
    }
}
