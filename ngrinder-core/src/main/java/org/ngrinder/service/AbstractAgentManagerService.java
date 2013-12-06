/* 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.ngrinder.service;

import net.grinder.engine.controller.AgentControllerIdentityImplementation;
import org.apache.commons.lang.mutable.MutableInt;
import org.ngrinder.model.AgentInfo;
import org.ngrinder.model.User;
import org.ngrinder.monitor.controller.model.SystemDataModel;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Abstract Agent manager service class which is used to retrieve the agent info
 * attaching the current controller.
 *
 * @author JunHo Yoon
 * @since 3.3
 */
public abstract class AbstractAgentManagerService implements IAgentManagerService {

}