package com.zagniotov.puzzles.trees;

import com.zagniotov.puzzles.common.TreeNode;

class BinaryTreeMaxDepthTake1 {

    public int maxDepth(final TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null) {
            return maxDepth(root.right) + 1;
        }

        if (root.right == null) {
            return maxDepth(root.left) + 1;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
