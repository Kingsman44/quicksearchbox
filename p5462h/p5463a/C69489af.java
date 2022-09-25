package p5462h.p5463a;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import p5462h.p5473f.p5475b.C69651ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.af */
/* compiled from: PG */
class C69489af extends C69488ae {
    /* renamed from: q */
    public static final Object m100810q(List list) {
        if (!list.isEmpty()) {
            return list.remove(C69540x.m100945c(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: r */
    public static final void m100811r(Collection collection, Iterable iterable) {
        C69664n.m101061g(collection, "<this>");
        C69664n.m101061g(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    /* renamed from: s */
    public static final void m100812s(Collection collection, Object[] objArr) {
        C69664n.m101061g(collection, "<this>");
        collection.addAll(C69531o.m100923a(objArr));
    }

    /* renamed from: t */
    public static final void m100813t(Collection collection, Iterable iterable) {
        C69664n.m101061g(collection, "<this>");
        C69664n.m101061g(iterable, "elements");
        Collection a = C69538v.m100942a(iterable, collection);
        C69651ah.m101038c(collection);
        collection.removeAll(a);
    }
}
