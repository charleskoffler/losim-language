package org.simol.examples.design_patterns.adapter;

//Adapter class of the design pattern, that adapts OldSystem to NewSystem interface
//public simu_comp_worker NewSystemFromOld contracts NewSystem
public class NewSystemFromOld implements NewSystem {
 private OldSystem oldSystem;

 public NewSystemFromOld(OldSystem oldSystem) {
     this.oldSystem = oldSystem;
 }

 @Override
 public void newMethod() {
     // Call the old method from the adapted class
     oldSystem.oldMethod();
 }
}
