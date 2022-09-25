package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.d */
/* compiled from: PG */
public final class C123920d implements C123924h {

    /* renamed from: a */
    public final Throwable f342280a;

    /* renamed from: b */
    private final C123918b f342281b;

    public C123920d(C123918b bVar, Throwable th) {
        C69664n.m101061g(bVar, "appHeadphoneContext");
        C69664n.m101061g(th, "throwable");
        this.f342281b = bVar;
        this.f342280a = th;
    }

    /* renamed from: a */
    public final C123918b mo106181a() {
        return this.f342281b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C123920d)) {
            return false;
        }
        C123920d dVar = (C123920d) obj;
        return C69664n.m101066l(this.f342281b, dVar.f342281b) && C69664n.m101066l(this.f342280a, dVar.f342280a);
    }

    public final int hashCode() {
        return (this.f342281b.hashCode() * 31) + this.f342280a.hashCode();
    }

    public final String toString() {
        C123918b bVar = this.f342281b;
        Throwable th = this.f342280a;
        return "Failed(appHeadphoneContext=" + bVar + ", throwable=" + th + ")";
    }
}
