package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.al */
/* compiled from: PG */
public final class C46603al extends C46605an {

    /* renamed from: a */
    public final Object f121792a;

    /* renamed from: b */
    public final C46607ap f121793b;

    public C46603al(Object obj, C46607ap apVar) {
        this.f121792a = obj;
        this.f121793b = apVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46603al)) {
            return false;
        }
        C46603al alVar = (C46603al) obj;
        return C69664n.m101066l(this.f121792a, alVar.f121792a) && C69664n.m101066l(this.f121793b, alVar.f121793b);
    }

    public final int hashCode() {
        Object obj = this.f121792a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C46607ap apVar = this.f121793b;
        if (apVar != null) {
            i = apVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        Object obj = this.f121792a;
        C46607ap apVar = this.f121793b;
        return "Rereading(staleResponse=" + obj + ", cause=" + apVar + ")";
    }
}
