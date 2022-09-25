package androidx.constraintlayout.motion.p084a;

import android.view.View;
import androidx.constraintlayout.p079a.p080a.p081a.C1601k;

/* renamed from: androidx.constraintlayout.motion.a.p */
/* compiled from: PG */
public abstract class C1690p extends C1601k {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.constraintlayout.motion.p084a.C1690p m4572d(java.lang.String r1) {
        /*
            java.lang.String r0 = "CUSTOM"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x000e
            androidx.constraintlayout.motion.a.d r1 = new androidx.constraintlayout.motion.a.d
            r1.<init>()
            return r1
        L_0x000e:
            int r0 = r1.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x00a3;
                case -1249320805: goto L_0x0099;
                case -1225497657: goto L_0x008e;
                case -1225497656: goto L_0x0083;
                case -1225497655: goto L_0x0078;
                case -1001078227: goto L_0x006d;
                case -908189618: goto L_0x0063;
                case -908189617: goto L_0x0059;
                case -797520672: goto L_0x004e;
                case -40300674: goto L_0x0044;
                case -4379043: goto L_0x0039;
                case 37232917: goto L_0x002e;
                case 92909918: goto L_0x0023;
                case 156108012: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x00ad
        L_0x0017:
            java.lang.String r0 = "waveOffset"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 8
            goto L_0x00ae
        L_0x0023:
            java.lang.String r0 = "alpha"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 0
            goto L_0x00ae
        L_0x002e:
            java.lang.String r0 = "transitionPathRotate"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 5
            goto L_0x00ae
        L_0x0039:
            java.lang.String r0 = "elevation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 1
            goto L_0x00ae
        L_0x0044:
            java.lang.String r0 = "rotation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 2
            goto L_0x00ae
        L_0x004e:
            java.lang.String r0 = "waveVariesBy"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 9
            goto L_0x00ae
        L_0x0059:
            java.lang.String r0 = "scaleY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 7
            goto L_0x00ae
        L_0x0063:
            java.lang.String r0 = "scaleX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 6
            goto L_0x00ae
        L_0x006d:
            java.lang.String r0 = "progress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 13
            goto L_0x00ae
        L_0x0078:
            java.lang.String r0 = "translationZ"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 12
            goto L_0x00ae
        L_0x0083:
            java.lang.String r0 = "translationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 11
            goto L_0x00ae
        L_0x008e:
            java.lang.String r0 = "translationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 10
            goto L_0x00ae
        L_0x0099:
            java.lang.String r0 = "rotationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 4
            goto L_0x00ae
        L_0x00a3:
            java.lang.String r0 = "rotationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00ad
            r1 = 3
            goto L_0x00ae
        L_0x00ad:
            r1 = -1
        L_0x00ae:
            switch(r1) {
                case 0: goto L_0x0101;
                case 1: goto L_0x00fb;
                case 2: goto L_0x00f5;
                case 3: goto L_0x00ef;
                case 4: goto L_0x00e9;
                case 5: goto L_0x00e3;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00d7;
                case 8: goto L_0x00d1;
                case 9: goto L_0x00cb;
                case 10: goto L_0x00c5;
                case 11: goto L_0x00bf;
                case 12: goto L_0x00b9;
                case 13: goto L_0x00b3;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            r1 = 0
            return r1
        L_0x00b3:
            androidx.constraintlayout.motion.a.g r1 = new androidx.constraintlayout.motion.a.g
            r1.<init>()
            return r1
        L_0x00b9:
            androidx.constraintlayout.motion.a.o r1 = new androidx.constraintlayout.motion.a.o
            r1.<init>()
            return r1
        L_0x00bf:
            androidx.constraintlayout.motion.a.n r1 = new androidx.constraintlayout.motion.a.n
            r1.<init>()
            return r1
        L_0x00c5:
            androidx.constraintlayout.motion.a.m r1 = new androidx.constraintlayout.motion.a.m
            r1.<init>()
            return r1
        L_0x00cb:
            androidx.constraintlayout.motion.a.c r1 = new androidx.constraintlayout.motion.a.c
            r1.<init>()
            return r1
        L_0x00d1:
            androidx.constraintlayout.motion.a.c r1 = new androidx.constraintlayout.motion.a.c
            r1.<init>()
            return r1
        L_0x00d7:
            androidx.constraintlayout.motion.a.l r1 = new androidx.constraintlayout.motion.a.l
            r1.<init>()
            return r1
        L_0x00dd:
            androidx.constraintlayout.motion.a.k r1 = new androidx.constraintlayout.motion.a.k
            r1.<init>()
            return r1
        L_0x00e3:
            androidx.constraintlayout.motion.a.f r1 = new androidx.constraintlayout.motion.a.f
            r1.<init>()
            return r1
        L_0x00e9:
            androidx.constraintlayout.motion.a.j r1 = new androidx.constraintlayout.motion.a.j
            r1.<init>()
            return r1
        L_0x00ef:
            androidx.constraintlayout.motion.a.i r1 = new androidx.constraintlayout.motion.a.i
            r1.<init>()
            return r1
        L_0x00f5:
            androidx.constraintlayout.motion.a.h r1 = new androidx.constraintlayout.motion.a.h
            r1.<init>()
            return r1
        L_0x00fb:
            androidx.constraintlayout.motion.a.e r1 = new androidx.constraintlayout.motion.a.e
            r1.<init>()
            return r1
        L_0x0101:
            androidx.constraintlayout.motion.a.c r1 = new androidx.constraintlayout.motion.a.c
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.p084a.C1690p.m4572d(java.lang.String):androidx.constraintlayout.motion.a.p");
    }

    /* renamed from: c */
    public abstract void mo4711c(View view, float f);
}
