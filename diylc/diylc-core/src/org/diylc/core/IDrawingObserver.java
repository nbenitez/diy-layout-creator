/*

    DIY Layout Creator (DIYLC).
    Copyright (c) 2009-2018 held jointly by the individual authors.

    This file is part of DIYLC.

    DIYLC is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    DIYLC is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with DIYLC.  If not, see <http://www.gnu.org/licenses/>.

*/
package org.diylc.core;

/**
 * Interface for tracking component drawing process. Components may use it to stop or restart
 * tracking. Anything drawn while tracking is stopped will not be added to the mouse hot-spot area.
 * 
 * @author Branislav Stojkovic
 */
public interface IDrawingObserver {

  void stopTracking();

  void startTracking();
  
  void stopTrackingContinuityArea();

  void startTrackingContinuityArea(boolean positive);
}