package android.support.p033v7.widget;

import android.graphics.PointF;
import android.view.View;

/* renamed from: android.support.v7.widget.ds */
/* compiled from: PG */
public class C0603ds extends C0710hr {

    /* renamed from: b */
    private C0626eo f2341b;

    /* renamed from: c */
    private C0626eo f2342c;

    /* renamed from: j */
    private int m2161j(C0653fo foVar, C0626eo eoVar, int i, int i2) {
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

    /* renamed from: k */
    private final C0626eo m2162k(C0653fo foVar) {
        C0626eo eoVar = this.f2342c;
        if (eoVar == null || eoVar.f2386a != foVar) {
            this.f2342c = new C0624em(foVar);
        }
        return this.f2342c;
    }

    /* renamed from: l */
    private C0626eo m2163l(C0653fo foVar) {
        C0626eo eoVar = this.f2341b;
        if (eoVar == null || eoVar.f2386a != foVar) {
            this.f2341b = new C0625en(foVar);
        }
        return this.f2341b;
    }

    /* renamed from: m */
    private static final int m2164m(View view, C0626eo eoVar) {
        return (eoVar.mo2841d(view) + (eoVar.mo2839b(view) / 2)) - (eoVar.mo2847j() + (eoVar.mo2848k() / 2));
    }

    /* renamed from: n */
    private static final View m2165n(C0653fo foVar, C0626eo eoVar) {
        int childCount = foVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int j = eoVar.mo2847j() + (eoVar.mo2848k() / 2);
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = foVar.getChildAt(i2);
            int abs = Math.abs((eoVar.mo2841d(childAt) + (eoVar.mo2839b(childAt) / 2)) - j);
            int i3 = abs < i ? abs : i;
            if (abs < i) {
                view = childAt;
            }
            i2++;
            i = i3;
        }
        return view;
    }

    /* renamed from: a */
    public int mo2802a(C0653fo foVar, int i, int i2) {
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
            i4 = m2161j(foVar, m2162k(foVar), i, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (foVar.canScrollVertically()) {
            i5 = m2161j(foVar, m2163l(foVar), 0, i2);
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
        int i7 = position + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= itemCount ? itemCount - 1 : i6;
    }

    /* renamed from: b */
    public View mo2803b(C0653fo foVar) {
        if (foVar.canScrollVertically()) {
            return m2165n(foVar, m2163l(foVar));
        }
        if (foVar.canScrollHorizontally()) {
            return m2165n(foVar, m2162k(foVar));
        }
        return null;
    }

    /* renamed from: c */
    public int[] mo2804c(C0653fo foVar, View view) {
        int[] iArr = new int[2];
        if (foVar.canScrollHorizontally()) {
            iArr[0] = m2164m(view, m2162k(foVar));
        } else {
            iArr[0] = 0;
        }
        if (foVar.canScrollVertically()) {
            iArr[1] = m2164m(view, m2163l(foVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
