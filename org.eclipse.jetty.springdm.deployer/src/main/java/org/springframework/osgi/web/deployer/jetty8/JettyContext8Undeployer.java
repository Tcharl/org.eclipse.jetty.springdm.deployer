package org.springframework.osgi.web.deployer.jetty8;

import org.eclipse.jetty.webapp.WebAppContext;
import org.springframework.osgi.web.deployer.OsgiWarDeploymentException;

public interface JettyContext8Undeployer {
    /**
     * Undeploys the given Jetty context.
     * 
     * @param webAppCtx
     * @throws OsgiWarDeploymentException
     */
    void undeploy(WebAppContext webAppCtx)
            throws OsgiWarDeploymentException;
}

