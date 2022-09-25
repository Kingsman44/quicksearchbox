package com.p232a.p233a;

/* renamed from: com.a.a.ag */
/* compiled from: PG */
public final class C4698ag implements C4699ah {

    /* renamed from: a */
    public int f14751a = 0;

    /* renamed from: b */
    private byte[] f14752b = new byte[8];

    /* renamed from: c */
    private float[] f14753c = new float[16];

    /* renamed from: d */
    private int f14754d = 0;

    /* renamed from: i */
    private final void m13055i(int i) {
        float[] fArr = this.f14753c;
        int length = fArr.length;
        if (length < this.f14754d + i) {
            float[] fArr2 = new float[(length + length)];
            System.arraycopy(fArr, 0, fArr2, 0, length);
            this.f14753c = fArr2;
        }
    }

    /* renamed from: a */
    public final void mo9593a(byte b) {
        int i = this.f14751a;
        byte[] bArr = this.f14752b;
        int length = bArr.length;
        if (i == length) {
            byte[] bArr2 = new byte[(length + length)];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            this.f14752b = bArr2;
        }
        byte[] bArr3 = this.f14752b;
        int i2 = this.f14751a;
        this.f14751a = i2 + 1;
        bArr3[i2] = b;
    }

    /* renamed from: b */
    public final void mo9594b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        mo9593a(((true != z ? (char) 0 : 2) | true) | z2 ? (byte) 1 : 0);
        m13055i(5);
        float[] fArr = this.f14753c;
        int i = this.f14754d;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        int i5 = i4 + 1;
        fArr[i4] = f4;
        this.f14754d = i5 + 1;
        fArr[i5] = f5;
    }

    /* renamed from: c */
    public final void mo9595c() {
        mo9593a((byte) 8);
    }

    /* renamed from: d */
    public final void mo9596d(float f, float f2, float f3, float f4, float f5, float f6) {
        mo9593a((byte) 2);
        m13055i(6);
        float[] fArr = this.f14753c;
        int i = this.f14754d;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        int i5 = i4 + 1;
        fArr[i4] = f4;
        int i6 = i5 + 1;
        fArr[i5] = f5;
        this.f14754d = i6 + 1;
        fArr[i6] = f6;
    }

    /* renamed from: e */
    public final void mo9597e(C4699ah ahVar) {
        int i;
        C4699ah ahVar2 = ahVar;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f14751a; i3++) {
            byte b = this.f14752b[i3];
            if (b == 0) {
                float[] fArr = this.f14753c;
                int i4 = i2 + 1;
                i = i4 + 1;
                ahVar2.mo9599g(fArr[i2], fArr[i4]);
            } else if (b != 1) {
                if (b == 2) {
                    float[] fArr2 = this.f14753c;
                    int i5 = i2 + 1;
                    int i6 = i5 + 1;
                    int i7 = i6 + 1;
                    int i8 = i7 + 1;
                    int i9 = i8 + 1;
                    ahVar.mo9596d(fArr2[i2], fArr2[i5], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                    i2 = i9 + 1;
                } else if (b == 3) {
                    float[] fArr3 = this.f14753c;
                    int i10 = i2 + 1;
                    int i11 = i10 + 1;
                    int i12 = i11 + 1;
                    ahVar2.mo9600h(fArr3[i2], fArr3[i10], fArr3[i11], fArr3[i12]);
                    i2 = i12 + 1;
                } else if (b != 8) {
                    boolean z = (b & 2) != 0;
                    float[] fArr4 = this.f14753c;
                    int i13 = i2 + 1;
                    float f = fArr4[i2];
                    int i14 = i13 + 1;
                    float f2 = fArr4[i13];
                    int i15 = i14 + 1;
                    float f3 = fArr4[i14];
                    int i16 = i15 + 1;
                    int i17 = i16 + 1;
                    ahVar.mo9594b(f, f2, f3, z, 1 == (b & 1), fArr4[i15], fArr4[i16]);
                    i2 = i17;
                } else {
                    ahVar.mo9595c();
                }
            } else {
                float[] fArr5 = this.f14753c;
                int i18 = i2 + 1;
                i = i18 + 1;
                ahVar2.mo9598f(fArr5[i2], fArr5[i18]);
            }
            i2 = i;
        }
    }

    /* renamed from: f */
    public final void mo9598f(float f, float f2) {
        mo9593a((byte) 1);
        m13055i(2);
        float[] fArr = this.f14753c;
        int i = this.f14754d;
        int i2 = i + 1;
        fArr[i] = f;
        this.f14754d = i2 + 1;
        fArr[i2] = f2;
    }

    /* renamed from: g */
    public final void mo9599g(float f, float f2) {
        mo9593a((byte) 0);
        m13055i(2);
        float[] fArr = this.f14753c;
        int i = this.f14754d;
        int i2 = i + 1;
        fArr[i] = f;
        this.f14754d = i2 + 1;
        fArr[i2] = f2;
    }

    /* renamed from: h */
    public final void mo9600h(float f, float f2, float f3, float f4) {
        mo9593a((byte) 3);
        m13055i(4);
        float[] fArr = this.f14753c;
        int i = this.f14754d;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        this.f14754d = i4 + 1;
        fArr[i4] = f4;
    }
}
