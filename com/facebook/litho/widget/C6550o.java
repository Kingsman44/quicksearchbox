package com.facebook.litho.widget;

import android.graphics.PointF;
import android.support.p033v7.widget.C0603ds;
import android.support.p033v7.widget.C0624em;
import android.support.p033v7.widget.C0625en;
import android.support.p033v7.widget.C0626eo;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0668gc;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;

/* renamed from: com.facebook.litho.widget.o */
/* compiled from: PG */
public final class C6550o extends C0603ds {

    /* renamed from: b */
    private static int f19514b = Integer.MAX_VALUE;

    public C6550o(int i) {
        f19514b = i;
    }

    /* renamed from: j */
    private final int m17841j(C0653fo foVar, C0626eo eoVar, int i, int i2) {
        int max;
        int[] i3 = mo3199i(i, i2);
        int childCount = foVar.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            View view2 = null;
            int i4 = Integer.MAX_VALUE;
            int i5 = LinearLayoutManager.INVALID_OFFSET;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = foVar.getChildAt(i6);
                int position = foVar.getPosition(childAt);
                if (position != -1) {
                    int i7 = position < i4 ? position : i4;
                    if (position < i4) {
                        view = childAt;
                    }
                    if (position > i5) {
                        view2 = childAt;
                        i5 = position;
                    }
                    i4 = i7;
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(eoVar.mo2838a(view), eoVar.mo2838a(view2)) - Math.min(eoVar.mo2841d(view), eoVar.mo2841d(view2))) == 0)) {
                f = ((float) max) / ((float) ((i5 - i4) + 1));
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(i3[0]) > Math.abs(i3[1]) ? i3[0] : i3[1])) / f);
    }

    /* renamed from: a */
    public final int mo2802a(C0653fo foVar, int i, int i2) {
        int itemCount;
        View b;
        int position;
        int i3;
        PointF computeScrollVectorForPosition;
        int i4;
        int i5;
        if (!(foVar instanceof C0668gc) || (itemCount = foVar.getItemCount()) == 0 || (b = mo2803b(foVar)) == null || (position = foVar.getPosition(b)) == -1 || (computeScrollVectorForPosition = ((C0668gc) foVar).computeScrollVectorForPosition(i3)) == null) {
            return -1;
        }
        int i6 = 0;
        if (foVar.canScrollHorizontally()) {
            i4 = m17841j(foVar, new C0624em(foVar), i, 0);
            int i7 = f19514b;
            if (i4 > i7) {
                i4 = i7;
            }
            int i8 = -i7;
            if (i4 < i8) {
                i4 = i8;
            }
            if (computeScrollVectorForPosition.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (foVar.canScrollVertically()) {
            i5 = m17841j(foVar, new C0625en(foVar), 0, i2);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (true == foVar.canScrollVertically()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i9 = position + i4;
        if (i9 >= 0) {
            i6 = i9;
        }
        return i6 >= itemCount ? itemCount - 1 : i6;
    }
}
