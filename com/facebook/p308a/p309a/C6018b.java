package com.facebook.p308a.p309a;

import android.graphics.Typeface;
import android.text.Layout;
import androidx.core.p096h.C1956i;
import androidx.p060c.C0983m;

/* renamed from: com.facebook.a.a.b */
/* compiled from: PG */
public final class C6018b {

    /* renamed from: a */
    static final C0983m f17733a = new C0983m(100);

    /* renamed from: b */
    public int f17734b = 2;

    /* renamed from: c */
    public int f17735c = Integer.MAX_VALUE;

    /* renamed from: d */
    public int f17736d = 2;

    /* renamed from: e */
    public final C6016a f17737e = new C6016a();

    /* renamed from: f */
    public Layout f17738f = null;

    /* renamed from: g */
    public boolean f17739g = true;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[SYNTHETIC, Splitter:B:25:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7 A[LOOP:0: B:47:0x00d7->B:70:0x015c, LOOP_START, SYNTHETIC, Splitter:B:47:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0172  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Layout mo12561a() {
        /*
            r17 = this;
            r1 = r17
            boolean r0 = r1.f17739g
            if (r0 == 0) goto L_0x000c
            android.text.Layout r0 = r1.f17738f
            if (r0 != 0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            return r0
        L_0x000c:
            com.facebook.a.a.a r0 = r1.f17737e
            java.lang.CharSequence r0 = r0.f17722h
            r2 = 0
            if (r0 == 0) goto L_0x01a2
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001b
            goto L_0x01a2
        L_0x001b:
            boolean r0 = r1.f17739g
            r3 = -1
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x003f
            com.facebook.a.a.a r0 = r1.f17737e
            java.lang.CharSequence r0 = r0.f17722h
            boolean r6 = r0 instanceof android.text.Spannable
            if (r6 == 0) goto L_0x003f
            r6 = r0
            android.text.Spannable r6 = (android.text.Spannable) r6
            int r0 = r0.length()
            int r0 = r0 + r3
            java.lang.Class<android.text.style.ClickableSpan> r7 = android.text.style.ClickableSpan.class
            java.lang.Object[] r0 = r6.getSpans(r5, r0, r7)
            android.text.style.ClickableSpan[] r0 = (android.text.style.ClickableSpan[]) r0
            int r0 = r0.length
            if (r0 <= 0) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            boolean r0 = r1.f17739g
            if (r0 == 0) goto L_0x005c
            if (r6 != 0) goto L_0x005c
            com.facebook.a.a.a r0 = r1.f17737e
            int r3 = r0.hashCode()
            androidx.c.m r0 = f17733a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.mo3690d(r7)
            android.text.Layout r0 = (android.text.Layout) r0
            if (r0 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            return r0
        L_0x005c:
            com.facebook.a.a.a r0 = r1.f17737e
            int r7 = r0.f17728n
            if (r7 != r4) goto L_0x006f
            java.lang.CharSequence r7 = r0.f17722h     // Catch:{ NullPointerException -> 0x006d }
            android.text.TextPaint r0 = r0.f17715a     // Catch:{ NullPointerException -> 0x006d }
            android.text.BoringLayout$Metrics r0 = android.text.BoringLayout.isBoring(r7, r0)     // Catch:{ NullPointerException -> 0x006d }
            r13 = r0
            r7 = 1
            goto L_0x0070
        L_0x006d:
            r0 = move-exception
            throw r0
        L_0x006f:
            r13 = r2
        L_0x0070:
            com.facebook.a.a.a r0 = r1.f17737e
            int r8 = r0.f17721g
            if (r8 == 0) goto L_0x0092
            if (r8 == r4) goto L_0x008f
            java.lang.CharSequence r8 = r0.f17722h
            android.text.TextPaint r0 = r0.f17715a
            float r0 = android.text.Layout.getDesiredWidth(r8, r0)
            double r8 = (double) r0
            double r8 = java.lang.Math.ceil(r8)
            int r0 = (int) r8
            com.facebook.a.a.a r8 = r1.f17737e
            int r8 = r8.f17720f
            int r0 = java.lang.Math.min(r0, r8)
            goto L_0x00a0
        L_0x008f:
            int r0 = r0.f17720f
            goto L_0x00a0
        L_0x0092:
            java.lang.CharSequence r8 = r0.f17722h
            android.text.TextPaint r0 = r0.f17715a
            float r0 = android.text.Layout.getDesiredWidth(r8, r0)
            double r8 = (double) r0
            double r8 = java.lang.Math.ceil(r8)
            int r0 = (int) r8
        L_0x00a0:
            com.facebook.a.a.a r8 = r1.f17737e
            android.text.TextPaint r9 = r8.f17715a
            int r9 = r9.getFontMetricsInt(r2)
            float r9 = (float) r9
            float r10 = r8.f17724j
            float r9 = r9 * r10
            float r8 = r8.f17725k
            float r9 = r9 + r8
            int r8 = java.lang.Math.round(r9)
            int r9 = r1.f17736d
            if (r9 != r4) goto L_0x00c1
            int r9 = r1.f17735c
            int r9 = r9 * r8
            int r0 = java.lang.Math.min(r0, r9)
            goto L_0x00c7
        L_0x00c1:
            int r8 = r1.f17735c
            int r0 = java.lang.Math.min(r0, r8)
        L_0x00c7:
            int r8 = r1.f17734b
            if (r8 != r4) goto L_0x00d0
            int r0 = java.lang.Math.max(r0, r5)
            goto L_0x00d4
        L_0x00d0:
            int r0 = java.lang.Math.max(r0, r5)
        L_0x00d4:
            r15 = r0
            if (r13 != 0) goto L_0x0172
        L_0x00d7:
            com.facebook.a.a.a r0 = r1.f17737e     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            java.lang.CharSequence r0 = r0.f17722h     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            int r8 = r0.length()     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            com.facebook.a.a.a r9 = r1.f17737e     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.TextPaint r10 = r9.f17715a     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.Layout$Alignment r11 = r9.f17729o     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            float r12 = r9.f17724j     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            float r13 = r9.f17725k     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            boolean r14 = r9.f17726l     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.TextUtils$TruncateAt r4 = r9.f17727m     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            androidx.core.h.i r2 = r9.f17730p     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            int r9 = r9.f17731q     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r0, r5, r8, r10, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.StaticLayout$Builder r0 = r0.setAlignment(r11)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.StaticLayout$Builder r0 = r0.setLineSpacing(r13, r12)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.StaticLayout$Builder r0 = r0.setIncludePad(r14)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.StaticLayout$Builder r0 = r0.setEllipsize(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.StaticLayout$Builder r0 = r0.setEllipsizedWidth(r15)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.StaticLayout$Builder r0 = r0.setMaxLines(r7)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            androidx.core.h.i r4 = androidx.core.p096h.C1963p.f5879a     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            if (r2 != r4) goto L_0x0114
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.LTR     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            goto L_0x0136
        L_0x0114:
            androidx.core.h.i r4 = androidx.core.p096h.C1963p.f5880b     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            if (r2 != r4) goto L_0x011b
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.RTL     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            goto L_0x0136
        L_0x011b:
            androidx.core.h.i r4 = androidx.core.p096h.C1963p.f5881c     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            if (r2 != r4) goto L_0x0122
        L_0x011f:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            goto L_0x0136
        L_0x0122:
            androidx.core.h.i r4 = androidx.core.p096h.C1963p.f5882d     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            if (r2 != r4) goto L_0x0129
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            goto L_0x0136
        L_0x0129:
            androidx.core.h.i r4 = androidx.core.p096h.C1963p.f5883e     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            if (r2 != r4) goto L_0x0130
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.ANYRTL_LTR     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            goto L_0x0136
        L_0x0130:
            androidx.core.h.i r4 = androidx.core.p096h.C1963p.f5884f     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            if (r2 != r4) goto L_0x011f
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.LOCALE     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
        L_0x0136:
            android.text.StaticLayout$Builder r0 = r0.setTextDirection(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.StaticLayout$Builder r0 = r0.setBreakStrategy(r9)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.StaticLayout$Builder r0 = r0.setHyphenationFrequency(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            r2 = 0
            android.text.StaticLayout$Builder r0 = r0.setIndents(r2, r2)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            r0.setJustificationMode(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            r2 = 1
            r0.setUseLineSpacingFromFallbacks(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            android.text.StaticLayout r0 = r0.build()     // Catch:{ IndexOutOfBoundsException -> 0x0153 }
            goto L_0x018b
        L_0x0153:
            r0 = move-exception
            com.facebook.a.a.a r2 = r1.f17737e
            java.lang.CharSequence r2 = r2.f17722h
            boolean r2 = r2 instanceof java.lang.String
            if (r2 != 0) goto L_0x0171
            java.lang.String r2 = "TextLayoutBuilder"
            java.lang.String r4 = "Hit bug #35412, retrying with Spannables removed"
            android.util.Log.e(r2, r4, r0)
            com.facebook.a.a.a r0 = r1.f17737e
            java.lang.CharSequence r2 = r0.f17722h
            java.lang.String r2 = r2.toString()
            r0.f17722h = r2
            r2 = 0
            r4 = 1
            goto L_0x00d7
        L_0x0171:
            throw r0
        L_0x0172:
            com.facebook.a.a.a r0 = r1.f17737e
            java.lang.CharSequence r7 = r0.f17722h
            android.text.TextPaint r8 = r0.f17715a
            android.text.Layout$Alignment r10 = r0.f17729o
            float r11 = r0.f17724j
            float r12 = r0.f17725k
            boolean r14 = r0.f17726l
            android.text.TextUtils$TruncateAt r0 = r0.f17727m
            r9 = r15
            r2 = r15
            r15 = r0
            r16 = r2
            android.text.BoringLayout r0 = android.text.BoringLayout.make(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x018b:
            boolean r2 = r1.f17739g
            if (r2 == 0) goto L_0x019c
            if (r6 != 0) goto L_0x019c
            r1.f17738f = r0
            androidx.c.m r2 = f17733a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo3691e(r3, r0)
        L_0x019c:
            com.facebook.a.a.a r2 = r1.f17737e
            r3 = 1
            r2.f17732r = r3
            return r0
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p308a.p309a.C6018b.mo12561a():android.text.Layout");
    }

    /* renamed from: b */
    public final void mo12562b(Layout.Alignment alignment) {
        C6016a aVar = this.f17737e;
        if (aVar.f17729o != alignment) {
            aVar.f17729o = alignment;
            this.f17738f = null;
        }
    }

    /* renamed from: c */
    public final void mo12563c(C1956i iVar) {
        C6016a aVar = this.f17737e;
        if (aVar.f17730p != iVar) {
            aVar.f17730p = iVar;
            this.f17738f = null;
        }
    }

    /* renamed from: d */
    public final void mo12564d(int i) {
        float f = (float) i;
        if (this.f17737e.f17715a.getTextSize() != f) {
            this.f17737e.mo12559a();
            this.f17737e.f17715a.setTextSize(f);
            this.f17738f = null;
        }
    }

    /* renamed from: e */
    public final void mo12565e(Typeface typeface) {
        if (this.f17737e.f17715a.getTypeface() != typeface) {
            this.f17737e.mo12559a();
            this.f17737e.f17715a.setTypeface(typeface);
            this.f17738f = null;
        }
    }
}
