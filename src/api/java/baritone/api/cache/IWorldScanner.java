/*
 * This file is part of Baritone.
 *
 * Baritone is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Baritone is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Baritone.  If not, see <https://www.gnu.org/licenses/>.
 */

package baritone.api.cache;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

import java.util.List;

/**
 * @author Brady
 * @since 10/6/2018
 */
public interface IWorldScanner {

    /**
     * Scans the world, up to the specified max chunk radius, for the specified blocks.
     *
     * @param blocks          The blocks to scan for
     * @param max             The maximum number of blocks to scan before cutoff
     * @param yLevelThreshold If a block is found within this Y level, the current result will be
     *                        returned, if the value is negative, then this condition doesn't apply.
     * @param maxSearchRadius The maximum chunk search radius
     * @return The matching block positions
     */
    List<BlockPos> scanLoadedChunks(List<Block> blocks, int max, int yLevelThreshold, int maxSearchRadius);
}
