package com.google.p3577ap.p3578a;

/* renamed from: com.google.ap.a.f */
/* compiled from: PG */
public final class C45608f {

    /* renamed from: a */
    public final boolean f119968a;

    /* renamed from: b */
    public final boolean f119969b;

    /* renamed from: c */
    public final int f119970c;

    /* renamed from: d */
    public final int f119971d;

    /* renamed from: e */
    public final int f119972e;

    /* renamed from: f */
    public final int f119973f;

    public C45608f(long j) {
        int i = (int) j;
        boolean z = true;
        boolean z2 = ((j >> 30) & 1) == 1;
        this.f119968a = z2;
        if (z2) {
            this.f119969b = false;
            this.f119970c = 0;
            this.f119971d = 0;
            this.f119972e = 0;
            this.f119973f = 0;
            return;
        }
        this.f119972e = ((i >> 27) & 7) * 3;
        this.f119973f = ((i >> 24) & 7) * 3;
        this.f119970c = ((i >> 21) & 7) * 3;
        this.f119971d = ((i >> 18) & 7) * 3;
        this.f119969b = ((j >> 31) & 1) != 1 ? false : z;
    }

    public final String toString() {
        boolean z = this.f119968a;
        boolean z2 = this.f119969b;
        int i = this.f119970c;
        int i2 = this.f119971d;
        int i3 = this.f119972e;
        int i4 = this.f119973f;
        return "{isBlockListed=" + z + ", isStrict=" + z2 + ", top=" + i + ", bottom=" + i2 + ", left=" + i3 + ", right=" + i4;
    }
}
