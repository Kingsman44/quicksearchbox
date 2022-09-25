package com.facebook.p313c.p317d;

import android.graphics.Rect;
import com.facebook.p313c.C6060s;

/* renamed from: com.facebook.c.d.a */
/* compiled from: PG */
public final class C6038a {
    /* renamed from: a */
    public static void m15529a(C6060s sVar, Object obj, boolean z) {
        m15530b(sVar.f17829d, sVar.f17830e, obj, z);
    }

    /* renamed from: b */
    public static void m15530b(Rect rect, Rect rect2, Object obj, boolean z) {
        m15531c(rect.left, rect.top, rect.right, rect.bottom, rect2, obj, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r11 == false) goto L_0x0038;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15531c(int r5, int r6, int r7, int r8, android.graphics.Rect r9, java.lang.Object r10, boolean r11) {
        /*
            boolean r0 = r10 instanceof android.view.View
            if (r0 == 0) goto L_0x0056
            android.view.View r10 = (android.view.View) r10
            int r0 = r7 - r5
            int r1 = r8 - r6
            if (r9 == 0) goto L_0x001b
            boolean r2 = r10 instanceof com.facebook.p313c.C6040e
            if (r2 != 0) goto L_0x001b
            int r2 = r9.left
            int r3 = r9.top
            int r4 = r9.right
            int r9 = r9.bottom
            r10.setPadding(r2, r3, r4, r9)
        L_0x001b:
            if (r11 != 0) goto L_0x0029
            int r9 = r10.getMeasuredHeight()
            if (r9 != r1) goto L_0x0029
            int r9 = r10.getMeasuredWidth()
            if (r9 == r0) goto L_0x0038
        L_0x0029:
            r9 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r9)
            r10.measure(r0, r9)
            if (r11 != 0) goto L_0x0052
        L_0x0038:
            int r9 = r10.getLeft()
            if (r9 != r5) goto L_0x0052
            int r9 = r10.getTop()
            if (r9 != r6) goto L_0x0052
            int r9 = r10.getRight()
            if (r9 != r7) goto L_0x0052
            int r9 = r10.getBottom()
            if (r9 == r8) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            return
        L_0x0052:
            r10.layout(r5, r6, r7, r8)
            return
        L_0x0056:
            boolean r11 = r10 instanceof android.graphics.drawable.Drawable
            if (r11 == 0) goto L_0x006e
            if (r9 == 0) goto L_0x0068
            int r11 = r9.left
            int r5 = r5 + r11
            int r11 = r9.top
            int r6 = r6 + r11
            int r11 = r9.right
            int r7 = r7 - r11
            int r9 = r9.bottom
            int r8 = r8 - r9
        L_0x0068:
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            r10.setBounds(r5, r6, r7, r8)
            return
        L_0x006e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = java.lang.String.valueOf(r10)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Unsupported mounted content "
            java.lang.String r6 = r7.concat(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p313c.p317d.C6038a.m15531c(int, int, int, int, android.graphics.Rect, java.lang.Object, boolean):void");
    }
}
