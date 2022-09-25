package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.a.e */
/* compiled from: PG */
final class C96885e extends C96900t {

    /* renamed from: a */
    private final C42876ab f270867a;

    /* renamed from: b */
    private final C60930r f270868b;

    public C96885e(C42876ab abVar, C60930r rVar) {
        this.f270867a = abVar;
        this.f270868b = rVar;
    }

    /* renamed from: a */
    public final C42876ab mo90369a() {
        return this.f270867a;
    }

    /* renamed from: b */
    public final C60930r mo90370b() {
        return this.f270868b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C96900t) {
            C96900t tVar = (C96900t) obj;
            return this.f270867a.equals(tVar.mo90369a()) && this.f270868b.equals(tVar.mo90370b());
        }
    }

    public final int hashCode() {
        return ((this.f270867a.hashCode() ^ 1000003) * 1000003) ^ this.f270868b.hashCode();
    }

    public final String toString() {
        String obj = this.f270867a.toString();
        String obj2 = this.f270868b.toString();
        return "LamsSubscriptionEntity{autoBubbleData=" + obj + ", syncCallback=" + obj2 + "}";
    }
}
