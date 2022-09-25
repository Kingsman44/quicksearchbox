package com.google.android.libraries.elements.p1714d.p1717c;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21268bk;
import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68088j;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.elements.d.c.a */
/* compiled from: PG */
public final class C20844a implements C21268bk {

    /* renamed from: a */
    private final C21259bb f58405a;

    /* renamed from: b */
    private final DisplayMetrics f58406b;

    public C20844a(Context context, C21259bb bbVar) {
        this.f58405a = bbVar;
        this.f58406b = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    public final int mo25959a() {
        return 154604025;
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ android.graphics.drawable.Drawable mo25960b(com.google.p370af.C7492e r29, android.graphics.Bitmap r30, android.widget.ImageView.ScaleType r31) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            com.youtube.a.a.j r1 = (com.youtube.p5283a.p5284a.C68088j) r1
            com.google.android.libraries.elements.d.c.c r10 = new com.google.android.libraries.elements.d.c.c
            r11 = 4
            int r2 = r1.mo16913a(r11)
            if (r2 == 0) goto L_0x0019
            java.nio.ByteBuffer r3 = r1.f24704b
            int r4 = r1.f24703a
            int r2 = r2 + r4
            float r2 = r3.getFloat(r2)
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            android.util.DisplayMetrics r3 = r0.f58406b
            r13 = 1
            float r5 = android.util.TypedValue.applyDimension(r13, r2, r3)
            r14 = 6
            int r2 = r1.mo16913a(r14)
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r17 = 0
            if (r2 == 0) goto L_0x003b
            java.nio.ByteBuffer r3 = r1.f24704b
            int r4 = r1.f24703a
            int r2 = r2 + r4
            int r2 = r3.getInt(r2)
            long r2 = (long) r2
            long r2 = r2 & r15
            goto L_0x003d
        L_0x003b:
            r2 = r17
        L_0x003d:
            int r6 = (int) r2
            float r2 = r1.mo60232g()
            android.util.DisplayMetrics r3 = r0.f58406b
            float r7 = android.util.TypedValue.applyDimension(r13, r2, r3)
            r9 = 10
            int r2 = r1.mo16913a(r9)
            r19 = 0
            if (r2 == 0) goto L_0x005f
            java.nio.ByteBuffer r3 = r1.f24704b
            int r4 = r1.f24703a
            int r2 = r2 + r4
            byte r2 = r3.get(r2)
            if (r2 == 0) goto L_0x005f
            r8 = 1
            goto L_0x0060
        L_0x005f:
            r8 = 0
        L_0x0060:
            com.google.android.libraries.elements.interfaces.bb r4 = r0.f58405a
            r2 = r10
            r3 = r30
            r20 = r4
            r4 = r31
            r12 = 10
            r9 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.youtube.a.a.bc r2 = r1.mo60236l()
            if (r2 == 0) goto L_0x0085
            com.youtube.a.a.bc r2 = r1.mo60236l()
            r10.f58410i = r2
            boolean r2 = r10.mo25964d()
            if (r2 != 0) goto L_0x0085
            r10.mo25962b()
        L_0x0085:
            com.youtube.a.a.au r2 = r1.mo60235k()
            if (r2 == 0) goto L_0x020d
            com.youtube.a.a.au r2 = r1.mo60235k()
            android.util.DisplayMetrics r3 = r0.f58406b
            int r4 = r2.mo60137g()
            r5 = 0
            if (r4 != 0) goto L_0x00a5
            com.google.android.libraries.elements.interfaces.bb r2 = r10.f57990g
            com.google.protos.youtube.elements.r r3 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_MISSING_FIELD
            java.lang.String r4 = "BorderImageProcessorDrawable Linear Gradient colors is null and linear gradient cannot be applied"
            com.google.android.libraries.elements.interfaces.z r6 = com.google.android.libraries.elements.interfaces.C21319z.f59680u
            r2.mo25782a(r3, r4, r6, r5)
            goto L_0x020d
        L_0x00a5:
            int r4 = r2.mo60137g()
            r6 = 2
            if (r4 >= r6) goto L_0x00b9
            com.google.android.libraries.elements.interfaces.bb r2 = r10.f57990g
            com.google.protos.youtube.elements.r r3 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_INVALID_FIELD
            java.lang.String r4 = "BorderImageProcessorDrawable There should be minimum 2 colors to apply linear gradient"
            com.google.android.libraries.elements.interfaces.z r6 = com.google.android.libraries.elements.interfaces.C21319z.f59680u
            r2.mo25782a(r3, r4, r6, r5)
            goto L_0x020d
        L_0x00b9:
            com.youtube.a.a.at r4 = new com.youtube.a.a.at
            r4.<init>()
            int r7 = r2.mo16913a(r12)
            if (r7 == 0) goto L_0x00d4
            int r8 = r2.f24703a
            int r7 = r7 + r8
            java.nio.ByteBuffer r8 = r2.f24704b
            int r8 = r8.getInt(r7)
            int r7 = r7 + r8
            java.nio.ByteBuffer r8 = r2.f24704b
            r4.mo16917e(r7, r8)
            goto L_0x00d5
        L_0x00d4:
            r4 = r5
        L_0x00d5:
            if (r4 == 0) goto L_0x00fc
            com.youtube.a.a.az r7 = r4.mo60136h()
            if (r7 != 0) goto L_0x00e3
            com.youtube.a.a.az r7 = r4.mo60135g()
            if (r7 != 0) goto L_0x00ef
        L_0x00e3:
            com.youtube.a.a.az r7 = r4.mo60136h()
            if (r7 == 0) goto L_0x00fc
            com.youtube.a.a.az r7 = r4.mo60135g()
            if (r7 != 0) goto L_0x00fc
        L_0x00ef:
            com.google.android.libraries.elements.interfaces.bb r2 = r10.f57990g
            com.google.protos.youtube.elements.r r3 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_MISSING_FIELD
            java.lang.String r4 = "BorderImageProcessorDrawable LinearGradient line should have both start and end values to apply linear gradient"
            com.google.android.libraries.elements.interfaces.z r6 = com.google.android.libraries.elements.interfaces.C21319z.f59680u
            r2.mo25782a(r3, r4, r6, r5)
            goto L_0x020d
        L_0x00fc:
            int r7 = r2.mo60138h()
            if (r7 <= 0) goto L_0x012d
            int r7 = r2.mo60138h()
            float[] r7 = new float[r7]
            r8 = 0
        L_0x0109:
            int r9 = r2.mo60138h()
            if (r8 >= r9) goto L_0x012a
            int r9 = r2.mo16913a(r14)
            if (r9 == 0) goto L_0x0124
            java.nio.ByteBuffer r12 = r2.f24704b
            int r9 = r2.mo16914b(r9)
            int r20 = r8 * 4
            int r9 = r9 + r20
            float r9 = r12.getFloat(r9)
            goto L_0x0125
        L_0x0124:
            r9 = 0
        L_0x0125:
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x0109
        L_0x012a:
            r25 = r7
            goto L_0x012f
        L_0x012d:
            r25 = r5
        L_0x012f:
            int r7 = r2.mo60137g()
            int[] r7 = new int[r7]
            r8 = 0
        L_0x0136:
            int r9 = r2.mo60137g()
            if (r8 >= r9) goto L_0x015d
            int r9 = r2.mo16913a(r11)
            if (r9 == 0) goto L_0x0153
            java.nio.ByteBuffer r12 = r2.f24704b
            int r9 = r2.mo16914b(r9)
            int r20 = r8 * 4
            int r9 = r9 + r20
            int r9 = r12.getInt(r9)
            long r5 = (long) r9
            long r5 = r5 & r15
            goto L_0x0155
        L_0x0153:
            r5 = r17
        L_0x0155:
            int r6 = (int) r5
            r7[r8] = r6
            int r8 = r8 + 1
            r5 = 0
            r6 = 2
            goto L_0x0136
        L_0x015d:
            r5 = 8
            if (r4 == 0) goto L_0x01d7
            com.youtube.a.a.az r6 = r4.mo60136h()
            if (r6 == 0) goto L_0x01d7
            com.youtube.a.a.az r6 = r4.mo60135g()
            if (r6 == 0) goto L_0x01d7
            com.youtube.a.a.az r6 = r4.mo60136h()
            com.youtube.a.a.az r8 = r4.mo60135g()
            int r9 = r4.mo16913a(r5)
            if (r9 == 0) goto L_0x01b8
            java.nio.ByteBuffer r12 = r4.f24704b
            int r4 = r4.f24703a
            int r9 = r9 + r4
            int r4 = r12.getInt(r9)
            if (r4 == r13) goto L_0x0187
            goto L_0x01b8
        L_0x0187:
            android.graphics.PointF r4 = new android.graphics.PointF
            float r9 = r6.mo60145b()
            float r9 = android.util.TypedValue.applyDimension(r13, r9, r3)
            float r6 = r6.mo60146c()
            float r6 = android.util.TypedValue.applyDimension(r13, r6, r3)
            r4.<init>(r9, r6)
            android.graphics.PointF r6 = new android.graphics.PointF
            float r9 = r8.mo60145b()
            float r9 = android.util.TypedValue.applyDimension(r13, r9, r3)
            float r8 = r8.mo60146c()
            float r3 = android.util.TypedValue.applyDimension(r13, r8, r3)
            r6.<init>(r9, r3)
            r22 = r4
            r23 = r6
            r26 = 2
            goto L_0x01dd
        L_0x01b8:
            android.graphics.PointF r3 = new android.graphics.PointF
            float r4 = r6.mo60145b()
            float r6 = r6.mo60146c()
            r3.<init>(r4, r6)
            android.graphics.PointF r4 = new android.graphics.PointF
            float r6 = r8.mo60145b()
            float r8 = r8.mo60146c()
            r4.<init>(r6, r8)
            r22 = r3
            r23 = r4
            goto L_0x01db
        L_0x01d7:
            r22 = 0
            r23 = 0
        L_0x01db:
            r26 = 1
        L_0x01dd:
            com.google.android.libraries.elements.d.c.d r3 = new com.google.android.libraries.elements.d.c.d
            int r4 = r2.mo16913a(r5)
            if (r4 == 0) goto L_0x01f1
            java.nio.ByteBuffer r5 = r2.f24704b
            int r2 = r2.f24703a
            int r4 = r4 + r2
            float r12 = r5.getFloat(r4)
            r21 = r12
            goto L_0x01f3
        L_0x01f1:
            r21 = 0
        L_0x01f3:
            com.google.android.libraries.elements.interfaces.bb r2 = r10.f57990g
            r20 = r3
            r24 = r7
            r27 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r10.f58409h = r3
            com.google.android.libraries.elements.d.c.d r2 = r10.f58409h
            android.graphics.RectF r3 = r10.f57986c
            boolean r4 = r10.mo25963c()
            boolean r5 = r10.f57989f
            r2.mo25965d(r3, r4, r5)
        L_0x020d:
            com.youtube.a.a.bk r2 = r1.mo60237m()
            if (r2 == 0) goto L_0x0273
            com.youtube.a.a.bk r2 = r1.mo60237m()
            int r3 = r2.mo16913a(r11)
            if (r3 == 0) goto L_0x0229
            java.nio.ByteBuffer r4 = r2.f24704b
            int r5 = r2.f24703a
            int r3 = r3 + r5
            int r3 = r4.getInt(r3)
            long r3 = (long) r3
            long r3 = r3 & r15
            goto L_0x022b
        L_0x0229:
            r3 = r17
        L_0x022b:
            int r4 = (int) r3
            int r3 = r2.mo16913a(r14)
            if (r3 == 0) goto L_0x023b
            java.nio.ByteBuffer r5 = r2.f24704b
            int r2 = r2.f24703a
            int r3 = r3 + r2
            int r19 = r5.getInt(r3)
        L_0x023b:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            switch(r19) {
                case 1: goto L_0x026e;
                case 2: goto L_0x026b;
                case 3: goto L_0x0268;
                case 4: goto L_0x0265;
                case 5: goto L_0x0262;
                case 6: goto L_0x025f;
                case 7: goto L_0x025c;
                case 8: goto L_0x0259;
                case 9: goto L_0x0256;
                case 10: goto L_0x0253;
                case 11: goto L_0x0250;
                case 12: goto L_0x024d;
                case 13: goto L_0x024a;
                case 14: goto L_0x0247;
                case 15: goto L_0x0244;
                case 16: goto L_0x0241;
                default: goto L_0x0240;
            }
        L_0x0240:
            goto L_0x0270
        L_0x0241:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.CLEAR
            goto L_0x0270
        L_0x0244:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.XOR
            goto L_0x0270
        L_0x0247:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x0270
        L_0x024a:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.OVERLAY
            goto L_0x0270
        L_0x024d:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0270
        L_0x0250:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.LIGHTEN
            goto L_0x0270
        L_0x0253:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DARKEN
            goto L_0x0270
        L_0x0256:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x0270
        L_0x0259:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_OVER
            goto L_0x0270
        L_0x025c:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_OUT
            goto L_0x0270
        L_0x025f:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            goto L_0x0270
        L_0x0262:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x0270
        L_0x0265:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_OVER
            goto L_0x0270
        L_0x0268:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_OUT
            goto L_0x0270
        L_0x026b:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_IN
            goto L_0x0270
        L_0x026e:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_ATOP
        L_0x0270:
            r10.setColorFilter(r4, r2)
        L_0x0273:
            long r2 = r1.mo60233h()
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x028c
            long r1 = r1.mo60233h()
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r10.f58411j = r3
            android.graphics.Paint r3 = r10.f58411j
            int r2 = (int) r1
            r3.setColor(r2)
        L_0x028c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.p1717c.C20844a.mo25960b(com.google.af.e, android.graphics.Bitmap, android.widget.ImageView$ScaleType):android.graphics.drawable.Drawable");
    }

    /* renamed from: c */
    public final /* synthetic */ C7492e mo25961c(ByteBuffer byteBuffer) {
        return C68088j.m98409j(byteBuffer);
    }
}
