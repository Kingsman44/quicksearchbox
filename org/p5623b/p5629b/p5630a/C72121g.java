package org.p5623b.p5629b.p5630a;

/* renamed from: org.b.b.a.g */
/* compiled from: PG */
public final class C72121g implements C72118d {

    /* renamed from: a */
    protected final byte[] f191953a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b */
    protected final byte[] f191954b = new byte[128];

    public C72121g() {
        for (int i = 0; i < 128; i++) {
            this.f191954b[i] = -1;
        }
        for (int i2 = 0; i2 < 16; i2++) {
            this.f191954b[this.f191953a[i2]] = (byte) i2;
        }
        byte[] bArr = this.f191954b;
        bArr[65] = bArr[97];
        bArr[66] = bArr[98];
        bArr[67] = bArr[99];
        bArr[68] = bArr[100];
        bArr[69] = bArr[101];
        bArr[70] = bArr[102];
    }
}
