class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None

def build_binary_tree(arr):
    def build_tree_recursive(index):
        if index >= len(arr) or arr[index] is None:
            return None

        root = TreeNode(arr[index])
        root.right = build_tree_recursive(2 * index + 1)
        root.left = build_tree_recursive(2 * index + 2)

        return root

    return build_tree_recursive(0)

def inorder_traversal(node):
    if node:
        
        inorder_traversal(node.left)
        print(node.val, end=" ")
        inorder_traversal(node.right)

# Example usage:

    # Sample array representing the binary tree (None means no node)
arr = [4,2,7,1,3,6,9]

root = build_binary_tree(arr)

    # Perform an inorder traversal to verify the tree construction
print(inorder_traversal(root))