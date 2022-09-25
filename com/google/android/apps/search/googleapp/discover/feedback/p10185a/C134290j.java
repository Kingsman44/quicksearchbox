package com.google.android.apps.search.googleapp.discover.feedback.p10185a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.j */
/* compiled from: PG */
public final class C134290j extends C134295o {

    /* renamed from: a */
    public final int f365800a;

    /* renamed from: b */
    private final String f365801b;

    /* renamed from: c */
    private final C134296p f365802c;

    public C134290j(String str, C134296p pVar, int i) {
        C69664n.m101061g(pVar, "sensitivity");
        this.f365801b = str;
        this.f365802c = pVar;
        this.f365800a = i;
    }

    /* renamed from: a */
    public final C134296p mo111675a() {
        return this.f365802c;
    }

    /* renamed from: b */
    public final String mo111676b() {
        return this.f365801b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134290j)) {
            return false;
        }
        C134290j jVar = (C134290j) obj;
        return C69664n.m101066l(this.f365801b, jVar.f365801b) && this.f365802c == jVar.f365802c && this.f365800a == jVar.f365800a;
    }

    public final int hashCode() {
        return (((this.f365801b.hashCode() * 31) + this.f365802c.hashCode()) * 31) + this.f365800a;
    }

    public final String toString() {
        String str = this.f365801b;
        C134296p pVar = this.f365802c;
        int i = this.f365800a;
        return "IntFeature(name=" + str + ", sensitivity=" + pVar + ", value=" + i + ")";
    }
}
