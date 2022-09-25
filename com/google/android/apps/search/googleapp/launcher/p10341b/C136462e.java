package com.google.android.apps.search.googleapp.launcher.p10341b;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.e */
/* compiled from: PG */
final class C136462e extends C136423a {

    /* renamed from: a */
    private boolean f371528a;

    /* renamed from: b */
    private boolean f371529b;

    /* renamed from: c */
    private boolean f371530c;

    /* renamed from: d */
    private boolean f371531d;

    /* renamed from: e */
    private boolean f371532e;

    /* renamed from: f */
    private boolean f371533f;

    /* renamed from: g */
    private int f371534g;

    /* renamed from: h */
    private byte f371535h;

    /* renamed from: a */
    public final C136443b mo112995a() {
        if (this.f371535h == Byte.MAX_VALUE) {
            return new C136464f(this.f371528a, this.f371529b, this.f371530c, this.f371531d, this.f371532e, this.f371533f, this.f371534g);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f371535h & 1) == 0) {
            sb.append(" overlayEnabled");
        }
        if ((this.f371535h & 2) == 0) {
            sb.append(" hotwordEnabled");
        }
        if ((this.f371535h & 4) == 0) {
            sb.append(" pixelSuggestEnabled");
        }
        if ((this.f371535h & 8) == 0) {
            sb.append(" sharedOverlayEnabled");
        }
        if ((this.f371535h & 16) == 0) {
            sb.append(" googleOverlayActive");
        }
        if ((this.f371535h & 32) == 0) {
            sb.append(" overlayVisible");
        }
        if ((this.f371535h & 64) == 0) {
            sb.append(" bottomInsetOverride");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: c */
    public final boolean mo112997c() {
        if ((this.f371535h & 1) != 0) {
            return this.f371528a;
        }
        throw new IllegalStateException("Property \"overlayEnabled\" has not been set");
    }

    /* renamed from: d */
    public final boolean mo112998d() {
        if ((this.f371535h & 4) != 0) {
            return this.f371530c;
        }
        throw new IllegalStateException("Property \"pixelSuggestEnabled\" has not been set");
    }

    /* renamed from: e */
    public final boolean mo112999e() {
        if ((this.f371535h & 8) != 0) {
            return this.f371531d;
        }
        throw new IllegalStateException("Property \"sharedOverlayEnabled\" has not been set");
    }

    /* renamed from: f */
    public final void mo113000f(int i) {
        this.f371534g = i;
        this.f371535h = (byte) (this.f371535h | 64);
    }

    /* renamed from: g */
    public final void mo113001g(boolean z) {
        this.f371532e = z;
        this.f371535h = (byte) (this.f371535h | 16);
    }

    /* renamed from: h */
    public final void mo113002h(boolean z) {
        this.f371529b = z;
        this.f371535h = (byte) (this.f371535h | 2);
    }

    /* renamed from: i */
    public final void mo113003i(boolean z) {
        this.f371528a = z;
        this.f371535h = (byte) (this.f371535h | 1);
    }

    /* renamed from: j */
    public final void mo113004j(boolean z) {
        this.f371533f = z;
        this.f371535h = (byte) (this.f371535h | 32);
    }

    /* renamed from: k */
    public final void mo113005k(boolean z) {
        this.f371530c = z;
        this.f371535h = (byte) (this.f371535h | 4);
    }

    /* renamed from: l */
    public final void mo113006l(boolean z) {
        this.f371531d = z;
        this.f371535h = (byte) (this.f371535h | 8);
    }
}
