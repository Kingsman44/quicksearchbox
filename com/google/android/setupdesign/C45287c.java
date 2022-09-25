package com.google.android.setupdesign;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import java.lang.ref.SoftReference;

/* renamed from: com.google.android.setupdesign.c */
/* compiled from: PG */
public final class C45287c extends Drawable {

    /* renamed from: a */
    private static SoftReference f118332a;

    /* renamed from: b */
    private static Path[] f118333b;

    /* renamed from: c */
    private static int[] f118334c;

    /* renamed from: d */
    private final int f118335d;

    /* renamed from: e */
    private final Paint f118336e = new Paint(1);

    public C45287c(int i) {
        this.f118335d = Color.argb(204, Color.red(i), Color.green(i), Color.blue(i));
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (((float) r8) < 1152.0f) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (((float) r7) < 2049.0f) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.graphics.Rect r2 = r18.getBounds()
            int r3 = r2.width()
            int r4 = r2.height()
            java.lang.ref.SoftReference r5 = f118332a
            r6 = 0
            if (r5 == 0) goto L_0x001c
            java.lang.Object r5 = r5.get()
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            goto L_0x001d
        L_0x001c:
            r5 = r6
        L_0x001d:
            if (r5 == 0) goto L_0x003c
            int r7 = r5.getWidth()
            int r8 = r5.getHeight()
            if (r3 <= r7) goto L_0x0032
            float r7 = (float) r7
            r9 = 1157632000(0x45001000, float:2049.0)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0032
            goto L_0x003d
        L_0x0032:
            if (r4 <= r8) goto L_0x003c
            float r7 = (float) r8
            r8 = 1150287872(0x44900000, float:1152.0)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r6 = r5
        L_0x003d:
            r5 = 0
            if (r6 != 0) goto L_0x021a
            android.graphics.Paint r6 = r0.f118336e
            r6.reset()
            float r3 = (float) r3
            r6 = 1152040960(0x44aac000, float:1366.0)
            float r3 = r3 / r6
            float r4 = (float) r4
            r7 = 1145044992(0x44400000, float:768.0)
            float r4 = r4 / r7
            float r3 = java.lang.Math.max(r3, r4)
            r4 = 1069547520(0x3fc00000, float:1.5)
            float r3 = java.lang.Math.min(r4, r3)
            float r4 = r3 * r6
            int r4 = (int) r4
            float r8 = r3 * r7
            int r8 = (int) r8
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r8, r9)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r4)
            r8.save()
            r8.scale(r3, r3)
            android.graphics.Paint r3 = r0.f118336e
            android.graphics.PorterDuffXfermode r9 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC
            r9.<init>(r10)
            r3.setXfermode(r9)
            android.graphics.Path[] r3 = f118333b
            r9 = 7
            r10 = 0
            if (r3 != 0) goto L_0x01ec
            android.graphics.Path[] r3 = new android.graphics.Path[r9]
            f118333b = r3
            int[] r11 = new int[r9]
            r11 = {10, 40, 51, 66, 91, 112, 130} // fill-array
            f118334c = r11
            android.graphics.Path r11 = new android.graphics.Path
            r11.<init>()
            r3[r10] = r11
            r3 = 1149283533(0x4480accd, float:1029.4)
            r12 = 1135788032(0x43b2c000, float:357.5)
            r11.moveTo(r3, r12)
            r3 = 1144899174(0x443dc666, float:759.1)
            r11.lineTo(r6, r3)
            r11.lineTo(r6, r5)
            r3 = 1150170726(0x448e3666, float:1137.7)
            r11.lineTo(r3, r5)
            r11.close()
            android.graphics.Path[] r3 = f118333b
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r11 = 1
            r3[r11] = r6
            r3 = 1150174003(0x448e4333, float:1138.1)
            r6.moveTo(r3, r5)
            r3 = -1022309171(0xffffffffc310cccd, float:-144.8)
            r6.rLineTo(r3, r7)
            r3 = 1136286106(0x43ba599a, float:372.7)
            r6.rLineTo(r3, r5)
            r3 = -1006436352(0xffffffffc4030000, float:-524.0)
            r6.rLineTo(r5, r3)
            r12 = 1151424102(0x44a15666, float:1290.7)
            r13 = 1123234611(0x42f33333, float:121.6)
            r14 = 1150838374(0x44986666, float:1219.2)
            r15 = 1109681766(0x42246666, float:41.1)
            r16 = 1150506598(0x44935666, float:1178.7)
            r17 = 0
            r11 = r6
            r11.cubicTo(r12, r13, r14, r15, r16, r17)
            r6.close()
            android.graphics.Path[] r3 = f118333b
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r11 = 2
            r3[r11] = r6
            r3 = 1148023603(0x446d7333, float:949.8)
            r6.moveTo(r3, r7)
            r12 = 1119433523(0x42b93333, float:92.6)
            r13 = -1020618342(0xffffffffc32a999a, float:-170.6)
            r14 = 1129644032(0x43550000, float:213.0)
            r15 = -1008982426(0xffffffffc3dc2666, float:-440.3)
            r16 = 1132901171(0x4386b333, float:269.4)
            r17 = -1002438656(0xffffffffc4400000, float:-768.0)
            r11 = r6
            r11.rCubicTo(r12, r13, r14, r15, r16, r17)
            r3 = 1142046720(0x44124000, float:585.0)
            r6.lineTo(r3, r5)
            r3 = 1074161254(0x40066666, float:2.1)
            r11 = 1145012224(0x443f8000, float:766.0)
            r6.rLineTo(r3, r11)
            r6.close()
            android.graphics.Path[] r3 = f118333b
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r11 = 3
            r3[r11] = r6
            r3 = 1139510477(0x43eb8ccd, float:471.1)
            r6.moveTo(r3, r7)
            r3 = 1144004608(0x44302000, float:704.5)
            r6.rMoveTo(r3, r5)
            r12 = 1150055219(0x448c7333, float:1123.6)
            r13 = 1141691187(0x440cd333, float:563.3)
            r14 = 1149267149(0x44806ccd, float:1027.4)
            r15 = 1133091226(0x4389999a, float:275.2)
            r16 = 1146490061(0x44560ccd, float:856.2)
            r17 = 0
            r11 = r6
            r11.cubicTo(r12, r13, r14, r15, r16, r17)
            r3 = 1139684147(0x43ee3333, float:476.4)
            r6.lineTo(r3, r5)
            r3 = -1062626918(0xffffffffc0a9999a, float:-5.3)
            r6.rLineTo(r3, r7)
            r6.close()
            android.graphics.Path[] r3 = f118333b
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r11 = 4
            r3[r11] = r6
            r3 = 1134660813(0x43a18ccd, float:323.1)
            r6.moveTo(r3, r7)
            r11 = 1145200640(0x44426000, float:777.5)
            r6.moveTo(r11, r7)
            r12 = 1143306650(0x4425799a, float:661.9)
            r13 = 1135502950(0x43ae6666, float:348.8)
            r14 = 1138071962(0x43d5999a, float:427.2)
            r15 = 1101738803(0x41ab3333, float:21.4)
            r16 = 1137219994(0x43c8999a, float:401.2)
            r17 = 1103835955(0x41cb3333, float:25.4)
            r11 = r6
            r11.cubicTo(r12, r13, r14, r15, r16, r17)
            r6.lineTo(r3, r7)
            r6.close()
            android.graphics.Path[] r3 = f118333b
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r11 = 5
            r3[r11] = r6
            r3 = 1127379295(0x4332715f, float:178.44286)
            r11 = 1145026267(0x443fb6db, float:766.8571)
            r6.moveTo(r3, r11)
            r3 = 1134188954(0x439a599a, float:308.7)
            r6.lineTo(r3, r7)
            r12 = 1136581018(0x43bed99a, float:381.7)
            r13 = 1142367846(0x44172666, float:604.6)
            r14 = 1139854541(0x43f0cccd, float:481.6)
            r15 = 1135355494(0x43ac2666, float:344.3)
            r16 = 1141673165(0x440c8ccd, float:562.2)
            r17 = 0
            r11 = r6
            r11.cubicTo(r12, r13, r14, r15, r16, r17)
            r6.lineTo(r5, r5)
            r6.close()
            android.graphics.Path[] r3 = f118333b
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r11 = 6
            r3[r11] = r6
            r3 = 1125253120(0x43120000, float:146.0)
            r6.moveTo(r3, r5)
            r6.lineTo(r5, r5)
            r6.lineTo(r5, r7)
            r3 = 1136990618(0x43c5199a, float:394.2)
            r6.lineTo(r3, r7)
            r12 = 1134811546(0x43a3d99a, float:327.7)
            r13 = 1139648102(0x43eda666, float:475.3)
            r14 = 1130659840(0x43648000, float:228.5)
            r15 = 1128857600(0x43490000, float:201.0)
            r16 = 1125253120(0x43120000, float:146.0)
            r11 = r6
            r11.cubicTo(r12, r13, r14, r15, r16, r17)
            r6.close()
        L_0x01ec:
            if (r10 >= r9) goto L_0x0205
            android.graphics.Paint r3 = r0.f118336e
            int[] r6 = f118334c
            r6 = r6[r10]
            int r6 = r6 << 24
            r3.setColor(r6)
            android.graphics.Path[] r3 = f118333b
            r3 = r3[r10]
            android.graphics.Paint r6 = r0.f118336e
            r8.drawPath(r3, r6)
            int r10 = r10 + 1
            goto L_0x01ec
        L_0x0205:
            r8.restore()
            android.graphics.Paint r3 = r0.f118336e
            r3.reset()
            java.lang.ref.SoftReference r3 = new java.lang.ref.SoftReference
            r3.<init>(r4)
            f118332a = r3
            android.graphics.Paint r3 = r0.f118336e
            r3.reset()
            r6 = r4
        L_0x021a:
            r19.save()
            r1.clipRect(r2)
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            float r3 = (float) r3
            int r7 = r2.width()
            float r7 = (float) r7
            float r7 = r7 / r3
            float r4 = (float) r4
            int r2 = r2.height()
            float r2 = (float) r2
            float r2 = r2 / r4
            r1.scale(r7, r2)
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0249
            float r2 = r2 / r7
            r4 = 1041596678(0x3e158106, float:0.146)
            float r3 = r3 * r4
            r1.scale(r2, r8, r3, r5)
            goto L_0x0256
        L_0x0249:
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0256
            float r7 = r7 / r2
            r2 = 1047099605(0x3e6978d5, float:0.228)
            float r4 = r4 * r2
            r1.scale(r8, r7, r5, r4)
        L_0x0256:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.drawColor(r2)
            android.graphics.Paint r2 = r0.f118336e
            r3 = -1
            r2.setColor(r3)
            android.graphics.Paint r2 = r0.f118336e
            r1.drawBitmap(r6, r5, r5, r2)
            int r2 = r0.f118335d
            r1.drawColor(r2)
            r19.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.C45287c.draw(android.graphics.Canvas):void");
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
