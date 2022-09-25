package android.support.p033v7.widget;

import android.graphics.PointF;
import android.view.View;

/* renamed from: android.support.v7.widget.eq */
/* compiled from: PG */
public class C0628eq extends C0710hr {

    /* renamed from: b */
    private C0626eo f2390b;

    /* renamed from: c */
    private C0626eo f2391c;

    /* renamed from: j */
    private final C0626eo m2251j(C0653fo foVar) {
        C0626eo eoVar = this.f2391c;
        if (eoVar == null || eoVar.f2386a != foVar) {
            this.f2391c = new C0624em(foVar);
        }
        return this.f2391c;
    }

    /* renamed from: k */
    private final C0626eo m2252k(C0653fo foVar) {
        C0626eo eoVar = this.f2390b;
        if (eoVar == null || eoVar.f2386a != foVar) {
            this.f2390b = new C0625en(foVar);
        }
        return this.f2390b;
    }

    /* renamed from: l */
    private static final int m2253l(View view, C0626eo eoVar) {
        return (eoVar.mo2841d(view) + (eoVar.mo2839b(view) / 2)) - (eoVar.mo2847j() + (eoVar.mo2848k() / 2));
    }

    /* renamed from: m */
    private static final View m2254m(C0653fo foVar, C0626eo eoVar) {
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
        C0626eo eoVar;
        PointF computeScrollVectorForPosition;
        int itemCount = foVar.getItemCount();
        if (itemCount != 0) {
            View view = null;
            if (foVar.canScrollVertically()) {
                eoVar = m2252k(foVar);
            } else {
                eoVar = foVar.canScrollHorizontally() ? m2251j(foVar) : null;
            }
            if (eoVar == null) {
                return -1;
            }
            int childCount = foVar.getChildCount();
            boolean z = false;
            View view2 = null;
            int i3 = LinearLayoutManager.INVALID_OFFSET;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = foVar.getChildAt(i5);
                if (childAt != null) {
                    int l = m2253l(childAt, eoVar);
                    if (l <= 0 && l > i3) {
                        view2 = childAt;
                        i3 = l;
                    }
                    if (l >= 0 && l < i4) {
                        view = childAt;
                        i4 = l;
                    }
                }
            }
            int i6 = 1;
            boolean z2 = !foVar.canScrollHorizontally() ? i2 > 0 : i > 0;
            if (z2 && view != null) {
                return foVar.getPosition(view);
            }
            if (!z2 && view2 != null) {
                return foVar.getPosition(view2);
            }
            if (true == z2) {
                view = view2;
            }
            if (view == null) {
                return -1;
            }
            int position = foVar.getPosition(view);
            int itemCount2 = foVar.getItemCount();
            if ((foVar instanceof C0668gc) && (computeScrollVectorForPosition = ((C0668gc) foVar).computeScrollVectorForPosition(itemCount2 - 1)) != null && (computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f)) {
                z = true;
            }
            if (z == z2) {
                i6 = -1;
            }
            int i7 = position + i6;
            if (i7 < 0 || i7 >= itemCount) {
                return -1;
            }
            return i7;
        }
        return -1;
    }

    /* renamed from: b */
    public View mo2803b(C0653fo foVar) {
        if (foVar.canScrollVertically()) {
            return m2254m(foVar, m2252k(foVar));
        }
        if (foVar.canScrollHorizontally()) {
            return m2254m(foVar, m2251j(foVar));
        }
        return null;
    }

    /* renamed from: c */
    public final int[] mo2804c(C0653fo foVar, View view) {
        int[] iArr = new int[2];
        if (foVar.canScrollHorizontally()) {
            iArr[0] = m2253l(view, m2251j(foVar));
        } else {
            iArr[0] = 0;
        }
        if (foVar.canScrollVertically()) {
            iArr[1] = m2253l(view, m2252k(foVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C0669gd mo2853d(C0653fo foVar) {
        if (!(foVar instanceof C0668gc)) {
            return null;
        }
        return new C0627ep(this, this.f2542a.getContext());
    }
}
