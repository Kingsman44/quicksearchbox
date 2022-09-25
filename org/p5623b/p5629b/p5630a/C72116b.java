package org.p5623b.p5629b.p5630a;

/* renamed from: org.b.b.a.b */
/* compiled from: PG */
public final class C72116b implements C72118d {

    /* renamed from: a */
    protected final byte[] f191947a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    protected byte f191948b = 61;

    /* renamed from: c */
    protected final byte[] f191949c = new byte[128];

    public C72116b() {
        for (int i = 0; i < 128; i++) {
            this.f191949c[i] = -1;
        }
        for (int i2 = 0; i2 < 64; i2++) {
            this.f191949c[this.f191947a[i2]] = (byte) i2;
        }
    }
}
