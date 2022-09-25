package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.z */
/* compiled from: PG */
public final class C58916z extends C58810aa implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final C58810aa f156756a;

    public C58916z(C58810aa aaVar) {
        this.f156756a = aaVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo17535b(Object obj) {
        throw new AssertionError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Object mo17536c(Object obj) {
        throw new AssertionError();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58916z) {
            return this.f156756a.equals(((C58916z) obj).f156756a);
        }
        return false;
    }

    /* renamed from: fP */
    public final Object mo56068fP(Object obj) {
        return this.f156756a.mo56070hd(obj);
    }

    public final int hashCode() {
        return this.f156756a.hashCode() ^ -1;
    }

    /* renamed from: hd */
    public final Object mo56070hd(Object obj) {
        return this.f156756a.mo56068fP(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C58810aa aaVar = this.f156756a;
        sb.append(aaVar);
        return aaVar.toString().concat(".reverse()");
    }
}
