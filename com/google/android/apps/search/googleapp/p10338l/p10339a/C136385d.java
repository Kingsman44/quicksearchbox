package com.google.android.apps.search.googleapp.p10338l.p10339a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.l.a.d */
/* compiled from: PG */
public final /* synthetic */ class C136385d implements C136383b {

    /* renamed from: a */
    private final /* synthetic */ String f371313a = "debuggable_fragments";

    /* renamed from: b */
    private final /* synthetic */ String f371314b;

    public C136385d(String str) {
        this.f371314b = str;
    }

    /* renamed from: a */
    public final /* synthetic */ String mo112961a() {
        return this.f371314b;
    }

    public final /* synthetic */ Class annotationType() {
        return C136383b.class;
    }

    /* renamed from: b */
    public final /* synthetic */ String mo112962b() {
        return this.f371313a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C136383b)) {
            return false;
        }
        C136383b bVar = (C136383b) obj;
        return C69664n.m101066l(this.f371313a, bVar.mo112962b()) && C69664n.m101066l(this.f371314b, bVar.mo112961a());
    }

    public final int hashCode() {
        return (this.f371313a.hashCode() ^ 1457550950) + (this.f371314b.hashCode() ^ -1205216362);
    }

    public final String toString() {
        String str = this.f371313a;
        String str2 = this.f371314b;
        return "@com.google.android.apps.search.googleapp.feedback.statedump.ComplexDebuggableItem(psbdKey=" + str + ", dataLabel=" + str2 + ")";
    }
}
