package com.google.android.apps.search.googleapp.discover.feedback.p10185a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.a.h */
/* compiled from: PG */
public final class C134288h extends C134295o {

    /* renamed from: a */
    public final float f365795a;

    /* renamed from: b */
    private final String f365796b = "Density";

    /* renamed from: c */
    private final C134296p f365797c;

    public C134288h(C134296p pVar, float f) {
        C69664n.m101061g(pVar, "sensitivity");
        this.f365797c = pVar;
        this.f365795a = f;
    }

    /* renamed from: a */
    public final C134296p mo111675a() {
        return this.f365797c;
    }

    /* renamed from: b */
    public final String mo111676b() {
        return this.f365796b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134288h)) {
            return false;
        }
        C134288h hVar = (C134288h) obj;
        return C69664n.m101066l(this.f365796b, hVar.f365796b) && this.f365797c == hVar.f365797c && C69664n.m101066l(Float.valueOf(this.f365795a), Float.valueOf(hVar.f365795a));
    }

    public final int hashCode() {
        return (((this.f365796b.hashCode() * 31) + this.f365797c.hashCode()) * 31) + Float.floatToIntBits(this.f365795a);
    }

    public final String toString() {
        String str = this.f365796b;
        C134296p pVar = this.f365797c;
        float f = this.f365795a;
        return "FloatFeature(name=" + str + ", sensitivity=" + pVar + ", value=" + f + ")";
    }
}
