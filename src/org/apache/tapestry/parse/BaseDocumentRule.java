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

package org.apache.tapestry.parse;

import org.xml.sax.Attributes;

/**
 *  Base implementation of {@link org.apache.tapestry.parse.IDocumentRule}.
 *
 *  @author Howard Lewis Ship
 *  @version $Id: BaseDocumentRule.java,v 1.4 2004/02/19 17:37:41 hlship Exp $
 *  @since 3.0
 *
 **/
public class BaseDocumentRule implements IDocumentRule
{
	private SpecificationDigester _digester;
	
	public SpecificationDigester getDigester()
	{
		return _digester;
	}
	
    public void setDigester(SpecificationDigester digester)
    {
    	_digester = digester;
    }

    public void startDocument(String namespace, String name, Attributes attributes) throws Exception
    {
    }

    public void endDocument() throws Exception
    {
    }

    public void finish() throws Exception
    {
    }

}
