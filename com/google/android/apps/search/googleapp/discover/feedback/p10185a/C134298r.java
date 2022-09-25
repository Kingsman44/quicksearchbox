package com.google.android.apps.search.googleapp.discover.feedback.p10185a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.r */
/* compiled from: PG */
public final class C134298r extends C134295o {

    /* renamed from: a */
    public final String f365815a;

    /* renamed from: b */
    private final String f365816b;

    /* renamed from: c */
    private final C134296p f365817c;

    public C134298r(String str, C134296p pVar, String str2) {
        C69664n.m101061g(pVar, "sensitivity");
        C69664n.m101061g(str2, "value");
        this.f365816b = str;
        this.f365817c = pVar;
        this.f365815a = str2;
    }

    /* renamed from: a */
    public final C134296p mo111675a() {
        return this.f365817c;
    }

    /* renamed from: b */
    public final String mo111676b() {
        return this.f365816b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134298r)) {
            return false;
        }
        C134298r rVar = (C134298r) obj;
        return C69664n.m101066l(this.f365816b, rVar.f365816b) && this.f365817c == rVar.f365817c && C69664n.m101066l(this.f365815a, rVar.f365815a);
    }

    public final int hashCode() {
        return (((this.f365816b.hashCode() * 31) + this.f365817c.hashCode()) * 31) + this.f365815a.hashCode();
    }

    public final String toString() {
        String str = this.f365816b;
        C134296p pVar = this.f365817c;
        String str2 = this.f365815a;
        return "StringFeature(name=" + str + ", sensitivity=" + pVar + ", value=" + str2 + ")";
    }
}
