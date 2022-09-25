package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.a */
/* compiled from: PG */
final class C101611a extends C101627q {

    /* renamed from: a */
    public int f283533a;

    /* renamed from: b */
    private boolean f283534b;

    /* renamed from: c */
    private boolean f283535c;

    /* renamed from: d */
    private boolean f283536d;

    /* renamed from: e */
    private boolean f283537e;

    /* renamed from: f */
    private byte f283538f;

    /* renamed from: a */
    public final C101628r mo92425a() {
        int i;
        if (this.f283538f == 15 && (i = this.f283533a) != 0) {
            return new C101612b(i, this.f283534b, this.f283535c, this.f283536d, this.f283537e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f283533a == 0) {
            sb.append(" mode");
        }
        if ((this.f283538f & 1) == 0) {
            sb.append(" showParentSelection");
        }
        if ((this.f283538f & 2) == 0) {
            sb.append(" showSummaryScreen");
        }
        if ((this.f283538f & 4) == 0) {
            sb.append(" showVoiceAndAudioConsent");
        }
        if ((this.f283538f & 8) == 0) {
            sb.append(" showHandBackScreenForUnicorn");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo92426b(boolean z) {
        this.f283537e = z;
        this.f283538f = (byte) (this.f283538f | 8);
    }

    /* renamed from: c */
    public final void mo92427c(boolean z) {
        this.f283534b = z;
        this.f283538f = (byte) (this.f283538f | 1);
    }

    /* renamed from: d */
    public final void mo92428d(boolean z) {
        this.f283535c = z;
        this.f283538f = (byte) (this.f283538f | 2);
    }

    /* renamed from: e */
    public final void mo92429e(boolean z) {
        this.f283536d = z;
        this.f283538f = (byte) (this.f283538f | 4);
    }
}
