package com.google.android.libraries.micore.learning.training.nflrunner;

/* renamed from: com.google.android.libraries.micore.learning.training.nflrunner.a */
/* compiled from: PG */
public final class C29743a extends C29753k {

    /* renamed from: a */
    private int f80569a;

    /* renamed from: b */
    private int f80570b;

    /* renamed from: c */
    private int f80571c;

    /* renamed from: d */
    private int f80572d;

    /* renamed from: e */
    private int f80573e;

    /* renamed from: f */
    private boolean f80574f;

    /* renamed from: g */
    private boolean f80575g;

    /* renamed from: h */
    private boolean f80576h;

    /* renamed from: i */
    private double f80577i;

    /* renamed from: j */
    private short f80578j;

    /* renamed from: a */
    public final C29754l mo34901a() {
        if (this.f80578j == 511) {
            return new C29744b(this.f80569a, this.f80570b, this.f80571c, this.f80572d, this.f80573e, this.f80574f, this.f80575g, this.f80576h, this.f80577i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f80578j & 1) == 0) {
            sb.append(" connectTimeoutMs");
        }
        if ((this.f80578j & 2) == 0) {
            sb.append(" readTimeoutMs");
        }
        if ((this.f80578j & 4) == 0) {
            sb.append(" requestBodyChunkSizeBytes");
        }
        if ((this.f80578j & 8) == 0) {
            sb.append(" responseBodyChunkSizeBytes");
        }
        if ((this.f80578j & 16) == 0) {
            sb.append(" responseBodyGzipBufferSizeBytes");
        }
        if ((this.f80578j & 32) == 0) {
            sb.append(" callDisconnectWhenCancelled");
        }
        if ((this.f80578j & 64) == 0) {
            sb.append(" supportAcceptEncodingHeader");
        }
        if ((this.f80578j & 128) == 0) {
            sb.append(" estimateSentReceivedBytes");
        }
        if ((this.f80578j & 256) == 0) {
            sb.append(" estimatedHttp2HeaderCompressionRatio");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo34902b(boolean z) {
        this.f80574f = z;
        this.f80578j = (short) (this.f80578j | 32);
    }

    /* renamed from: c */
    public final void mo34903c(int i) {
        this.f80569a = i;
        this.f80578j = (short) (this.f80578j | 1);
    }

    /* renamed from: d */
    public final void mo34904d(boolean z) {
        this.f80576h = z;
        this.f80578j = (short) (this.f80578j | 128);
    }

    /* renamed from: e */
    public final void mo34905e(double d) {
        this.f80577i = d;
        this.f80578j = (short) (this.f80578j | 256);
    }

    /* renamed from: f */
    public final void mo34906f(int i) {
        this.f80570b = i;
        this.f80578j = (short) (this.f80578j | 2);
    }

    /* renamed from: g */
    public final void mo34907g(int i) {
        this.f80571c = i;
        this.f80578j = (short) (this.f80578j | 4);
    }

    /* renamed from: h */
    public final void mo34908h(int i) {
        this.f80572d = i;
        this.f80578j = (short) (this.f80578j | 8);
    }

    /* renamed from: i */
    public final void mo34909i(int i) {
        this.f80573e = i;
        this.f80578j = (short) (this.f80578j | 16);
    }

    /* renamed from: j */
    public final void mo34910j(boolean z) {
        this.f80575g = z;
        this.f80578j = (short) (this.f80578j | 64);
    }
}
