package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

/* renamed from: com.google.android.libraries.search.n.c.a.h.f */
/* compiled from: PG */
public final class C39587f extends C39607z {

    /* renamed from: a */
    private int f104210a;

    /* renamed from: b */
    private int f104211b;

    /* renamed from: c */
    private boolean f104212c;

    /* renamed from: d */
    private byte f104213d;

    /* renamed from: a */
    public final C39536aa mo41933a() {
        if (this.f104213d == 7) {
            return new C39588g(this.f104210a, this.f104211b, this.f104212c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f104213d & 1) == 0) {
            sb.append(" sampleRate");
        }
        if ((this.f104213d & 2) == 0) {
            sb.append(" channelCount");
        }
        if ((this.f104213d & 4) == 0) {
            sb.append(" isDspBased");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo41934b(int i) {
        this.f104211b = i;
        this.f104213d = (byte) (this.f104213d | 2);
    }

    /* renamed from: c */
    public final void mo41935c(boolean z) {
        this.f104212c = z;
        this.f104213d = (byte) (this.f104213d | 4);
    }

    /* renamed from: d */
    public final void mo41936d(int i) {
        this.f104210a = i;
        this.f104213d = (byte) (this.f104213d | 1);
    }
}
