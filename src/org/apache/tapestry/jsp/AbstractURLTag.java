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

package org.apache.tapestry.jsp;

import javax.servlet.jsp.JspException;

/**
 *  Base class for tags which simply insert a URL into the output.
 *
 *  @author Howard Lewis Ship
 *  @version $Id: AbstractURLTag.java,v 1.4 2004/02/19 17:37:55 hlship Exp $
 *  @since 3.0
 *
 **/

public abstract class AbstractURLTag extends AbstractTapestryTag
{

    /**
	 *  Inserts the URL and returns {@link javax.servlet.jsp.tagext.Tag#SKIP_BODY}.
	 * 
	 **/
	
    public int doStartTag() throws JspException
    {
        getURLRetriever().insertURL(getServlet());
        
        return SKIP_BODY;
    }
}
