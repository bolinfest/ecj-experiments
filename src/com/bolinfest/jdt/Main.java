package com.bolinfest.jdt;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class Main {

  public static void main(String... args) throws CoreException {
    final IProgressMonitor myProgressMonitor = null;

    IWorkspace workspace = ResourcesPlugin.getWorkspace();
    IWorkspaceRoot root = workspace.getRoot();
    IProject project = root.getProject("test");
    project.create(myProgressMonitor);
    project.open(myProgressMonitor);

    project.build(IncrementalProjectBuilder.INCREMENTAL_BUILD, myProgressMonitor);
  }
}
