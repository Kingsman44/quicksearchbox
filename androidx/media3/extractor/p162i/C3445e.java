package androidx.media3.extractor.p162i;

import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3374bl;
import androidx.media3.extractor.C3627q;

/* renamed from: androidx.media3.extractor.i.e */
/* compiled from: PG */
public final class C3445e implements C3326aa {

    /* renamed from: a */
    private C3329ad f10636a;

    /* renamed from: b */
    private C3452l f10637b;

    /* renamed from: c */
    private boolean f10638c;

    /* renamed from: f */
    private final boolean m9976f(C3327ab abVar) {
        C3447g gVar = new C3447g();
        if (gVar.mo7408b(abVar, true) && (gVar.f10644a & 2) == 2) {
            int min = Math.min(gVar.f10648e, 8);
            C2604ac acVar = new C2604ac(min);
            ((C3627q) abVar).mo7320o(acVar.f7234a, 0, min, false);
            acVar.mo6131A(0);
            if (acVar.f7236c - acVar.f7235b >= 5 && acVar.mo6139g() == 127 && acVar.mo6146n() == 1179402563) {
                this.f10637b = new C3444d();
            } else {
                acVar.mo6131A(0);
                try {
                    if (C3374bl.m9761d(1, acVar, true)) {
                        this.f10637b = new C3454n();
                    }
                } catch (C2599az unused) {
                }
                acVar.mo6131A(0);
                if (C3449i.m9990d(acVar, C3449i.f10651a)) {
                    this.f10637b = new C3449i();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7152a(androidx.media3.extractor.C3327ab r19, androidx.media3.extractor.C3350ay r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.media3.extractor.ad r2 = r0.f10636a
            androidx.media3.common.p136b.C2601a.m6829a(r2)
            androidx.media3.extractor.i.l r2 = r0.f10637b
            r3 = 0
            if (r2 != 0) goto L_0x0022
            boolean r2 = r18.m9976f(r19)
            if (r2 == 0) goto L_0x001a
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            r2.f11568e = r3
            goto L_0x0022
        L_0x001a:
            java.lang.String r1 = "Failed to determine bitstream type"
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r2)
            throw r1
        L_0x0022:
            boolean r2 = r0.f10638c
            r4 = 1
            if (r2 != 0) goto L_0x003f
            androidx.media3.extractor.ad r2 = r0.f10636a
            androidx.media3.extractor.bf r2 = r2.mo6987eZ(r3, r4)
            androidx.media3.extractor.ad r5 = r0.f10636a
            r5.mo6988fa()
            androidx.media3.extractor.i.l r5 = r0.f10637b
            androidx.media3.extractor.ad r6 = r0.f10636a
            r5.f10658d = r6
            r5.f10657c = r2
            r5.mo7404b(r4)
            r0.f10638c = r4
        L_0x003f:
            androidx.media3.extractor.i.l r2 = r0.f10637b
            androidx.media3.extractor.bf r5 = r2.f10657c
            androidx.media3.common.p136b.C2601a.m6829a(r5)
            int r5 = androidx.media3.common.p136b.C2612ak.f7249a
            int r5 = r2.f10663i
            r6 = 3
            r7 = -1
            r9 = -1
            r15 = 2
            if (r5 == 0) goto L_0x00df
            if (r5 == r4) goto L_0x00d4
            if (r5 == r15) goto L_0x0058
        L_0x0055:
            r3 = -1
            goto L_0x0175
        L_0x0058:
            androidx.media3.extractor.i.h r5 = r2.f10659e
            long r10 = r5.mo7400a(r1)
            r12 = 0
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x006b
            r5 = r20
            r5.f10122a = r10
            r3 = 1
            goto L_0x0175
        L_0x006b:
            int r5 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0076
            r14 = 2
            long r10 = r10 + r14
            long r10 = -r10
            r2.mo7412g(r10)
        L_0x0076:
            boolean r5 = r2.f10667m
            if (r5 != 0) goto L_0x008a
            androidx.media3.extractor.i.h r5 = r2.f10659e
            androidx.media3.extractor.bb r5 = r5.mo7401b()
            androidx.media3.common.p136b.C2601a.m6829a(r5)
            androidx.media3.extractor.ad r10 = r2.f10658d
            r10.mo6989q(r5)
            r2.f10667m = r4
        L_0x008a:
            long r4 = r2.f10666l
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x009c
            androidx.media3.extractor.i.f r4 = r2.f10656b
            boolean r1 = r4.mo7406a(r1)
            if (r1 == 0) goto L_0x0099
            goto L_0x009c
        L_0x0099:
            r2.f10663i = r6
            goto L_0x0055
        L_0x009c:
            r2.f10666l = r12
            androidx.media3.extractor.i.f r1 = r2.f10656b
            androidx.media3.common.b.ac r1 = r1.f10640b
            long r4 = r2.mo7403a(r1)
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x00cd
            long r9 = r2.f10662h
            long r11 = r9 + r4
            long r13 = r2.f10660f
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x00cd
            long r12 = r2.mo7410e(r9)
            androidx.media3.extractor.bf r6 = r2.f10657c
            int r9 = r1.f7236c
            r6.mo6851c(r1, r9)
            androidx.media3.extractor.bf r11 = r2.f10657c
            r14 = 1
            int r15 = r1.f7236c
            r16 = 0
            r17 = 0
            r11.mo6852d(r12, r14, r15, r16, r17)
            r2.f10660f = r7
        L_0x00cd:
            long r6 = r2.f10662h
            long r6 = r6 + r4
            r2.f10662h = r6
            goto L_0x0175
        L_0x00d4:
            long r4 = r2.f10661g
            androidx.media3.extractor.q r1 = (androidx.media3.extractor.C3627q) r1
            int r5 = (int) r4
            r1.mo7639q(r5)
            r2.f10663i = r15
            return r3
        L_0x00df:
            androidx.media3.extractor.i.f r5 = r2.f10656b
            boolean r5 = r5.mo7406a(r1)
            if (r5 != 0) goto L_0x00eb
            r2.f10663i = r6
            goto L_0x0055
        L_0x00eb:
            r5 = r1
            androidx.media3.extractor.q r5 = (androidx.media3.extractor.C3627q) r5
            long r10 = r5.f11566c
            long r12 = r2.f10661g
            long r10 = r10 - r12
            r2.f10666l = r10
            androidx.media3.extractor.i.f r10 = r2.f10656b
            androidx.media3.common.b.ac r10 = r10.f10640b
            androidx.media3.extractor.i.j r11 = r2.f10665k
            boolean r10 = r2.mo7405c(r10, r12, r11)
            if (r10 == 0) goto L_0x0106
            long r10 = r5.f11566c
            r2.f10661g = r10
            goto L_0x00df
        L_0x0106:
            androidx.media3.extractor.i.j r1 = r2.f10665k
            androidx.media3.common.x r1 = r1.f10654a
            int r6 = r1.f7478B
            r2.f10664j = r6
            boolean r6 = r2.f10668n
            if (r6 != 0) goto L_0x0119
            androidx.media3.extractor.bf r6 = r2.f10657c
            r6.mo6850b(r1)
            r2.f10668n = r4
        L_0x0119:
            androidx.media3.extractor.i.j r1 = r2.f10665k
            androidx.media3.extractor.i.h r1 = r1.f10655b
            if (r1 == 0) goto L_0x0123
            r2.f10659e = r1
        L_0x0121:
            r1 = 2
            goto L_0x0155
        L_0x0123:
            long r11 = r5.f11565b
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0131
            androidx.media3.extractor.i.k r1 = new androidx.media3.extractor.i.k
            r1.<init>()
            r2.f10659e = r1
            goto L_0x0121
        L_0x0131:
            androidx.media3.extractor.i.f r1 = r2.f10656b
            androidx.media3.extractor.i.g r1 = r1.f10639a
            int r5 = r1.f10644a
            r5 = r5 & 4
            if (r5 == 0) goto L_0x013e
            r17 = 1
            goto L_0x0140
        L_0x013e:
            r17 = 0
        L_0x0140:
            androidx.media3.extractor.i.b r4 = new androidx.media3.extractor.i.b
            long r9 = r2.f10661g
            int r5 = r1.f10647d
            int r6 = r1.f10648e
            int r5 = r5 + r6
            long r13 = (long) r5
            long r5 = r1.f10645b
            r7 = r4
            r8 = r2
            r1 = 2
            r15 = r5
            r7.<init>(r8, r9, r11, r13, r15, r17)
            r2.f10659e = r4
        L_0x0155:
            r2.f10663i = r1
            androidx.media3.extractor.i.f r1 = r2.f10656b
            androidx.media3.common.b.ac r2 = r1.f10640b
            byte[] r4 = r2.f7234a
            int r5 = r4.length
            r6 = 65025(0xfe01, float:9.112E-41)
            if (r5 != r6) goto L_0x0164
            goto L_0x0175
        L_0x0164:
            int r5 = r2.f7236c
            int r5 = java.lang.Math.max(r6, r5)
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)
            androidx.media3.common.b.ac r1 = r1.f10640b
            int r1 = r1.f7236c
            r2.mo6157y(r4, r1)
        L_0x0175:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p162i.C3445e.mo7152a(androidx.media3.extractor.ab, androidx.media3.extractor.ay):int");
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        C3452l lVar = this.f10637b;
        if (lVar != null) {
            C3446f fVar = lVar.f10656b;
            fVar.f10639a.mo7407a();
            fVar.f10640b.mo6156x(0);
            fVar.f10641c = -1;
            fVar.f10642d = false;
            if (j == 0) {
                lVar.mo7404b(!lVar.f10667m);
            } else if (lVar.f10663i != 0) {
                lVar.f10660f = lVar.mo7411f(j2);
                C3448h hVar = lVar.f10659e;
                int i = C2612ak.f7249a;
                hVar.mo7402c(lVar.f10660f);
                lVar.f10663i = 2;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        try {
            return m9976f(abVar);
        } catch (C2599az unused) {
            return false;
        }
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f10636a = adVar;
    }
}
