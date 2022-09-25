package com.google.common.p4522b;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: com.google.common.b.qf */
/* compiled from: PG */
public final class C58740qf extends C58710pc implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C58710pc f156511a;

    public C58740qf(C58710pc pcVar) {
        this.f156511a = pcVar;
    }

    /* renamed from: c */
    public final C58710pc mo55783c() {
        return this.f156511a;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f156511a.compare(obj2, obj);
    }

    /* renamed from: e */
    public final Object mo55810e(Iterable iterable) {
        return this.f156511a.mo55813h(iterable);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58740qf) {
            return this.f156511a.equals(((C58740qf) obj).f156511a);
        }
        return false;
    }

    /* renamed from: f */
    public final Object mo55811f(Iterator it) {
        return this.f156511a.mo55814i(it);
    }

    /* renamed from: g */
    public final Object mo55812g(Object obj, Object obj2) {
        return this.f156511a.mo55815j(obj, obj2);
    }

    /* renamed from: h */
    public final Object mo55813h(Iterable iterable) {
        return this.f156511a.mo55810e(iterable);
    }

    public final int hashCode() {
        return -this.f156511a.hashCode();
    }

    /* renamed from: i */
    public final Object mo55814i(Iterator it) {
        return this.f156511a.mo55811f(it);
    }

    /* renamed from: j */
    public final Object mo55815j(Object obj, Object obj2) {
        return this.f156511a.mo55812g(obj, obj2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C58710pc pcVar = this.f156511a;
        sb.append(pcVar);
        return pcVar.toString().concat(".reverse()");
    }
}
