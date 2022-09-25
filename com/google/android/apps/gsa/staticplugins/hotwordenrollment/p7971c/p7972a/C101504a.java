package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a */
/* compiled from: PG */
final class C101504a extends C101605p {

    /* renamed from: a */
    private boolean f283257a;

    /* renamed from: b */
    private boolean f283258b;

    /* renamed from: c */
    private boolean f283259c;

    /* renamed from: d */
    private boolean f283260d;

    /* renamed from: e */
    private boolean f283261e;

    /* renamed from: f */
    private boolean f283262f;

    /* renamed from: g */
    private boolean f283263g;

    /* renamed from: h */
    private boolean f283264h;

    /* renamed from: i */
    private byte f283265i;

    /* renamed from: a */
    public final C101606q mo92355a() {
        if (this.f283265i == -1) {
            return new C101545b(this.f283257a, this.f283258b, this.f283259c, this.f283260d, this.f283261e, this.f283262f, this.f283263g, this.f283264h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f283265i & 1) == 0) {
            sb.append(" showDeviceDiscoveryScreen");
        }
        if ((this.f283265i & 2) == 0) {
            sb.append(" showProgressUpdateScreenAfterFreshEnroll");
        }
        if ((this.f283265i & 4) == 0) {
            sb.append(" showGetParentScreen");
        }
        if ((this.f283265i & 8) == 0) {
            sb.append(" showHandBackToParentScreen");
        }
        if ((this.f283265i & 16) == 0) {
            sb.append(" finishAfterVaa");
        }
        if ((this.f283265i & 32) == 0) {
            sb.append(" showFaceMatch");
        }
        if ((this.f283265i & 64) == 0) {
            sb.append(" showSummaryScreen");
        }
        if ((this.f283265i & 128) == 0) {
            sb.append(" showPersonalResultScreen");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo92356b(boolean z) {
        this.f283261e = z;
        this.f283265i = (byte) (this.f283265i | 16);
    }

    /* renamed from: c */
    public final void mo92357c(boolean z) {
        this.f283257a = z;
        this.f283265i = (byte) (this.f283265i | 1);
    }

    /* renamed from: d */
    public final void mo92358d(boolean z) {
        this.f283262f = z;
        this.f283265i = (byte) (this.f283265i | 32);
    }

    /* renamed from: e */
    public final void mo92359e(boolean z) {
        this.f283259c = z;
        this.f283265i = (byte) (this.f283265i | 4);
    }

    /* renamed from: f */
    public final void mo92360f(boolean z) {
        this.f283260d = z;
        this.f283265i = (byte) (this.f283265i | 8);
    }

    /* renamed from: g */
    public final void mo92361g(boolean z) {
        this.f283264h = z;
        this.f283265i = (byte) (this.f283265i | 128);
    }

    /* renamed from: h */
    public final void mo92362h(boolean z) {
        this.f283258b = z;
        this.f283265i = (byte) (this.f283265i | 2);
    }

    /* renamed from: i */
    public final void mo92363i(boolean z) {
        this.f283263g = z;
        this.f283265i = (byte) (this.f283265i | 64);
    }
}
