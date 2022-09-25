package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: com.google.common.b.qe */
/* compiled from: PG */
public final class C58739qe extends C58710pc implements Serializable {

    /* renamed from: a */
    public static final C58739qe f156510a = new C58739qe();
    private static final long serialVersionUID = 0;

    private C58739qe() {
    }

    private Object readResolve() {
        return f156510a;
    }

    /* renamed from: c */
    public final C58710pc mo55783c() {
        return C58701ou.f156429a;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo55810e(Iterable iterable) {
        return (Comparable) C58701ou.f156429a.mo55813h(iterable);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo55811f(Iterator it) {
        return (Comparable) C58701ou.f156429a.mo55814i(it);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo55812g(Object obj, Object obj2) {
        return (Comparable) C58701ou.f156429a.mo55815j((Comparable) obj, (Comparable) obj2);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Object mo55813h(Iterable iterable) {
        return (Comparable) C58701ou.f156429a.mo55810e(iterable);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Object mo55814i(Iterator it) {
        return (Comparable) C58701ou.f156429a.mo55811f(it);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo55815j(Object obj, Object obj2) {
        return (Comparable) C58701ou.f156429a.mo55812g((Comparable) obj, (Comparable) obj2);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
