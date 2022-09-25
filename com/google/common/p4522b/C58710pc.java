package com.google.common.p4522b;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.common.b.pc */
/* compiled from: PG */
public abstract class C58710pc implements Comparator {
    protected C58710pc() {
    }

    /* renamed from: d */
    public static C58710pc m90487d(Comparator comparator) {
        if (comparator instanceof C58710pc) {
            return (C58710pc) comparator;
        }
        return new C58389df(comparator);
    }

    /* renamed from: b */
    public C58710pc mo55782b() {
        return new C58703ow(this);
    }

    /* renamed from: c */
    public C58710pc mo55783c() {
        return new C58740qf(this);
    }

    public abstract int compare(Object obj, Object obj2);

    /* renamed from: e */
    public Object mo55810e(Iterable iterable) {
        return mo55811f(iterable.iterator());
    }

    /* renamed from: f */
    public Object mo55811f(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = mo55812g(next, it.next());
        }
        return next;
    }

    /* renamed from: g */
    public Object mo55812g(Object obj, Object obj2) {
        return compare(obj, obj2) >= 0 ? obj : obj2;
    }

    /* renamed from: h */
    public Object mo55813h(Iterable iterable) {
        return mo55814i(iterable.iterator());
    }

    /* renamed from: i */
    public Object mo55814i(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = mo55815j(next, it.next());
        }
        return next;
    }

    /* renamed from: j */
    public Object mo55815j(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }

    /* renamed from: k */
    public final List mo55816k(Iterable iterable) {
        Object[] v = C58557jl.m90141v(iterable);
        Arrays.sort(v, this);
        return C58597ky.m90211b(Arrays.asList(v));
    }

    /* renamed from: lC */
    public C58710pc mo55784lC() {
        return new C58702ov(this);
    }
}
