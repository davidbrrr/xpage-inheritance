package org.example.sitemap;

import org.hippoecm.hst.core.request.ResolvedSiteMapItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Custom sitemap implementation for x-page delivery.
 */
public class XpageSiteMapItemImpl extends SiteMapItemDecorator {

  private static Logger log = LoggerFactory.getLogger(XpageSiteMapItemImpl.class);

  private String relativeContentPath;

  public XpageSiteMapItemImpl(ResolvedSiteMapItem siteMapItem, String relativeContentPath) {
    super(siteMapItem);
    this.relativeContentPath = relativeContentPath;
  }

  @Override
  public String getRelativeContentPath() {
    return relativeContentPath;
  }
}
