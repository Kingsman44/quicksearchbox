package com.google.common.p4522b;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58839bc;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.common.b.eu */
/* compiled from: PG */
public abstract class C58431eu implements Iterable {

    /* renamed from: a */
    private final C58833ax f156044a;

    protected C58431eu() {
        this.f156044a = C58836b.f156633a;
    }

    public C58431eu(Iterable iterable) {
        this.f156044a = C58833ax.m90834k(iterable);
    }

    /* renamed from: b */
    public static C58431eu m89652b(Iterable iterable) {
        iterable.getClass();
        return new C58428er(iterable);
    }

    /* renamed from: c */
    public static C58431eu m89653c(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new C58430et(iterableArr);
    }

    /* renamed from: f */
    public static C58431eu m89654f(Iterable iterable) {
        if (iterable instanceof C58431eu) {
            return (C58431eu) iterable;
        }
        return new C58427eq(iterable, iterable);
    }

    /* renamed from: a */
    public final C58833ax mo55244a() {
        Iterator it = mo55248h().iterator();
        return it.hasNext() ? C58833ax.m90834k(it.next()) : C58836b.f156633a;
    }

    /* renamed from: d */
    public final C58431eu mo55245d() {
        return m89654f(C58557jl.m90123d(mo55248h()));
    }

    /* renamed from: e */
    public final C58431eu mo55246e(C58839bc bcVar) {
        return m89654f(C58557jl.m90124e(mo55248h(), bcVar));
    }

    /* renamed from: g */
    public final C58431eu mo55247g(C58817ah ahVar) {
        return m89654f(C58557jl.m90127h(mo55248h(), ahVar));
    }

    /* renamed from: h */
    public final Iterable mo55248h() {
        return (Iterable) this.f156044a.mo56109e(this);
    }

    public String toString() {
        return C58557jl.m90135p(mo55248h());
    }

    /* renamed from: i */
    public final void mo55249i(Collection collection) {
        collection.getClass();
        Iterable<Object> h = mo55248h();
        if (h instanceof Collection) {
            collection.addAll((Collection) h);
            return;
        }
        for (Object add : h) {
            collection.add(add);
        }
    }
}
