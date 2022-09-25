package com.google.android.libraries.search.location;

import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.location.b */
/* compiled from: PG */
final class C38696b extends C38726z {

    /* renamed from: a */
    private final C39226b f102175a;

    /* renamed from: b */
    private final Duration f102176b;

    /* renamed from: c */
    private final int f102177c;

    public C38696b(C39226b bVar, int i, Duration duration) {
        this.f102175a = bVar;
        this.f102177c = i;
        this.f102176b = duration;
    }

    /* renamed from: a */
    public final C39226b mo41552a() {
        return this.f102175a;
    }

    /* renamed from: b */
    public final Duration mo41553b() {
        return this.f102176b;
    }

    /* renamed from: c */
    public final int mo41554c() {
        return this.f102177c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C38726z) {
            C38726z zVar = (C38726z) obj;
            return this.f102175a.equals(zVar.mo41552a()) && this.f102177c == zVar.mo41554c() && this.f102176b.equals(zVar.mo41553b());
        }
    }

    public final int hashCode() {
        return ((((this.f102175a.hashCode() ^ 1000003) * 1000003) ^ this.f102177c) * 1000003) ^ this.f102176b.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f102175a.getNumber());
        int i = this.f102177c;
        String str = i != 1 ? i != 2 ? "REAL_TIME" : "FOREGROUND" : "BACKGROUND";
        String obj = this.f102176b.toString();
        return "LocationRequest{attributionId=" + num + ", requestType=" + str + ", maxAge=" + obj + "}";
    }
}
