package androidx.media3.extractor.p163j.p165b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2612ak;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.j.b.j */
/* compiled from: PG */
final class C3480j {

    /* renamed from: h */
    private static final byte[] f10818h = {0, 7, 8, 15};

    /* renamed from: i */
    private static final byte[] f10819i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f10820j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f10821a;

    /* renamed from: b */
    public final Paint f10822b;

    /* renamed from: c */
    public final Canvas f10823c = new Canvas();

    /* renamed from: d */
    public final C3473c f10824d = new C3473c(719, 575, 0, 719, 0, 575);

    /* renamed from: e */
    public final C3472b f10825e = new C3472b(0, m10076f(), m10077g(), m10078h());

    /* renamed from: f */
    public final C3479i f10826f;

    /* renamed from: g */
    public Bitmap f10827g;

    public C3480j(int i, int i2) {
        Paint paint = new Paint();
        this.f10821a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f10822b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f10826f = new C3479i(i, i2);
    }

    /* renamed from: a */
    public static C3472b m10071a(C2603ab abVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C2603ab abVar2 = abVar;
        int i6 = 8;
        int d = abVar2.mo6119d(8);
        abVar2.mo6126k(8);
        int i7 = i - 2;
        int[] f = m10076f();
        int[] g = m10077g();
        int[] h = m10078h();
        while (i7 > 0) {
            int d2 = abVar2.mo6119d(i6);
            int d3 = abVar2.mo6119d(i6);
            int i8 = i7 - 2;
            int[] iArr = (d3 & 128) != 0 ? f : (d3 & 64) != 0 ? g : h;
            if ((d3 & 1) != 0) {
                i5 = abVar2.mo6119d(i6);
                i4 = abVar2.mo6119d(i6);
                i3 = abVar2.mo6119d(i6);
                i2 = abVar2.mo6119d(i6);
                i7 = i8 - 4;
            } else {
                int d4 = abVar2.mo6119d(2) << 6;
                i7 = i8 - 2;
                i3 = abVar2.mo6119d(4) << 4;
                i2 = d4;
                i5 = abVar2.mo6119d(6) << 2;
                i4 = abVar2.mo6119d(4) << 4;
            }
            if (i5 == 0) {
                i2 = PrivateKeyType.INVALID;
            }
            if (i5 == 0) {
                i3 = 0;
            }
            int i9 = d;
            if (i5 == 0) {
                i4 = 0;
            }
            double d5 = (double) i5;
            double d6 = (double) (i4 - 128);
            double d7 = (double) (i3 - 128);
            Double.isNaN(d6);
            Double.isNaN(d5);
            int f2 = C2612ak.m6981f((int) (d5 + (1.402d * d6)), 0, PrivateKeyType.INVALID);
            Double.isNaN(d7);
            Double.isNaN(d5);
            Double.isNaN(d6);
            int f3 = C2612ak.m6981f((int) ((d5 - (0.34414d * d7)) - (d6 * 0.71414d)), 0, PrivateKeyType.INVALID);
            Double.isNaN(d7);
            Double.isNaN(d5);
            iArr[d2] = m10074d((byte) (255 - (i2 & PrivateKeyType.INVALID)), f2, f3, C2612ak.m6981f((int) (d5 + (d7 * 1.772d)), 0, PrivateKeyType.INVALID));
            d = i9;
            i6 = 8;
        }
        return new C3472b(d, f, g, h);
    }

