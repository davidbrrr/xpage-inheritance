package org.example.sitemap;

import org.hippoecm.hst.container.RequestContextProvider;
import org.hippoecm.hst.core.request.HstRequestContext;
import org.hippoecm.hst.core.request.ResolvedSiteMapItem;
import org.hippoecm.hst.core.sitemapitemhandler.AbstractHstSiteMapItemHandler;
import org.hippoecm.hst.core.sitemapitemhandler.HstSiteMapItemHandlerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Custom sitemap handler for x-page delivery.
 */
public class XpageSiteMapItemHandler extends AbstractHstSiteMapItemHandler {

  private static Logger log = LoggerFactory.getLogger(XpageSiteMapItemHandler.class);

  @Override
  public ResolvedSiteMapItem process(ResolvedSiteMapItem resolvedSiteMapItem, HttpServletRequest request, HttpServletResponse response)
      throws HstSiteMapItemHandlerException {
    //TODO code that figures out where the "common" page is
    String resolvedPath = "en_us/" + resolvedSiteMapItem.getRelativeContentPath();
    return new XpageSiteMapItemImpl(resolvedSiteMapItem, "../" + resolvedPath);
  }
}
