/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.function.operation;

/**
 * A RunContext is provided to an Operation and should be used to implement
 * time limits on the operation.
 */
public interface RunContext {

    /**
     * Test whether the operation has been cancelled.
     *
     * <p>Operations should check the value of this to cease execution
     * when appropriate. This method is similar to
     * {@link Thread#isInterrupted()} in that it is a flag that
     * operations can act on whenever appropriate to cease execution.</p>
     *
     * @return true if cancelled
     */
    boolean isCancelled();

    /**
     * Return whether the current operation should still continue running.
     *
     * <p>This method can be called frequently.</p>
     *
     * @return true if the operation should continue running
     */
    boolean shouldContinue();

}