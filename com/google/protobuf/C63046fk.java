package com.google.protobuf;

/* renamed from: com.google.protobuf.fk */
/* compiled from: PG */
final class C63046fk extends C63044fi {
    /* renamed from: a */
    public final /* synthetic */ int mo59086a(Object obj) {
        return ((C63045fj) obj).mo59105a();
    }

    /* renamed from: b */
    public final /* synthetic */ int mo59087b(Object obj) {
        C63045fj fjVar = (C63045fj) obj;
        int i = fjVar.f170160e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < fjVar.f170157b; i3++) {
            int i4 = fjVar.f170158c[i3];
            int N = C62906an.m95321N(8);
            int d = ((C63088z) fjVar.f170159d[i3]).mo59031d();
            i2 += N + N + C62906an.m95321N(16) + C62906an.m95321N(i4 >>> 3) + C62906an.m95321N(24) + C62906an.m95321N(d) + d;
        }
        fjVar.f170160e = i2;
        return i2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo59088c(Object obj) {
        C62942bv bvVar = (C62942bv) obj;
        C63045fj fjVar = bvVar.unknownFields;
        if (fjVar != C63045fj.f170156a) {
            return fjVar;
        }
        C63045fj fjVar2 = new C63045fj();
        bvVar.unknownFields = fjVar2;
        return fjVar2;
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo59089d(Object obj) {
        return ((C62942bv) obj).unknownFields;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo59090e(Object obj, Object obj2) {
        C63045fj fjVar = (C63045fj) obj;
        C63045fj fjVar2 = (C63045fj) obj2;
        if (fjVar2.equals(C63045fj.f170156a)) {
            return fjVar;
        }
        return C63045fj.m95891b(fjVar, fjVar2);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo59091f() {
        return new C63045fj();
    }

    /* renamed from: g */
    public final /* synthetic */ Object mo59092g(Object obj) {
        C63045fj fjVar = (C63045fj) obj;
        fjVar.f170161f = false;
        return fjVar;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo59093h(Object obj, int i, int i2) {
        ((C63045fj) obj).mo59107d((i << 3) | 5, Integer.valueOf(i2));
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo59094i(Object obj, int i, long j) {
        ((C63045fj) obj).mo59107d((i << 3) | 1, Long.valueOf(j));
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo59095j(Object obj, int i, Object obj2) {
        ((C63045fj) obj).mo59107d((i << 3) | 3, (C63045fj) obj2);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo59096k(Object obj, int i, C63088z zVar) {
        ((C63045fj) obj).mo59107d((i << 3) | 2, zVar);
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo59097l(Object obj, int i, long j) {
        ((C63045fj) obj).mo59107d(i << 3, Long.valueOf(j));
    }

    /* renamed from: m */
    public final void mo59098m(Object obj) {
        ((C62942bv) obj).unknownFields.f170161f = false;
    }

    /* renamed from: n */
    public final /* synthetic */ void mo59099n(Object obj, Object obj2) {
        ((C62942bv) obj).unknownFields = (C63045fj) obj2;
    }

    /* renamed from: o */
    public final /* synthetic */ void mo59100o(Object obj, Object obj2) {
        ((C62942bv) obj).unknownFields = (C63045fj) obj2;
    }

    /* renamed from: q */
    public final boolean mo59102q() {
        return false;
    }

    /* renamed from: r */
    public final /* synthetic */ void mo59103r(Object obj, C62907ao aoVar) {
        C63045fj fjVar = (C63045fj) obj;
        for (int i = 0; i < fjVar.f170157b; i++) {
            aoVar.mo58792c(fjVar.f170158c[i] >>> 3, fjVar.f170159d[i]);
        }
    }

    /* renamed from: s */
    public final /* synthetic */ void mo59104s(Object obj, C62907ao aoVar) {
        ((C63045fj) obj).mo59110f(aoVar);
    }
}
