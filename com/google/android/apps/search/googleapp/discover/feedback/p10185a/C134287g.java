package com.google.android.apps.search.googleapp.discover.feedback.p10185a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.g */
/* compiled from: PG */
public final class C134287g extends C134295o {

    /* renamed from: a */
    public final Enum f365792a;

    /* renamed from: b */
    private final String f365793b;

    /* renamed from: c */
    private final C134296p f365794c;

    public C134287g(String str, C134296p pVar, Enum enumR) {
        C69664n.m101061g(pVar, "sensitivity");
        C69664n.m101061g(enumR, "value");
        this.f365793b = str;
        this.f365794c = pVar;
        this.f365792a = enumR;
    }

    /* renamed from: a */
    public final C134296p mo111675a() {
        return this.f365794c;
    }

    /* renamed from: b */
    public final String mo111676b() {
        return this.f365793b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134287g)) {
            return false;
        }
        C134287g gVar = (C134287g) obj;
        return C69664n.m101066l(this.f365793b, gVar.f365793b) && this.f365794c == gVar.f365794c && C69664n.m101066l(this.f365792a, gVar.f365792a);
    }

    public final int hashCode() {
        return (((this.f365793b.hashCode() * 31) + this.f365794c.hashCode()) * 31) + this.f365792a.hashCode();
    }

    public final String toString() {
        String str = this.f365793b;
        C134296p pVar = this.f365794c;
        Enum enumR = this.f365792a;
        return "EnumFeature(name=" + str + ", sensitivity=" + pVar + ", value=" + enumR + ")";
    }
}
