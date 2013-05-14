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

import org.apache.tapestry.Tapestry;

/**
 *  Like the {@link org.apache.tapestry.jsp.ExternalTag}, but inserts just
 *  the URL.
 *
 *  @author Howard Lewis Ship
 *  @version $Id: ExternalURLTag.java,v 1.4 2004/02/19 17:37:55 hlship Exp $
 *  @since 3.0
 *
 **/
public class ExternalURLTag extends AbstractURLTag
{

    private String _parameters;
    private String _page;

    protected URLRetriever getURLRetriever() throws JspException
    {
        return new URLRetriever(
            pageContext,
            Tapestry.EXTERNAL_SERVICE,
            constructExternalServiceParameters(_page, _parameters));
    }

    public void setParameters(String parameters)
    {
        _parameters = parameters;
    }

    public String getPage()
    {
        return _page;
    }

    public void setPage(String page)
    {
        _page = page;
    }

    public String getParameters()
    {
        return _parameters;
    }

}
