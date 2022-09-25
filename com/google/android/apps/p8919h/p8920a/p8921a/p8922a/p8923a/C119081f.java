package com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8923a;

/* renamed from: com.google.android.apps.h.a.a.a.a.f */
/* compiled from: PG */
final class C119081f extends C119090o {

    /* renamed from: a */
    private int f332191a;

    /* renamed from: b */
    private int f332192b;

    /* renamed from: c */
    private long f332193c;

    /* renamed from: d */
    private long f332194d;

    /* renamed from: e */
    private int f332195e;

    /* renamed from: f */
    private int f332196f;

    /* renamed from: g */
    private byte f332197g;

    public C119081f() {
    }

    public C119081f(C119091p pVar) {
        C119082g gVar = (C119082g) pVar;
        this.f332191a = gVar.f332198a;
        this.f332192b = gVar.f332199b;
        this.f332193c = gVar.f332200c;
        this.f332194d = gVar.f332201d;
        this.f332195e = gVar.f332202e;
        this.f332196f = gVar.f332203f;
        this.f332197g = 63;
    }

    /* renamed from: a */
    public final C119091p mo104154a() {
        if (this.f332197g == 63) {
            return new C119082g(this.f332191a, this.f332192b, this.f332193c, this.f332194d, this.f332195e, this.f332196f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f332197g & 1) == 0) {
            sb.append(" wordStartIndex");
        }
        if ((this.f332197g & 2) == 0) {
            sb.append(" wordEndIndex");
        }
        if ((this.f332197g & 4) == 0) {
            sb.append(" wordStartTimeMillis");
        }
        if ((this.f332197g & 8) == 0) {
            sb.append(" wordEndTimeMillis");
        }
        if ((this.f332197g & 16) == 0) {
            sb.append(" wordStartOffsetInParagraph");
        }
        if ((this.f332197g & 32) == 0) {
            sb.append(" wordEndOffsetInParagraph");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo104155b(int i) {
        this.f332192b = i;
        this.f332197g = (byte) (this.f332197g | 2);
    }

    /* renamed from: c */
    public final void mo104156c(int i) {
        this.f332196f = i;
        this.f332197g = (byte) (this.f332197g | 32);
    }

    /* renamed from: d */
    public final void mo104157d(long j) {
        this.f332194d = j;
        this.f332197g = (byte) (this.f332197g | 8);
    }

    /* renamed from: e */
    public final void mo104158e(int i) {
        this.f332191a = i;
        this.f332197g = (byte) (this.f332197g | 1);
    }

    /* renamed from: f */
    public final void mo104159f(int i) {
        this.f332195e = i;
        this.f332197g = (byte) (this.f332197g | 16);
    }

    /* renamed from: g */
    public final void mo104160g(long j) {
        this.f332193c = j;
        this.f332197g = (byte) (this.f332197g | 4);
    }
}
