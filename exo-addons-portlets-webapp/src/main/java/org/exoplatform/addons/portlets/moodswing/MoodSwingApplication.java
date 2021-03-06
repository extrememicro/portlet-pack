package org.exoplatform.addons.portlets.moodswing;

import juzu.Path;
import juzu.View;
import juzu.request.RenderContext;
import juzu.template.Template;

import javax.inject.Inject;
import java.io.IOException;

public class MoodSwingApplication
{

  /** . */
  @Inject
  @Path("index.gtmpl")
  Template indexTemplate;

  @View
  public void index(RenderContext renderContext) throws IOException
  {
      indexTemplate.render();
  }

}
