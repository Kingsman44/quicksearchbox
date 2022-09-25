package com.google.android.apps.gsa.shared.p6976ag.p6980d;

import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.ag.d.a */
/* compiled from: PG */
final class C89119a extends C89128d {

    /* renamed from: a */
    private final C51992gr f241583a;

    /* renamed from: b */
    private final C89126b f241584b;

    /* renamed from: c */
    private final Optional f241585c;

    public C89119a(C51992gr grVar, C89126b bVar, Optional optional) {
        if (grVar != null) {
            this.f241583a = grVar;
            if (bVar != null) {
                this.f241584b = bVar;
                if (optional != null) {
                    this.f241585c = optional;
                    return;
                }
                throw new NullPointerException("Null clientLoggingData");
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null suggestion");
    }

    /* renamed from: a */
    public final C89126b mo83100a() {
        return this.f241584b;
    }

    /* renamed from: b */
    public final C51992gr mo83101b() {
        return this.f241583a;
    }

    /* renamed from: c */
    public final Optional mo83102c() {
        return this.f241585c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89128d) {
            C89128d dVar = (C89128d) obj;
            return this.f241583a.equals(dVar.mo83101b()) && this.f241584b.equals(dVar.mo83100a()) && this.f241585c.equals(dVar.mo83102c());
        }
    }

    public final int hashCode() {
        return ((((this.f241583a.hashCode() ^ 1000003) * 1000003) ^ this.f241584b.hashCode()) * 1000003) ^ this.f241585c.hashCode();
    }

    public final String toString() {
        String obj = this.f241583a.toString();
        String obj2 = this.f241584b.toString();
        String obj3 = this.f241585c.toString();
        return "SuggestionWithType{suggestion=" + obj + ", type=" + obj2 + ", clientLoggingData=" + obj3 + "}";
    }
}
