package com.google.common.p4522b;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.common.b.fo */
/* compiled from: PG */
final class C58452fo extends AbstractMap implements Serializable, C58334be {

    /* renamed from: a */
    private final C58458fu f156061a;

    /* renamed from: b */
    private transient Set f156062b;

    public C58452fo(C58458fu fuVar) {
        this.f156061a = fuVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f156061a.f156077g = this;
    }

    public final void clear() {
        this.f156061a.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.f156061a.containsValue(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f156061a.containsKey(obj);
    }

    /* renamed from: e */
    public final C58334be mo55027e() {
        throw null;
    }

    public final Set entrySet() {
        Set set = this.f156062b;
        if (set != null) {
            return set;
        }
        C58453fp fpVar = new C58453fp(this.f156061a);
        this.f156062b = fpVar;
        return fpVar;
    }

    public final Object get(Object obj) {
        C58458fu fuVar = this.f156061a;
        int c = fuVar.mo55334c(obj, C58462fy.m89758b(obj));
        if (c == -1) {
            return null;
        }
        return fuVar.f156071a[c];
    }

    /* renamed from: h */
    public final Set mo55028h() {
        throw null;
    }

    public final Set keySet() {
        return this.f156061a.values();
    }

    public final Object put(Object obj, Object obj2) {
        return this.f156061a.mo55345k(obj, obj2);
    }

    public final Object remove(Object obj) {
        C58458fu fuVar = this.f156061a;
        int b = C58462fy.m89758b(obj);
        int c = fuVar.mo55334c(obj, b);
        if (c == -1) {
            return null;
        }
        Object obj2 = fuVar.f156071a[c];
        fuVar.mo55343i(c, b);
        return obj2;
    }

    public final int size() {
        return this.f156061a.f156073c;
    }

    public final /* synthetic */ Collection values() {
        return this.f156061a.keySet();
    }
}
