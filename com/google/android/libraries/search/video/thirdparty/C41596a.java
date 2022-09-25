package com.google.android.libraries.search.video.thirdparty;

/* renamed from: com.google.android.libraries.search.video.thirdparty.a */
/* compiled from: PG */
final class C41596a extends C41598ab {

    /* renamed from: a */
    private boolean f108743a;

    /* renamed from: b */
    private boolean f108744b;

    /* renamed from: c */
    private boolean f108745c;

    /* renamed from: d */
    private boolean f108746d;

    /* renamed from: e */
    private boolean f108747e;

    /* renamed from: f */
    private byte f108748f;

    /* renamed from: a */
    public final C41599ac mo44153a() {
        if (this.f108748f == 31) {
            return new C41600b(this.f108743a, this.f108744b, this.f108745c, this.f108746d, this.f108747e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f108748f & 1) == 0) {
            sb.append(" enableControls");
        }
        if ((this.f108748f & 2) == 0) {
            sb.append(" hideVideoOnEnd");
        }
        if ((this.f108748f & 4) == 0) {
            sb.append(" hideVideoOnPause");
        }
        if ((this.f108748f & 8) == 0) {
            sb.append(" enableSubtitleButton");
        }
        if ((this.f108748f & 16) == 0) {
            sb.append(" isStampAutoplay");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo44154b(boolean z) {
        this.f108743a = z;
        this.f108748f = (byte) (this.f108748f | 1);
    }

    /* renamed from: c */
    public final void mo44155c(boolean z) {
        this.f108746d = z;
        this.f108748f = (byte) (this.f108748f | 8);
    }

    /* renamed from: d */
    public final void mo44156d(boolean z) {
        this.f108744b = z;
        this.f108748f = (byte) (this.f108748f | 2);
    }

    /* renamed from: e */
    public final void mo44157e(boolean z) {
        this.f108745c = z;
        this.f108748f = (byte) (this.f108748f | 4);
    }

    /* renamed from: f */
    public final void mo44158f(boolean z) {
        this.f108747e = z;
        this.f108748f = (byte) (this.f108748f | 16);
    }
}
