package com.google.android.apps.gsa.assist.p501a;

/* renamed from: com.google.android.apps.gsa.assist.a.o */
/* compiled from: PG */
final class C9327o extends C9315c {

    /* renamed from: a */
    private boolean f32353a;

    /* renamed from: b */
    private boolean f32354b;

    /* renamed from: c */
    private int f32355c;

    /* renamed from: d */
    private int f32356d;

    /* renamed from: e */
    private int f32357e;

    /* renamed from: f */
    private int f32358f;

    /* renamed from: g */
    private boolean f32359g;

    /* renamed from: h */
    private boolean f32360h;

    /* renamed from: i */
    private byte f32361i;

    /* renamed from: a */
    public final C9316d mo17505a() {
        if (this.f32361i == -1) {
            return new C9328p(this.f32353a, this.f32354b, this.f32355c, this.f32356d, this.f32357e, this.f32358f, this.f32359g, this.f32360h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f32361i & 1) == 0) {
            sb.append(" includeScreenshot");
        }
        if ((this.f32361i & 2) == 0) {
            sb.append(" includeScreenshotAvailability");
        }
        if ((this.f32361i & 4) == 0) {
            sb.append(" screenshotCompressionQuality");
        }
        if ((this.f32361i & 8) == 0) {
            sb.append(" screenshotScalingPercent");
        }
        if ((this.f32361i & 16) == 0) {
            sb.append(" dataTimeout");
        }
        if ((this.f32361i & 32) == 0) {
            sb.append(" screenshotTimeout");
        }
        if ((this.f32361i & 64) == 0) {
            sb.append(" hasUserOptedToDonateScreenshot");
        }
        if ((this.f32361i & 128) == 0) {
            sb.append(" includeAssistStructure");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo17506b(int i) {
        this.f32357e = i;
        this.f32361i = (byte) (this.f32361i | 16);
    }

    /* renamed from: c */
    public final void mo17507c(boolean z) {
        this.f32359g = z;
        this.f32361i = (byte) (this.f32361i | 64);
    }

    /* renamed from: d */
    public final void mo17508d(boolean z) {
        this.f32360h = z;
        this.f32361i = (byte) (this.f32361i | 128);
    }

    /* renamed from: e */
    public final void mo17509e(boolean z) {
        this.f32353a = z;
        this.f32361i = (byte) (this.f32361i | 1);
    }

    /* renamed from: f */
    public final void mo17510f(boolean z) {
        this.f32354b = z;
        this.f32361i = (byte) (this.f32361i | 2);
    }

    /* renamed from: g */
    public final void mo17511g(int i) {
        this.f32355c = i;
        this.f32361i = (byte) (this.f32361i | 4);
    }

    /* renamed from: h */
    public final void mo17512h(int i) {
        this.f32356d = i;
        this.f32361i = (byte) (this.f32361i | 8);
    }

    /* renamed from: i */
    public final void mo17513i(int i) {
        this.f32358f = i;
        this.f32361i = (byte) (this.f32361i | 32);
    }
}
