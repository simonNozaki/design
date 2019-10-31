import java.util.List;
import java.util.Collection;
import java.util.function.Predicate;


public final class CollectionQueryParser<T> implements CollectionQuery<T> {

    /**
     * TODO: staticコンテキストからインスタンス生成できる？初期ロードでメモリ確保されない？
     */
    public static <T> Parser<T> of(List<T> list) {
        return new Parser<T>(list);
    }

    private static class Parser<T> {

        private final Collection<T> source;

        private final Collection<T> target;

        public Parser(Collection<T> collection) {
            this.source = collection;
            this.target = null;
        }

        public Parser<T> select() {
            return new Parser<T>(this.source);
        }

        public <R> Parser<T> where(Predicate<R> predicate) {
            if(predicate.test()){
                
            }
            return new Parser<T>(this.source);
        }

        public Collection<T> execute(){
            return this.target;
        }

    }

}