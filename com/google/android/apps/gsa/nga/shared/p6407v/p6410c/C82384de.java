package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.de */
/* compiled from: PG */
final class C82384de extends C82613lr {

    /* renamed from: a */
    public String f225079a;

    /* renamed from: b */
    private int f225080b;

    /* renamed from: c */
    private int f225081c;

    /* renamed from: d */
    private byte f225082d;

    /* renamed from: a */
    public final C82614ls mo75967a() {
        String str;
        if (this.f225082d == 3 && (str = this.f225079a) != null) {
            return new C82385df(str, this.f225080b, this.f225081c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225079a == null) {
            sb.append(" token");
        }
        if ((this.f225082d & 1) == 0) {
            sb.append(" fulfiller");
        }
        if ((this.f225082d & 2) == 0) {
            sb.append(" lockscreenResult");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75968b(int i) {
        this.f225080b = i;
        this.f225082d = (byte) (this.f225082d | 1);
    }

    /* renamed from: c */
    public final void mo75969c(int i) {
        this.f225081c = i;
        this.f225082d = (byte) (this.f225082d | 2);
    }
}
