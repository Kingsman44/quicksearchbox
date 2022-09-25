package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.al */
/* compiled from: PG */
public final class C123936al implements C123938an {

    /* renamed from: a */
    private final Throwable f342332a;

    public C123936al(Throwable th) {
        this.f342332a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C123936al) && C69664n.m101066l(this.f342332a, ((C123936al) obj).f342332a);
    }

    public final int hashCode() {
        return this.f342332a.hashCode();
    }

    public final String toString() {
        Throwable th = this.f342332a;
        return "Failure(error=" + th + ")";
    }
}
