package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.C37215b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.h */
/* compiled from: PG */
final class C14138h extends C14135e {

    /* renamed from: a */
    public final C37215b f42854a;

    /* renamed from: b */
    public final String f42855b;

    /* renamed from: c */
    public final long f42856c;

    /* renamed from: d */
    public final Optional f42857d;

    /* renamed from: e */
    public final Optional f42858e;

    public C14138h(C37215b bVar, String str, long j, Optional optional, Optional optional2) {
        this.f42854a = bVar;
        this.f42855b = str;
        this.f42856c = j;
        this.f42857d = optional;
        this.f42858e = optional2;
    }

    /* renamed from: a */
    public final long mo21449a() {
        return this.f42856c;
    }

    /* renamed from: b */
    public final C37215b mo21450b() {
        return this.f42854a;
    }

    /* renamed from: c */
    public final Optional mo21451c() {
        return this.f42858e;
    }

    /* renamed from: d */
    public final Optional mo21452d() {
        return this.f42857d;
    }

    /* renamed from: e */
    public final String mo21453e() {
        return this.f42855b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14135e) {
            C14135e eVar = (C14135e) obj;
            return this.f42854a.equals(eVar.mo21450b()) && this.f42855b.equals(eVar.mo21453e()) && this.f42856c == eVar.mo21449a() && this.f42857d.equals(eVar.mo21452d()) && this.f42858e.equals(eVar.mo21451c());
        }
    }

    public final int hashCode() {
        int hashCode = this.f42854a.hashCode();
        int hashCode2 = this.f42855b.hashCode();
        long j = this.f42856c;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f42857d.hashCode()) * 1000003) ^ this.f42858e.hashCode();
    }

    public final String toString() {
        String obj = this.f42854a.toString();
        String str = this.f42855b;
        long j = this.f42856c;
        String valueOf = String.valueOf(this.f42857d);
        String valueOf2 = String.valueOf(this.f42858e);
        return "Params{appFlowLogger=" + obj + ", eventName=" + str + ", requestId=" + j + ", timestamp=" + valueOf + ", metadata=" + valueOf2 + "}";
    }
}
