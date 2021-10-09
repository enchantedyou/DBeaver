/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2021 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ui.navigator.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.ui.ActionUtils;

public class NavigatorHandlerPreferences extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
/*
        final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
        if (activePart instanceof NavigatorViewBase) {
            UIUtils.showPreferencesFor(
                HandlerUtil.getActiveShell(event),
                activePart,
                PrefPageDatabaseNavigator.PAGE_ID
            );
        }
*/
        ActionUtils.runCommand(IWorkbenchCommandConstants.WINDOW_PREFERENCES, HandlerUtil.getActiveWorkbenchWindow(event));
        return null;
    }


}