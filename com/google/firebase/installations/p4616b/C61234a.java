package com.google.firebase.installations.p4616b;

/* renamed from: com.google.firebase.installations.b.a */
/* compiled from: PG */
final class C61234a extends C61238e {

    /* renamed from: a */
    public String f165633a;

    /* renamed from: b */
    public String f165634b;

    /* renamed from: c */
    public String f165635c;

    /* renamed from: d */
    public String f165636d;

    /* renamed from: e */
    private long f165637e;

    /* renamed from: f */
    private long f165638f;

    /* renamed from: g */
    private byte f165639g;

    /* renamed from: h */
    private int f165640h;

    public C61234a() {
    }

    public C61234a(C61239f fVar) {
        C61235b bVar = (C61235b) fVar;
        this.f165633a = bVar.f165641a;
        this.f165640h = bVar.f165647g;
        this.f165634b = bVar.f165642b;
        this.f165635c = bVar.f165643c;
        this.f165637e = bVar.f165644d;
        this.f165638f = bVar.f165645e;
        this.f165636d = bVar.f165646f;
        this.f165639g = 3;
    }

    /* renamed from: a */
    public final C61239f mo57812a() {
        if (this.f165639g == 3 && this.f165640h != 0) {
            return new C61235b(this.f165633a, this.f165640h, this.f165634b, this.f165635c, this.f165637e, this.f165638f, this.f165636d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f165640h == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.f165639g & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.f165639g & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo57813b(String str) {
        this.f165634b = str;
    }

    /* renamed from: c */
    public final void mo57814c(long j) {
        this.f165637e = j;
        this.f165639g = (byte) (this.f165639g | 1);
    }

    /* renamed from: d */
    public final void mo57815d(String str) {
        this.f165633a = str;
    }

    /* renamed from: e */
    public final void mo57816e(String str) {
        this.f165635c = str;
    }

    /* renamed from: f */
    public final void mo57817f(int i) {
        if (i != 0) {
            this.f165640h = i;
            return;
        }
        throw new NullPointerException("Null registrationStatus");
    }

    /* renamed from: g */
    public final void mo57818g(long j) {
        this.f165638f = j;
        this.f165639g = (byte) (this.f165639g | 2);
    }

    /* renamed from: h */
    public final void mo57819h() {
        this.f165636d = "BAD CONFIG";
    }
}
