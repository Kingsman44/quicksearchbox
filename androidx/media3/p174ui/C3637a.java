package androidx.media3.p174ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.ui.a */
/* compiled from: PG */
final class C3637a extends View implements C3655s {

    /* renamed from: a */
    public final List f11691a = new ArrayList();

    /* renamed from: b */
    public List f11692b = Collections.emptyList();

    /* renamed from: c */
    public int f11693c = 0;

    /* renamed from: d */
    public float f11694d = 0.0533f;

    /* renamed from: e */
    public C3638b f11695e = C3638b.f11697a;

    /* renamed from: f */
    public float f11696f = 0.08f;

    public C3637a(Context context) {
        super(context, (AttributeSet) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:177:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x048b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r39) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            java.util.List r2 = r0.f11692b
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            int r3 = r38.getHeight()
            int r4 = r38.getPaddingLeft()
            int r5 = r38.getPaddingTop()
            int r6 = r38.getWidth()
            int r7 = r38.getPaddingRight()
            int r6 = r6 - r7
            int r7 = r38.getPaddingBottom()
            int r7 = r3 - r7
            if (r7 <= r5) goto L_0x04bc
            if (r6 > r4) goto L_0x002e
            goto L_0x04bc
        L_0x002e:
            int r8 = r7 - r5
            int r9 = r0.f11693c
            float r10 = r0.f11694d
            float r9 = androidx.media3.p174ui.C3658v.m10613a(r9, r10, r3, r8)
            r10 = 0
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 > 0) goto L_0x003e
            return
        L_0x003e:
            int r11 = r2.size()
            r13 = 0
        L_0x0043:
            if (r13 >= r11) goto L_0x04bc
            java.lang.Object r14 = r2.get(r13)
            androidx.media3.common.a.c r14 = (androidx.media3.common.p135a.C2567c) r14
            int r15 = r14.f7099r
            r16 = 1065353216(0x3f800000, float:1.0)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 == r10) goto L_0x008e
            androidx.media3.common.a.b r15 = new androidx.media3.common.a.b
            r15.<init>(r14)
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r15.f7072h = r12
            r15.f7073i = r10
            r10 = 0
            r15.f7067c = r10
            int r10 = r14.f7089h
            if (r10 != 0) goto L_0x0070
            float r10 = r14.f7088g
            float r10 = r16 - r10
            r15.f7069e = r10
            r10 = 0
            r15.f7070f = r10
            goto L_0x007b
        L_0x0070:
            float r10 = r14.f7088g
            float r10 = -r10
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r10 = r10 + r12
            r15.f7069e = r10
            r10 = 1
            r15.f7070f = r10
        L_0x007b:
            int r10 = r14.f7090i
            if (r10 == 0) goto L_0x0087
            r12 = 2
            if (r10 == r12) goto L_0x0083
            goto L_0x008a
        L_0x0083:
            r10 = 0
            r15.f7071g = r10
            goto L_0x008a
        L_0x0087:
            r12 = 2
            r15.f7071g = r12
        L_0x008a:
            androidx.media3.common.a.c r14 = r15.mo6076a()
        L_0x008e:
            int r10 = r14.f7097p
            float r12 = r14.f7098q
            float r10 = androidx.media3.p174ui.C3658v.m10613a(r10, r12, r3, r8)
            java.util.List r12 = r0.f11691a
            java.lang.Object r12 = r12.get(r13)
            androidx.media3.ui.r r12 = (androidx.media3.p174ui.C3654r) r12
            androidx.media3.ui.b r15 = r0.f11695e
            r19 = r2
            float r2 = r0.f11696f
            android.graphics.Bitmap r0 = r14.f7087f
            if (r0 != 0) goto L_0x00aa
            r0 = 1
            goto L_0x00ab
        L_0x00aa:
            r0 = 0
        L_0x00ab:
            if (r0 == 0) goto L_0x00d1
            r20 = r3
            java.lang.CharSequence r3 = r14.f7084c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x00c7
            r0 = r1
            r36 = r6
            r31 = r7
            r7 = r8
            r32 = r9
            r21 = r11
            r22 = r13
        L_0x00c3:
            r8 = 0
            r13 = 0
            goto L_0x04a6
        L_0x00c7:
            boolean r3 = r14.f7095n
            if (r3 == 0) goto L_0x00ce
            int r3 = r14.f7096o
            goto L_0x00d5
        L_0x00ce:
            int r3 = r15.f11700d
            goto L_0x00d5
        L_0x00d1:
            r20 = r3
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x00d5:
            r21 = r11
            java.lang.CharSequence r11 = r12.f11765d
            r22 = r13
            java.lang.CharSequence r13 = r14.f7084c
            if (r11 == r13) goto L_0x00e7
            if (r11 == 0) goto L_0x019a
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x019a
        L_0x00e7:
            android.text.Layout$Alignment r11 = r12.f11766e
            android.text.Layout$Alignment r13 = r14.f7085d
            boolean r11 = androidx.media3.common.p136b.C2612ak.m6951aa(r11, r13)
            if (r11 == 0) goto L_0x019a
            android.graphics.Bitmap r11 = r12.f11767f
            android.graphics.Bitmap r13 = r14.f7087f
            if (r11 != r13) goto L_0x019a
            float r11 = r12.f11768g
            float r13 = r14.f7088g
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x019a
            int r11 = r12.f11769h
            int r13 = r14.f7089h
            if (r11 != r13) goto L_0x019a
            int r11 = r12.f11770i
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r13 = r14.f7090i
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r11 = androidx.media3.common.p136b.C2612ak.m6951aa(r11, r13)
            if (r11 == 0) goto L_0x019a
            float r11 = r12.f11771j
            float r13 = r14.f7091j
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x019a
            int r11 = r12.f11772k
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r13 = r14.f7092k
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r11 = androidx.media3.common.p136b.C2612ak.m6951aa(r11, r13)
            if (r11 == 0) goto L_0x019a
            float r11 = r12.f11773l
            float r13 = r14.f7093l
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x019a
            float r11 = r12.f11774m
            float r13 = r14.f7094m
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x019a
            int r11 = r12.f11775n
            int r13 = r15.f11698b
            if (r11 != r13) goto L_0x019a
            int r11 = r12.f11776o
            int r13 = r15.f11699c
            if (r11 != r13) goto L_0x019a
            int r11 = r12.f11777p
            if (r11 != r3) goto L_0x019a
            int r11 = r12.f11779r
            int r13 = r15.f11701e
            if (r11 != r13) goto L_0x019a
            int r11 = r12.f11778q
            int r13 = r15.f11702f
            if (r11 != r13) goto L_0x019a
            android.text.TextPaint r11 = r12.f11764c
            android.graphics.Typeface r11 = r11.getTypeface()
            android.graphics.Typeface r13 = r15.f11703g
            boolean r11 = androidx.media3.common.p136b.C2612ak.m6951aa(r11, r13)
            if (r11 == 0) goto L_0x019a
            float r11 = r12.f11780s
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x019a
            float r11 = r12.f11781t
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 != 0) goto L_0x019a
            float r11 = r12.f11782u
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x019a
            int r11 = r12.f11783v
            if (r11 != r4) goto L_0x019a
            int r11 = r12.f11784w
            if (r11 != r5) goto L_0x019a
            int r11 = r12.f11785x
            if (r11 != r6) goto L_0x019a
            int r11 = r12.f11786y
            if (r11 != r7) goto L_0x019a
            r12.mo7706a(r1, r0)
            r0 = r1
            r36 = r6
            r31 = r7
            r7 = r8
            r32 = r9
            goto L_0x00c3
        L_0x019a:
            java.lang.CharSequence r11 = r14.f7084c
            r12.f11765d = r11
            android.text.Layout$Alignment r11 = r14.f7085d
            r12.f11766e = r11
            android.graphics.Bitmap r11 = r14.f7087f
            r12.f11767f = r11
            float r11 = r14.f7088g
            r12.f11768g = r11
            int r11 = r14.f7089h
            r12.f11769h = r11
            int r11 = r14.f7090i
            r12.f11770i = r11
            float r11 = r14.f7091j
            r12.f11771j = r11
            int r11 = r14.f7092k
            r12.f11772k = r11
            float r11 = r14.f7093l
            r12.f11773l = r11
            float r11 = r14.f7094m
            r12.f11774m = r11
            int r11 = r15.f11698b
            r12.f11775n = r11
            int r11 = r15.f11699c
            r12.f11776o = r11
            r12.f11777p = r3
            int r3 = r15.f11701e
            r12.f11779r = r3
            int r3 = r15.f11702f
            r12.f11778q = r3
            android.text.TextPaint r3 = r12.f11764c
            android.graphics.Typeface r11 = r15.f11703g
            r3.setTypeface(r11)
            r12.f11780s = r9
            r12.f11781t = r10
            r12.f11782u = r2
            r12.f11783v = r4
            r12.f11784w = r5
            r12.f11785x = r6
            r12.f11786y = r7
            if (r0 == 0) goto L_0x041f
            java.lang.CharSequence r2 = r12.f11765d
            r2.getClass()
            boolean r3 = r2 instanceof android.text.SpannableStringBuilder
            if (r3 == 0) goto L_0x01f7
            android.text.SpannableStringBuilder r2 = (android.text.SpannableStringBuilder) r2
            goto L_0x01fd
        L_0x01f7:
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r2)
            r2 = r3
        L_0x01fd:
            int r3 = r12.f11785x
            int r10 = r12.f11783v
            int r3 = r3 - r10
            int r10 = r12.f11786y
            int r11 = r12.f11784w
            int r10 = r10 - r11
            android.text.TextPaint r11 = r12.f11764c
            float r13 = r12.f11780s
            r11.setTextSize(r13)
            float r11 = r12.f11780s
            r13 = 1040187392(0x3e000000, float:0.125)
            float r11 = r11 * r13
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r13
            int r11 = (int) r11
            int r13 = r11 + r11
            int r14 = r3 - r13
            float r15 = r12.f11773l
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r23 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r23 == 0) goto L_0x0229
            float r14 = (float) r14
            float r14 = r14 * r15
            int r14 = (int) r14
        L_0x0229:
            java.lang.String r15 = "SubtitlePainter"
            if (r14 > 0) goto L_0x0242
            java.lang.String r2 = "Skipped drawing subtitle cue (insufficient space)"
            androidx.media3.common.p136b.C2633u.m7050e(r15, r2)
            r36 = r6
            r31 = r7
            r7 = r8
            r32 = r9
            r8 = 0
            r13 = 0
            r37 = r1
            r1 = r0
            r0 = r37
            goto L_0x04a3
        L_0x0242:
            r31 = r7
            float r7 = r12.f11781t
            r32 = r9
            r17 = 0
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r7 <= 0) goto L_0x0263
            android.text.style.AbsoluteSizeSpan r7 = new android.text.style.AbsoluteSizeSpan
            float r9 = r12.f11781t
            int r9 = (int) r9
            r7.<init>(r9)
            int r9 = r2.length()
            r33 = r0
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = 0
            r2.setSpan(r7, r1, r9, r0)
            goto L_0x0266
        L_0x0263:
            r33 = r0
            r1 = 0
        L_0x0266:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r2)
            int r7 = r12.f11779r
            r9 = 1
            if (r7 != r9) goto L_0x028c
            int r7 = r0.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r9 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r7 = r0.getSpans(r1, r7, r9)
            android.text.style.ForegroundColorSpan[] r7 = (android.text.style.ForegroundColorSpan[]) r7
            int r1 = r7.length
            r9 = 0
        L_0x027e:
            if (r9 >= r1) goto L_0x028c
            r24 = r1
            r1 = r7[r9]
            r0.removeSpan(r1)
            int r9 = r9 + 1
            r1 = r24
            goto L_0x027e
        L_0x028c:
            int r1 = r12.f11776o
            int r1 = android.graphics.Color.alpha(r1)
            if (r1 <= 0) goto L_0x02c4
            int r1 = r12.f11779r
            if (r1 == 0) goto L_0x02b0
            r7 = 2
            if (r1 != r7) goto L_0x029c
            goto L_0x02b0
        L_0x029c:
            android.text.style.BackgroundColorSpan r1 = new android.text.style.BackgroundColorSpan
            int r7 = r12.f11776o
            r1.<init>(r7)
            int r7 = r0.length()
            r34 = r5
            r5 = 0
            r9 = 16711680(0xff0000, float:2.3418052E-38)
            r0.setSpan(r1, r5, r7, r9)
            goto L_0x02c6
        L_0x02b0:
            r34 = r5
            r5 = 0
            r9 = 16711680(0xff0000, float:2.3418052E-38)
            android.text.style.BackgroundColorSpan r1 = new android.text.style.BackgroundColorSpan
            int r7 = r12.f11776o
            r1.<init>(r7)
            int r7 = r2.length()
            r2.setSpan(r1, r5, r7, r9)
            goto L_0x02c6
        L_0x02c4:
            r34 = r5
        L_0x02c6:
            android.text.Layout$Alignment r1 = r12.f11766e
            if (r1 != 0) goto L_0x02cc
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x02cc:
            android.text.StaticLayout r5 = new android.text.StaticLayout
            android.text.TextPaint r7 = r12.f11764c
            float r9 = r12.f11762a
            r35 = r8
            float r8 = r12.f11763b
            r30 = 1
            r23 = r5
            r24 = r2
            r25 = r7
            r26 = r14
            r27 = r1
            r28 = r9
            r29 = r8
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r12.f11787z = r5
            android.text.StaticLayout r5 = r12.f11787z
            int r5 = r5.getHeight()
            android.text.StaticLayout r7 = r12.f11787z
            int r7 = r7.getLineCount()
            r8 = 0
            r9 = 0
        L_0x02f9:
            if (r8 >= r7) goto L_0x0316
            r23 = r7
            android.text.StaticLayout r7 = r12.f11787z
            float r7 = r7.getLineWidth(r8)
            r36 = r6
            double r6 = (double) r7
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r9 = java.lang.Math.max(r6, r9)
            int r8 = r8 + 1
            r7 = r23
            r6 = r36
            goto L_0x02f9
        L_0x0316:
            r36 = r6
            float r6 = r12.f11773l
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0323
            if (r9 < r14) goto L_0x0324
        L_0x0323:
            r14 = r9
        L_0x0324:
            int r14 = r14 + r13
            float r6 = r12.f11771j
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x0350
            float r3 = (float) r3
            float r3 = r3 * r6
            int r3 = java.lang.Math.round(r3)
            int r6 = r12.f11783v
            int r3 = r3 + r6
            int r7 = r12.f11772k
            r8 = 1
            if (r7 == r8) goto L_0x0340
            r8 = 2
            if (r7 == r8) goto L_0x033e
            goto L_0x0344
        L_0x033e:
            int r3 = r3 - r14
            goto L_0x0344
        L_0x0340:
            r8 = 2
            int r3 = r3 + r3
            int r3 = r3 - r14
            int r3 = r3 / r8
        L_0x0344:
            int r3 = java.lang.Math.max(r3, r6)
            int r14 = r14 + r3
            int r6 = r12.f11785x
            int r6 = java.lang.Math.min(r14, r6)
            goto L_0x0358
        L_0x0350:
            r8 = 2
            int r3 = r3 - r14
            int r3 = r3 / r8
            int r6 = r12.f11783v
            int r3 = r3 + r6
            int r6 = r3 + r14
        L_0x0358:
            int r6 = r6 - r3
            if (r6 > 0) goto L_0x036c
            java.lang.String r0 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            androidx.media3.common.p136b.C2633u.m7050e(r15, r0)
            r0 = r39
            r1 = r33
            r5 = r34
            r7 = r35
            r8 = 0
            r13 = 0
            goto L_0x04a3
        L_0x036c:
            float r7 = r12.f11768g
            r8 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x03cf
            int r8 = r12.f11769h
            if (r8 != 0) goto L_0x0393
            float r8 = (float) r10
            float r8 = r8 * r7
            int r7 = java.lang.Math.round(r8)
            int r8 = r12.f11784w
            int r7 = r7 + r8
            int r8 = r12.f11770i
            r9 = 2
            if (r8 != r9) goto L_0x038a
            int r7 = r7 - r5
            goto L_0x0390
        L_0x038a:
            r10 = 1
            if (r8 != r10) goto L_0x0390
            int r7 = r7 + r7
            int r7 = r7 - r5
            int r7 = r7 / r9
        L_0x0390:
            r8 = 0
            r13 = 0
            goto L_0x03c0
        L_0x0393:
            android.text.StaticLayout r7 = r12.f11787z
            r8 = 0
            int r7 = r7.getLineBottom(r8)
            android.text.StaticLayout r9 = r12.f11787z
            int r9 = r9.getLineTop(r8)
            int r7 = r7 - r9
            float r9 = r12.f11768g
            r13 = 0
            int r10 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r10 < 0) goto L_0x03b3
            float r7 = (float) r7
            float r9 = r9 * r7
            int r7 = java.lang.Math.round(r9)
            int r9 = r12.f11784w
            int r7 = r7 + r9
            goto L_0x03c0
        L_0x03b3:
            float r9 = r9 + r16
            float r7 = (float) r7
            float r9 = r9 * r7
            int r7 = java.lang.Math.round(r9)
            int r9 = r12.f11786y
            int r7 = r7 + r9
            int r7 = r7 - r5
        L_0x03c0:
            int r9 = r12.f11786y
            int r10 = r7 + r5
            if (r10 <= r9) goto L_0x03c9
            int r7 = r9 - r5
            goto L_0x03db
        L_0x03c9:
            int r5 = r12.f11784w
            if (r7 >= r5) goto L_0x03db
            r7 = r5
            goto L_0x03db
        L_0x03cf:
            r8 = 0
            r13 = 0
            int r7 = r12.f11786y
            int r7 = r7 - r5
            float r5 = (float) r10
            float r9 = r12.f11782u
            float r5 = r5 * r9
            int r5 = (int) r5
            int r7 = r7 - r5
        L_0x03db:
            android.text.StaticLayout r5 = new android.text.StaticLayout
            android.text.TextPaint r9 = r12.f11764c
            float r10 = r12.f11762a
            float r14 = r12.f11763b
            r30 = 1
            r23 = r5
            r24 = r2
            r25 = r9
            r26 = r6
            r27 = r1
            r28 = r10
            r29 = r14
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r12.f11787z = r5
            android.text.StaticLayout r2 = new android.text.StaticLayout
            android.text.TextPaint r5 = r12.f11764c
            float r9 = r12.f11762a
            float r10 = r12.f11763b
            r23 = r2
            r24 = r0
            r25 = r5
            r28 = r9
            r29 = r10
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            r12.f11752A = r2
            r12.f11753B = r3
            r12.f11754C = r7
            r12.f11755D = r11
            r0 = r39
            r1 = r33
            r5 = r34
            r7 = r35
            goto L_0x04a3
        L_0x041f:
            r33 = r0
            r34 = r5
            r36 = r6
            r31 = r7
            r35 = r8
            r32 = r9
            r8 = 0
            r13 = 0
            android.graphics.Bitmap r0 = r12.f11767f
            r0.getClass()
            int r6 = r36 - r4
            float r1 = (float) r6
            float r2 = (float) r4
            float r3 = r12.f11771j
            float r3 = r3 * r1
            float r2 = r2 + r3
            r7 = r35
            float r3 = (float) r7
            r5 = r34
            float r6 = (float) r5
            float r9 = r12.f11768g
            float r9 = r9 * r3
            float r6 = r6 + r9
            float r9 = r12.f11773l
            float r1 = r1 * r9
            int r1 = java.lang.Math.round(r1)
            float r9 = r12.f11774m
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x045e
            float r3 = r3 * r9
            int r0 = java.lang.Math.round(r3)
            goto L_0x0470
        L_0x045e:
            float r3 = (float) r1
            int r9 = r0.getHeight()
            float r9 = (float) r9
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r9 = r9 / r0
            float r3 = r3 * r9
            int r0 = java.lang.Math.round(r3)
        L_0x0470:
            int r3 = r12.f11772k
            r9 = 2
            if (r3 != r9) goto L_0x0478
            float r3 = (float) r1
        L_0x0476:
            float r2 = r2 - r3
            goto L_0x047f
        L_0x0478:
            r9 = 1
            if (r3 != r9) goto L_0x047f
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L_0x0476
        L_0x047f:
            int r2 = java.lang.Math.round(r2)
            int r3 = r12.f11770i
            r9 = 2
            if (r3 != r9) goto L_0x048b
            float r3 = (float) r0
        L_0x0489:
            float r6 = r6 - r3
            goto L_0x0492
        L_0x048b:
            r9 = 1
            if (r3 != r9) goto L_0x0492
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L_0x0489
        L_0x0492:
            int r3 = java.lang.Math.round(r6)
            android.graphics.Rect r6 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r6.<init>(r2, r3, r1, r0)
            r12.f11756E = r6
            r0 = r39
            r1 = r33
        L_0x04a3:
            r12.mo7706a(r0, r1)
        L_0x04a6:
            int r1 = r22 + 1
            r13 = r1
            r8 = r7
            r2 = r19
            r3 = r20
            r11 = r21
            r7 = r31
            r9 = r32
            r6 = r36
            r10 = 0
            r1 = r0
            r0 = r38
            goto L_0x0043
        L_0x04bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p174ui.C3637a.dispatchDraw(android.graphics.Canvas):void");
    }
}
