package p3186j$.util;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: j$.util.Set */
public interface Set<E> extends Collection<E> {

    /* renamed from: j$.util.Set$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<E> {
        public static Spliterator $default$spliterator(java.util.Set set) {
            return new C41056Y(1, (Collection) Objects.requireNonNull(set));
        }

        /* renamed from: of */
        public static <E> java.util.Set<E> m71644of(E... eArr) {
            int length = eArr.length;
            if (length == 0) {
                int i = C41329u.f108056a;
                return C41124s.f107707c;
            } else if (length == 1) {
                return new C41123r(eArr[0]);
            } else {
                if (length != 2) {
                    return new C41124s(eArr);
                }
                return new C41123r(eArr[0], eArr[1]);
            }
        }
    }

    boolean contains(Object obj);

    Iterator<E> iterator();

    Spliterator<E> spliterator();
}
