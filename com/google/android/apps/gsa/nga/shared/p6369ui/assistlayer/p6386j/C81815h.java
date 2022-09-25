package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.j.h */
/* compiled from: PG */
final class C81815h extends C81808a {

    /* renamed from: a */
    private boolean f223747a;

    /* renamed from: b */
    private int f223748b;

    /* renamed from: c */
    private int f223749c;

    /* renamed from: d */
    private int f223750d;

    /* renamed from: e */
    private int f223751e;

    /* renamed from: f */
    private int f223752f;

    /* renamed from: g */
    private int f223753g;

    /* renamed from: h */
    private int f223754h;

    /* renamed from: i */
    private float f223755i;

    /* renamed from: j */
    private int f223756j;

    /* renamed from: k */
    private short f223757k;

    /* renamed from: a */
    public final C81809b mo75322a() {
        if (this.f223757k == 1023) {
            return new C81816i(this.f223747a, this.f223748b, this.f223749c, this.f223750d, this.f223751e, this.f223752f, this.f223753g, this.f223754h, this.f223755i, this.f223756j);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f223757k & 1) == 0) {
            sb.append(" isDarkMode");
        }
        if ((this.f223757k & 2) == 0) {
            sb.append(" rotation");
        }
        if ((this.f223757k & 4) == 0) {
            sb.append(" rotatedWidth");
        }
        if ((this.f223757k & 8) == 0) {
            sb.append(" rotatedHeight");
        }
        if ((this.f223757k & 16) == 0) {
            sb.append(" screenWidth");
        }
        if ((this.f223757k & 32) == 0) {
            sb.append(" screenHeight");
        }
        if ((this.f223757k & 64) == 0) {
            sb.append(" bottomCornerRadius");
        }
        if ((this.f223757k & 128) == 0) {
            sb.append(" topCornerRadius");
        }
        if ((this.f223757k & 256) == 0) {
            sb.append(" fontScale");
        }
        if ((this.f223757k & 512) == 0) {
            sb.append(" densityDpi");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75323b(int i) {
        this.f223753g = i;
        this.f223757k = (short) (this.f223757k | 64);
    }

    /* renamed from: c */
    public final void mo75324c(int i) {
        this.f223756j = i;
        this.f223757k = (short) (this.f223757k | 512);
    }

    /* renamed from: d */
    public final void mo75325d(float f) {
        this.f223755i = f;
        this.f223757k = (short) (this.f223757k | 256);
    }

    /* renamed from: e */
    public final void mo75326e(boolean z) {
        this.f223747a = z;
        this.f223757k = (short) (this.f223757k | 1);
    }

    /* renamed from: f */
    public final void mo75327f(int i) {
        this.f223750d = i;
        this.f223757k = (short) (this.f223757k | 8);
    }

    /* renamed from: g */
    public final void mo75328g(int i) {
        this.f223749c = i;
        this.f223757k = (short) (this.f223757k | 4);
    }

    /* renamed from: h */
    public final void mo75329h(int i) {
        this.f223748b = i;
        this.f223757k = (short) (this.f223757k | 2);
    }

    /* renamed from: i */
    public final void mo75330i(int i) {
        this.f223752f = i;
        this.f223757k = (short) (this.f223757k | 32);
    }

    /* renamed from: j */
    public final void mo75331j(int i) {
        this.f223751e = i;
        this.f223757k = (short) (this.f223757k | 16);
    }

    /* renamed from: k */
    public final void mo75332k(int i) {
        this.f223754h = i;
        this.f223757k = (short) (this.f223757k | 128);
    }
}
