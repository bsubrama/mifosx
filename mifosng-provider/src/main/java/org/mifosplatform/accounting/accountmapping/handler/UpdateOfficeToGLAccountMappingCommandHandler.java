/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.accounting.accountmapping.handler;

import org.mifosplatform.accounting.accountmapping.service.OfficeToGLAccountMappingWritePlatformService;
import org.mifosplatform.commands.handler.NewCommandSourceHandler;
import org.mifosplatform.infrastructure.core.api.JsonCommand;
import org.mifosplatform.infrastructure.core.data.CommandProcessingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UpdateOfficeToGLAccountMappingCommandHandler implements NewCommandSourceHandler {

    private final OfficeToGLAccountMappingWritePlatformService writePlatformService;

    @Autowired
    public UpdateOfficeToGLAccountMappingCommandHandler(final OfficeToGLAccountMappingWritePlatformService writePlatformService) {
        this.writePlatformService = writePlatformService;
    }

    @Transactional
    @Override
    public CommandProcessingResult processCommand(final JsonCommand command) {
        return this.writePlatformService.updateGLAccountMapping(command.entityId(), command);
    }
}