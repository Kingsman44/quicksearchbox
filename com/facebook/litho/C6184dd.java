package com.facebook.litho;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.facebook.litho.p325d.C6180a;
import com.facebook.yoga.C6569e;
import com.facebook.yoga.C6570f;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.litho.dd */
/* compiled from: PG */
public final class C6184dd {

    /* renamed from: a */
    static final boolean f18250a = "robolectric".equals(Build.FINGERPRINT);

    /* JADX WARNING: Removed duplicated region for block: B:267:0x0469 A[Catch:{ ff -> 0x049c }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x046e A[Catch:{ ff -> 0x049c }] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x047b A[Catch:{ ff -> 0x049c }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x047f A[Catch:{ ff -> 0x049c }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x048c A[Catch:{ ff -> 0x049c }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x049f A[Catch:{ ff -> 0x049c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facebook.litho.C6181da m16302a(com.facebook.litho.C6411u r16, com.facebook.litho.C6407q r17, boolean r18, boolean r19, java.lang.String r20) {
        /*
            r1 = r16
            java.lang.String r0 = "component:"
            r2 = 0
            r3 = r17
            r4 = r19
            com.facebook.litho.u r4 = m16309h(r1, r3, r4)     // Catch:{ Exception -> 0x045c }
            r4.mo13348e()     // Catch:{ Exception -> 0x045c }
            com.facebook.litho.q r3 = r4.f19012e     // Catch:{ Exception -> 0x045c }
            boolean r5 = com.facebook.litho.C6407q.m17271B(r4, r3)     // Catch:{ Exception -> 0x045c }
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0039
            if (r18 != 0) goto L_0x0039
            com.facebook.litho.da r0 = com.facebook.litho.C6182db.m16301a(r4)     // Catch:{ Exception -> 0x045c }
            com.facebook.litho.hf r5 = r4.f19016i     // Catch:{ Exception -> 0x045c }
            r8 = r0
            com.facebook.litho.be r8 = (com.facebook.litho.C6124be) r8     // Catch:{ Exception -> 0x045c }
            com.facebook.litho.cz r8 = r8.mo12946as()     // Catch:{ Exception -> 0x045c }
            r8.f18225a = r7     // Catch:{ Exception -> 0x045c }
            r8 = r0
            com.facebook.litho.be r8 = (com.facebook.litho.C6124be) r8     // Catch:{ Exception -> 0x045c }
            com.facebook.litho.cz r8 = r8.mo12946as()     // Catch:{ Exception -> 0x045c }
            com.facebook.litho.hf r5 = com.facebook.litho.C6381hf.m17120b(r5)     // Catch:{ Exception -> 0x045c }
            r8.f18230f = r5     // Catch:{ Exception -> 0x045c }
            goto L_0x0084
        L_0x0039:
            boolean r5 = r3.mo13269e()     // Catch:{ Exception -> 0x045c }
            if (r5 == 0) goto L_0x0044
            com.facebook.litho.da r0 = r3.mo12836d(r4)     // Catch:{ Exception -> 0x045c }
            goto L_0x0084
        L_0x0044:
            boolean r5 = com.facebook.litho.C6407q.m17281z(r3)     // Catch:{ Exception -> 0x045c }
            if (r5 == 0) goto L_0x0057
            com.facebook.litho.da r0 = com.facebook.litho.C6182db.m16301a(r4)     // Catch:{ Exception -> 0x045c }
            r5 = r0
            com.facebook.litho.be r5 = (com.facebook.litho.C6124be) r5     // Catch:{ Exception -> 0x045c }
            com.facebook.yoga.k r5 = r5.f18090a     // Catch:{ Exception -> 0x045c }
            r5.mo13665P(r7)     // Catch:{ Exception -> 0x045c }
            goto L_0x0084
        L_0x0057:
            boolean r5 = com.facebook.litho.C6407q.m17279x(r3)     // Catch:{ Exception -> 0x045c }
            if (r5 == 0) goto L_0x0445
            boolean r0 = com.facebook.litho.C6407q.m17280y(r3)     // Catch:{ Exception -> 0x045c }
            if (r0 == 0) goto L_0x006a
            int r0 = r4.f19014g     // Catch:{ Exception -> 0x045c }
            com.facebook.litho.q r0 = r3.mo12827ar(r4, r0)     // Catch:{ Exception -> 0x045c }
            goto L_0x006e
        L_0x006a:
            com.facebook.litho.q r0 = r3.mo12835c(r4)     // Catch:{ Exception -> 0x045c }
        L_0x006e:
            if (r0 == 0) goto L_0x0074
            int r5 = r0.f18989l     // Catch:{ Exception -> 0x045c }
            if (r5 > 0) goto L_0x0075
        L_0x0074:
            r0 = r2
        L_0x0075:
            if (r0 != r3) goto L_0x007c
            com.facebook.litho.da r0 = r0.mo12836d(r4)     // Catch:{ Exception -> 0x045c }
            goto L_0x0084
        L_0x007c:
            if (r0 == 0) goto L_0x0083
            com.facebook.litho.da r0 = m16302a(r4, r0, r6, r6, r2)     // Catch:{ Exception -> 0x045c }
            goto L_0x0084
        L_0x0083:
            r0 = r2
        L_0x0084:
            if (r0 == 0) goto L_0x043f
            com.facebook.litho.da r5 = com.facebook.litho.C6411u.f19008a     // Catch:{ Exception -> 0x045c }
            if (r0 != r5) goto L_0x008c
            goto L_0x043f
        L_0x008c:
            com.facebook.litho.q r1 = r0.mo12936ai()
            if (r1 != 0) goto L_0x00ae
            boolean r1 = r3.mo12815af()
            if (r1 == 0) goto L_0x009f
            boolean r1 = com.facebook.litho.C6407q.m17281z(r3)
            if (r1 == 0) goto L_0x009f
            goto L_0x00a7
        L_0x009f:
            boolean r1 = com.facebook.litho.C6407q.m17271B(r4, r3)
            if (r1 == 0) goto L_0x00ae
            if (r18 != 0) goto L_0x00ae
        L_0x00a7:
            com.facebook.litho.ed r1 = com.facebook.litho.C6091ab.m15819aD()
            r0.mo12979bY(r1)
        L_0x00ae:
            com.facebook.litho.l r1 = r3.f19001x
            if (r1 == 0) goto L_0x0424
            boolean r5 = com.facebook.litho.C6407q.m17280y(r3)
            if (r5 == 0) goto L_0x00ba
            if (r18 != 0) goto L_0x0424
        L_0x00ba:
            com.facebook.litho.da r5 = com.facebook.litho.C6411u.f19008a
            if (r0 != r5) goto L_0x00c0
            goto L_0x0424
        L_0x00c0:
            com.facebook.litho.ev r5 = r1.f18969c
            if (r5 == 0) goto L_0x00cb
            com.facebook.litho.ev r8 = r0.mo12953az()
            r5.mo13039I(r8)
        L_0x00cb:
            byte r5 = r1.f18967a
            r5 = r5 & r7
            long r8 = (long) r5
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00da
            android.graphics.drawable.Drawable r5 = r1.f18970d
            r0.mo13004by(r5)
        L_0x00da:
            byte r5 = r1.f18967a
            r5 = r5 & 2
            long r8 = (long) r5
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00e8
            java.lang.String r5 = r1.f18971e
            r0.mo12967bM(r5)
        L_0x00e8:
            boolean r5 = r1.f18973g
            if (r5 != 0) goto L_0x00f5
            byte r5 = r1.f18967a
            r5 = r5 & 28
            long r8 = (long) r5
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00f8
        L_0x00f5:
            r0.mo12973bS()
        L_0x00f8:
            com.facebook.litho.j r5 = r1.f18974h
            r8 = 32768(0x8000, float:4.5918E-41)
            r9 = 131072(0x20000, float:1.83671E-40)
            r12 = 65536(0x10000, float:9.18355E-41)
            r13 = 262144(0x40000, float:3.67342E-40)
            r14 = 9
            if (r5 == 0) goto L_0x030b
            int r15 = r5.f18928a
            r15 = r15 & r7
            r17 = r3
            long r2 = (long) r15
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x0116
            int r2 = r5.f18929b
            r0.mo13024u(r2)
        L_0x0116:
            int r2 = r5.f18928a
            r2 = r2 & 2
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x0124
            float r2 = r5.f18930c
            r0.mo13023t(r2)
        L_0x0124:
            int r2 = r5.f18928a
            r2 = r2 & 4
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x0132
            int r2 = r5.f18931d
            r0.mo13022s(r2)
        L_0x0132:
            int r2 = r5.f18928a
            r2 = r2 & 8
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x0140
            float r2 = r5.f18932e
            r0.mo13021r(r2)
        L_0x0140:
            int r2 = r5.f18928a
            r2 = r2 & 16
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x014e
            int r2 = r5.f18933f
            r0.mo13018o(r2)
        L_0x014e:
            int r2 = r5.f18928a
            r2 = r2 & 32
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x015c
            float r2 = r5.f18934g
            r0.mo13017n(r2)
        L_0x015c:
            int r2 = r5.f18928a
            r2 = r2 & 64
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x016a
            int r2 = r5.f18935h
            r0.mo13013j(r2)
        L_0x016a:
            int r2 = r5.f18928a
            r2 = r2 & 128(0x80, float:1.794E-43)
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x0178
            float r2 = r5.f18936i
            r0.mo13012i(r2)
        L_0x0178:
            int r2 = r5.f18928a
            r2 = r2 & 256(0x100, float:3.59E-43)
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x0186
            int r2 = r5.f18937j
            r0.mo13020q(r2)
        L_0x0186:
            int r2 = r5.f18928a
            r2 = r2 & 512(0x200, float:7.175E-43)
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x0194
            float r2 = r5.f18938k
            r0.mo13019p(r2)
        L_0x0194:
            int r2 = r5.f18928a
            r2 = r2 & 1024(0x400, float:1.435E-42)
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x01a2
            int r2 = r5.f18939l
            r0.mo13016m(r2)
        L_0x01a2:
            int r2 = r5.f18928a
            r2 = r2 & 2048(0x800, float:2.87E-42)
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x01b0
            float r2 = r5.f18940m
            r0.mo13015l(r2)
        L_0x01b0:
            int r2 = r5.f18928a
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x01be
            com.facebook.yoga.f r2 = r5.f18946s
            r0.mo13014k(r2)
        L_0x01be:
            int r2 = r5.f18928a
            r2 = r2 & 8192(0x2000, float:1.14794E-41)
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x01cc
            com.facebook.yoga.a r2 = r5.f18947t
            r0.mo12954b(r2)
        L_0x01cc:
            int r2 = r5.f18928a
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x01d8
            r0.mo13026w()
        L_0x01d8:
            int r2 = r5.f18928a
            r2 = r2 & r8
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x01e5
            float r2 = r5.f18941n
            r0.mo13010g(r2)
        L_0x01e5:
            int r2 = r5.f18928a
            r2 = r2 & r12
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x01f2
            float r2 = r5.f18942o
            r0.mo13011h(r2)
        L_0x01f2:
            int r2 = r5.f18928a
            r2 = r2 & r9
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x01ff
            int r2 = r5.f18943p
            r0.mo13009f(r2)
        L_0x01ff:
            int r2 = r5.f18928a
            r2 = r2 & r13
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x020c
            float r2 = r5.f18944q
            r0.mo13008e(r2)
        L_0x020c:
            int r2 = r5.f18928a
            r3 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r3
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x021b
            float r2 = r5.f18945r
            r0.mo13006c(r2)
        L_0x021b:
            int r2 = r5.f18928a
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r3
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x022a
            int r2 = r5.f18927A
            r0.mo13025v(r2)
        L_0x022a:
            int r2 = r5.f18928a
            r3 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r3
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x0250
            r2 = 0
        L_0x0235:
            int r3 = com.facebook.litho.C6139bt.f18162a
            if (r2 >= r14) goto L_0x0250
            com.facebook.litho.bt r3 = r5.f18948u
            float r3 = r3.mo13119b(r2)
            boolean r15 = com.facebook.yoga.C6569e.m17936a(r3)
            if (r15 != 0) goto L_0x024d
            int r15 = com.facebook.yoga.C6571g.m17939b(r2)
            int r3 = (int) r3
            r0.mo12877C(r15, r3)
        L_0x024d:
            int r2 = r2 + 1
            goto L_0x0235
        L_0x0250:
            int r2 = r5.f18928a
            r3 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r3
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x0275
            r2 = 0
        L_0x025b:
            int r3 = com.facebook.litho.C6139bt.f18162a
            if (r2 >= r14) goto L_0x0275
            com.facebook.litho.bt r3 = r5.f18953z
            float r3 = r3.mo13119b(r2)
            boolean r15 = com.facebook.yoga.C6569e.m17936a(r3)
            if (r15 != 0) goto L_0x0272
            int r15 = com.facebook.yoga.C6571g.m17939b(r2)
            r0.mo12876B(r15, r3)
        L_0x0272:
            int r2 = r2 + 1
            goto L_0x025b
        L_0x0275:
            int r2 = r5.f18928a
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r2 & r3
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x029b
            r2 = 0
        L_0x0280:
            int r3 = com.facebook.litho.C6139bt.f18162a
            if (r2 >= r14) goto L_0x029b
            com.facebook.litho.bt r3 = r5.f18951x
            float r3 = r3.mo13119b(r2)
            boolean r15 = com.facebook.yoga.C6569e.m17936a(r3)
            if (r15 != 0) goto L_0x0298
            int r15 = com.facebook.yoga.C6571g.m17939b(r2)
            int r3 = (int) r3
            r0.mo12875A(r15, r3)
        L_0x0298:
            int r2 = r2 + 1
            goto L_0x0280
        L_0x029b:
            int r2 = r5.f18928a
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 & r3
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x02c0
            r2 = 0
        L_0x02a6:
            int r3 = com.facebook.litho.C6139bt.f18162a
            if (r2 >= r14) goto L_0x02c0
            com.facebook.litho.bt r3 = r5.f18952y
            float r3 = r3.mo13119b(r2)
            boolean r15 = com.facebook.yoga.C6569e.m17936a(r3)
            if (r15 != 0) goto L_0x02bd
            int r15 = com.facebook.yoga.C6571g.m17939b(r2)
            r0.mo13029z(r15, r3)
        L_0x02bd:
            int r2 = r2 + 1
            goto L_0x02a6
        L_0x02c0:
            int r2 = r5.f18928a
            r3 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r3
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x02e6
            r2 = 0
        L_0x02cb:
            int r3 = com.facebook.litho.C6139bt.f18162a
            if (r2 >= r14) goto L_0x02e6
            com.facebook.litho.bt r3 = r5.f18949v
            float r3 = r3.mo13119b(r2)
            boolean r15 = com.facebook.yoga.C6569e.m17936a(r3)
            if (r15 != 0) goto L_0x02e3
            int r15 = com.facebook.yoga.C6571g.m17939b(r2)
            int r3 = (int) r3
            r0.mo13028y(r15, r3)
        L_0x02e3:
            int r2 = r2 + 1
            goto L_0x02cb
        L_0x02e6:
            int r2 = r5.f18928a
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r3
            long r2 = (long) r2
            int r15 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r15 == 0) goto L_0x030d
            r2 = 0
        L_0x02f1:
            int r3 = com.facebook.litho.C6139bt.f18162a
            if (r2 >= r14) goto L_0x030d
            com.facebook.litho.bt r3 = r5.f18950w
            float r3 = r3.mo13119b(r2)
            boolean r15 = com.facebook.yoga.C6569e.m17936a(r3)
            if (r15 != 0) goto L_0x0308
            int r15 = com.facebook.yoga.C6571g.m17939b(r2)
            r0.mo13027x(r15, r3)
        L_0x0308:
            int r2 = r2 + 1
            goto L_0x02f1
        L_0x030b:
            r17 = r3
        L_0x030d:
            com.facebook.litho.k r1 = r1.f18968b
            if (r1 == 0) goto L_0x0426
            int r2 = r1.f18954a
            r2 = r2 & r7
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x031e
            int r2 = r1.f18958e
            r0.mo12960bF(r2)
        L_0x031e:
            int r2 = r1.f18954a
            r2 = r2 & 2
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x032a
            r0.mo12974bT()
        L_0x032a:
            int r2 = r1.f18954a
            r2 = r2 & r13
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0335
            r0.mo12957bC()
        L_0x0335:
            int r2 = r1.f18954a
            r2 = r2 & 4
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0341
            r0.mo12975bU()
        L_0x0341:
            int r2 = r1.f18954a
            r2 = r2 & 1024(0x400, float:1.435E-42)
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x034d
            r0.mo12973bS()
        L_0x034d:
            int r2 = r1.f18954a
            r2 = r2 & 8
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x035b
            com.facebook.litho.cb r2 = r1.f18955b
            r0.mo12972bR(r2)
        L_0x035b:
            int r2 = r1.f18954a
            r3 = 1073741824(0x40000000, float:2.0)
            r2 = r2 & r3
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x036a
            com.facebook.litho.cb r2 = r1.f18956c
            r0.mo12963bI(r2)
        L_0x036a:
            int r2 = r1.f18954a
            r2 = r2 & 16
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r2 = 0
            if (r5 == 0) goto L_0x0377
            r0.mo12958bD(r2)
        L_0x0377:
            int r3 = r1.f18954a
            r3 = r3 & 32
            long r6 = (long) r3
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0383
            r0.mo12959bE(r2)
        L_0x0383:
            int r2 = r1.f18954a
            r2 = r2 & 64
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0391
            com.facebook.litho.cb r2 = r1.f18957d
            r0.mo12961bG(r2)
        L_0x0391:
            int r2 = r1.f18954a
            r2 = r2 & 128(0x80, float:1.794E-43)
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r2 = 0
            if (r5 == 0) goto L_0x039e
            r0.mo12970bP(r2)
        L_0x039e:
            int r3 = r1.f18954a
            r3 = r3 & r12
            if (r3 == 0) goto L_0x03a6
            r0.mo12971bQ(r2)
        L_0x03a6:
            int r2 = r1.f18954a
            r2 = r2 & 512(0x200, float:7.175E-43)
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x03b6
            java.lang.String r2 = r1.f18961h
            java.lang.String r3 = r1.f18960g
            r0.mo12968bN(r2, r3)
        L_0x03b6:
            int r2 = r1.f18954a
            r2 = r2 & r9
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x03c3
            com.facebook.litho.go r2 = r1.f18962i
            r0.mo12969bO(r2)
        L_0x03c3:
            int r2 = r1.f18954a
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x03d2
            com.facebook.litho.gr r2 = r1.f18963j
            r0.mo12917aP(r2)
        L_0x03d2:
            int r2 = r1.f18954a
            r2 = r2 & 256(0x100, float:3.59E-43)
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x03f7
            r6 = 0
        L_0x03dc:
            int r2 = com.facebook.litho.C6139bt.f18162a
            if (r6 >= r14) goto L_0x03f7
            com.facebook.litho.bt r2 = r1.f18959f
            float r2 = r2.mo13119b(r6)
            boolean r3 = com.facebook.yoga.C6569e.m17936a(r2)
            if (r3 != 0) goto L_0x03f4
            int r3 = com.facebook.yoga.C6571g.m17939b(r6)
            int r2 = (int) r2
            r0.mo12978bX(r3, r2)
        L_0x03f4:
            int r6 = r6 + 1
            goto L_0x03dc
        L_0x03f7:
            int r2 = r1.f18954a
            r2 = r2 & 8192(0x2000, float:1.14794E-41)
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0405
            com.facebook.litho.e r2 = r1.f18964k
            r0.mo13005bz(r2)
        L_0x0405:
            int r2 = r1.f18954a
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0411
            r0.mo12965bK()
        L_0x0411:
            int r2 = r1.f18954a
            r2 = r2 & r8
            long r2 = (long) r2
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x041c
            r0.mo12966bL()
        L_0x041c:
            int r2 = r1.f18965l
            android.graphics.Paint r1 = r1.f18966m
            r0.mo12962bH(r2, r1)
            goto L_0x0426
        L_0x0424:
            r17 = r3
        L_0x0426:
            java.lang.String r1 = com.facebook.litho.C6103an.m15882i(r17)
            r2 = r17
            r0.mo12919aR(r2, r1)
            m16304c(r4)
            boolean r1 = com.facebook.litho.C6407q.m17281z(r2)
            if (r1 == 0) goto L_0x043b
            r2.mo12806Z(r4)
        L_0x043b:
            com.facebook.litho.C6407q.m17272C(r0, r2)
            return r0
        L_0x043f:
            r2 = r3
            com.facebook.litho.da r0 = com.facebook.litho.C6411u.f19008a     // Catch:{ Exception -> 0x0443 }
            return r0
        L_0x0443:
            r0 = move-exception
            goto L_0x0461
        L_0x0445:
            r2 = r3
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0443 }
            java.lang.String r4 = r2.mo13461q()     // Catch:{ Exception -> 0x0443 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0443 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0443 }
            r5.append(r4)     // Catch:{ Exception -> 0x0443 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x0443 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0443 }
            throw r3     // Catch:{ Exception -> 0x0443 }
        L_0x045c:
            r0 = move-exception
            goto L_0x0460
        L_0x045e:
            r0 = move-exception
            goto L_0x04a2
        L_0x0460:
            r2 = r3
        L_0x0461:
            com.facebook.litho.cb r3 = r16.mo13467b()     // Catch:{ all -> 0x045e }
            boolean r4 = r0 instanceof com.facebook.litho.C6263ff     // Catch:{ all -> 0x045e }
            if (r4 == 0) goto L_0x046e
            com.facebook.litho.ff r0 = (com.facebook.litho.C6263ff) r0     // Catch:{ all -> 0x045e }
            r0 = 0
        L_0x046c:
            r4 = 0
            goto L_0x0477
        L_0x046e:
            boolean r4 = r0 instanceof com.facebook.litho.C6196dp     // Catch:{ all -> 0x045e }
            if (r4 == 0) goto L_0x046c
            r4 = r0
            com.facebook.litho.dp r4 = (com.facebook.litho.C6196dp) r4     // Catch:{ all -> 0x045e }
            com.facebook.litho.cb r4 = r4.f18335a     // Catch:{ all -> 0x045e }
        L_0x0477:
            boolean r5 = r0 instanceof com.facebook.litho.C6196dp     // Catch:{ all -> 0x045e }
            if (r5 == 0) goto L_0x047f
            r5 = r0
            com.facebook.litho.dp r5 = (com.facebook.litho.C6196dp) r5     // Catch:{ all -> 0x045e }
            goto L_0x0485
        L_0x047f:
            com.facebook.litho.dp r5 = new com.facebook.litho.dp     // Catch:{ all -> 0x045e }
            r6 = 0
            r5.<init>(r1, r6, r0)     // Catch:{ all -> 0x045e }
        L_0x0485:
            java.util.ArrayList r6 = r5.f18336b     // Catch:{ all -> 0x045e }
            r6.add(r2)     // Catch:{ all -> 0x045e }
            if (r4 == r3) goto L_0x049f
            boolean r2 = r3 instanceof com.facebook.litho.C6144by     // Catch:{ all -> 0x045e }
            if (r2 == 0) goto L_0x0496
            com.facebook.litho.by r3 = (com.facebook.litho.C6144by) r3     // Catch:{ all -> 0x045e }
            r3.mo12874b(r5)     // Catch:{ all -> 0x045e }
            goto L_0x0499
        L_0x0496:
            com.facebook.litho.C6091ab.m15818S(r1, r0)     // Catch:{ ff -> 0x049c }
        L_0x0499:
            com.facebook.litho.da r0 = com.facebook.litho.C6411u.f19008a     // Catch:{ all -> 0x045e }
            return r0
        L_0x049c:
            r5.f18335a = r3     // Catch:{ all -> 0x045e }
            throw r5     // Catch:{ all -> 0x045e }
        L_0x049f:
            r5.f18335a = r4     // Catch:{ all -> 0x045e }
            throw r5     // Catch:{ all -> 0x045e }
        L_0x04a2:
            goto L_0x04a4
        L_0x04a3:
            throw r0
        L_0x04a4:
            goto L_0x04a3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6184dd.m16302a(com.facebook.litho.u, com.facebook.litho.q, boolean, boolean, java.lang.String):com.facebook.litho.da");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005f, code lost:
        if (m16305d(r11.mo12897W(), r11.mo12896V(), r19, r20, r11.mo12889O(), r11.mo12888N()) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a2, code lost:
        if (r1 != false) goto L_0x00a6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.litho.C6181da m16303b(com.facebook.litho.C6411u r17, com.facebook.litho.C6181da r18, int r19, int r20, com.facebook.litho.C6188dh r21) {
        /*
            r0 = r18
            r7 = r19
            r8 = r20
            com.facebook.litho.q r9 = r18.mo12936ai()
            java.lang.String r10 = r18.mo12907aF()
            com.facebook.litho.da r11 = r18.mo12948au()
            java.util.List r1 = r18.mo12915aN()
            java.util.List r2 = r18.mo12914aM()
            int r3 = r1.size()
            r12 = 1
            if (r3 <= r12) goto L_0x0040
            int r3 = r1.size()
            int r3 = r3 + -2
            java.lang.Object r1 = r1.get(r3)
            com.facebook.litho.q r1 = (com.facebook.litho.C6407q) r1
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
        L_0x0035:
            com.facebook.litho.C6103an.m15882i(r1)
            r2 = r17
            com.facebook.litho.dh r2 = r2.f19018k
            com.facebook.litho.u r1 = r1.f18995r
            r13 = r1
            goto L_0x0043
        L_0x0040:
            r2 = r17
            r13 = r2
        L_0x0043:
            if (r9 == 0) goto L_0x010d
            if (r11 == 0) goto L_0x0061
            int r1 = r11.mo12897W()
            int r2 = r11.mo12896V()
            float r5 = r11.mo12889O()
            float r6 = r11.mo12888N()
            r3 = r19
            r4 = r20
            boolean r1 = m16305d(r1, r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x00f9
        L_0x0061:
            com.facebook.litho.dg r1 = r13.mo13468c()
            if (r1 == 0) goto L_0x00fd
            com.facebook.litho.da r14 = r1.mo13157g(r9)
            r15 = 0
            if (r14 == 0) goto L_0x00a5
            r1.mo13158m(r9)
            boolean r1 = r14.mo12997br()
            if (r1 != 0) goto L_0x0086
            com.facebook.yoga.f r1 = r14.mo12886L()
            com.facebook.yoga.f r2 = r18.mo12886L()
            if (r1 != r2) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            r1 = 0
            r16 = 0
            goto L_0x0088
        L_0x0086:
            r16 = 1
        L_0x0088:
            int r1 = r14.mo12897W()
            int r2 = r14.mo12896V()
            float r5 = r14.mo12889O()
            float r6 = r14.mo12888N()
            r3 = r19
            r4 = r20
            boolean r1 = m16305d(r1, r2, r3, r4, r5, r6)
            if (r16 == 0) goto L_0x00a5
            if (r1 == 0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r14 = r15
        L_0x00a6:
            if (r14 == 0) goto L_0x00aa
            r11 = r14
            goto L_0x00f6
        L_0x00aa:
            if (r11 == 0) goto L_0x00b4
            boolean r1 = com.facebook.litho.p325d.C6180a.f18238e
            if (r1 == 0) goto L_0x00b4
            int r1 = r13.f19014g
            int r1 = r13.f19015h
        L_0x00b4:
            boolean r1 = f18250a
            if (r1 != 0) goto L_0x00ba
            r1 = r13
            goto L_0x00bf
        L_0x00ba:
            com.facebook.litho.u r1 = new com.facebook.litho.u
            r1.<init>(r13)
        L_0x00bf:
            com.facebook.litho.hf r2 = r18.mo12903aB()
            r1.f19016i = r2
            r1.f19014g = r7
            r1.f19015h = r8
            com.facebook.litho.da r9 = m16302a(r1, r9, r12, r12, r10)
            r0.mo12856d(r9)
            com.facebook.litho.bc r6 = r18.mo13002bw()
            r1 = r13
            r2 = r9
            r3 = r19
            r4 = r20
            r5 = r21
            m16308g(r1, r2, r3, r4, r5, r6)
            r9.mo12981bb(r7)
            r9.mo12926aY(r8)
            int r1 = r9.mo12901a()
            float r1 = (float) r1
            r9.mo12927aZ(r1)
            int r1 = r9.mo12882H()
            float r1 = (float) r1
            r9.mo12980ba(r1)
            r11 = r9
        L_0x00f6:
            r0.mo12982bc(r11)
        L_0x00f9:
            r11.mo12921aT()
            return r11
        L_0x00fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r9.mo13461q()
            java.lang.String r2 = ": Trying to access the cached InternalNode for a component outside of a LayoutState calculation. If that is what you must do, see Component#measureMightNotCacheInternalNode."
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x010d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "A component is required to resolve a nested tree."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6184dd.m16303b(com.facebook.litho.u, com.facebook.litho.da, int, int, com.facebook.litho.dh):com.facebook.litho.da");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f19017j;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m16304c(com.facebook.litho.C6411u r0) {
        /*
            if (r0 == 0) goto L_0x000a
            com.facebook.litho.ComponentTree r0 = r0.f19017j
            if (r0 != 0) goto L_0x0007
            goto L_0x000a
        L_0x0007:
            boolean r0 = r0.f17900c
            return r0
        L_0x000a:
            r0 = 0
            boolean r0 = com.facebook.litho.C6116b.m15917a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6184dd.m16304c(com.facebook.litho.u):boolean");
    }

    /* renamed from: d */
    public static boolean m16305d(int i, int i2, int i3, int i4, float f, float f2) {
        return C6235ei.m16506a(i, i3, (int) f) && C6235ei.m16506a(i2, i4, (int) f2);
    }

