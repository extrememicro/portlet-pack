/*
 * Copyright (C) 2003-2014 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
@Assets(
        location = AssetLocation.SERVER,
        scripts = {
                @Script(src = "js/Chart.min.js", id = "Chart"),
                @Script(src = "js/moodtrend.js", id = "moodtrend", depends = "Chart")

        },
        stylesheets = {
                @Stylesheet(src = "/org/exoplatform/addons/portlets/moodtrend/assets/moodtrend.css", location = AssetLocation.APPLICATION)
        }
)
@Less(value = "moodtrend.less", minify = true)


@Application(defaultController = MoodTrendApplication.class)
@Portlet(name="MoodTrendPortlet") package org.exoplatform.addons.portlets.moodtrend;

import juzu.Application;
import juzu.asset.AssetLocation;
import juzu.plugin.asset.Assets;
import juzu.plugin.asset.Script;
import juzu.plugin.asset.Stylesheet;
import juzu.plugin.less.Less;
import juzu.plugin.portlet.Portlet;
