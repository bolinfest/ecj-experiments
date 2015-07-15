# ecj-experiments

This is my attempt to use the Eclipse compiler for Java (ECJ) with its full suite of
Java development tools (JDT) without using the Eclipse GUI.

If you have Buck on your `$PATH`, you can try launching the JDT in an OSGi container
(which AFAICT is a requirement for using the JDT):

```bash
./scripts/run
```

It does not work yet. If I look at the `config.ini` from Eclipse itself, the OSGi bundle that it
launches is `org.eclipse.equinox.simpleconfigurator`. From
[http://www.artificialworlds.net/blog/2012/11/27/launching-an-osgi-app-on-the-command-line/](
this blog post), it appears that `org.eclipse.equinox.simpleconfigurator` has a ton of transitive
dependencies that I would like to avoid including, if at all possible.
