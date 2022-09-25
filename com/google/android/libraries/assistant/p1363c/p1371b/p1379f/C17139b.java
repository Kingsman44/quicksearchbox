package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import com.google.apps.tiktok.concurrent.C46423aj;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.assistant.c.b.f.b */
/* compiled from: PG */
final class C17139b extends C17150m {

    /* renamed from: a */
    public final C46423aj f49829a;

    /* renamed from: b */
    private final Instant f49830b;

    public C17139b(C46423aj ajVar, Instant instant) {
        this.f49829a = ajVar;
        if (instant != null) {
            this.f49830b = instant;
            return;
        }
        throw new NullPointerException("Null cacheInstant");
    }

    /* renamed from: a */
    public final C46423aj mo23201a() {
        return this.f49829a;
    }

    /* renamed from: b */
    public final Instant mo23202b() {
        return this.f49830b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17150m) {
            C17150m mVar = (C17150m) obj;
            return this.f49829a.equals(mVar.mo23201a()) && this.f49830b.equals(mVar.mo23202b());
        }
    }

    public final int hashCode() {
        return ((this.f49829a.hashCode() ^ 1000003) * 1000003) ^ this.f49830b.hashCode();
    }

    public final String toString() {
        String obj = this.f49829a.toString();
        String obj2 = this.f49830b.toString();
        return "CacheValue{groupOnce=" + obj + ", cacheInstant=" + obj2 + "}";
    }
}
