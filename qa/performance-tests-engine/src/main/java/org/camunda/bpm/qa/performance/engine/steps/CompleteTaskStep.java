/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.qa.performance.engine.steps;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.qa.performance.engine.framework.PerfTestRunContext;
import org.camunda.bpm.qa.performance.engine.framework.PerfTestStepBehavior;

/**
 * @author Daniel Meyer
 *
 */
public class CompleteTaskStep extends ProcessEngineAwareStep implements PerfTestStepBehavior {

  protected String taskIdKey;

  public CompleteTaskStep(ProcessEngine processEngine, String taskIdKey) {
    super(processEngine);
    this.taskIdKey = taskIdKey;
  }

  public void execute(PerfTestRunContext context) {
    String taskId = context.getVariable(taskIdKey);
    taskService.complete(taskId);
  }

}
