package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.an */
/* compiled from: PG */
final class C123306an extends C123507m {

    /* renamed from: a */
    private final String f341046a;

    /* renamed from: b */
    private final C123506l f341047b;

    public C123306an(String str, C123506l lVar) {
        this.f341046a = str;
        this.f341047b = lVar;
    }

    /* renamed from: a */
    public final C123506l mo105936a() {
        return this.f341047b;
    }

    /* renamed from: b */
    public final String mo105937b() {
        return null;
    }

    /* renamed from: c */
    public final String mo105938c() {
        return this.f341046a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123507m) {
            C123507m mVar = (C123507m) obj;
            return this.f341046a.equals(mVar.mo105938c()) && this.f341047b.equals(mVar.mo105936a()) && mVar.mo105937b() == null;
        }
    }

    public final int hashCode() {
        return (((this.f341046a.hashCode() ^ 1000003) * 1000003) ^ this.f341047b.hashCode()) * 1000003;
    }

    public final String toString() {
        String str = this.f341046a;
        String obj = this.f341047b.toString();
        return "AppSearchClassificationResult{query=" + str + ", target=" + obj + ", origin=null}";
    }
}
