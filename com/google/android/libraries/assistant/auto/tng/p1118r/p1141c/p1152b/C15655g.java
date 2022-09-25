package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.b.g */
/* compiled from: PG */
final class C15655g extends C15666r {

    /* renamed from: a */
    private final C15663o f46780a;

    /* renamed from: b */
    private final C15664p f46781b;

    /* renamed from: c */
    private final C15660l f46782c;

    /* renamed from: d */
    private final C60870cx f46783d;

    /* renamed from: e */
    private final int f46784e;

    public C15655g(C15663o oVar, C15664p pVar, C15660l lVar, int i, C60870cx cxVar) {
        this.f46780a = oVar;
        this.f46781b = pVar;
        this.f46782c = lVar;
        this.f46784e = i;
        this.f46783d = cxVar;
    }

    /* renamed from: a */
    public final C15660l mo22475a() {
        return this.f46782c;
    }

    /* renamed from: b */
    public final C15663o mo22476b() {
        return this.f46780a;
    }

    /* renamed from: c */
    public final C15664p mo22477c() {
        return this.f46781b;
    }

    /* renamed from: d */
    public final C60870cx mo22478d() {
        return this.f46783d;
    }

    /* renamed from: e */
    public final int mo22479e() {
        return this.f46784e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15666r) {
            C15666r rVar = (C15666r) obj;
            return this.f46780a.equals(rVar.mo22476b()) && this.f46781b.equals(rVar.mo22477c()) && this.f46782c.equals(rVar.mo22475a()) && this.f46784e == rVar.mo22479e() && this.f46783d.equals(rVar.mo22478d());
        }
    }

    public final int hashCode() {
        return ((((((((this.f46780a.hashCode() ^ 1000003) * 1000003) ^ this.f46781b.hashCode()) * 1000003) ^ this.f46782c.hashCode()) * 1000003) ^ this.f46784e) * 1000003) ^ this.f46783d.hashCode();
    }

    public final String toString() {
        String obj = this.f46780a.toString();
        String obj2 = this.f46781b.toString();
        String obj3 = this.f46782c.toString();
        int i = this.f46784e;
        String obj4 = this.f46783d.toString();
        return "OfflineFulfillmentRequest{nluResult=" + obj + ", queryInfo=" + obj2 + ", accountInfo=" + obj3 + ", vertical=" + C15665q.m32452a(i) + ", deviceCapabilitiesOptionalFuture=" + obj4 + "}";
    }
}
