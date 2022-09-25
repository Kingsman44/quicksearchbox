package com.google.android.apps.gsa.shared.p7195y;

/* renamed from: com.google.android.apps.gsa.shared.y.l */
/* compiled from: PG */
final class C91220l extends C91191aw {

    /* renamed from: a */
    public C91230v f254611a;

    /* renamed from: b */
    public byte f254612b;

    /* renamed from: c */
    private boolean f254613c;

    /* renamed from: d */
    private boolean f254614d;

    /* renamed from: e */
    private boolean f254615e;

    /* renamed from: a */
    public final C91192ax mo85434a() {
        if (this.f254612b == 15 && this.f254611a != null) {
            return new C91221m(this.f254613c, this.f254614d, this.f254615e, this.f254611a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f254612b & 1) == 0) {
            sb.append(" autoStartAnimatedPlaceholder");
        }
        if ((this.f254612b & 2) == 0) {
            sb.append(" autoFifeHandling");
        }
        if ((this.f254612b & 4) == 0) {
            sb.append(" autoMapImageHandling");
        }
        if ((this.f254612b & 8) == 0) {
            sb.append(" diskCacheDisabled");
        }
        if (this.f254611a == null) {
            sb.append(" downsampleParameters");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo85435b(boolean z) {
        this.f254614d = z;
        this.f254612b = (byte) (this.f254612b | 2);
    }

    /* renamed from: c */
    public final void mo85436c(boolean z) {
        this.f254615e = z;
        this.f254612b = (byte) (this.f254612b | 4);
    }

    /* renamed from: d */
    public final void mo85437d(boolean z) {
        this.f254613c = z;
        this.f254612b = (byte) (this.f254612b | 1);
    }
}
