package com.facebook.litho.widget;

import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.core.p096h.C1956i;
import androidx.core.p096h.C1963p;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1991k;
import com.evernote.android.state.BuildConfig;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.facebook.p308a.p309a.C6016a;
import com.facebook.p308a.p309a.C6018b;
import com.facebook.p319d.p320a.p321a.C6066a;
import com.facebook.yoga.C6570f;
import com.google.android.libraries.elements.p1714d.C20905da;
import com.google.android.libraries.elements.p1714d.C20906db;

/* renamed from: com.facebook.litho.widget.ec */
/* compiled from: PG */
final class C6525ec {

    /* renamed from: a */
    protected static final ColorStateList f19425a;

    /* renamed from: b */
    protected static final int f19426b;

    /* renamed from: c */
    protected static final Typeface f19427c;

    /* renamed from: d */
    protected static final int f19428d = 1;

    /* renamed from: e */
    private static final Typeface f19429e;

    /* renamed from: f */
    private static final int[][] f19430f;

    /* renamed from: g */
    private static final int[] f19431g;

    /* renamed from: h */
    private static final Path f19432h = new Path();

    /* renamed from: i */
    private static final Rect f19433i = new Rect();

    /* renamed from: j */
    private static final RectF f19434j = new RectF();

    static {
        Typeface typeface = Typeface.DEFAULT;
        f19429e = typeface;
        int[][] iArr = {new int[]{0}};
        f19430f = iArr;
        int[] iArr2 = {-16777216};
        f19431g = iArr2;
        f19425a = new ColorStateList(iArr, iArr2);
        f19426b = typeface.getStyle();
        f19427c = typeface;
    }

