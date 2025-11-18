/**
 * This class represents the entire Tree structure.
 * It primarily holds a reference to the root node of the tree.
 */
public class Tree<T> {
    public TreeNode<T> root;

    /**
     * Constructor for the Tree.
     * @param root The root node of the tree.
     */
    public Tree(TreeNode<T> root) {
        this.root = root;
    }

    /**
     * A method to print all the nodes in the tree in a hierarchical way.
     * This is a form of traversal.
     */
    public void printTree() {
        printTreeRecursive(root, 0);
    }

    /**
     * A private helper method to perform the recursive printing.
     * @param node The current node to print.
     * @param level The current depth in the tree, used for indentation.
     */
    private void printTreeRecursive(TreeNode<T> node, int level) {
        // Stop condition: if the node is null, do nothing.
        if (node == null) {
            return;
        }

        // Print the current node's data with indentation.
        for (int i = 0; i < level; i++) {
            System.out.print("  "); // Add two spaces for each level of depth
        }
        System.out.println("- " + node.data);

        // Recursive step: call this method for all children.
        for (TreeNode<T> child : node.children) {
            printTreeRecursive(child, level + 1); // Increase the level for children
        }
    }
}

