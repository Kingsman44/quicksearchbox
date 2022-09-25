package androidx.media3.exoplayer.p145h;

import android.net.Uri;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2510n;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.h.ai */
/* compiled from: PG */
final class C3026ai implements C2505i {

    /* renamed from: a */
    private final C2505i f8766a;

    /* renamed from: b */
    private final int f8767b;

    /* renamed from: c */
    private final C3025ah f8768c;

    /* renamed from: d */
    private final byte[] f8769d;

    /* renamed from: e */
    private int f8770e;

    public C3026ai(C2505i iVar, int i, C3025ah ahVar) {
        C2601a.m6830b(i > 0);
        this.f8766a = iVar;
        this.f8767b = i;
        this.f8768c = ahVar;
        this.f8769d = new byte[1];
        this.f8770e = i;
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        long j;
        int i3 = this.f8770e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.f8766a.mo5879a(this.f8769d, 0, 1) != -1) {
                int i5 = (this.f8769d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int a = this.f8766a.mo5879a(bArr2, i4, i6);
                        if (a != -1) {
                            i4 += a;
                            i6 -= a;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        C3025ah ahVar = this.f8768c;
                        C2604ac acVar = new C2604ac(bArr2, i5);
                        C3078bp bpVar = (C3078bp) ahVar;
                        if (!bpVar.f8943f) {
                            j = bpVar.f8940c;
                        } else {
                            j = Math.max(bpVar.f8944g.mo7052k(true), bpVar.f8940c);
                        }
                        int i8 = acVar.f7236c - acVar.f7235b;
                        C3368bf bfVar = bpVar.f8942e;
                        bfVar.getClass();
                        bfVar.mo6851c(acVar, i8);
                        bfVar.mo6852d(j, 1, i8, 0, (C3367be) null);
                        bpVar.f8943f = true;
                    }
                }
                i3 = this.f8767b;
                this.f8770e = i3;
            }
            return -1;
        }
        int a2 = this.f8766a.mo5879a(bArr, i, Math.min(i3, i2));
        if (a2 != -1) {
            this.f8770e -= a2;
        }
        return a2;
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f8766a.mo5881c();
    }

    /* renamed from: d */
    public final void mo5882d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final Map mo5883e() {
        return this.f8766a.mo5883e();
    }

    /* renamed from: f */
    public final void mo5884f(C2495an anVar) {
        anVar.getClass();
        this.f8766a.mo5884f(anVar);
    }
}