    /* renamed from: e */
    static C6181da m16306e(C6188dh dhVar, C6411u uVar, C6407q qVar, String str, int i, int i2, C6181da daVar, C6188dh dhVar2, C6122bc bcVar, C6261fd fdVar) {
        C6181da daVar2;
        C6187dg dgVar;
        if (fdVar != null) {
            fdVar.mo13236b(daVar == null ? "start_create_layout" : "start_reconcile_layout");
        }
        uVar.f19014g = i;
        uVar.f19015h = i2;
        String str2 = "end_create_layout";
        if (daVar == null) {
            daVar2 = m16302a(uVar, qVar, true, false, (String) null);
            if (uVar.mo13474l()) {
                if (fdVar != null) {
                    fdVar.mo13236b(str2);
                }
                return daVar2;
            }
            C6188dh dhVar3 = uVar.f19018k;
            if (!(dhVar3 == null || (dgVar = dhVar3.f18322a) == null)) {
                dgVar.f18270C = false;
            }
        } else {
            C6407q qVar2 = m16309h(uVar, qVar, true).f19012e;
            daVar2 = daVar.mo12951ax(dhVar, uVar, qVar2, C6103an.m15882i(qVar2));
        }
        if (fdVar != null) {
            if (daVar != null) {
                str2 = "end_reconcile_layout";
            }
            fdVar.mo13236b(str2);
        }
        if (fdVar != null) {
            fdVar.mo13236b("start_measure");
        }
        m16308g(uVar, daVar2, i, i2, dhVar2, bcVar);
        if (fdVar != null) {
            fdVar.mo13236b("end_measure");
        }
        return daVar2;
    }

