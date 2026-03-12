import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class TreeTraversals {

    public static <V> void preorder(BinaryTree<V> node, List<V> result) {
        if (node == null) return;
        result.add(node.getValue());          // raíz
        preorder(node.getLeft(), result);     // izquierda
        preorder(node.getRight(), result);    // derecha
    }

    public static <V> void inorder(BinaryTree<V> node, List<V> result) {
        if (node == null) return;
        inorder(node.getLeft(), result);      // izquierda
        result.add(node.getValue());          // raíz
        inorder(node.getRight(), result);     // derecha
    }

    public static <V> void postorder(BinaryTree<V> node, List<V> result) {
        if (node == null) return;
        postorder(node.getLeft(), result);    // izquierda
        postorder(node.getRight(), result);   // derecha
        result.add(node.getValue());          // raíz
    }

    public static <V> void levelorder(BinaryTree<V> node, List<V> result) {
        if (node == null) return;
        Queue<BinaryTree<V>> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            BinaryTree<V> current = queue.poll();
            result.add(current.getValue());
            if (current.getLeft() != null) queue.add(current.getLeft());
            if (current.getRight() != null) queue.add(current.getRight());
        }
    }
}