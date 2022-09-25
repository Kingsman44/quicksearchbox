package com.android.p271h.p272a;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.android.p261d.p264c.C5053a;
import com.android.p261d.p264c.C5059g;
import com.android.p261d.p264c.C5062j;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.android.h.a.i */
/* compiled from: PG */
final class C5161i implements GLSurfaceView.Renderer {

    /* renamed from: a */
    final /* synthetic */ C5162j f16411a;

    /* renamed from: b */
    private C5059g f16412b;

    public C5161i(C5162j jVar) {
        this.f16411a = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x0337 A[Catch:{ all -> 0x04ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0340 A[Catch:{ all -> 0x04ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDrawFrame(javax.microedition.khronos.opengles.GL10 r28) {
        /*
            r27 = this;
            r1 = r27
            r0 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r0, r0, r0, r2)
            com.android.p261d.p264c.C5059g.m13900f()
            r3 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r3)
            com.android.p261d.p264c.C5059g.m13900f()
            com.android.h.a.j r3 = r1.f16411a
            java.lang.Object r3 = r3.mLock
            monitor-enter(r3)
            com.android.h.a.j r4 = r1.f16411a     // Catch:{ all -> 0x04b6 }
            com.android.h.a.h r4 = r4.mRenderer     // Catch:{ all -> 0x04b6 }
            java.lang.Runnable r5 = r4.f16409f     // Catch:{ all -> 0x04b6 }
            com.android.h.a.e r5 = r4.f16410g     // Catch:{ all -> 0x04b6 }
            com.android.h.a.d r6 = r4.f16408e     // Catch:{ all -> 0x04b6 }
            int r4 = r4.f16407d     // Catch:{ all -> 0x04b6 }
            r5.mo10240g(r6, r4)     // Catch:{ all -> 0x04b6 }
            com.android.h.a.j r4 = r1.f16411a     // Catch:{ all -> 0x04b6 }
            com.android.h.a.h r4 = r4.mRenderer     // Catch:{ all -> 0x04b6 }
            com.android.h.a.e r5 = r4.f16410g     // Catch:{ all -> 0x04b6 }
            int r6 = r4.f16405b     // Catch:{ all -> 0x04b6 }
            int r7 = r4.f16406c     // Catch:{ all -> 0x04b6 }
            float r4 = r4.f16404a     // Catch:{ all -> 0x04b6 }
            int r8 = r5.f16395t     // Catch:{ all -> 0x04b6 }
            r9 = 1
            if (r8 != r6) goto L_0x0042
            int r8 = r5.f16396u     // Catch:{ all -> 0x04b6 }
            if (r8 != r7) goto L_0x0042
            float r8 = r5.f16397v     // Catch:{ all -> 0x04b6 }
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x004a
        L_0x0042:
            r5.f16395t = r6     // Catch:{ all -> 0x04b6 }
            r5.f16396u = r7     // Catch:{ all -> 0x04b6 }
            r5.f16397v = r4     // Catch:{ all -> 0x04b6 }
            r5.f16399x = r9     // Catch:{ all -> 0x04b6 }
        L_0x004a:
            monitor-exit(r3)     // Catch:{ all -> 0x04b6 }
            com.android.h.a.j r3 = r1.f16411a
            com.android.h.a.h r3 = r3.mRenderer
            com.android.h.a.e r3 = r3.f16410g
            com.android.d.c.g r4 = r1.f16412b
            int r5 = r3.f16374C
            r6 = 0
            r8 = 1073741824(0x40000000, float:2.0)
            r15 = 0
            if (r5 == 0) goto L_0x0220
            int r5 = r3.f16375D
            if (r5 == 0) goto L_0x0220
            boolean r5 = r3.f16399x
            if (r5 != 0) goto L_0x0065
            goto L_0x0220
        L_0x0065:
            r3.f16399x = r15
            float r5 = r3.f16397v
            float r5 = r2 / r5
            r10 = 0
        L_0x006c:
            r11 = 31
            if (r10 >= r11) goto L_0x007b
            int r11 = r9 << r10
            float r11 = (float) r11
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x0078
            goto L_0x007b
        L_0x0078:
            int r10 = r10 + 1
            goto L_0x006c
        L_0x007b:
            r5 = -1
            int r10 = r10 + r5
            int r11 = r3.f16380e
            if (r10 <= r11) goto L_0x0083
            r14 = r11
            goto L_0x0088
        L_0x0083:
            if (r10 >= 0) goto L_0x0087
            r14 = 0
            goto L_0x0088
        L_0x0087:
            r14 = r10
        L_0x0088:
            r3.f16381f = r14
            if (r14 == r11) goto L_0x00e3
            android.graphics.Rect r13 = r3.f16400y
            int r12 = r3.f16395t
            int r11 = r3.f16396u
            float r10 = r3.f16397v
            int r0 = r3.f16398w
            r16 = r10
            r10 = r3
            r17 = r11
            r11 = r13
            r5 = r13
            r13 = r17
            r7 = 0
            r15 = r16
            r16 = r0
            r10.mo10237d(r11, r12, r13, r14, r15, r16)
            int r0 = r3.f16374C
            float r0 = (float) r0
            float r0 = r0 / r8
            int r10 = r5.left
            int r11 = r3.f16395t
            int r10 = r10 - r11
            float r10 = (float) r10
            float r11 = r3.f16397v
            float r10 = r10 * r11
            float r0 = r0 + r10
            int r0 = java.lang.Math.round(r0)
            r3.f16382g = r0
            int r0 = r3.f16375D
            float r0 = (float) r0
            float r0 = r0 / r8
            int r5 = r5.top
            int r10 = r3.f16396u
            int r5 = r5 - r10
            float r5 = (float) r5
            float r10 = r3.f16397v
            float r5 = r5 * r10
            float r0 = r0 + r5
            int r0 = java.lang.Math.round(r0)
            r3.f16383h = r0
            float r0 = r3.f16397v
            int r5 = r3.f16381f
            int r10 = r9 << r5
            float r10 = (float) r10
            float r0 = r0 * r10
            r10 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x010a
            int r5 = r5 + -1
            goto L_0x010a
        L_0x00e3:
            r7 = 0
            int r5 = r14 + -2
            int r0 = r3.f16374C
            float r0 = (float) r0
            float r0 = r0 / r8
            int r10 = r3.f16395t
            float r10 = (float) r10
            float r11 = r3.f16397v
            float r10 = r10 * r11
            float r0 = r0 - r10
            int r0 = java.lang.Math.round(r0)
            r3.f16382g = r0
            int r0 = r3.f16375D
            float r0 = (float) r0
            float r0 = r0 / r8
            int r10 = r3.f16396u
            float r10 = (float) r10
            float r11 = r3.f16397v
            float r10 = r10 * r11
            float r0 = r0 - r10
            int r0 = java.lang.Math.round(r0)
            r3.f16383h = r0
        L_0x010a:
            int r0 = r3.f16380e
            int r0 = r0 + -2
            int r0 = java.lang.Math.min(r5, r0)
            int r0 = java.lang.Math.max(r7, r0)
            int r5 = r0 + 2
            int r10 = r3.f16380e
            int r5 = java.lang.Math.min(r5, r10)
            android.graphics.Rect[] r15 = r3.f16401z
            r14 = r0
        L_0x0121:
            if (r14 >= r5) goto L_0x0145
            int r10 = r14 - r0
            r11 = r15[r10]
            int r12 = r3.f16395t
            int r13 = r3.f16396u
            int r18 = r14 + 1
            int r10 = r9 << r18
            float r10 = (float) r10
            float r16 = r2 / r10
            int r10 = r3.f16398w
            r19 = r10
            r10 = r3
            r20 = r15
            r15 = r16
            r16 = r19
            r10.mo10237d(r11, r12, r13, r14, r15, r16)
            r14 = r18
            r15 = r20
            goto L_0x0121
        L_0x0145:
            r20 = r15
            int r2 = r3.f16398w
            int r2 = r2 % 90
            if (r2 != 0) goto L_0x0220
            java.lang.Object r2 = r3.f16389n
            monitor-enter(r2)
            com.android.h.a.c r10 = r3.f16392q     // Catch:{ all -> 0x021d }
            r10.f16370a = r6     // Catch:{ all -> 0x021d }
            com.android.h.a.c r10 = r3.f16391p     // Catch:{ all -> 0x021d }
            r10.f16370a = r6     // Catch:{ all -> 0x021d }
            r3.f16373B = r7     // Catch:{ all -> 0x021d }
            android.util.LongSparseArray r10 = r3.f16388m     // Catch:{ all -> 0x021d }
            int r10 = r10.size()     // Catch:{ all -> 0x021d }
            r15 = 0
        L_0x0161:
            if (r15 >= r10) goto L_0x018c
            android.util.LongSparseArray r11 = r3.f16388m     // Catch:{ all -> 0x021d }
            java.lang.Object r11 = r11.valueAt(r15)     // Catch:{ all -> 0x021d }
            com.android.h.a.a r11 = (com.android.p271h.p272a.C5153a) r11     // Catch:{ all -> 0x021d }
            int r12 = r11.f16364m     // Catch:{ all -> 0x021d }
            if (r12 < r0) goto L_0x017e
            if (r12 >= r5) goto L_0x017e
            int r12 = r12 - r0
            r12 = r20[r12]     // Catch:{ all -> 0x021d }
            int r13 = r11.f16362i     // Catch:{ all -> 0x021d }
            int r14 = r11.f16363l     // Catch:{ all -> 0x021d }
            boolean r12 = r12.contains(r13, r14)     // Catch:{ all -> 0x021d }
            if (r12 != 0) goto L_0x018a
        L_0x017e:
            android.util.LongSparseArray r12 = r3.f16388m     // Catch:{ all -> 0x021d }
            r12.removeAt(r15)     // Catch:{ all -> 0x021d }
            int r15 = r15 + -1
            int r10 = r10 + -1
            r3.mo10239f(r11)     // Catch:{ all -> 0x021d }
        L_0x018a:
            int r15 = r15 + r9
            goto L_0x0161
        L_0x018c:
            monitor-exit(r2)     // Catch:{ all -> 0x021d }
            r2 = r0
        L_0x018e:
            if (r2 >= r5) goto L_0x0217
            int r10 = r3.f16377b
            int r10 = r10 << r2
            int r11 = r2 - r0
            r11 = r20[r11]
            int r12 = r11.top
            int r13 = r11.bottom
        L_0x019b:
            if (r12 >= r13) goto L_0x0209
            int r14 = r11.left
            int r15 = r11.right
        L_0x01a1:
            if (r14 >= r15) goto L_0x01fd
            long r6 = com.android.p271h.p272a.C5157e.m14090b(r14, r12, r2)
            android.util.LongSparseArray r8 = r3.f16388m
            java.lang.Object r8 = r8.get(r6)
            com.android.h.a.a r8 = (com.android.p271h.p272a.C5153a) r8
            if (r8 == 0) goto L_0x01bc
            int r6 = r8.f16367p
            r7 = 2
            if (r6 != r7) goto L_0x01b8
            r8.f16367p = r9
        L_0x01b8:
            r21 = r0
            r0 = -1
            goto L_0x01f1
        L_0x01bc:
            java.lang.Object r8 = r3.f16389n
            monitor-enter(r8)
            com.android.h.a.c r9 = r3.f16390o     // Catch:{ all -> 0x01fa }
            com.android.h.a.a r9 = r9.mo10228a()     // Catch:{ all -> 0x01fa }
            if (r9 == 0) goto L_0x01e3
            r21 = r0
            r0 = 1
            r9.f16367p = r0     // Catch:{ all -> 0x01fa }
            r9.f16362i = r14     // Catch:{ all -> 0x01fa }
            r9.f16363l = r12     // Catch:{ all -> 0x01fa }
            r9.f16364m = r2     // Catch:{ all -> 0x01fa }
            android.graphics.Bitmap r0 = r9.f16138k     // Catch:{ all -> 0x01fa }
            if (r0 == 0) goto L_0x01d9
            r9.mo10042o()     // Catch:{ all -> 0x01fa }
        L_0x01d9:
            r0 = 0
            r9.f16137j = r0     // Catch:{ all -> 0x01fa }
            r0 = -1
            r9.f16094d = r0     // Catch:{ all -> 0x01fa }
            r9.f16095e = r0     // Catch:{ all -> 0x01fa }
            monitor-exit(r8)     // Catch:{ all -> 0x01fa }
            goto L_0x01ec
        L_0x01e3:
            r21 = r0
            r0 = -1
            com.android.h.a.a r9 = new com.android.h.a.a     // Catch:{ all -> 0x01fa }
            r9.<init>(r3, r14, r12, r2)     // Catch:{ all -> 0x01fa }
            monitor-exit(r8)     // Catch:{ all -> 0x01fa }
        L_0x01ec:
            android.util.LongSparseArray r8 = r3.f16388m
            r8.put(r6, r9)
        L_0x01f1:
            int r14 = r14 + r10
            r0 = r21
            r6 = 0
            r7 = 0
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            goto L_0x01a1
        L_0x01fa:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01fa }
            throw r0
        L_0x01fd:
            r21 = r0
            r0 = -1
            int r12 = r12 + r10
            r0 = r21
            r6 = 0
            r7 = 0
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            goto L_0x019b
        L_0x0209:
            r21 = r0
            r0 = -1
            int r2 = r2 + 1
            r0 = r21
            r6 = 0
            r7 = 0
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            goto L_0x018e
        L_0x0217:
            android.view.View r0 = r3.f16376E
            r0.postInvalidate()
            goto L_0x0220
        L_0x021d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x021d }
            throw r0
        L_0x0220:
            r0 = 1
            r2 = 0
        L_0x0222:
            r5 = 8
            if (r0 <= 0) goto L_0x025c
            java.lang.Object r6 = r3.f16389n
            monitor-enter(r6)
            com.android.h.a.c r2 = r3.f16391p     // Catch:{ all -> 0x0259 }
            com.android.h.a.a r2 = r2.mo10228a()     // Catch:{ all -> 0x0259 }
            monitor-exit(r6)     // Catch:{ all -> 0x0259 }
            if (r2 != 0) goto L_0x0233
            goto L_0x025c
        L_0x0233:
            boolean r6 = r2.mo10044q()
            if (r6 != 0) goto L_0x0222
            int r6 = r2.f16367p
            if (r6 != r5) goto L_0x0243
            r2.mo10043p(r4)
            int r0 = r0 + -1
            goto L_0x0222
        L_0x0243:
            int r5 = r2.f16367p
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Tile in upload queue has invalid state: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = "TiledImageRenderer"
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r5, r6)
            goto L_0x0222
        L_0x0259:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0259 }
            throw r0
        L_0x025c:
            if (r2 == 0) goto L_0x0263
            android.view.View r0 = r3.f16376E
            r0.postInvalidate()
        L_0x0263:
            r0 = 1
            r3.f16384i = r0
            r3.f16385j = r0
            int r0 = r3.f16381f
            int r15 = r3.f16398w
            if (r15 == 0) goto L_0x0271
            r2 = r15
            r15 = 2
            goto L_0x0273
        L_0x0271:
            r2 = 0
            r15 = 0
        L_0x0273:
            r6 = 16
            if (r15 == 0) goto L_0x02ba
            r4.mo10032e()
            if (r2 == 0) goto L_0x02ba
            int r7 = r3.f16374C
            r8 = 2
            int r7 = r7 / r8
            int r9 = r3.f16375D
            int r9 = r9 / r8
            float r8 = (float) r7
            float r10 = (float) r9
            r4.mo10031d(r8, r10)
            float r2 = (float) r2
            r8 = 0
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x02b3
            float[] r8 = r4.f16117l
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 1065353216(0x3f800000, float:1.0)
            r21 = r8
            r23 = r2
            android.opengl.Matrix.setRotateM(r21, r22, r23, r24, r25, r26)
            float[] r2 = r4.f16106a
            int r10 = r4.f16107b
            r22 = 16
            r26 = 0
            r23 = r2
            r24 = r10
            r25 = r8
            android.opengl.Matrix.multiplyMM(r21, r22, r23, r24, r25, r26)
            java.lang.System.arraycopy(r8, r6, r2, r10, r6)
        L_0x02b3:
            int r2 = -r7
            float r2 = (float) r2
            int r7 = -r9
            float r7 = (float) r7
            r4.mo10031d(r2, r7)
        L_0x02ba:
            int r2 = r3.f16380e     // Catch:{ all -> 0x04ad }
            if (r0 == r2) goto L_0x0425
            int r2 = r3.f16377b     // Catch:{ all -> 0x04ad }
            int r2 = r2 << r0
            float r7 = (float) r2     // Catch:{ all -> 0x04ad }
            float r8 = r3.f16397v     // Catch:{ all -> 0x04ad }
            float r7 = r7 * r8
            android.graphics.Rect r8 = r3.f16400y     // Catch:{ all -> 0x04ad }
            int r9 = r8.top     // Catch:{ all -> 0x04ad }
            r10 = 0
        L_0x02cb:
            int r11 = r8.bottom     // Catch:{ all -> 0x04ad }
            if (r9 >= r11) goto L_0x0422
            int r11 = r3.f16383h     // Catch:{ all -> 0x04ad }
            float r11 = (float) r11     // Catch:{ all -> 0x04ad }
            float r12 = (float) r10     // Catch:{ all -> 0x04ad }
            float r12 = r12 * r7
            float r11 = r11 + r12
            int r12 = r8.left     // Catch:{ all -> 0x04ad }
            r13 = 0
        L_0x02d9:
            int r14 = r8.right     // Catch:{ all -> 0x04ad }
            if (r12 >= r14) goto L_0x0411
            int r14 = r3.f16382g     // Catch:{ all -> 0x04ad }
            float r14 = (float) r14     // Catch:{ all -> 0x04ad }
            float r6 = (float) r13     // Catch:{ all -> 0x04ad }
            float r6 = r6 * r7
            float r14 = r14 + r6
            android.graphics.RectF r6 = r3.f16386k     // Catch:{ all -> 0x04ad }
            android.graphics.RectF r5 = r3.f16387l     // Catch:{ all -> 0x04ad }
            float r1 = r14 + r7
            r20 = r8
            float r8 = r11 + r7
            r5.set(r14, r11, r1, r8)     // Catch:{ all -> 0x04ad }
            int r1 = r3.f16377b     // Catch:{ all -> 0x04ad }
            float r1 = (float) r1     // Catch:{ all -> 0x04ad }
            r8 = 0
            r6.set(r8, r8, r1, r1)     // Catch:{ all -> 0x04ad }
            com.android.h.a.a r1 = r3.mo10236c(r12, r9, r0)     // Catch:{ all -> 0x04ad }
            if (r1 == 0) goto L_0x03c4
            boolean r8 = r1.mo10044q()     // Catch:{ all -> 0x04ad }
            if (r8 != 0) goto L_0x032d
            int r8 = r1.f16367p     // Catch:{ all -> 0x04ad }
            r14 = 8
            if (r8 != r14) goto L_0x031e
            int r8 = r3.f16384i     // Catch:{ all -> 0x04ad }
            if (r8 <= 0) goto L_0x0316
            int r8 = r8 + -1
            r3.f16384i = r8     // Catch:{ all -> 0x04ad }
            r1.mo10043p(r4)     // Catch:{ all -> 0x04ad }
            goto L_0x032d
        L_0x0316:
            r8 = 0
            r3.f16385j = r8     // Catch:{ all -> 0x04ad }
            r18 = r7
            r7 = 16
            goto L_0x0331
        L_0x031e:
            r8 = 0
            int r14 = r1.f16367p     // Catch:{ all -> 0x04ad }
            r18 = r7
            r7 = 16
            if (r14 == r7) goto L_0x0331
            r3.f16385j = r8     // Catch:{ all -> 0x04ad }
            r3.mo10238e(r1)     // Catch:{ all -> 0x04ad }
            goto L_0x0331
        L_0x032d:
            r18 = r7
            goto L_0x03bf
        L_0x0331:
            boolean r14 = r1.mo10044q()     // Catch:{ all -> 0x04ad }
            if (r14 == 0) goto L_0x0340
            r4.mo10028a(r1, r6, r5)     // Catch:{ all -> 0x04ad }
            r22 = r11
            r23 = r15
            goto L_0x03fe
        L_0x0340:
            int r14 = r1.f16364m     // Catch:{ all -> 0x04ad }
            r17 = 1
            int r14 = r14 + 1
            com.android.h.a.e r7 = r1.f16368q     // Catch:{ all -> 0x04ad }
            int r8 = r7.f16380e     // Catch:{ all -> 0x04ad }
            if (r14 != r8) goto L_0x0352
            r22 = r11
            r23 = r15
            r7 = 0
            goto L_0x0367
        L_0x0352:
            int r8 = r7.f16377b     // Catch:{ all -> 0x04ad }
            int r8 = r8 << r14
            r22 = r11
            int r11 = r1.f16362i     // Catch:{ all -> 0x04ad }
            int r11 = r11 / r8
            int r11 = r11 * r8
            r23 = r15
            int r15 = r1.f16363l     // Catch:{ all -> 0x04ab }
            int r15 = r15 / r8
            int r8 = r8 * r15
            com.android.h.a.a r7 = r7.mo10236c(r11, r8, r14)     // Catch:{ all -> 0x04ab }
        L_0x0367:
            if (r7 != 0) goto L_0x036a
            goto L_0x03ca
        L_0x036a:
            int r8 = r1.f16362i     // Catch:{ all -> 0x04ab }
            int r11 = r7.f16362i     // Catch:{ all -> 0x04ab }
            if (r8 != r11) goto L_0x037f
            float r8 = r6.left     // Catch:{ all -> 0x04ab }
            r11 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r11
            r6.left = r8     // Catch:{ all -> 0x04ab }
            float r8 = r6.right     // Catch:{ all -> 0x04ab }
            float r8 = r8 / r11
            r6.right = r8     // Catch:{ all -> 0x04ab }
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0393
        L_0x037f:
            int r8 = r3.f16377b     // Catch:{ all -> 0x04ab }
            float r8 = (float) r8     // Catch:{ all -> 0x04ab }
            float r11 = r6.left     // Catch:{ all -> 0x04ab }
            float r8 = r8 + r11
            r11 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r11
            r6.left = r8     // Catch:{ all -> 0x04ab }
            int r8 = r3.f16377b     // Catch:{ all -> 0x04ab }
            float r8 = (float) r8     // Catch:{ all -> 0x04ab }
            float r14 = r6.right     // Catch:{ all -> 0x04ab }
            float r8 = r8 + r14
            float r8 = r8 / r11
            r6.right = r8     // Catch:{ all -> 0x04ab }
        L_0x0393:
            int r1 = r1.f16363l     // Catch:{ all -> 0x04ab }
            int r8 = r7.f16363l     // Catch:{ all -> 0x04ab }
            if (r1 != r8) goto L_0x03a6
            float r1 = r6.top     // Catch:{ all -> 0x04ab }
            float r1 = r1 / r11
            r6.top = r1     // Catch:{ all -> 0x04ab }
            float r1 = r6.bottom     // Catch:{ all -> 0x04ab }
            float r1 = r1 / r11
            r6.bottom = r1     // Catch:{ all -> 0x04ab }
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x03ba
        L_0x03a6:
            int r1 = r3.f16377b     // Catch:{ all -> 0x04ab }
            float r1 = (float) r1     // Catch:{ all -> 0x04ab }
            float r8 = r6.top     // Catch:{ all -> 0x04ab }
            float r1 = r1 + r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r8
            r6.top = r1     // Catch:{ all -> 0x04ab }
            int r1 = r3.f16377b     // Catch:{ all -> 0x04ab }
            float r1 = (float) r1     // Catch:{ all -> 0x04ab }
            float r11 = r6.bottom     // Catch:{ all -> 0x04ab }
            float r1 = r1 + r11
            float r1 = r1 / r8
            r6.bottom = r1     // Catch:{ all -> 0x04ab }
        L_0x03ba:
            r1 = r7
            r11 = r22
            r15 = r23
        L_0x03bf:
            r7 = 16
            r8 = 0
            goto L_0x0331
        L_0x03c4:
            r18 = r7
            r22 = r11
            r23 = r15
        L_0x03ca:
            r8 = 1073741824(0x40000000, float:2.0)
            com.android.d.c.a r1 = r3.f16379d     // Catch:{ all -> 0x04ab }
            if (r1 == 0) goto L_0x03fe
            int r7 = r3.f16377b     // Catch:{ all -> 0x04ab }
            int r7 = r7 << r0
            int r1 = r1.mo10017e()     // Catch:{ all -> 0x04ab }
            float r1 = (float) r1     // Catch:{ all -> 0x04ab }
            int r11 = r3.f16393r     // Catch:{ all -> 0x04ab }
            float r11 = (float) r11     // Catch:{ all -> 0x04ab }
            float r1 = r1 / r11
            com.android.d.c.a r11 = r3.f16379d     // Catch:{ all -> 0x04ab }
            int r11 = r11.mo10013a()     // Catch:{ all -> 0x04ab }
            float r11 = (float) r11     // Catch:{ all -> 0x04ab }
            int r14 = r3.f16394s     // Catch:{ all -> 0x04ab }
            float r14 = (float) r14     // Catch:{ all -> 0x04ab }
            float r11 = r11 / r14
            float r14 = (float) r12     // Catch:{ all -> 0x04ab }
            float r14 = r14 * r1
            float r15 = (float) r9     // Catch:{ all -> 0x04ab }
            float r15 = r15 * r11
            int r8 = r12 + r7
            float r8 = (float) r8     // Catch:{ all -> 0x04ab }
            float r8 = r8 * r1
            int r7 = r7 + r9
            float r1 = (float) r7     // Catch:{ all -> 0x04ab }
            float r1 = r1 * r11
            r6.set(r14, r15, r8, r1)     // Catch:{ all -> 0x04ab }
            com.android.d.c.a r1 = r3.f16379d     // Catch:{ all -> 0x04ab }
            r4.mo10028a(r1, r6, r5)     // Catch:{ all -> 0x04ab }
        L_0x03fe:
            int r12 = r12 + r2
            int r13 = r13 + 1
            r1 = r27
            r7 = r18
            r8 = r20
            r11 = r22
            r15 = r23
            r5 = 8
            r6 = 16
            goto L_0x02d9
        L_0x0411:
            r18 = r7
            r20 = r8
            r23 = r15
            int r9 = r9 + r2
            int r10 = r10 + 1
            r1 = r27
            r5 = 8
            r6 = 16
            goto L_0x02cb
        L_0x0422:
            r23 = r15
            goto L_0x0472
        L_0x0425:
            r23 = r15
            com.android.d.c.a r0 = r3.f16379d     // Catch:{ all -> 0x04ab }
            if (r0 == 0) goto L_0x0472
            int r1 = r3.f16382g     // Catch:{ all -> 0x04ab }
            int r2 = r3.f16383h     // Catch:{ all -> 0x04ab }
            int r5 = r3.f16393r     // Catch:{ all -> 0x04ab }
            float r5 = (float) r5     // Catch:{ all -> 0x04ab }
            float r6 = r3.f16397v     // Catch:{ all -> 0x04ab }
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)     // Catch:{ all -> 0x04ab }
            int r6 = r3.f16394s     // Catch:{ all -> 0x04ab }
            float r6 = (float) r6     // Catch:{ all -> 0x04ab }
            float r7 = r3.f16397v     // Catch:{ all -> 0x04ab }
            float r6 = r6 * r7
            int r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x04ab }
            if (r5 <= 0) goto L_0x0472
            if (r6 <= 0) goto L_0x0472
            android.graphics.RectF r7 = r4.f16118m     // Catch:{ all -> 0x04ab }
            int r8 = r0.mo10017e()     // Catch:{ all -> 0x04ab }
            float r8 = (float) r8     // Catch:{ all -> 0x04ab }
            int r9 = r0.mo10013a()     // Catch:{ all -> 0x04ab }
            float r9 = (float) r9     // Catch:{ all -> 0x04ab }
            r10 = 0
            r7.set(r10, r10, r8, r9)     // Catch:{ all -> 0x04ab }
            android.graphics.RectF r7 = r4.f16119n     // Catch:{ all -> 0x04ab }
            float r8 = (float) r1     // Catch:{ all -> 0x04ab }
            float r9 = (float) r2     // Catch:{ all -> 0x04ab }
            int r1 = r1 + r5
            float r1 = (float) r1     // Catch:{ all -> 0x04ab }
            int r2 = r2 + r6
            float r2 = (float) r2     // Catch:{ all -> 0x04ab }
            r7.set(r8, r9, r1, r2)     // Catch:{ all -> 0x04ab }
            android.graphics.RectF r1 = r4.f16118m     // Catch:{ all -> 0x04ab }
            android.graphics.RectF r2 = r4.f16119n     // Catch:{ all -> 0x04ab }
            com.android.p261d.p264c.C5059g.m13901g(r1, r2, r0)     // Catch:{ all -> 0x04ab }
            android.graphics.RectF r1 = r4.f16118m     // Catch:{ all -> 0x04ab }
            android.graphics.RectF r2 = r4.f16119n     // Catch:{ all -> 0x04ab }
            r4.mo10034h(r0, r1, r2)     // Catch:{ all -> 0x04ab }
        L_0x0472:
            if (r23 == 0) goto L_0x0477
            r4.mo10029b()
        L_0x0477:
            boolean r0 = r3.f16385j
            if (r0 == 0) goto L_0x049f
            boolean r0 = r3.f16373B
            if (r0 != 0) goto L_0x04a4
            r0 = 1
            r3.f16373B = r0
            android.util.LongSparseArray r0 = r3.f16388m
            int r0 = r0.size()
            r15 = 0
        L_0x0489:
            if (r15 >= r0) goto L_0x04a4
            android.util.LongSparseArray r1 = r3.f16388m
            java.lang.Object r1 = r1.valueAt(r15)
            com.android.h.a.a r1 = (com.android.p271h.p272a.C5153a) r1
            boolean r2 = r1.mo10044q()
            if (r2 != 0) goto L_0x049c
            r3.mo10238e(r1)
        L_0x049c:
            int r15 = r15 + 1
            goto L_0x0489
        L_0x049f:
            android.view.View r0 = r3.f16376E
            r0.postInvalidate()
        L_0x04a4:
            boolean r0 = r3.f16385j
            if (r0 != 0) goto L_0x04aa
            com.android.d.c.a r0 = r3.f16379d
        L_0x04aa:
            return
        L_0x04ab:
            r0 = move-exception
            goto L_0x04b0
        L_0x04ad:
            r0 = move-exception
            r23 = r15
        L_0x04b0:
            if (r23 == 0) goto L_0x04b5
            r4.mo10029b()
        L_0x04b5:
            throw r0
        L_0x04b6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04b6 }
            goto L_0x04ba
        L_0x04b9:
            throw r0
        L_0x04ba:
            goto L_0x04b9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p271h.p272a.C5161i.onDrawFrame(javax.microedition.khronos.opengles.GL10):void");
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        C5059g gVar = this.f16412b;
        gVar.f16108c = i;
        gVar.f16109d = i2;
        GLES20.glViewport(0, 0, i, i2);
        C5059g.m13900f();
        Matrix.setIdentityM(gVar.f16106a, gVar.f16107b);
        float f = (float) i2;
        Matrix.orthoM(gVar.f16110e, 0, 0.0f, (float) i, 0.0f, f, -1.0f, 1.0f);
        ArrayList arrayList = gVar.f16116k;
        if (((C5062j) arrayList.get(arrayList.size() - 1)) == null) {
            Matrix.translateM(gVar.f16106a, gVar.f16107b, 0.0f, f, 0.0f);
            Matrix.scaleM(gVar.f16106a, gVar.f16107b, 1.0f, -1.0f, 1.0f);
        }
        C5157e eVar = this.f16411a.mRenderer.f16410g;
        eVar.f16374C = i;
        eVar.f16375D = i2;
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f16412b = new C5059g();
        synchronized (C5053a.f16090a) {
            for (C5053a aVar : C5053a.f16090a.keySet()) {
                aVar.f16093c = 0;
                aVar.f16098h = null;
            }
        }
        C5160h hVar = this.f16411a.mRenderer;
        hVar.f16410g.mo10240g(hVar.f16408e, hVar.f16407d);
    }
}
