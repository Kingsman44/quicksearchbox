package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.az */
/* compiled from: PG */
final class C123318az extends C123385dl {

    /* renamed from: a */
    private final String f341069a;

    /* renamed from: b */
    private final Predicate f341070b;

    public C123318az(String str, Predicate predicate) {
        this.f341069a = str;
        this.f341070b = predicate;
    }

    /* renamed from: a */
    public final Predicate mo105984a() {
        return this.f341070b;
    }

    /* renamed from: b */
    public final String mo105985b() {
        return this.f341069a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C123385dl) {
            C123385dl dlVar = (C123385dl) obj;
            return this.f341069a.equals(dlVar.mo105985b()) && this.f341070b.equals(dlVar.mo105984a());
        }
    }

    public final int hashCode() {
        return ((this.f341069a.hashCode() ^ 1000003) * 1000003) ^ this.f341070b.hashCode();
    }

    public final String toString() {
        String str = this.f341069a;
        String obj = this.f341070b.toString();
        return "Token{source=" + str + ", predicate=" + obj + "}";
    }
}
