package com.google.android.apps.gsa.staticplugins.actionsui.modularanswer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* compiled from: PG */
public class EllipsizeLayout extends LinearLayout {
    public EllipsizeLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            int r0 = r17.getOrientation()
            if (r0 != 0) goto L_0x00a7
            int r0 = android.view.View.MeasureSpec.getMode(r18)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L_0x00a7
            int r0 = r17.getChildCount()
            int r1 = android.view.View.MeasureSpec.getSize(r18)
            int r2 = android.view.View.MeasureSpec.getSize(r18)
            r3 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            r4 = 0
            r5 = 0
            r10 = 0
            r11 = 0
        L_0x0023:
            r12 = 1
            if (r10 >= r0) goto L_0x0088
            if (r5 != 0) goto L_0x0088
            r13 = r17
            android.view.View r14 = r13.getChildAt(r10)
            if (r14 == 0) goto L_0x0085
            int r6 = r14.getVisibility()
            r7 = 8
            if (r6 == r7) goto L_0x0085
            boolean r6 = r14 instanceof android.widget.TextView
            if (r6 == 0) goto L_0x0055
            r6 = r14
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.text.TextUtils$TruncateAt r7 = r6.getEllipsize()
            if (r7 == 0) goto L_0x0055
            if (r4 != 0) goto L_0x0051
            r4 = 2147483647(0x7fffffff, float:NaN)
            r6.setMaxWidth(r4)
            r16 = r5
            r15 = r6
            goto L_0x0058
        L_0x0051:
            r15 = r4
            r16 = 1
            goto L_0x0058
        L_0x0055:
            r15 = r4
            r16 = r5
        L_0x0058:
            r7 = 0
            r9 = 0
            r4 = r17
            r5 = r14
            r6 = r2
            r8 = r19
            r4.measureChildWithMargins(r5, r6, r7, r8, r9)
            android.view.ViewGroup$LayoutParams r4 = r14.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            if (r4 == 0) goto L_0x0083
            float r5 = r4.weight
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r12 = 0
        L_0x0074:
            r5 = r16 | r12
            int r6 = r14.getMeasuredWidth()
            int r7 = r4.leftMargin
            int r6 = r6 + r7
            int r4 = r4.rightMargin
            int r6 = r6 + r4
            int r11 = r11 + r6
            r4 = r15
            goto L_0x0085
        L_0x0083:
            r4 = r15
            r5 = 1
        L_0x0085:
            int r10 = r10 + 1
            goto L_0x0023
        L_0x0088:
            r13 = r17
            if (r4 == 0) goto L_0x0091
            if (r11 != 0) goto L_0x0090
            r11 = 0
            goto L_0x0091
        L_0x0090:
            r12 = 0
        L_0x0091:
            r0 = r5 | r12
            if (r4 == 0) goto L_0x00a9
            if (r0 != 0) goto L_0x00a9
            if (r11 <= r1) goto L_0x00a9
            int r0 = r4.getMeasuredWidth()
            int r11 = r11 - r1
            int r0 = r0 - r11
            if (r0 >= 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r3 = r0
        L_0x00a3:
            r4.setMaxWidth(r3)
            goto L_0x00a9
        L_0x00a7:
            r13 = r17
        L_0x00a9:
            super.onMeasure(r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modularanswer.EllipsizeLayout.onMeasure(int, int):void");
    }

    public EllipsizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
