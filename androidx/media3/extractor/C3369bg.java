package androidx.media3.extractor;

import androidx.media3.common.p136b.C2601a;

/* renamed from: androidx.media3.extractor.bg */
/* compiled from: PG */
public final class C3369bg {

    /* renamed from: a */
    private final byte[] f10180a = new byte[10];

    /* renamed from: b */
    private boolean f10181b;

    /* renamed from: c */
    private int f10182c;

    /* renamed from: d */
    private long f10183d;

    /* renamed from: e */
    private int f10184e;

    /* renamed from: f */
    private int f10185f;

    /* renamed from: g */
    private int f10186g;

    /* renamed from: a */
    public final void mo7358a(C3368bf bfVar, C3367be beVar) {
        if (this.f10182c > 0) {
            bfVar.mo6852d(this.f10183d, this.f10184e, this.f10185f, this.f10186g, beVar);
            this.f10182c = 0;
        }
    }

    /* renamed from: b */
    public final void mo7359b() {
        this.f10181b = false;
        this.f10182c = 0;
    }

    /* renamed from: c */
    public final void mo7360c(C3368bf bfVar, long j, int i, int i2, int i3, C3367be beVar) {
        C2601a.m6833e(this.f10186g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f10181b) {
            int i4 = this.f10182c;
            int i5 = i4 + 1;
            this.f10182c = i5;
            if (i4 == 0) {
                this.f10183d = j;
                this.f10184e = i;
                this.f10185f = 0;
            }
            this.f10185f += i2;
            this.f10186g = i3;
            if (i5 >= 16) {
                mo7358a(bfVar, beVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo7361d(C3327ab abVar) {
        if (!this.f10181b) {
            abVar.mo7315j(this.f10180a, 0, 10);
            abVar.mo7317l();
            byte[] bArr = this.f10180a;
            int[] iArr = C3375c.f10200a;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.f10181b = true;
            }
        }
    }
}
