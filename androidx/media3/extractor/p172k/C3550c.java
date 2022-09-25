package androidx.media3.extractor.p172k;

import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3350ay;
import androidx.media3.extractor.C3363ba;

/* renamed from: androidx.media3.extractor.k.c */
/* compiled from: PG */
public final class C3550c implements C3326aa {

    /* renamed from: a */
    private final C3551d f11127a = new C3551d((String) null);

    /* renamed from: b */
    private final C2604ac f11128b = new C2604ac(16384);

    /* renamed from: c */
    private boolean f11129c;

    /* renamed from: a */
    public final int mo7152a(C3327ab abVar, C3350ay ayVar) {
        int a = abVar.mo5879a(this.f11128b.f7234a, 0, 16384);
        if (a == -1) {
            return -1;
        }
        this.f11128b.mo6131A(0);
        this.f11128b.mo6158z(a);
        if (!this.f11129c) {
            this.f11127a.mo7469d(0, 4);
            this.f11129c = true;
        }
        this.f11127a.mo7466a(this.f11128b);
        return 0;
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        this.f11129c = false;
        this.f11127a.mo7470e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        r5.f11568e = 0;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if ((r1 - r3) >= 8192) goto L_0x004a;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo7155e(androidx.media3.extractor.C3327ab r15) {
        /*
            r14 = this;
            androidx.media3.common.b.ac r0 = new androidx.media3.common.b.ac
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f7234a
            r5 = r15
            androidx.media3.extractor.q r5 = (androidx.media3.extractor.C3627q) r5
            r5.mo7320o(r4, r2, r1, r2)
            r0.mo6131A(r2)
            int r4 = r0.mo6140h()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L_0x0094
            r5.f11568e = r2
            r5.mo7319n(r3, r2)
            r1 = r3
        L_0x0024:
            r15 = 0
        L_0x0025:
            byte[] r4 = r0.f7234a
            r6 = 7
            r5.mo7320o(r4, r2, r6, r2)
            r0.mo6131A(r2)
            int r4 = r0.mo6142j()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r4 == r8) goto L_0x004e
            if (r4 == r9) goto L_0x004b
            r5.f11568e = r2
            int r1 = r1 + 1
            int r15 = r1 - r3
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r15 >= r4) goto L_0x004a
            r5.mo7319n(r1, r2)
            goto L_0x0024
        L_0x004a:
            return r2
        L_0x004b:
            r4 = 44097(0xac41, float:6.1793E-41)
        L_0x004e:
            r8 = 1
            int r15 = r15 + r8
            r10 = 4
            if (r15 >= r10) goto L_0x0093
            byte[] r8 = r0.f7234a
            int r11 = androidx.media3.extractor.C3387e.f10256a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L_0x005d
            r11 = -1
            goto L_0x008a
        L_0x005d:
            r11 = 2
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            byte r13 = r8[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L_0x0084
            byte r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            byte r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            byte r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L_0x0085
        L_0x0084:
            r6 = 4
        L_0x0085:
            if (r4 != r9) goto L_0x0089
            int r6 = r6 + 2
        L_0x0089:
            int r11 = r11 + r6
        L_0x008a:
            if (r11 != r12) goto L_0x008d
            return r2
        L_0x008d:
            int r11 = r11 + -7
            r5.mo7319n(r11, r2)
            goto L_0x0025
        L_0x0093:
            return r8
        L_0x0094:
            int r4 = r0.f7235b
            int r4 = r4 + r7
            r0.mo6131A(r4)
            int r4 = r0.mo6138f()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo7319n(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3550c.mo7155e(androidx.media3.extractor.ab):boolean");
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f11127a.mo7467b(adVar, new C3545ar(LinearLayoutManager.INVALID_OFFSET, 0, 1));
        adVar.mo6988fa();
        adVar.mo6989q(new C3363ba(-9223372036854775807L, 0));
    }
}