    /* renamed from: b */
    public static C3474d m10072b(C2603ab abVar) {
        int d = abVar.mo6119d(16);
        abVar.mo6126k(4);
        int d2 = abVar.mo6119d(2);
        boolean m = abVar.mo6128m();
        abVar.mo6126k(1);
        byte[] bArr = C2612ak.f7254f;
        byte[] bArr2 = C2612ak.f7254f;
        if (d2 == 1) {
            abVar.mo6126k(abVar.mo6119d(8) * 16);
        } else if (d2 == 0) {
            int d3 = abVar.mo6119d(16);
            int d4 = abVar.mo6119d(16);
            if (d3 > 0) {
                bArr = new byte[d3];
                abVar.mo6130o(bArr, d3);
            }
            if (d4 > 0) {
                bArr2 = new byte[d4];
                abVar.mo6130o(bArr2, d4);
            } else {
                bArr2 = bArr;
            }
        }
        return new C3474d(d, m, bArr, bArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v13, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v13, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0224 A[LOOP:3: B:84:0x0170->B:113:0x0224, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0146 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x021e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014c A[LOOP:2: B:37:0x00ac->B:71:0x014c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10073c(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            r0 = r24
            r1 = r26
            r8 = r29
            androidx.media3.common.b.ab r9 = new androidx.media3.common.b.ab
            int r2 = r0.length
            r9.<init>(r0, r2)
            r2 = r27
            r10 = r28
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0013:
            int r3 = r9.mo6116a()
            if (r3 == 0) goto L_0x022f
            r14 = 8
            int r3 = r9.mo6119d(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x0229
            r15 = 3
            r7 = 4
            r6 = 1
            r5 = 2
            r16 = 0
            switch(r3) {
                case 16: goto L_0x0154;
                case 17: goto L_0x009b;
                case 18: goto L_0x0041;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r3) {
                case 32: goto L_0x003c;
                case 33: goto L_0x0037;
                case 34: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0013
        L_0x0030:
            r3 = 16
            byte[] r12 = m10075e(r3, r14, r9)
            goto L_0x0013
        L_0x0037:
            byte[] r11 = m10075e(r7, r14, r9)
            goto L_0x0013
        L_0x003c:
            byte[] r13 = m10075e(r7, r7, r9)
            goto L_0x0013
        L_0x0041:
            r15 = r2
            r2 = 0
        L_0x0043:
            int r3 = r9.mo6119d(r14)
            if (r3 == 0) goto L_0x004e
            r17 = r2
            r18 = 1
            goto L_0x0074
        L_0x004e:
            boolean r3 = r9.mo6128m()
            r4 = 7
            if (r3 != 0) goto L_0x0067
            int r3 = r9.mo6119d(r4)
            if (r3 == 0) goto L_0x0061
            r17 = r2
            r18 = r3
            r3 = 0
            goto L_0x0074
        L_0x0061:
            r3 = 0
            r17 = 1
            r18 = 0
            goto L_0x0074
        L_0x0067:
            int r3 = r9.mo6119d(r4)
            int r4 = r9.mo6119d(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0074:
            if (r18 == 0) goto L_0x008f
            if (r8 == 0) goto L_0x008f
            r2 = r25[r3]
            r8.setColor(r2)
            float r3 = (float) r15
            float r4 = (float) r10
            int r2 = r15 + r18
            float r5 = (float) r2
            int r2 = r10 + 1
            float r7 = (float) r2
            r2 = r30
            r0 = 1
            r6 = r7
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0090
        L_0x008f:
            r0 = 1
        L_0x0090:
            int r15 = r15 + r18
            if (r17 == 0) goto L_0x0097
            r2 = r15
            goto L_0x0013
        L_0x0097:
            r2 = r17
            r6 = 1
            goto L_0x0043
        L_0x009b:
            r0 = 1
            if (r1 != r15) goto L_0x00a8
            if (r12 != 0) goto L_0x00a5
            byte[] r3 = f10820j
            r17 = r3
            goto L_0x00aa
        L_0x00a5:
            r17 = r12
            goto L_0x00aa
        L_0x00a8:
            r17 = 0
        L_0x00aa:
            r6 = r2
            r2 = 0
        L_0x00ac:
            int r3 = r9.mo6119d(r7)
            if (r3 == 0) goto L_0x00b8
            r18 = r2
        L_0x00b4:
            r19 = 1
            goto L_0x0117
        L_0x00b8:
            boolean r3 = r9.mo6128m()
            if (r3 != 0) goto L_0x00d2
            int r3 = r9.mo6119d(r15)
            if (r3 == 0) goto L_0x00cc
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
            r3 = 0
            goto L_0x0117
        L_0x00cc:
            r3 = 0
            r18 = 1
        L_0x00cf:
            r19 = 0
            goto L_0x0117
        L_0x00d2:
            boolean r3 = r9.mo6128m()
            if (r3 != 0) goto L_0x00e7
            int r3 = r9.mo6119d(r5)
            int r3 = r3 + r7
            int r4 = r9.mo6119d(r7)
        L_0x00e1:
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x0117
        L_0x00e7:
            int r3 = r9.mo6119d(r5)
            if (r3 == 0) goto L_0x0113
            if (r3 == r0) goto L_0x010d
            if (r3 == r5) goto L_0x0102
            if (r3 == r15) goto L_0x00f7
            r18 = r2
            r3 = 0
            goto L_0x00cf
        L_0x00f7:
            int r3 = r9.mo6119d(r14)
            int r3 = r3 + 25
            int r4 = r9.mo6119d(r7)
            goto L_0x00e1
        L_0x0102:
            int r3 = r9.mo6119d(r7)
            int r3 = r3 + 9
            int r4 = r9.mo6119d(r7)
            goto L_0x00e1
        L_0x010d:
            r18 = r2
            r3 = 0
            r19 = 2
            goto L_0x0117
        L_0x0113:
            r18 = r2
            r3 = 0
            goto L_0x00b4
        L_0x0117:
            if (r19 == 0) goto L_0x013f
            if (r8 == 0) goto L_0x013f
            if (r17 == 0) goto L_0x011f
            byte r3 = r17[r3]
        L_0x011f:
            r2 = r25[r3]
            r8.setColor(r2)
            float r3 = (float) r6
            float r4 = (float) r10
            int r2 = r6 + r19
            float r2 = (float) r2
            int r5 = r10 + 1
            float r5 = (float) r5
            r20 = r2
            r2 = r30
            r21 = r5
            r14 = 2
            r5 = r20
            r20 = r6
            r6 = r21
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0142
        L_0x013f:
            r20 = r6
            r14 = 2
        L_0x0142:
            int r6 = r20 + r19
            if (r18 == 0) goto L_0x014c
            r9.mo6122g()
            r2 = r6
            goto L_0x0013
        L_0x014c:
            r2 = r18
            r5 = 2
            r7 = 4
            r14 = 8
            goto L_0x00ac
        L_0x0154:
            r0 = 1
            r14 = 2
            if (r1 != r15) goto L_0x0162
            if (r11 != 0) goto L_0x015f
            byte[] r3 = f10819i
        L_0x015c:
            r17 = r3
            goto L_0x016e
        L_0x015f:
            r17 = r11
            goto L_0x016e
        L_0x0162:
            if (r1 != r14) goto L_0x016c
            if (r13 != 0) goto L_0x0169
            byte[] r3 = f10818h
            goto L_0x015c
        L_0x0169:
            r17 = r13
            goto L_0x016e
        L_0x016c:
            r17 = 0
        L_0x016e:
            r7 = r2
            r6 = 0
        L_0x0170:
            int r2 = r9.mo6119d(r14)
            if (r2 == 0) goto L_0x017f
            r19 = r6
        L_0x0178:
            r4 = 4
            r5 = 8
            r18 = 1
            goto L_0x01ed
        L_0x017f:
            boolean r2 = r9.mo6128m()
            if (r2 == 0) goto L_0x0197
            int r2 = r9.mo6119d(r15)
            int r2 = r2 + r15
            int r3 = r9.mo6119d(r14)
            r18 = r2
            r2 = r3
            r19 = r6
            r4 = 4
            r5 = 8
            goto L_0x01ed
        L_0x0197:
            boolean r2 = r9.mo6128m()
            if (r2 == 0) goto L_0x01a1
            r19 = r6
            r2 = 0
            goto L_0x0178
        L_0x01a1:
            int r2 = r9.mo6119d(r14)
            if (r2 == 0) goto L_0x01e5
            if (r2 == r0) goto L_0x01dc
            if (r2 == r14) goto L_0x01c9
            if (r2 == r15) goto L_0x01b6
            r19 = r6
            r2 = 0
            r4 = 4
            r5 = 8
            r18 = 0
            goto L_0x01ed
        L_0x01b6:
            r5 = 8
            int r2 = r9.mo6119d(r5)
            int r2 = r2 + 29
            int r3 = r9.mo6119d(r14)
            r18 = r2
            r2 = r3
            r19 = r6
            r4 = 4
            goto L_0x01ed
        L_0x01c9:
            r4 = 4
            r5 = 8
            int r2 = r9.mo6119d(r4)
            int r2 = r2 + 12
            int r3 = r9.mo6119d(r14)
            r18 = r2
            r2 = r3
            r19 = r6
            goto L_0x01ed
        L_0x01dc:
            r4 = 4
            r5 = 8
            r19 = r6
            r2 = 0
            r18 = 2
            goto L_0x01ed
        L_0x01e5:
            r4 = 4
            r5 = 8
            r2 = 0
            r18 = 0
            r19 = 1
        L_0x01ed:
            if (r18 == 0) goto L_0x0215
            if (r8 == 0) goto L_0x0215
            if (r17 == 0) goto L_0x01f5
            byte r2 = r17[r2]
        L_0x01f5:
            r2 = r25[r2]
            r8.setColor(r2)
            float r3 = (float) r7
            float r6 = (float) r10
            int r2 = r7 + r18
            float r2 = (float) r2
            int r0 = r10 + 1
            float r0 = (float) r0
            r21 = r2
            r2 = r30
            r22 = 4
            r4 = r6
            r23 = 8
            r5 = r21
            r6 = r0
            r0 = r7
            r7 = r29
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x021a
        L_0x0215:
            r0 = r7
            r22 = 4
            r23 = 8
        L_0x021a:
            int r7 = r0 + r18
            if (r19 == 0) goto L_0x0224
            r9.mo6122g()
            r2 = r7
            goto L_0x0013
        L_0x0224:
            r6 = r19
            r0 = 1
            goto L_0x0170
        L_0x0229:
            int r10 = r10 + 2
            r2 = r27
            goto L_0x0013
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p165b.C3480j.m10073c(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* renamed from: d */
    private static int m10074d(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: e */
    private static byte[] m10075e(int i, int i2, C2603ab abVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) abVar.mo6119d(i2);
        }
        return bArr;
    }

    /* renamed from: f */
    private static int[] m10076f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* renamed from: g */
    private static int[] m10077g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m10074d(PrivateKeyType.INVALID, 1 != (i & 1) ? 0 : PrivateKeyType.INVALID, (i & 2) != 0 ? PrivateKeyType.INVALID : 0, (i & 4) != 0 ? PrivateKeyType.INVALID : 0);
            } else {
                int i2 = 127;
                int i3 = 1 != (i & 1) ? 0 : 127;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m10074d(PrivateKeyType.INVALID, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* renamed from: h */
    private static int[] m10078h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = PrivateKeyType.INVALID;
            if (i < 8) {
                int i3 = 1 != (i & 1) ? 0 : PrivateKeyType.INVALID;
                int i4 = (i & 2) != 0 ? PrivateKeyType.INVALID : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m10074d(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m10074d(PrivateKeyType.INVALID, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m10074d(PrivateKeyType.INVALID, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m10074d(PrivateKeyType.INVALID, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m10074d(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }
}
