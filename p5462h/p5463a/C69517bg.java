package p5462h.p5463a;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.bg */
/* compiled from: PG */
class C69517bg extends C69516bf {
    /* renamed from: c */
    public static final Set m100889c(Set set, Iterable iterable) {
        C69664n.m101061g(set, "<this>");
        C69664n.m101061g(iterable, "elements");
        Collection a = C69538v.m100942a(iterable, set);
        if (a.isEmpty()) {
            return C69540x.m100846ab(set);
        }
        if (a instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object next : set) {
                if (!a.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(a);
        return linkedHashSet2;
    }

    /* renamed from: d */
    public static final Set m100890d(Set set, Object obj) {
        C69664n.m101061g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C69505av.m100860b(set.size()));
        boolean z = false;
        for (Object next : set) {
            boolean z2 = true;
            if (!z && C69664n.m101066l(next, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public static final Set m100891e(Set set, Iterable iterable) {
        int i;
        C69664n.m101061g(set, "<this>");
        C69664n.m101061g(iterable, "elements");
        C69664n.m101061g(iterable, "<this>");
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (valueOf != null) {
            i = set.size() + valueOf.intValue();
        } else {
            int size = set.size();
            i = size + size;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C69505av.m100860b(i));
        linkedHashSet.addAll(set);
        C69540x.m100811r(linkedHashSet, iterable);
        return linkedHashSet;
    }

    /* renamed from: f */
    public static final Set m100892f(Set set, Object obj) {
        C69664n.m101061g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C69505av.m100860b(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
