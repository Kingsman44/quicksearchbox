package com.google.android.libraries.lens.ondevice.p2034k;

/* renamed from: com.google.android.libraries.lens.ondevice.k.d */
/* compiled from: PG */
final class C24616d extends C24630dn {

    /* renamed from: a */
    private boolean f67349a;

    /* renamed from: b */
    private boolean f67350b;

    /* renamed from: c */
    private byte f67351c;

    /* renamed from: a */
    public final C24631do mo29965a() {
        if (this.f67351c == 3) {
            return new C24643e(this.f67349a, this.f67350b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f67351c & 1) == 0) {
            sb.append(" includePageLayout");
        }
        if ((this.f67351c & 2) == 0) {
            sb.append(" createPageLayoutMutatorContext");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo29966b(boolean z) {
        this.f67350b = z;
        this.f67351c = (byte) (this.f67351c | 2);
    }

    /* renamed from: c */
    public final void mo29967c(boolean z) {
        this.f67349a = z;
        this.f67351c = (byte) (this.f67351c | 1);
    }
}
