package com.google.android.libraries.gsa.conversation.p1855h;

import com.google.assistant.p3897e.p3921j.C52070ec;

/* renamed from: com.google.android.libraries.gsa.conversation.h.j */
/* compiled from: PG */
final class C22706j extends C22715s {

    /* renamed from: a */
    private final String f62499a;

    /* renamed from: b */
    private final C52070ec f62500b;

    /* renamed from: c */
    private final C22714r f62501c;

    /* renamed from: d */
    private final long f62502d;

    /* renamed from: e */
    private final long f62503e;

    public C22706j(String str, C52070ec ecVar, C22714r rVar, long j, long j2) {
        this.f62499a = str;
        this.f62500b = ecVar;
        this.f62501c = rVar;
        this.f62502d = j;
        this.f62503e = j2;
    }

    /* renamed from: a */
    public final long mo27846a() {
        return this.f62503e;
    }

    /* renamed from: b */
    public final long mo27847b() {
        return this.f62502d;
    }

    /* renamed from: c */
    public final C22714r mo27848c() {
        return this.f62501c;
    }

    /* renamed from: d */
    public final C52070ec mo27849d() {
        return this.f62500b;
    }

    /* renamed from: e */
    public final String mo27850e() {
        return this.f62499a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22715s) {
            C22715s sVar = (C22715s) obj;
            return this.f62499a.equals(sVar.mo27850e()) && this.f62500b.equals(sVar.mo27849d()) && this.f62501c.equals(sVar.mo27848c()) && this.f62502d == sVar.mo27847b() && this.f62503e == sVar.mo27846a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f62499a.hashCode();
        int hashCode2 = this.f62500b.hashCode();
        int hashCode3 = this.f62501c.hashCode();
        long j = this.f62502d;
        long j2 = this.f62503e;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.f62499a;
        String obj = this.f62500b.toString();
        String obj2 = this.f62501c.toString();
        long j = this.f62502d;
        long j2 = this.f62503e;
        return "ClientOpResultMetadata{clientOpName=" + str + ", clientOpResult=" + obj + ", clientOpReliabilityStatus=" + obj2 + ", clientOpStartElapsedTimeNanos=" + j + ", clientOpEndElapsedTimeNanos=" + j2 + "}";
    }
}
