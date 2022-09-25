package com.airbnb.lottie.p243e;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.p098j.p100b.C2034a;
import androidx.p060c.C0985o;
import com.airbnb.lottie.p243e.p244a.C4906c;
import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p245f.C4954k;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.research.xeno.effect.C66412o;
import java.lang.ref.WeakReference;

/* renamed from: com.airbnb.lottie.e.q */
/* compiled from: PG */
final class C4933q {

    /* renamed from: a */
    static final C4906c f15688a = C4906c.m13601a(C42181t.f110467a, C59002s.f156871a, "e", C66412o.f180592a, "i", C19618h.f54585a, "to", "ti");

    /* renamed from: b */
    static final C4906c f15689b = C4906c.m13601a("x", "y");

    /* renamed from: c */
    private static final Interpolator f15690c = new LinearInterpolator();

    /* renamed from: d */
    private static C0985o f15691d;

    C4933q() {
    }

    /* renamed from: b */
    private static Interpolator m13677b(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator interpolator;
        pointF.x = C4949f.m13708b(pointF.x, -1.0f, 1.0f);
        pointF.y = C4949f.m13708b(pointF.y, -100.0f, 100.0f);
        pointF2.x = C4949f.m13708b(pointF2.x, -1.0f, 1.0f);
        pointF2.y = C4949f.m13708b(pointF2.y, -100.0f, 100.0f);
        int d = C4954k.m13721d(pointF.x, pointF.y, pointF2.x, pointF2.y);
        synchronized (C4933q.class) {
            if (f15691d == null) {
                f15691d = new C0985o(10);
            }
            weakReference = (WeakReference) f15691d.mo3726e(d);
        }
        Interpolator interpolator2 = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference == null || interpolator2 == null) {
            try {
                interpolator = C2034a.m5471c(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    interpolator = C2034a.m5471c(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    interpolator = new LinearInterpolator();
                }
            }
            interpolator2 = interpolator;
            try {
                WeakReference weakReference2 = new WeakReference(interpolator2);
                synchronized (C4933q.class) {
                    f15691d.mo3730i(d, weakReference2);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        r13 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x019b, code lost:
        r13 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a8, code lost:
        r13 = r26;
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ab, code lost:
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ad, code lost:
        r5 = r20;
     */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01f2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.p246g.C4956a m13676a(com.airbnb.lottie.p243e.p244a.C4908e r21, com.airbnb.lottie.C4964k r22, float r23, com.airbnb.lottie.p243e.C4917ah r24, boolean r25, boolean r26) {
        /*
            r0 = r21
            r1 = r23
            r2 = r24
            if (r25 == 0) goto L_0x0284
            if (r26 == 0) goto L_0x0208
            r21.mo9847j()
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0019:
            boolean r17 = r21.mo9853p()
            if (r17 == 0) goto L_0x01b1
            com.airbnb.lottie.e.a.c r4 = f15688a
            int r4 = r0.mo9841c(r4)
            r26 = r13
            switch(r4) {
                case 0: goto L_0x019e;
                case 1: goto L_0x0192;
                case 2: goto L_0x0188;
                case 3: goto L_0x00f3;
                case 4: goto L_0x004d;
                case 5: goto L_0x0040;
                case 6: goto L_0x0039;
                case 7: goto L_0x0034;
                default: goto L_0x002a;
            }
        L_0x002a:
            r20 = r5
            r19 = r6
            r5 = r7
            r21.mo9852o()
            goto L_0x019b
        L_0x0034:
            android.graphics.PointF r6 = com.airbnb.lottie.p243e.C4932p.m13674c(r0, r1)
            goto L_0x003d
        L_0x0039:
            android.graphics.PointF r5 = com.airbnb.lottie.p243e.C4932p.m13674c(r0, r1)
        L_0x003d:
            r13 = r26
            goto L_0x0019
        L_0x0040:
            int r4 = r21.mo9840b()
            r7 = 1
            r13 = r26
            if (r4 != r7) goto L_0x004b
            r7 = 1
            goto L_0x0019
        L_0x004b:
            r7 = 0
            goto L_0x0019
        L_0x004d:
            int r4 = r21.mo9855r()
            r13 = 3
            if (r4 != r13) goto L_0x00e8
            r21.mo9847j()
            r3 = 0
            r4 = 0
            r13 = 0
            r14 = 0
        L_0x005b:
            boolean r18 = r21.mo9853p()
            if (r18 == 0) goto L_0x00d1
            r19 = r6
            com.airbnb.lottie.e.a.c r6 = f15689b
            int r6 = r0.mo9841c(r6)
            if (r6 == 0) goto L_0x00a3
            r20 = r5
            r5 = 1
            if (r6 == r5) goto L_0x0078
            r21.mo9852o()
        L_0x0073:
            r6 = r19
            r5 = r20
            goto L_0x005b
        L_0x0078:
            int r4 = r21.mo9855r()
            r5 = 7
            if (r4 != r5) goto L_0x0086
            double r5 = r21.mo9839a()
            float r14 = (float) r5
            r4 = r14
            goto L_0x0073
        L_0x0086:
            r21.mo9846i()
            double r4 = r21.mo9839a()
            float r4 = (float) r4
            int r5 = r21.mo9855r()
            r6 = 7
            if (r5 != r6) goto L_0x009d
            r5 = r7
            double r6 = r21.mo9839a()
            float r6 = (float) r6
            r14 = r6
            goto L_0x009f
        L_0x009d:
            r5 = r7
            r14 = r4
        L_0x009f:
            r21.mo9848k()
            goto L_0x00cf
        L_0x00a3:
            r20 = r5
            r5 = r7
            int r3 = r21.mo9855r()
            r6 = 7
            if (r3 != r6) goto L_0x00b5
            double r6 = r21.mo9839a()
            float r13 = (float) r6
            r7 = r5
            r3 = r13
            goto L_0x0073
        L_0x00b5:
            r21.mo9846i()
            double r6 = r21.mo9839a()
            float r3 = (float) r6
            int r6 = r21.mo9855r()
            r7 = 7
            if (r6 != r7) goto L_0x00cb
            double r6 = r21.mo9839a()
            float r6 = (float) r6
            r13 = r6
            goto L_0x00cc
        L_0x00cb:
            r13 = r3
        L_0x00cc:
            r21.mo9848k()
        L_0x00cf:
            r7 = r5
            goto L_0x0073
        L_0x00d1:
            r20 = r5
            r19 = r6
            r5 = r7
            android.graphics.PointF r6 = new android.graphics.PointF
            r6.<init>(r3, r4)
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r13, r14)
            r21.mo9849l()
            r13 = r26
            r14 = r6
            goto L_0x01ab
        L_0x00e8:
            r20 = r5
            r19 = r6
            r5 = r7
            android.graphics.PointF r9 = com.airbnb.lottie.p243e.C4932p.m13674c(r0, r1)
            goto L_0x019b
        L_0x00f3:
            r20 = r5
            r19 = r6
            r5 = r7
            int r4 = r21.mo9855r()
            r6 = 3
            if (r4 != r6) goto L_0x0183
            r21.mo9847j()
            r4 = 0
            r6 = 0
            r7 = 0
            r10 = 0
        L_0x0106:
            boolean r12 = r21.mo9853p()
            if (r12 == 0) goto L_0x016b
            com.airbnb.lottie.e.a.c r12 = f15689b
            int r12 = r0.mo9841c(r12)
            if (r12 == 0) goto L_0x0143
            r13 = 1
            if (r12 == r13) goto L_0x011b
            r21.mo9852o()
            goto L_0x0106
        L_0x011b:
            int r6 = r21.mo9855r()
            r12 = 7
            if (r6 != r12) goto L_0x0129
            double r12 = r21.mo9839a()
            float r10 = (float) r12
            r6 = r10
            goto L_0x0106
        L_0x0129:
            r21.mo9846i()
            double r12 = r21.mo9839a()
            float r6 = (float) r12
            int r10 = r21.mo9855r()
            r12 = 7
            if (r10 != r12) goto L_0x013e
            double r12 = r21.mo9839a()
            float r10 = (float) r12
            goto L_0x013f
        L_0x013e:
            r10 = r6
        L_0x013f:
            r21.mo9848k()
            goto L_0x0106
        L_0x0143:
            int r4 = r21.mo9855r()
            r12 = 7
            if (r4 != r12) goto L_0x0151
            double r12 = r21.mo9839a()
            float r7 = (float) r12
            r4 = r7
            goto L_0x0106
        L_0x0151:
            r21.mo9846i()
            double r12 = r21.mo9839a()
            float r4 = (float) r12
            int r7 = r21.mo9855r()
            r12 = 7
            if (r7 != r12) goto L_0x0166
            double r12 = r21.mo9839a()
            float r7 = (float) r12
            goto L_0x0167
        L_0x0166:
            r7 = r4
        L_0x0167:
            r21.mo9848k()
            goto L_0x0106
        L_0x016b:
            android.graphics.PointF r12 = new android.graphics.PointF
            r12.<init>(r4, r6)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r7, r10)
            r21.mo9849l()
            r13 = r26
            r7 = r5
            r10 = r12
            r6 = r19
            r5 = r20
            r12 = r4
            goto L_0x0019
        L_0x0183:
            android.graphics.PointF r8 = com.airbnb.lottie.p243e.C4932p.m13674c(r0, r1)
            goto L_0x01a8
        L_0x0188:
            r20 = r5
            r19 = r6
            r5 = r7
            java.lang.Object r13 = r2.mo9858a(r0, r1)
            goto L_0x01ad
        L_0x0192:
            r20 = r5
            r19 = r6
            r5 = r7
            java.lang.Object r11 = r2.mo9858a(r0, r1)
        L_0x019b:
            r13 = r26
            goto L_0x01ad
        L_0x019e:
            r20 = r5
            r19 = r6
            r5 = r7
            double r6 = r21.mo9839a()
            float r15 = (float) r6
        L_0x01a8:
            r13 = r26
            r7 = r5
        L_0x01ab:
            r6 = r19
        L_0x01ad:
            r5 = r20
            goto L_0x0019
        L_0x01b1:
            r20 = r5
            r19 = r6
            r5 = r7
            r26 = r13
            r21.mo9849l()
            if (r5 == 0) goto L_0x01c3
            android.view.animation.Interpolator r0 = f15690c
            r12 = r11
        L_0x01c0:
            r13 = 0
            r14 = 0
            goto L_0x01e7
        L_0x01c3:
            if (r8 == 0) goto L_0x01cc
            if (r9 == 0) goto L_0x01cc
            android.view.animation.Interpolator r0 = m13677b(r8, r9)
            goto L_0x01e4
        L_0x01cc:
            if (r10 == 0) goto L_0x01e2
            if (r12 == 0) goto L_0x01e2
            if (r14 == 0) goto L_0x01e2
            if (r3 == 0) goto L_0x01e2
            android.view.animation.Interpolator r0 = m13677b(r10, r14)
            android.view.animation.Interpolator r1 = m13677b(r12, r3)
            r12 = r26
            r13 = r0
            r14 = r1
            r0 = 0
            goto L_0x01e7
        L_0x01e2:
            android.view.animation.Interpolator r0 = f15690c
        L_0x01e4:
            r12 = r26
            goto L_0x01c0
        L_0x01e7:
            if (r13 == 0) goto L_0x01f2
            com.airbnb.lottie.g.a r0 = new com.airbnb.lottie.g.a
            r9 = r0
            r10 = r22
            r9.<init>((com.airbnb.lottie.C4964k) r10, (java.lang.Object) r11, (java.lang.Object) r12, (android.view.animation.Interpolator) r13, (android.view.animation.Interpolator) r14, (float) r15)
            goto L_0x01ff
        L_0x01f2:
            com.airbnb.lottie.g.a r1 = new com.airbnb.lottie.g.a
            r2 = 0
            r9 = r1
            r10 = r22
            r13 = r0
            r14 = r15
            r15 = r2
            r9.<init>((com.airbnb.lottie.C4964k) r10, (java.lang.Object) r11, (java.lang.Object) r12, (android.view.animation.Interpolator) r13, (float) r14, (java.lang.Float) r15)
            r0 = r1
        L_0x01ff:
            r5 = r20
            r0.f15742m = r5
            r6 = r19
            r0.f15743n = r6
            return r0
        L_0x0208:
            r21.mo9847j()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r12 = 0
            r16 = 0
        L_0x0214:
            boolean r8 = r21.mo9853p()
            if (r8 == 0) goto L_0x025e
            com.airbnb.lottie.e.a.c r8 = f15688a
            int r8 = r0.mo9841c(r8)
            r10 = 1065353216(0x3f800000, float:1.0)
            switch(r8) {
                case 0: goto L_0x0257;
                case 1: goto L_0x0251;
                case 2: goto L_0x024b;
                case 3: goto L_0x0245;
                case 4: goto L_0x023f;
                case 5: goto L_0x0234;
                case 6: goto L_0x022f;
                case 7: goto L_0x022a;
                default: goto L_0x0225;
            }
        L_0x0225:
            r8 = 1
            r21.mo9852o()
            goto L_0x0214
        L_0x022a:
            android.graphics.PointF r5 = com.airbnb.lottie.p243e.C4932p.m13674c(r0, r1)
            goto L_0x0214
        L_0x022f:
            android.graphics.PointF r4 = com.airbnb.lottie.p243e.C4932p.m13674c(r0, r1)
            goto L_0x0214
        L_0x0234:
            int r7 = r21.mo9840b()
            r8 = 1
            if (r7 != r8) goto L_0x023d
            r7 = 1
            goto L_0x0214
        L_0x023d:
            r7 = 0
            goto L_0x0214
        L_0x023f:
            r8 = 1
            android.graphics.PointF r3 = com.airbnb.lottie.p243e.C4932p.m13674c(r0, r10)
            goto L_0x0214
        L_0x0245:
            r8 = 1
            android.graphics.PointF r6 = com.airbnb.lottie.p243e.C4932p.m13674c(r0, r10)
            goto L_0x0214
        L_0x024b:
            r8 = 1
            java.lang.Object r16 = r2.mo9858a(r0, r1)
            goto L_0x0214
        L_0x0251:
            r8 = 1
            java.lang.Object r9 = r2.mo9858a(r0, r1)
            goto L_0x0214
        L_0x0257:
            r8 = 1
            double r10 = r21.mo9839a()
            float r12 = (float) r10
            goto L_0x0214
        L_0x025e:
            r21.mo9849l()
            if (r7 == 0) goto L_0x0268
            android.view.animation.Interpolator r0 = f15690c
            r11 = r0
            r10 = r9
            goto L_0x0276
        L_0x0268:
            if (r6 == 0) goto L_0x0271
            if (r3 == 0) goto L_0x0271
            android.view.animation.Interpolator r0 = m13677b(r6, r3)
            goto L_0x0273
        L_0x0271:
            android.view.animation.Interpolator r0 = f15690c
        L_0x0273:
            r11 = r0
            r10 = r16
        L_0x0276:
            com.airbnb.lottie.g.a r0 = new com.airbnb.lottie.g.a
            r13 = 0
            r7 = r0
            r8 = r22
            r7.<init>((com.airbnb.lottie.C4964k) r8, (java.lang.Object) r9, (java.lang.Object) r10, (android.view.animation.Interpolator) r11, (float) r12, (java.lang.Float) r13)
            r0.f15742m = r4
            r0.f15743n = r5
            return r0
        L_0x0284:
            java.lang.Object r0 = r2.mo9858a(r0, r1)
            com.airbnb.lottie.g.a r1 = new com.airbnb.lottie.g.a
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p243e.C4933q.m13676a(com.airbnb.lottie.e.a.e, com.airbnb.lottie.k, float, com.airbnb.lottie.e.ah, boolean, boolean):com.airbnb.lottie.g.a");
    }
}
