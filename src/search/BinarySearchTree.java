package search;

/**
 * Created by t-hanxl on 7/11/2017.
 */
public class BinarySearchTree {
    private BSTNode root;

    private static class BSTNode<T extends  Comparable<T>,V>{
        T value;
        private BSTNode left;
        private BSTNode right;
        private int N;

        public BSTNode(T value,int N){
            this.value=value;
            this.N=N;
        }

        public int size(){
            return 0;
        }

        public int size(BSTNode node){
            return  0;
        }

        public

    }
}
