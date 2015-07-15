package com.bolinfest.jdt;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class MyActivator implements BundleActivator {

  private static BundleContext context;

  static BundleContext getContext() {
    return context;
  }

  @Override
  public void start(BundleContext bundleContext) throws Exception {
    System.out.println("hello world");
    MyActivator.context = bundleContext;
  }

  @Override
  public void stop(BundleContext bundleContext) throws Exception {
    MyActivator.context = null;
  }
}
