package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a;

import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.a.a.d */
/* compiled from: PG */
final class C12178d extends C12182h {

    /* renamed from: a */
    private final C52081en f38885a;

    /* renamed from: b */
    private final C58495hd f38886b;

    /* renamed from: c */
    private final Optional f38887c;

    public C12178d(C52081en enVar, C58495hd hdVar, Optional optional) {
        this.f38885a = enVar;
        this.f38886b = hdVar;
        this.f38887c = optional;
    }

    /* renamed from: a */
    public final C52081en mo20475a() {
        return this.f38885a;
    }

    /* renamed from: b */
    public final C58495hd mo20476b() {
        return this.f38886b;
    }

    /* renamed from: c */
    public final Optional mo20477c() {
        return this.f38887c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12182h) {
            C12182h hVar = (C12182h) obj;
            return this.f38885a.equals(hVar.mo20475a()) && C58662ni.m90356o(this.f38886b, hVar.mo20476b()) && this.f38887c.equals(hVar.mo20477c());
        }
    }

    public final int hashCode() {
        return ((((this.f38885a.hashCode() ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f38886b.entrySet())) * 1000003) ^ this.f38887c.hashCode();
    }

    public final String toString() {
        String obj = this.f38885a.toString();
        String i = C58662ni.m90350i(this.f38886b);
        String valueOf = String.valueOf(this.f38887c);
        return "ConversationDeltaStreamChunk{conversationDelta=" + obj + ", clientOpMetadataMap=" + i + ", dialogToken=" + valueOf + "}";
    }
}
