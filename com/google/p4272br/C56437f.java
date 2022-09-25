package com.google.p4272br;

/* renamed from: com.google.br.f */
/* compiled from: PG */
final class C56437f {

    /* renamed from: a */
    final C56438g[] f150737a;

    /* renamed from: b */
    final int[] f150738b;

    /* renamed from: c */
    final int[] f150739c;

    /* renamed from: d */
    int f150740d;

    public C56437f(int i) {
        this.f150739c = new int[i];
        this.f150738b = new int[i];
        this.f150737a = new C56438g[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < this.f150740d; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.f150738b[i]);
        }
        sb.append('}');
        return sb.toString();
    }
}
