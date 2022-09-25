package com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9228a;

import com.google.android.libraries.assistant.p1594s.p1597b.C19169bc;

/* renamed from: com.google.android.apps.search.assistant.platform.i.d.a.b */
/* compiled from: PG */
final class C121478b extends C121481e {

    /* renamed from: a */
    private final C19169bc f337152a;

    /* renamed from: b */
    private final long f337153b;

    /* renamed from: c */
    private final long f337154c;

    /* renamed from: d */
    private final long f337155d;

    public C121478b(C19169bc bcVar, long j, long j2, long j3) {
        this.f337152a = bcVar;
        this.f337153b = j;
        this.f337154c = j2;
        this.f337155d = j3;
    }

    /* renamed from: a */
    public final long mo105169a() {
        return this.f337153b;
    }

    /* renamed from: b */
    public final long mo105170b() {
        return this.f337154c;
    }

    /* renamed from: c */
    public final long mo105171c() {
        return this.f337155d;
    }

    /* renamed from: d */
    public final C19169bc mo105172d() {
        return this.f337152a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C121481e) {
            C121481e eVar = (C121481e) obj;
            return this.f337152a.equals(eVar.mo105172d()) && this.f337153b == eVar.mo105169a() && this.f337154c == eVar.mo105170b() && this.f337155d == eVar.mo105171c();
        }
    }

    public final int hashCode() {
        int hashCode = this.f337152a.hashCode();
        long j = this.f337153b;
        long j2 = this.f337154c;
        long j3 = this.f337155d;
        return ((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        String obj = this.f337152a.toString();
        long j = this.f337153b;
        long j2 = this.f337154c;
        long j3 = this.f337155d;
        return "TapasSuggestionRequest{serviceRequest=" + obj + ", requestId=" + j + ", timestampMsec=" + j2 + ", timestampMsecSinceEpoch=" + j3 + "}";
    }
}
