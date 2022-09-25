package com.google.android.apps.search.assistant.platform.p9005b.p9036b;

import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.b.b.b */
/* compiled from: PG */
final class C119932b extends C119937f {

    /* renamed from: a */
    private final C52091ex f334007a;

    /* renamed from: b */
    private final Optional f334008b;

    /* renamed from: c */
    private final C58495hd f334009c;

    public C119932b(C52091ex exVar, Optional optional, C58495hd hdVar) {
        this.f334007a = exVar;
        this.f334008b = optional;
        this.f334009c = hdVar;
    }

    /* renamed from: a */
    public final C52091ex mo104571a() {
        return this.f334007a;
    }

    /* renamed from: b */
    public final C58495hd mo104572b() {
        return this.f334009c;
    }

    /* renamed from: c */
    public final Optional mo104573c() {
        return this.f334008b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C119937f) {
            C119937f fVar = (C119937f) obj;
            return this.f334007a.equals(fVar.mo104571a()) && this.f334008b.equals(fVar.mo104573c()) && this.f334009c.equals(fVar.mo104572b());
        }
    }

    public final int hashCode() {
        return ((((this.f334007a.hashCode() ^ 1000003) * 1000003) ^ this.f334008b.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f334009c.entrySet());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f334007a);
        String valueOf2 = String.valueOf(this.f334008b);
        String valueOf3 = String.valueOf(this.f334009c);
        return "InitialRequestContext{conversationParams=" + valueOf + ", userAgent=" + valueOf2 + ", contextHeader=" + valueOf3 + "}";
    }
}
