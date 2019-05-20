/*
 * This file is part of LuckPerms, licensed under the MIT License.
 *
 *  Copyright (c) lucko (Luck) <luck@lucko.me>
 *  Copyright (c) contributors
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

package me.lucko.luckperms.api.node.types;

import me.lucko.luckperms.api.LuckPermsProvider;
import me.lucko.luckperms.api.node.Node;
import me.lucko.luckperms.api.node.NodeBuilder;
import me.lucko.luckperms.api.node.ScopedNode;

import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * A sub-type of {@link Node} used to mark the weight of the node's holder.
 */
public interface WeightNode extends ScopedNode<WeightNode, WeightNode.Builder> {

    /**
     * Gets the weight value.
     *
     * @return the weight
     */
    int getWeight();

    /**
     * Creates a {@link WeightNode} builder.
     *
     * @return the builder
     */
    static @NonNull Builder builder() {
        return LuckPermsProvider.get().getNodeBuilderRegistry().forWeight();
    }

    /**
     * Creates a {@link WeightNode} builder.
     *
     * @param weight the weight to set
     * @return the builder
     */
    static @NonNull Builder builder(int weight) {
        return builder().weight(weight);
    }

    /**
     * A {@link WeightNode} builder.
     */
    interface Builder extends NodeBuilder<WeightNode, Builder> {

        /**
         * Sets the weight.
         *
         * @param weight the weight
         * @return the builder
         */
        @NonNull Builder weight(int weight);

    }

}