    /* renamed from: f */
    static void m16307f(C6188dh dhVar, C6181da daVar, C6188dh dhVar2, C6122bc bcVar) {
        ComponentTree componentTree;
        try {
            C6181da aw = daVar.mo12950aw();
            if (C6407q.m17280y(daVar.mo12936ai())) {
                if (aw != null) {
                    daVar.mo13003bx(bcVar);
                    return;
                }
            }
            if (bcVar != null) {
                if (C6103an.m15881h(daVar.mo12936ai(), bcVar.f18065e)) {
                    daVar.mo13003bx(bcVar);
                    int T = daVar.mo12894T();
                    int size = bcVar.f18070j.size();
                    if (T == 0 || size == 0) {
                        C6407q ai = daVar.mo12936ai();
                        daVar.mo12907aF();
                        C6103an.m15882i(ai);
                        if (ai != null) {
                            C6407q qVar = bcVar.f18065e;
                            if (qVar != null) {
                                if (!(dhVar == null || (componentTree = dhVar.f18323b) == null)) {
                                    C6187dg dgVar = componentTree.f17872C;
                                    if ((dgVar == null ? null : dgVar.f18302g) != null) {
                                        C6407q.m17273E(qVar);
                                    }
                                }
                            }
                            if (!ai.mo12809aC(bcVar.f18065e, ai)) {
                                C6407q ai2 = daVar.mo12936ai();
                                daVar.mo12907aF();
                                C6103an.m15882i(ai2);
                                if (ai2 != null) {
                                    ai2.mo13462r(ai2.f19000w, bcVar.f18065e.f19000w);
                                }
                                daVar.mo12964bJ();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int i = 0;
                    while (i < T && i < size) {
                        m16307f(dhVar, daVar.mo12947at(i), dhVar2, (C6122bc) bcVar.f18070j.get(i));
                        i++;
                    }
                }
            }
        } catch (Throwable th) {
            C6196dp dpVar = new C6196dp(daVar.mo12937aj(), (ComponentTree) null, th);
            C6407q ai3 = daVar.mo12936ai();
            if (ai3 != null) {
                dpVar.f18336b.add(ai3);
            }
            throw dpVar;
        }
    }

    /* renamed from: g */
    static void m16308g(C6411u uVar, C6181da daVar, int i, int i2, C6188dh dhVar, C6122bc bcVar) {
        float f;
        if (daVar.mo12904aC() == C6570f.INHERIT) {
            Context context = uVar.f19009b;
            if ((context.getApplicationInfo().flags & 4194304) != 0 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
                daVar.mo13014k(C6570f.RTL);
            }
        }
        if (C6569e.m17936a(daVar.mo12891Q())) {
            daVar.mo12985bf(i);
        }
        if (C6569e.m17936a(daVar.mo12890P())) {
            daVar.mo12984be(i2);
        }
        if (bcVar != null) {
            m16307f(uVar.f19018k, daVar, dhVar, bcVar);
        }
        float f2 = Float.NaN;
        if (View.MeasureSpec.getMode(i) == 0) {
            f = Float.NaN;
        } else {
            f = (float) View.MeasureSpec.getSize(i);
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            f2 = (float) View.MeasureSpec.getSize(i2);
        }
        daVar.mo12923aV(f, f2);
    }

    /* renamed from: h */
    static C6411u m16309h(C6411u uVar, C6407q qVar, boolean z) {
        AtomicBoolean atomicBoolean = qVar.f18994q;
        C6407q j = (atomicBoolean != null && atomicBoolean.getAndSet(true)) ? qVar.mo13318j() : qVar;
        if (z) {
            j.f18991n = C6103an.m15882i(qVar);
        }
        C6381hf hfVar = uVar.f19016i;
        j.mo12811ab(hfVar);
        C6411u I = j.mo13455I(uVar);
        I.f19016i = j.mo12826aq(hfVar);
        if (C6180a.f18234a) {
            C6109at atVar = (C6109at) C6110au.f18040a.get(C6110au.m15900j(I, I.mo13348e()));
            if (atVar != null) {
                atVar.mo12857a();
                C6279fv fvVar = j.f18999v;
                atVar.mo12859c();
            }
        }
        return I;
    }
}
