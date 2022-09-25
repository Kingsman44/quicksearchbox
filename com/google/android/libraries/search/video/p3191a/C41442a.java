package com.google.android.libraries.search.video.p3191a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.a.a */
/* compiled from: PG */
final class C41442a extends C41449h {

    /* renamed from: a */
    public byte f108233a;

    /* renamed from: b */
    private int f108234b;

    /* renamed from: c */
    private boolean f108235c;

    /* renamed from: d */
    private boolean f108236d;

    /* renamed from: e */
    private boolean f108237e;

    /* renamed from: f */
    private boolean f108238f;

    /* renamed from: g */
    private boolean f108239g;

    /* renamed from: h */
    private Optional f108240h = Optional.empty();

    /* renamed from: a */
    public final C41450i mo43957a() {
        if (this.f108233a == Byte.MAX_VALUE) {
            return new C41443b(this.f108234b, this.f108235c, this.f108236d, this.f108237e, this.f108238f, this.f108239g, this.f108240h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f108233a & 1) == 0) {
            sb.append(" lookaheadOffset");
        }
        if ((this.f108233a & 2) == 0) {
            sb.append(" duploEnabled");
        }
        if ((this.f108233a & 4) == 0) {
            sb.append(" tngLightboxEnabled");
        }
        if ((this.f108233a & 8) == 0) {
            sb.append(" youTubePreloadingEnabled");
        }
        if ((this.f108233a & 16) == 0) {
            sb.append(" noThumbnailForYoutubeVideosEnabled");
        }
        if ((this.f108233a & 32) == 0) {
            sb.append(" unregistrationOfFragmentCallbacksEnabled");
        }
        if ((this.f108233a & 64) == 0) {
            sb.append(" unregistrationOfThirdPartyWrapperCallbacksEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo43958b(boolean z) {
        this.f108235c = z;
        this.f108233a = (byte) (this.f108233a | 2);
    }

    /* renamed from: c */
    public final void mo43959c(int i) {
        this.f108234b = i;
        this.f108233a = (byte) (this.f108233a | 1);
    }

    /* renamed from: d */
    public final void mo43960d(boolean z) {
        this.f108237e = z;
        this.f108233a = (byte) (this.f108233a | 16);
    }

    /* renamed from: e */
    public final void mo43961e(boolean z) {
        this.f108238f = z;
        this.f108233a = (byte) (this.f108233a | 32);
    }

    /* renamed from: f */
    public final void mo43962f(boolean z) {
        this.f108239g = z;
        this.f108233a = (byte) (this.f108233a | 64);
    }

    /* renamed from: g */
    public final void mo43963g(Optional optional) {
        if (optional != null) {
            this.f108240h = optional;
            return;
        }
        throw new NullPointerException("Null veLogger");
    }

    /* renamed from: h */
    public final void mo43964h(boolean z) {
        this.f108236d = z;
        this.f108233a = (byte) (this.f108233a | 8);
    }
}
