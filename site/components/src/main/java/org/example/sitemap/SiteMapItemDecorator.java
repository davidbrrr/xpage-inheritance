package org.example.sitemap;

import org.hippoecm.hst.configuration.components.HstComponentConfiguration;
import org.hippoecm.hst.configuration.sitemap.HstSiteMapItem;
import org.hippoecm.hst.core.request.ResolvedMount;
import org.hippoecm.hst.core.request.ResolvedSiteMapItem;

import java.util.Properties;
import java.util.Set;

/**
 * Decorator for ResolvedSiteMapItem, defers behaviour to the provided sitemap item.
 */
public abstract class SiteMapItemDecorator implements ResolvedSiteMapItem {

  private ResolvedSiteMapItem siteMapItem;

  public SiteMapItemDecorator(ResolvedSiteMapItem siteMapItem) {
    this.siteMapItem = siteMapItem;
  }

  @Override
  public ResolvedMount getResolvedMount() {
    return this.siteMapItem.getResolvedMount();
  }

  @Override
  public String getRelativeContentPath() {
    return this.siteMapItem.getRelativeContentPath();
  }

  @Override
  public String getPathInfo() {
    return this.siteMapItem.getPathInfo();
  }

  @Override
  public String getPageTitle() {
    return this.siteMapItem.getPageTitle();
  }

  @Override
  public String getParameter(String name) {
    return this.siteMapItem.getParameter(name);
  }

  @Override
  public String getLocalParameter(String name) {
    return this.siteMapItem.getLocalParameter(name);
  }

  @Override
  public Properties getParameters() {
    return this.siteMapItem.getParameters();
  }

  @Override
  public Properties getLocalParameters() {
    return this.siteMapItem.getLocalParameters();
  }

  @Override
  public HstSiteMapItem getHstSiteMapItem() {
    return this.siteMapItem.getHstSiteMapItem();
  }

  @Override
  public String getNamedPipeline() {
    return this.siteMapItem.getNamedPipeline();
  }

  @Override
  public int getStatusCode() {
    return this.siteMapItem.getStatusCode();
  }

  @Override
  public int getErrorCode() {
    return this.siteMapItem.getErrorCode();
  }

  @Override
  public boolean isAuthenticated() {
    return this.siteMapItem.isAuthenticated();
  }

  @Override
  public Set<String> getRoles() {
    return this.siteMapItem.getRoles();
  }

  @Override
  public Set<String> getUsers() {
    return this.siteMapItem.getUsers();
  }

  @Override
  public HstComponentConfiguration getHstComponentConfiguration() {
    return this.siteMapItem.getHstComponentConfiguration();
  }

  @Override
  public boolean isExperiencePage() {
    return this.siteMapItem.isExperiencePage();
  }
}
