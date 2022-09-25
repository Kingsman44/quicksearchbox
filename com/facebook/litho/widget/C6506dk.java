package com.facebook.litho.widget;

import android.graphics.PointF;
import android.support.p033v7.widget.C0602dr;
import android.support.p033v7.widget.C0624em;
import android.support.p033v7.widget.C0625en;
import android.support.p033v7.widget.C0626eo;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0668gc;
import android.support.p033v7.widget.C0710hr;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: com.facebook.litho.widget.dk */
/* compiled from: PG */
public final class C6506dk extends C0710hr {

    /* renamed from: b */
    public RecyclerView f19284b;

    /* renamed from: c */
    private C0626eo f19285c;

    /* renamed from: d */
    private C0626eo f19286d;

    /* renamed from: e */
    private C0653fo f19287e;

    /* renamed from: f */
    private C0653fo f19288f;

    /* renamed from: g */
    private final int f19289g;

    public C6506dk(int i) {
        this.f19289g = i;
    }

    /* renamed from: j */
    private final C0626eo m17635j(C0653fo foVar) {
        if (this.f19286d == null || this.f19288f != foVar) {
            this.f19286d = new C0624em(foVar);
            this.f19288f = foVar;
        }
        return this.f19286d;
    }

    /* renamed from: k */
    private final C0626eo m17636k(C0653fo foVar) {
        if (this.f19285c == null || this.f19287e != foVar) {
            this.f19285c = new C0625en(foVar);
            this.f19287e = foVar;
        }
        return this.f19285c;
    }

    /* renamed from: l */
    private static View m17637l(C0653fo foVar, C0626eo eoVar) {
        int childCount = foVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int j = eoVar.mo2847j();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = foVar.getChildAt(i2);
            int abs = Math.abs(eoVar.mo2841d(childAt) - j);
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
    public final int mo2802a(C0653fo foVar, int i, int i2) {
        int position;
        PointF computeScrollVectorForPosition;
        C0653fo foVar2 = foVar;
        int itemCount = foVar.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        boolean canScrollHorizontally = foVar.canScrollHorizontally();
        C0626eo j = canScrollHorizontally ? m17635j(foVar) : m17636k(foVar);
        int childCount = foVar.getChildCount();
        View view = null;
        int i3 = 0;
        if (childCount != 0) {
            int j2 = j.mo2847j();
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = foVar2.getChildAt(i5);
                int d = j.mo2841d(childAt);
                int abs = Math.abs(d - j2);
                if (d < j2 && abs < i4) {
                    view = childAt;
                    i4 = abs;
                }
            }
        }
        if (view == null || (position = foVar2.getPosition(view)) == -1) {
            return -1;
        }
        boolean z = true;
        boolean z2 = !canScrollHorizontally ? i2 > 0 : i > 0;
        if (!(foVar2 instanceof C0668gc) || (computeScrollVectorForPosition = ((C0668gc) foVar2).computeScrollVectorForPosition(itemCount - 1)) == null || (computeScrollVectorForPosition.x >= 0.0f && computeScrollVectorForPosition.y >= 0.0f)) {
            z = false;
        }
        if (z2) {
            int i6 = this.f19289g;
            position = z ? position - i6 : position + i6;
        }
        if (position >= 0) {
            i3 = position;
        }
        return i3 >= itemCount ? itemCount - 1 : i3;
    }

    /* renamed from: b */
    public final View mo2803b(C0653fo foVar) {
        if (foVar.canScrollVertically()) {
            return m17637l(foVar, m17636k(foVar));
        }
        if (foVar.canScrollHorizontally()) {
            return m17637l(foVar, m17635j(foVar));
        }
        return null;
    }

    /* renamed from: c */
    public final int[] mo2804c(C0653fo foVar, View view) {
        int[] iArr = new int[2];
        if (foVar.canScrollHorizontally()) {
            C0626eo j = m17635j(foVar);
            iArr[0] = j.mo2841d(view) - ((C0624em) j).f2386a.getPaddingLeft();
        } else {
            iArr[0] = 0;
        }
        if (foVar.canScrollVertically()) {
            C0626eo k = m17636k(foVar);
            iArr[1] = k.mo2841d(view) - ((C0625en) k).f2386a.getPaddingTop();
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C0602dr mo3196f(C0653fo foVar) {
        if (!(foVar instanceof C0668gc)) {
            return null;
        }
        return new C6505dj(this, this.f19284b.getContext());
    }

    /* renamed from: g */
    public final void mo3197g(RecyclerView recyclerView) {
        this.f19284b = recyclerView;
        super.mo3197g(recyclerView);
    }
}
