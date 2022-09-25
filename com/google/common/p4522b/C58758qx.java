package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import com.google.common.base.C58846bj;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.common.b.qx */
/* compiled from: PG */
public final class C58758qx {
    /* renamed from: a */
    public static int m90643a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* renamed from: b */
    public static C58528ij m90644b(Iterable iterable) {
        if (iterable instanceof C58476gl) {
            return (C58476gl) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.isEmpty()) {
                return C58733pz.f156496a;
            }
            return C58476gl.m89803b(EnumSet.copyOf(collection));
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C58733pz.f156496a;
        }
        EnumSet of = EnumSet.of((Enum) it.next());
        C58570jy.m90163o(of, it);
        return C58476gl.m89803b(of);
    }

    /* renamed from: c */
    public static C58756qv m90645c(Set set, Set set2) {
        C58838bb.m90866a(set, "set1");
        C58838bb.m90866a(set2, "set2");
        return new C58749qo(set, set2);
    }

    /* renamed from: d */
    public static C58756qv m90646d(Set set, Set set2) {
        C58838bb.m90866a(set, "set1");
        C58838bb.m90866a(set2, "set2");
        return new C58747qm(set, set2);
    }

    /* renamed from: e */
    public static C58756qv m90647e(Set set, Set set2) {
        C58838bb.m90866a(set, "set1");
        C58838bb.m90866a(set2, "set2");
        return new C58745qk(set, set2);
    }

    /* renamed from: f */
    public static HashSet m90648f(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new HashSet((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        HashSet hashSet = new HashSet();
        C58570jy.m90163o(hashSet, it);
        return hashSet;
    }

    /* renamed from: g */
    public static HashSet m90649g(int i) {
        return new HashSet(C58662ni.m90342a(i));
    }

    /* renamed from: h */
    public static NavigableSet m90650h(NavigableSet navigableSet, C58839bc bcVar) {
        if (navigableSet instanceof C58753qs) {
            C58753qs qsVar = (C58753qs) navigableSet;
            return new C58752qr((NavigableSet) qsVar.f155948a, C58846bj.m90899a(qsVar.f155949b, bcVar));
        }
        navigableSet.getClass();
        bcVar.getClass();
        return new C58752qr(navigableSet, bcVar);
    }

    /* renamed from: i */
    public static NavigableSet m90651i(NavigableSet navigableSet) {
        return ((navigableSet instanceof C58471gg) || (navigableSet instanceof C58757qw)) ? navigableSet : new C58757qw(navigableSet);
    }

    /* renamed from: j */
    public static Set m90652j(Set set, C58839bc bcVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof C58753qs) {
                C58753qs qsVar = (C58753qs) sortedSet;
                return new C58754qt((SortedSet) qsVar.f155948a, C58846bj.m90899a(qsVar.f155949b, bcVar));
            }
            sortedSet.getClass();
            bcVar.getClass();
            return new C58754qt(sortedSet, bcVar);
        } else if (set instanceof C58753qs) {
            C58753qs qsVar2 = (C58753qs) set;
            return new C58753qs((Set) qsVar2.f155948a, C58846bj.m90899a(qsVar2.f155949b, bcVar));
        } else {
            set.getClass();
            bcVar.getClass();
            return new C58753qs(set, bcVar);
        }
    }

    /* renamed from: k */
    public static Set m90653k() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: l */
    static boolean m90654l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    /* renamed from: n */
    static boolean m90656n(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: m */
    static boolean m90655m(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof C58692ol) {
            collection = ((C58692ol) collection).mo54974l();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m90656n(set, collection.iterator());
        }
        return C58570jy.m90166r(set.iterator(), collection);
    }
}
