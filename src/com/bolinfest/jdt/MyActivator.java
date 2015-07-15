package com.bolinfest.jdt;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class MyActivator implements BundleActivator {

  private static BundleContext context;

  static BundleContext getContext() {
    return context;
  }

  @Override
  public void start(BundleContext bundleContext) throws Exception {
    System.out.println("about to create workspace");
    IWorkspace workspace = ResourcesPlugin.getWorkspace();
    System.out.println("workspace! " + workspace);

    MyActivator.context = bundleContext;
  }

  @Override
  public void stop(BundleContext bundleContext) throws Exception {
    MyActivator.context = null;
  }
}
