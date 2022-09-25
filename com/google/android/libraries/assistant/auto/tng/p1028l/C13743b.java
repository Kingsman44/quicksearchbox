package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.b */
/* compiled from: PG */
final class C13743b extends C13753bf {

    /* renamed from: a */
    private final C60870cx f41907a;

    /* renamed from: b */
    private final C60870cx f41908b;

    /* renamed from: c */
    private final C58817ah f41909c;

    /* renamed from: d */
    private final Optional f41910d;

    public C13743b(C60870cx cxVar, C60870cx cxVar2, C58817ah ahVar, Optional optional) {
        this.f41907a = cxVar;
        this.f41908b = cxVar2;
        this.f41909c = ahVar;
        this.f41910d = optional;
    }

    /* renamed from: a */
    public final C58817ah mo21239a() {
        return this.f41909c;
    }

    /* renamed from: b */
    public final C60870cx mo21240b() {
        return this.f41908b;
    }

    /* renamed from: c */
    public final C60870cx mo21241c() {
        return this.f41907a;
    }

    /* renamed from: d */
    public final Optional mo21242d() {
        return this.f41910d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13753bf) {
            C13753bf bfVar = (C13753bf) obj;
            return this.f41907a.equals(bfVar.mo21241c()) && this.f41908b.equals(bfVar.mo21240b()) && this.f41909c.equals(bfVar.mo21239a()) && this.f41910d.equals(bfVar.mo21242d());
        }
    }

    public final int hashCode() {
        return ((((((this.f41907a.hashCode() ^ 1000003) * 1000003) ^ this.f41908b.hashCode()) * 1000003) ^ this.f41909c.hashCode()) * 1000003) ^ this.f41910d.hashCode();
    }

    public final String toString() {
        String obj = this.f41907a.toString();
        String obj2 = this.f41908b.toString();
        String obj3 = this.f41909c.toString();
        String valueOf = String.valueOf(this.f41910d);
        return "FetchResponse{response=" + obj + ", executionComplete=" + obj2 + ", cancelFunction=" + obj3 + ", nonPuntFulfillmentDetectorFunction=" + valueOf + "}";
    }
}