    /* renamed from: a */
    static int m17723a(int i, int i2, @C6118b(mo12872a = C6119c.STRING) CharSequence charSequence, Layout layout, ClickableSpan[] clickableSpanArr) {
        if (!(charSequence instanceof Spanned)) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        Spanned spanned = (Spanned) charSequence;
        for (int i3 = 0; i3 < clickableSpanArr.length; i3++) {
            ClickableSpan clickableSpan = clickableSpanArr[i3];
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            Path path = f19432h;
            layout.getSelectionPath(spanStart, spanEnd, path);
            RectF rectF = f19434j;
            path.computeBounds(rectF, true);
            if (rectF.contains((float) i, (float) i2)) {
                return i3;
            }
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }

    /* renamed from: b */
    static int m17724b(@C6118b(mo12872a = C6119c.BOOL) boolean z, ClickableSpan[] clickableSpanArr) {
        if (!z || clickableSpanArr == null) {
            return 0;
        }
        return clickableSpanArr.length;
    }

    /* renamed from: c */
    static C6514ds m17725c() {
        return new C6514ds();
    }

    /* renamed from: d */
    static void m17726d(C1991k kVar, int i, int i2, int i3, @C6118b(mo12872a = C6119c.STRING) CharSequence charSequence, Layout layout, ClickableSpan[] clickableSpanArr) {
        int i4;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C6066a aVar = clickableSpanArr[i];
            int spanStart = spanned.getSpanStart(aVar);
            int spanEnd = spanned.getSpanEnd(aVar);
            int lineForOffset = layout.getLineForOffset(spanStart);
            if (lineForOffset == layout.getLineForOffset(spanEnd)) {
                i4 = spanEnd;
            } else {
                i4 = layout.getLineVisibleEnd(lineForOffset);
            }
            Path path = f19432h;
            layout.getSelectionPath(spanStart, i4, path);
            RectF rectF = f19434j;
            path.computeBounds(rectF, true);
            Rect rect = f19433i;
            rect.set(((int) rectF.left) + i2, ((int) rectF.top) + i3, i2 + ((int) rectF.right), i3 + ((int) rectF.bottom));
            if (rect.isEmpty()) {
                rect.set(0, 0, 1, 1);
                kVar.f5921a.setBoundsInParent(rect);
                kVar.f5921a.setContentDescription(BuildConfig.FLAVOR);
                return;
            }
            kVar.f5921a.setBoundsInParent(rect);
            kVar.f5921a.setClickable(true);
            kVar.f5921a.setFocusable(true);
            kVar.f5921a.setEnabled(true);
            kVar.f5921a.setVisibleToUser(true);
            kVar.f5921a.setText(spanned.subSequence(spanStart, spanEnd));
            if (!(aVar instanceof C6066a)) {
                kVar.f5921a.setClassName("android.widget.Button");
            } else {
                C6066a aVar2 = aVar;
                throw null;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0200: MOVE  (r2v12 int) = (r26v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0205  */
    /* renamed from: f */
    static void m17728f(com.facebook.litho.C6411u r29, com.facebook.litho.C6564z r30, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.STRING) java.lang.CharSequence r31, @com.facebook.litho.p323b.C6118b android.text.TextUtils.TruncateAt r32, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.BOOL) boolean r33, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.INT) int r34, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) float r35, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) float r36, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) float r37, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.COLOR) int r38, @com.facebook.litho.p323b.C6118b android.content.res.ColorStateList r39, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.COLOR) int r40, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_TEXT) int r41, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) float r42, @com.facebook.litho.p323b.C6118b int r43, @com.facebook.litho.p323b.C6118b int r44, @com.facebook.litho.p323b.C6118b android.graphics.Typeface r45, @com.facebook.litho.p323b.C6118b int r46, @com.facebook.litho.p323b.C6118b int r47, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.STRING) java.lang.CharSequence r48, @com.facebook.litho.p323b.C6118b boolean r49, @com.facebook.litho.p323b.C6118b boolean r50, android.text.Layout r51, android.text.Layout r52, java.lang.Integer r53, java.lang.Integer r54, com.facebook.litho.C6258fa r55, com.facebook.litho.C6258fa r56, com.facebook.litho.C6258fa r57, com.facebook.litho.C6258fa r58, com.facebook.litho.C6258fa r59) {
        /*
            r15 = r29
            r14 = r31
            r13 = r34
            r0 = r52
            r12 = r55
            r11 = r56
            r10 = r57
            r12.f18496a = r14
            boolean r1 = android.text.TextUtils.isEmpty(r31)
            if (r1 == 0) goto L_0x0017
            return
        L_0x0017:
            int r1 = r30.mo12882H()
            int r2 = r30.mo12879E()
            int r1 = r1 - r2
            int r2 = r30.mo12880F()
            int r1 = r1 - r2
            float r9 = (float) r1
            int r1 = r30.mo12901a()
            int r2 = r30.mo12881G()
            int r1 = r1 - r2
            int r2 = r30.mo12878D()
            int r1 = r1 - r2
            float r8 = (float) r1
            r7 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x0053
            int r1 = r53.intValue()
            float r1 = (float) r1
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0053
            int r1 = r54.intValue()
            float r1 = (float) r1
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0053
            r11.f18496a = r0
            r21 = r8
            r22 = r9
            r15 = r11
            goto L_0x009a
        L_0x0053:
            int r0 = (int) r9
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
            int r16 = m17736n(r46)
            com.facebook.yoga.f r17 = r30.mo12886L()
            android.content.Context r0 = r15.f19009b
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r18 = r0
            r0 = r29
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r21 = r8
            r8 = r38
            r22 = r9
            r9 = r31
            r10 = r39
            r11 = r40
            r12 = r41
            r13 = r42
            r14 = r44
            r15 = r45
            r19 = r47
            android.text.Layout r0 = m17737o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r15 = r56
            r15.f18496a = r0
        L_0x009a:
            java.lang.Object r0 = r15.f18496a
            android.text.Layout r0 = (android.text.Layout) r0
            int r0 = com.facebook.p308a.p309a.p310a.C6017a.m15462a(r0)
            float r0 = (float) r0
            int r1 = r43 + -1
            int[] r2 = com.facebook.litho.widget.C6524eb.f19423b
            r14 = 0
            if (r43 == 0) goto L_0x0391
            r1 = r2[r1]
            r13 = 2
            r12 = 1
            if (r1 == r12) goto L_0x00c1
            if (r1 == r13) goto L_0x00bc
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = r57
            r1.f18496a = r0
            goto L_0x00ce
        L_0x00bc:
            r1 = r57
            float r8 = r21 - r0
            goto L_0x00c8
        L_0x00c1:
            r1 = r57
            float r8 = r21 - r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r0
        L_0x00c8:
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            r1.f18496a = r0
        L_0x00ce:
            if (r50 == 0) goto L_0x00da
            boolean r0 = android.text.TextUtils.isEmpty(r48)
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "…"
            r11 = r0
            goto L_0x00dc
        L_0x00da:
            r11 = r48
        L_0x00dc:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x0130
            if (r51 != 0) goto L_0x0130
            r10 = r22
            int r0 = (int) r10
            r9 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            int r16 = m17736n(r46)
            com.facebook.yoga.f r17 = r30.mo12886L()
            r8 = r29
            android.content.Context r0 = r8.f19009b
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r18 = r0
            r0 = r29
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r11
            r23 = r10
            r10 = r39
            r24 = r11
            r11 = r40
            r20 = 1
            r12 = r41
            r13 = r42
            r14 = r44
            r15 = r45
            r19 = r47
            android.text.Layout r0 = m17737o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r15 = r0
            goto L_0x0138
        L_0x0130:
            r24 = r11
            r23 = r22
            r20 = 1
            r15 = r51
        L_0x0138:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r49 == 0) goto L_0x0173
            r1 = r34
            if (r1 != r0) goto L_0x0175
            r14 = r56
            java.lang.Object r2 = r14.f18496a
            android.text.Layout r2 = (android.text.Layout) r2
            int r3 = r30.mo12901a()
            float r3 = (float) r3
            float r4 = r2.getSpacingAdd()
            float r3 = r3 + r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            int r5 = r2.getLineCount()
        L_0x015a:
            if (r5 <= 0) goto L_0x0171
            int r6 = r5 + -1
            r2.getLineBounds(r6, r4)
            int r7 = r4.bottom
            int r8 = m17733k(r2, r6, r15)
            int r7 = r7 + r8
            float r7 = (float) r7
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 > 0) goto L_0x016f
            r13 = r5
            goto L_0x0178
        L_0x016f:
            r5 = r6
            goto L_0x015a
        L_0x0171:
            r13 = 1
            goto L_0x0178
        L_0x0173:
            r1 = r34
        L_0x0175:
            r14 = r56
            r13 = r1
        L_0x0178:
            java.lang.Object r2 = r14.f18496a
            android.text.Layout r2 = (android.text.Layout) r2
            int r2 = m17732j(r2)
            r12 = -1
            if (r2 != r12) goto L_0x0192
            java.lang.Object r2 = r14.f18496a
            android.text.Layout r2 = (android.text.Layout) r2
            int r2 = r2.getLineCount()
            if (r13 >= r2) goto L_0x0190
            int r2 = r13 + -1
            goto L_0x0192
        L_0x0190:
            r11 = -1
            goto L_0x0193
        L_0x0192:
            r11 = r2
        L_0x0193:
            if (r49 == 0) goto L_0x01f2
            if (r1 != r0) goto L_0x01f2
            java.lang.Object r0 = r14.f18496a
            android.text.Layout r0 = (android.text.Layout) r0
            int r0 = r0.getLineCount()
            if (r13 >= r0) goto L_0x01f2
            r10 = r23
            int r0 = (int) r10
            r9 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            int r16 = m17736n(r46)
            com.facebook.yoga.f r17 = r30.mo12886L()
            r8 = r29
            android.content.Context r0 = r8.f19009b
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r18 = r0
            r0 = r29
            r2 = r32
            r3 = r33
            r4 = r13
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r31
            r25 = r10
            r10 = r39
            r26 = r11
            r11 = r40
            r12 = r41
            r21 = r13
            r13 = r42
            r14 = r44
            r27 = r15
            r15 = r45
            r19 = r47
            android.text.Layout r0 = m17737o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r15 = r56
            r15.f18496a = r0
            goto L_0x01fb
        L_0x01f2:
            r26 = r11
            r21 = r13
            r27 = r15
            r25 = r23
            r15 = r14
        L_0x01fb:
            r14 = 0
            r0 = r27
            if (r0 == 0) goto L_0x0362
            r2 = r26
            r1 = -1
            if (r2 == r1) goto L_0x0362
            com.facebook.yoga.f r3 = r30.mo12886L()
            r4 = 0
            androidx.core.h.i r3 = m17734l(r4, r3)
            android.text.Layout$Alignment r4 = r0.getAlignment()
            int r5 = r31.length()
            r6 = r31
            boolean r3 = r3.mo5116a(r6, r5)
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            if (r4 != r5) goto L_0x0222
            r12 = 1
            goto L_0x0223
        L_0x0222:
            r12 = 0
        L_0x0223:
            r4 = r3 ^ r12
            java.lang.Object r5 = r15.f18496a
            android.text.Layout r5 = (android.text.Layout) r5
            int r7 = r0.getLineCount()
            int r7 = r7 + r1
            float r0 = r0.getLineWidth(r7)
            if (r3 != 0) goto L_0x023b
            if (r4 == 0) goto L_0x023b
            r7 = r25
            float r0 = r7 - r0
            goto L_0x0252
        L_0x023b:
            r7 = r25
            if (r3 != 0) goto L_0x0249
            float r9 = r7 - r0
            float r0 = r5.getLineWidth(r2)
            float r0 = r7 - r0
            float r0 = r0 + r9
            goto L_0x0252
        L_0x0249:
            if (r4 == 0) goto L_0x0252
            float r3 = r5.getLineWidth(r2)
            float r9 = r7 - r3
            float r0 = r0 - r9
        L_0x0252:
            int r0 = r5.getOffsetForHorizontal(r2, r0)
            if (r0 <= 0) goto L_0x0314
            r3 = r24
            if (r3 == 0) goto L_0x0314
            int r0 = r0 + r1
            if (r50 == 0) goto L_0x028b
            java.text.BreakIterator r1 = java.text.BreakIterator.getWordInstance()
            java.lang.String r4 = r31.toString()
            r1.setText(r4)
            r1.following(r0)
            int r1 = r1.previous()
            int r4 = r5.getLineStart(r2)
            if (r1 <= r4) goto L_0x0278
        L_0x0277:
            r0 = r1
        L_0x0278:
            int r1 = r0 + -1
            char r4 = r6.charAt(r1)
            boolean r4 = java.lang.Character.isWhitespace(r4)
            if (r4 == 0) goto L_0x028b
            int r4 = r5.getLineStart(r2)
            if (r1 <= r4) goto L_0x028b
            goto L_0x0277
        L_0x028b:
            int r1 = r5.getEllipsisCount(r2)
            if (r1 <= 0) goto L_0x029d
            int r1 = r5.getLineStart(r2)
            int r2 = r5.getEllipsisStart(r2)
            int r1 = r1 + r2
            if (r0 <= r1) goto L_0x029d
            r0 = r1
        L_0x029d:
            if (r0 >= 0) goto L_0x02a1
            r0 = 0
            goto L_0x02ab
        L_0x02a1:
            int r1 = r31.length()
            if (r0 <= r1) goto L_0x02ab
            int r0 = r31.length()
        L_0x02ab:
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r3)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x02c4
            com.facebook.litho.widget.ef r2 = new com.facebook.litho.widget.ef
            r2.<init>()
            int r3 = r1.length()
            r4 = 18
            r1.setSpan(r2, r14, r3, r4)
        L_0x02c4:
            r2 = 2
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]
            java.lang.CharSequence r0 = r6.subSequence(r14, r0)
            r2[r14] = r0
            r2[r20] = r1
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r2)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            int r0 = r2.length()
            java.lang.Class<android.text.style.ClickableSpan> r3 = android.text.style.ClickableSpan.class
            java.lang.Object[] r0 = r2.getSpans(r14, r0, r3)
            android.text.style.ClickableSpan[] r0 = (android.text.style.ClickableSpan[]) r0
            int r3 = r2.length()
            int r4 = r1.length()
            int r3 = r3 - r4
            int r4 = r0.length
            r5 = 0
        L_0x02ef:
            if (r5 >= r4) goto L_0x0308
            r6 = r0[r5]
            int r8 = r2.getSpanStart(r6)
            int r9 = r2.getSpanEnd(r6)
            if (r8 >= r3) goto L_0x0305
            if (r9 < r3) goto L_0x0305
            r2.removeSpan(r6)
            r2.setSpan(r6, r8, r3, r14)
        L_0x0305:
            int r5 = r5 + 1
            goto L_0x02ef
        L_0x0308:
            java.lang.Class<android.text.style.ForegroundColorSpan> r0 = android.text.style.ForegroundColorSpan.class
            m17735m(r2, r1, r0)
            java.lang.Class<android.text.style.UnderlineSpan> r0 = android.text.style.UnderlineSpan.class
            m17735m(r2, r1, r0)
            r13 = r2
            goto L_0x0315
        L_0x0314:
            r13 = r6
        L_0x0315:
            int r0 = (int) r7
            r1 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            com.facebook.yoga.f r17 = r30.mo12886L()
            r0 = r29
            android.content.Context r2 = r0.f19009b
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r18 = r2
            int r16 = m17736n(r46)
            r2 = r32
            r3 = r33
            r4 = r21
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r13
            r10 = r39
            r11 = r40
            r12 = r41
            r28 = r13
            r13 = r42
            r14 = r44
            r15 = r45
            r19 = r47
            android.text.Layout r0 = m17737o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r55
            r2 = r28
            r1.f18496a = r2
            r2 = r56
            r2.f18496a = r0
            goto L_0x0364
        L_0x0362:
            r1 = r55
        L_0x0364:
            java.lang.Object r0 = r1.f18496a
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 == 0) goto L_0x0390
            r1 = r0
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r2 = r0.length()
            java.lang.Class<android.text.style.ClickableSpan> r3 = android.text.style.ClickableSpan.class
            r4 = 0
            java.lang.Object[] r2 = r1.getSpans(r4, r2, r3)
            android.text.style.ClickableSpan[] r2 = (android.text.style.ClickableSpan[]) r2
            r3 = r58
            r3.f18496a = r2
            int r0 = r0.length()
            java.lang.Class<android.text.style.ImageSpan> r2 = android.text.style.ImageSpan.class
            java.lang.Object[] r0 = r1.getSpans(r4, r0, r2)
            android.text.style.ImageSpan[] r0 = (android.text.style.ImageSpan[]) r0
            r1 = r59
            r1.f18496a = r0
        L_0x0390:
            return
        L_0x0391:
            r4 = r14
            goto L_0x0394
        L_0x0393:
            throw r4
        L_0x0394:
            goto L_0x0393
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.C6525ec.m17728f(com.facebook.litho.u, com.facebook.litho.z, java.lang.CharSequence, android.text.TextUtils$TruncateAt, boolean, int, float, float, float, int, android.content.res.ColorStateList, int, int, float, int, int, android.graphics.Typeface, int, int, java.lang.CharSequence, boolean, boolean, android.text.Layout, android.text.Layout, java.lang.Integer, java.lang.Integer, com.facebook.litho.fa, com.facebook.litho.fa, com.facebook.litho.fa, com.facebook.litho.fa, com.facebook.litho.fa):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0064: MOVE  (r15v4 int) = (r32v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* renamed from: g */
    static void m17729g(com.facebook.litho.C6411u r24, com.facebook.litho.C6564z r25, int r26, int r27, com.facebook.litho.C6276fs r28, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.STRING) java.lang.CharSequence r29, @com.facebook.litho.p323b.C6118b android.text.TextUtils.TruncateAt r30, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.BOOL) boolean r31, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.INT) int r32, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) float r33, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) float r34, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) float r35, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.COLOR) int r36, @com.facebook.litho.p323b.C6118b android.content.res.ColorStateList r37, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.COLOR) int r38, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_TEXT) int r39, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.STRING) java.lang.CharSequence r40, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) float r41, @com.facebook.litho.p323b.C6118b int r42, @com.facebook.litho.p323b.C6118b android.graphics.Typeface r43, @com.facebook.litho.p323b.C6118b int r44, @com.facebook.litho.p323b.C6118b int r45, com.facebook.litho.C6258fa r46, com.facebook.litho.C6258fa r47, com.facebook.litho.C6258fa r48, com.facebook.litho.C6258fa r49, com.facebook.litho.C6258fa r50) {
        /*
            r15 = r24
            r14 = r28
            r13 = r29
            r12 = r32
            r11 = r40
            r10 = r46
            boolean r0 = android.text.TextUtils.isEmpty(r29)
            r9 = 0
            if (r0 != 0) goto L_0x01ed
            r20 = 1
            if (r30 != 0) goto L_0x001f
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r12 == r0) goto L_0x001f
            r21 = 1
            goto L_0x0021
        L_0x001f:
            r21 = 0
        L_0x0021:
            if (r21 == 0) goto L_0x0027
            int r0 = r12 + 1
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r12
        L_0x0028:
            int r16 = m17736n(r44)
            com.facebook.yoga.f r17 = r25.mo12886L()
            android.content.Context r0 = r15.f19009b
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r18 = r0
            r0 = r24
            r1 = r26
            r2 = r30
            r3 = r31
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r29
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r41
            r14 = r42
            r15 = r43
            r19 = r45
            android.text.Layout r0 = m17737o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r21 == 0) goto L_0x00b7
            r15 = r32
            if (r15 <= 0) goto L_0x00b7
            int r1 = r0.getLineCount()
            if (r1 <= r15) goto L_0x00b7
            int r1 = r15 + -1
            int r0 = r0.getLineEnd(r1)
            r14 = r29
            r13 = 0
            java.lang.CharSequence r9 = r14.subSequence(r13, r0)
            int r16 = m17736n(r44)
            com.facebook.yoga.f r17 = r25.mo12886L()
            r12 = r24
            android.content.Context r0 = r12.f19009b
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r18 = r0
            r0 = r24
            r1 = r26
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r41
            r14 = r42
            r15 = r43
            r19 = r45
            android.text.Layout r0 = m17737o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00b7:
            r15 = r0
            r0 = r46
            r0.f18496a = r15
            int r0 = r15.getWidth()
            r1 = r26
            int r0 = com.facebook.litho.C6277ft.m16837a(r1, r0)
            r14 = r28
            r14.f18535a = r0
            int r21 = com.facebook.p308a.p309a.p310a.C6017a.m15462a(r15)
            r15.getLineCount()
            android.text.TextPaint r0 = r15.getPaint()
            float r0 = r0.descent()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1 = r50
            r1.f18496a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r40)
            r13 = 2
            if (r0 != 0) goto L_0x01af
            int r12 = m17732j(r15)
            if (r12 < 0) goto L_0x01af
            r0 = r40
            boolean r1 = r0 instanceof android.text.Spannable
            if (r1 == 0) goto L_0x011a
            r1 = r0
            android.text.Spannable r1 = (android.text.Spannable) r1
            int r2 = r40.length()
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r3 = android.text.style.AbsoluteSizeSpan.class
            r11 = 0
            java.lang.Object[] r1 = r1.getSpans(r11, r2, r3)
            android.text.style.AbsoluteSizeSpan[] r1 = (android.text.style.AbsoluteSizeSpan[]) r1
            int r2 = r1.length
            r3 = 0
            r9 = 0
        L_0x0107:
            if (r9 >= r2) goto L_0x0116
            r4 = r1[r9]
            int r4 = r4.getSize()
            int r3 = java.lang.Math.max(r4, r3)
            int r9 = r9 + 1
            goto L_0x0107
        L_0x0116:
            r1 = r29
            r9 = r3
            goto L_0x011e
        L_0x011a:
            r11 = 0
            r1 = r29
            r9 = 0
        L_0x011e:
            boolean r2 = r1 instanceof android.text.Spannable
            if (r2 == 0) goto L_0x0149
            int r2 = r15.getLineStart(r12)
            int r3 = r15.getLineEnd(r12)
            android.text.Spannable r1 = (android.text.Spannable) r1
            int r3 = r3 - r2
            int r3 = r3 + 1
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r4 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r1 = r1.getSpans(r2, r3, r4)
            android.text.style.AbsoluteSizeSpan[] r1 = (android.text.style.AbsoluteSizeSpan[]) r1
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x013a:
            if (r3 >= r2) goto L_0x014a
            r5 = r1[r3]
            int r5 = r5.getSize()
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = r3 + 1
            goto L_0x013a
        L_0x0149:
            r4 = 0
        L_0x014a:
            if (r9 <= r4) goto L_0x01af
            if (r12 <= 0) goto L_0x015a
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r13]
            java.lang.String r2 = "1\n"
            r1[r11] = r2
            r1[r20] = r0
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r1)
        L_0x015a:
            r9 = r0
            int r0 = r15.getWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r16 = m17736n(r44)
            com.facebook.yoga.f r17 = r25.mo12886L()
            r0 = r24
            android.content.Context r2 = r0.f19009b
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r18 = r2
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r10 = r37
            r11 = r38
            r22 = r12
            r12 = r39
            r13 = r41
            r14 = r42
            r23 = r15
            r15 = r43
            r19 = r45
            android.text.Layout r0 = m17737o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r47
            r1.f18496a = r0
            r2 = r22
            r1 = r23
            int r0 = m17733k(r1, r2, r0)
            int r21 = r21 + r0
        L_0x01af:
            r1 = r27
            r0 = r21
            int r0 = com.facebook.litho.C6277ft.m16837a(r1, r0)
            r1 = r28
            r1.f18536b = r0
            int r2 = r1.f18535a
            if (r2 < 0) goto L_0x01c1
            if (r0 >= 0) goto L_0x01d8
        L_0x01c1:
            r3 = 0
            int r0 = java.lang.Math.max(r2, r3)
            r1.f18535a = r0
            int r0 = r1.f18536b
            int r0 = java.lang.Math.max(r0, r3)
            r1.f18536b = r0
            java.lang.String r0 = "TextSpec:WrongTextSize"
            java.lang.String r2 = "Text layout measured to less than 0 pixels"
            r3 = 2
            com.facebook.litho.C6106aq.m15891b(r3, r0, r2)
        L_0x01d8:
            int r0 = r1.f18535a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = r48
            r2.f18496a = r0
            int r0 = r1.f18536b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r49
            r1.f18496a = r0
            return
        L_0x01ed:
            r0 = r10
            r1 = r14
            r3 = 0
            r2 = 0
            r0.f18496a = r2
            r1.f18535a = r3
            r1.f18536b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.widget.C6525ec.m17729g(com.facebook.litho.u, com.facebook.litho.z, int, int, com.facebook.litho.fs, java.lang.CharSequence, android.text.TextUtils$TruncateAt, boolean, int, float, float, float, int, android.content.res.ColorStateList, int, int, java.lang.CharSequence, float, int, android.graphics.Typeface, int, int, com.facebook.litho.fa, com.facebook.litho.fa, com.facebook.litho.fa, com.facebook.litho.fa, com.facebook.litho.fa):void");
    }

    /* renamed from: h */
    static void m17730h(C6411u uVar, C6514ds dsVar, @C6118b(mo12872a = C6119c.COLOR) int i, @C6118b ColorStateList colorStateList, @C6118b boolean z, @C6118b C20906db dbVar, CharSequence charSequence, Layout layout, Float f, ClickableSpan[] clickableSpanArr, ImageSpan[] imageSpanArr) {
        float floatValue = f == null ? 0.0f : f.floatValue();
        String f2 = uVar.mo13470f();
        dsVar.f19338a = layout;
        dsVar.f19339c = floatValue;
        dsVar.f19340d = z;
        dsVar.f19342f = charSequence;
        if (dsVar.f19349m == null && clickableSpanArr != null) {
            int length = clickableSpanArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (clickableSpanArr[i2] instanceof C6434at) {
                    dsVar.f19349m = new Handler();
                    break;
                } else {
                    i2++;
                }
            }
        }
        dsVar.f19347k = null;
        dsVar.f19341e = clickableSpanArr != null && clickableSpanArr.length > 0;
        dsVar.f19345i = i;
        dsVar.f19351o = dbVar;
        if (colorStateList == null) {
            colorStateList = f19425a;
        }
        dsVar.f19343g = colorStateList;
        dsVar.f19344h = dsVar.f19343g.getDefaultColor();
        Layout layout2 = dsVar.f19338a;
        if (layout2 != null) {
            layout2.getPaint().setColor(dsVar.f19343g.getColorForState(dsVar.getState(), dsVar.f19344h));
        }
        dsVar.mo13591a(0, 0);
        if (imageSpanArr != null) {
            for (ImageSpan drawable : imageSpanArr) {
                Drawable drawable2 = drawable.getDrawable();
                drawable2.setCallback(dsVar);
                drawable2.setVisible(true, false);
            }
        }
        dsVar.f19346j = imageSpanArr;
        dsVar.f19350n = f2;
        C20906db dbVar2 = dsVar.f19351o;
        if (dbVar2 != null) {
            Layout layout3 = dsVar.f19338a;
            CharSequence charSequence2 = dsVar.f19342f;
            if (charSequence2 instanceof Spanned) {
                dbVar2.f58613a = (C20905da[]) ((Spanned) charSequence2).getSpans(0, charSequence2.length(), C20905da.class);
                for (C20905da c : dbVar2.f58613a) {
                    c.mo26043c(layout3, charSequence2);
                }
            }
        }
        dsVar.invalidateSelf();
        if (charSequence instanceof C6435au) {
            ((C6435au) charSequence).mo13515a();
        }
    }

    /* renamed from: i */
    static void m17731i(View view, C1991k kVar, @C6118b(mo12872a = C6119c.STRING) CharSequence charSequence) {
        if (C2043bi.m5575d(view) == 0) {
            C2043bi.m5551ae(view, 1);
        }
        CharSequence contentDescription = kVar.f5921a.getContentDescription();
        if (contentDescription != null) {
            charSequence = contentDescription;
        }
        kVar.f5921a.setText(charSequence);
        kVar.f5921a.setContentDescription(charSequence);
        kVar.f5921a.addAction(256);
        kVar.f5921a.addAction(512);
        kVar.f5921a.setMovementGranularities(11);
        kVar.f5921a.setMultiLine(true);
    }

    /* renamed from: j */
    private static int m17732j(Layout layout) {
        for (int i = 0; i < layout.getLineCount(); i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    private static int m17733k(Layout layout, int i, Layout layout2) {
        if (layout2 == null) {
            return 0;
        }
        Rect rect = new Rect();
        layout.getLineBounds(i, rect);
        Rect rect2 = new Rect();
        layout2.getLineBounds(layout2.getLineCount() - 1, rect2);
        return Math.max(0, rect2.height() - rect.height());
    }

    /* renamed from: l */
    private static C1956i m17734l(C1956i iVar, C6570f fVar) {
        if (iVar == null) {
            return fVar == C6570f.RTL ? C1963p.f5882d : C1963p.f5881c;
        }
        return iVar;
    }

    /* renamed from: m */
    private static void m17735m(SpannableString spannableString, CharSequence charSequence, Class cls) {
        Object[] spans = spannableString.getSpans(0, spannableString.length(), cls);
        int length = spannableString.length() - charSequence.length();
        for (Object obj : spans) {
            int spanStart = spannableString.getSpanStart(obj);
            int spanEnd = spannableString.getSpanEnd(obj);
            if (spanStart > 0 && spanStart < length && spanEnd >= length) {
                spannableString.removeSpan(obj);
                spannableString.setSpan(obj, spanStart, length, 0);
            }
        }
    }

    /* renamed from: n */
    private static int m17736n(int i) {
        if (i != 0) {
            return i;
        }
        return 1;
    }

    /* renamed from: o */
    private static Layout m17737o(C6411u uVar, int i, TextUtils.TruncateAt truncateAt, boolean z, int i2, float f, float f2, float f3, int i3, CharSequence charSequence, ColorStateList colorStateList, int i4, int i5, float f4, int i6, Typeface typeface, int i7, C6570f fVar, float f5, int i8) {
        int i9;
        C1956i iVar;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        boolean z2 = z;
        int i10 = i2;
        float f6 = f;
        float f7 = f2;
        float f8 = f3;
        int i11 = i3;
        CharSequence charSequence2 = charSequence;
        int i12 = i4;
        int i13 = i5;
        float f9 = f4;
        Typeface typeface2 = typeface;
        C6570f fVar2 = fVar;
        float f10 = f5;
        int i14 = i8;
        C6018b bVar = new C6018b();
        bVar.f17739g = false;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i9 = 2;
        } else if (mode == 0) {
            i9 = 0;
        } else if (mode == 1073741824) {
            i9 = 1;
        } else {
            throw new IllegalStateException("Unexpected size mode: " + View.MeasureSpec.getMode(i));
        }
        if (bVar.f17737e.f17715a.density != f10) {
            bVar.f17737e.mo12559a();
            bVar.f17737e.f17715a.density = f10;
            bVar.f17738f = null;
        }
        C6016a aVar = bVar.f17737e;
        if (aVar.f17727m != truncateAt2) {
            aVar.f17727m = truncateAt2;
            bVar.f17738f = null;
        }
        if (aVar.f17728n != i10) {
            aVar.f17728n = i10;
            bVar.f17738f = null;
        }
        aVar.mo12559a();
        C6016a aVar2 = bVar.f17737e;
        aVar2.f17718d = f6;
        aVar2.f17716b = f7;
        aVar2.f17717c = f8;
        aVar2.f17719e = i11;
        aVar2.f17715a.setShadowLayer(f6, f7, f8, i11);
        bVar.f17738f = null;
        if (charSequence2 != bVar.f17737e.f17722h) {
            if (charSequence2 instanceof SpannableStringBuilder) {
                try {
                    charSequence.hashCode();
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("The given text contains a null span. Due to an Android framework bug, this will cause an exception later down the line.", e);
                }
            }
            if (charSequence2 == null || !charSequence2.equals(bVar.f17737e.f17722h)) {
                bVar.f17737e.f17722h = charSequence2;
                bVar.f17738f = null;
            }
        }
        int size = View.MeasureSpec.getSize(i);
        C6016a aVar3 = bVar.f17737e;
        if (!(aVar3.f17720f == size && aVar3.f17721g == i9)) {
            aVar3.f17720f = size;
            aVar3.f17721g = i9;
            bVar.f17738f = null;
        }
        if (aVar3.f17726l != z2) {
            aVar3.f17726l = z2;
            bVar.f17738f = null;
        }
        if (aVar3.f17725k != f9) {
            aVar3.f17725k = f9;
            bVar.f17738f = null;
        }
        if (aVar3.f17724j != 1.0f) {
            aVar3.f17724j = 1.0f;
            bVar.f17738f = null;
        }
        if (aVar3.f17715a.linkColor != i12) {
            bVar.f17737e.mo12559a();
            bVar.f17737e.f17715a.linkColor = i12;
            bVar.f17738f = null;
        }
        C6016a aVar4 = bVar.f17737e;
        if (aVar4.f17731q != i14) {
            aVar4.f17731q = i14;
            bVar.f17738f = null;
        }
        int i15 = i5;
        if (i15 != -1) {
            bVar.mo12564d(i15);
        } else {
            bVar.mo12564d(uVar.f19013f.mo13258b(14.0f));
        }
        if (bVar.f17737e.f17715a.getLetterSpacing() != 0.0f) {
            bVar.f17737e.mo12559a();
            bVar.f17737e.f17715a.setLetterSpacing(0.0f);
            bVar.f17738f = null;
        }
        bVar.f17734b = 2;
        bVar.f17735c = Integer.MAX_VALUE;
        bVar.f17736d = 2;
        bVar.f17737e.mo12559a();
        C6016a aVar5 = bVar.f17737e;
        aVar5.f17723i = colorStateList;
        TextPaint textPaint = aVar5.f17715a;
        ColorStateList colorStateList2 = aVar5.f17723i;
        textPaint.setColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : -16777216);
        bVar.f17738f = null;
        Typeface typeface3 = typeface;
        if (!f19429e.equals(typeface3)) {
            bVar.mo12565e(typeface3);
        } else {
            bVar.mo12565e(Typeface.defaultFromStyle(i6));
        }
        C6570f fVar3 = fVar;
        boolean z3 = false;
        if (fVar3 == C6570f.RTL) {
            iVar = C1963p.f5882d;
        } else {
            iVar = C1963p.f5881c;
        }
        bVar.mo12563c(iVar);
        int i16 = i7 - 1;
        switch (C6524eb.f19422a[i16]) {
            case 3:
                if ((fVar3 == C6570f.RTL) == iVar.mo5116a(charSequence2, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 2:
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 4:
                if ((fVar3 == C6570f.RTL) != iVar.mo5116a(charSequence2, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 5:
                if (!iVar.mo5116a(charSequence2, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 6:
                if (!iVar.mo5116a(charSequence2, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 7:
                alignment = Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
        }
        bVar.mo12562b(alignment);
        C1956i l = m17734l(iVar, fVar3);
        bVar.mo12563c(l);
        switch (C6524eb.f19422a[i16]) {
            case 3:
                if (fVar3 == C6570f.RTL) {
                    z3 = true;
                }
                if (z3 == l.mo5116a(charSequence2, charSequence.length())) {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 2:
                alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 4:
                if (fVar3 == C6570f.RTL) {
                    z3 = true;
                }
                if (z3 != l.mo5116a(charSequence2, charSequence.length())) {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 5:
                if (!l.mo5116a(charSequence2, charSequence.length())) {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                } else {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                }
            case 6:
                if (!l.mo5116a(charSequence2, charSequence.length())) {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                    break;
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 7:
                alignment2 = Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                alignment2 = Layout.Alignment.ALIGN_NORMAL;
                break;
        }
        bVar.mo12562b(alignment2);
        return bVar.mo12561a();
    }

    /* renamed from: e */
    static void m17727e(C6514ds dsVar, @C6118b(mo12872a = C6119c.STRING) CharSequence charSequence) {
        C20905da[] daVarArr;
        dsVar.f19338a = null;
        dsVar.f19339c = 0.0f;
        dsVar.f19342f = null;
        dsVar.f19341e = false;
        dsVar.f19345i = 0;
        dsVar.f19347k = null;
        dsVar.f19343g = null;
        dsVar.f19344h = 0;
        C20906db dbVar = dsVar.f19351o;
        if (!(dbVar == null || (daVarArr = dbVar.f58613a) == null)) {
            for (C20905da d : daVarArr) {
                d.mo26044d();
            }
            dbVar.f58613a = null;
        }
        dsVar.f19351o = null;
        ImageSpan[] imageSpanArr = dsVar.f19346j;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i = 0; i < length; i++) {
                Drawable drawable = dsVar.f19346j[i].getDrawable();
                drawable.setCallback((Drawable.Callback) null);
                drawable.setVisible(false, false);
            }
            dsVar.f19346j = null;
        }
        if (charSequence instanceof C6435au) {
            ((C6435au) charSequence).mo13516b();
        }
    }
}
