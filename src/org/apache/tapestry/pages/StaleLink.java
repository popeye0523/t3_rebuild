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

package org.apache.tapestry.pages;

import org.apache.tapestry.html.BasePage;

/**
 *  Stores a message (taken from the {@link org.apache.tapestry.StaleLinkException})
 *  that is displayed as part of the page.
 *
 *  @author Howard Lewis Ship
 *  @version $Id: StaleLink.java,v 1.4 2004/02/19 17:38:13 hlship Exp $
 *  @since 3.0
 *
 **/

public abstract class StaleLink extends BasePage
{
    public abstract void setMessage(String message);
}