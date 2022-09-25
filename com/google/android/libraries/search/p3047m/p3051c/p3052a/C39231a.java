package com.google.android.libraries.search.p3047m.p3051c.p3052a;

import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.m.c.a.a */
/* compiled from: PG */
final class C39231a extends C39233c {

    /* renamed from: a */
    private final Duration f103355a;

    public C39231a(Duration duration) {
        if (duration != null) {
            this.f103355a = duration;
            return;
        }
        throw new NullPointerException("Null timeSinceConsentDeclined");
    }

    /* renamed from: a */
    public final Duration mo41737a() {
        return this.f103355a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39233c) {
            return this.f103355a.equals(((C39233c) obj).mo41737a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f103355a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f103355a.toString();
        return "UnconsentedLocationViolation{timeSinceConsentDeclined=" + obj + "}";
    }
}
