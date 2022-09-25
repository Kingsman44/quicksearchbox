package androidx.media3.extractor.p172k;

import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3350ay;
import androidx.media3.extractor.C3363ba;

/* renamed from: androidx.media3.extractor.k.a */
/* compiled from: PG */
public final class C3527a implements C3326aa {

    /* renamed from: a */
    private final C3549b f11028a = new C3549b((String) null);

    /* renamed from: b */
    private final C2604ac f11029b = new C2604ac(2786);

    /* renamed from: c */
    private boolean f11030c;

    /* renamed from: a */
    public final int mo7152a(C3327ab abVar, C3350ay ayVar) {
        int a = abVar.mo5879a(this.f11029b.f7234a, 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.f11029b.mo6131A(0);
        this.f11029b.mo6158z(a);
        if (!this.f11030c) {
            this.f11028a.mo7469d(0, 4);
            this.f11030c = true;
        }
        this.f11028a.mo7466a(this.f11029b);
        return 0;
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        this.f11030c = false;
        this.f11028a.mo7470e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        r5.f11568e = 0;
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        if ((r4 - r3) >= 8192) goto L_0x0044;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7155e(androidx.media3.extractor.C3327ab r14) {
        /*
            r13 = this;
            androidx.media3.common.b.ac r0 = new androidx.media3.common.b.ac
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f7234a
            r5 = r14
            androidx.media3.extractor.q r5 = (androidx.media3.extractor.C3627q) r5
            r5.mo7320o(r4, r2, r1, r2)
            r0.mo6131A(r2)
            int r4 = r0.mo6140h()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L_0x0081
            r5.f11568e = r2
            r5.mo7319n(r3, r2)
            r4 = r3
        L_0x0024:
            r14 = 0
        L_0x0025:
            byte[] r6 = r0.f7234a
            r8 = 6
            r5.mo7320o(r6, r2, r8, r2)
            r0.mo6131A(r2)
            int r6 = r0.mo6142j()
            r9 = 2935(0xb77, float:4.113E-42)
            if (r6 == r9) goto L_0x0045
            r5.f11568e = r2
            int r4 = r4 + 1
            int r14 = r4 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r14 >= r6) goto L_0x0044
            r5.mo7319n(r4, r2)
            goto L_0x0024
        L_0x0044:
            return r2
        L_0x0045:
            r6 = 1
            int r14 = r14 + r6
            r9 = 4
            if (r14 >= r9) goto L_0x0080
            byte[] r10 = r0.f7234a
            int[] r11 = androidx.media3.extractor.C3375c.f10200a
            int r11 = r10.length
            r12 = -1
            if (r11 >= r8) goto L_0x0054
            r8 = -1
            goto L_0x0077
        L_0x0054:
            r11 = 5
            byte r11 = r10[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r7
            if (r11 <= r1) goto L_0x006b
            r8 = 2
            byte r8 = r10[r8]
            r8 = r8 & 7
            int r8 = r8 << 8
            byte r9 = r10[r7]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r8 = r8 | r9
            int r8 = r8 + r6
            int r8 = r8 + r8
            goto L_0x0077
        L_0x006b:
            byte r6 = r10[r9]
            r9 = r6 & 192(0xc0, float:2.69E-43)
            int r8 = r9 >> 6
            r6 = r6 & 63
            int r8 = androidx.media3.extractor.C3375c.m9762a(r8, r6)
        L_0x0077:
            if (r8 != r12) goto L_0x007a
            return r2
        L_0x007a:
            int r8 = r8 + -6
            r5.mo7319n(r8, r2)
            goto L_0x0025
        L_0x0080:
            return r6
        L_0x0081:
            int r4 = r0.f7235b
            int r4 = r4 + r7
            r0.mo6131A(r4)
            int r4 = r0.mo6138f()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo7319n(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3527a.mo7155e(androidx.media3.extractor.ab):boolean");
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f11028a.mo7467b(adVar, new C3545ar(LinearLayoutManager.INVALID_OFFSET, 0, 1));
        adVar.mo6988fa();
        adVar.mo6989q(new C3363ba(-9223372036854775807L, 0));
    }
}
