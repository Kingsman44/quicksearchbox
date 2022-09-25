package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bk */
/* compiled from: PG */
public final class C32642bk {

    /* renamed from: a */
    public final Object f87490a;

    /* renamed from: b */
    public final boolean f87491b;

    public C32642bk(Object obj, boolean z) {
        this.f87490a = obj;
        this.f87491b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32642bk)) {
            return false;
        }
        C32642bk bkVar = (C32642bk) obj;
        return C69664n.m101066l(this.f87490a, bkVar.f87490a) && this.f87491b == bkVar.f87491b;
    }

    public final int hashCode() {
        return (this.f87490a.hashCode() * 31) + (this.f87491b ? 1 : 0);
    }

    public final String toString() {
        Object obj = this.f87490a;
        boolean z = this.f87491b;
        return "CacheGetResult(result=" + obj + ", isFromLocalCache=" + z + ")";
    }
}
