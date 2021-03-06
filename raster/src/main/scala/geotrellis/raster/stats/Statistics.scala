/*
 * Copyright (c) 2014 Azavea.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package geotrellis.raster.stats

import geotrellis.raster.NODATA

/**
  * Data object for sharing the basic statistics about a raster or region.
  */
case class Statistics(mean: Double = Double.NaN, median: Int = NODATA,
                      mode: Int = NODATA, stddev: Double = Double.NaN,
                      zmin: Int = NODATA, zmax: Int = NODATA)

object Statistics {
  val EMPTY = Statistics()
}
