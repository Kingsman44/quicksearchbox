package com.google.android.libraries.lens.view.infopanel.bottomsheet;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p092d.C1886a;
import androidx.customview.p103b.C2149g;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bottomsheet.c */
/* compiled from: PG */
final class C27056c extends C2149g {

    /* renamed from: a */
    final /* synthetic */ LensResultPanelBottomsheetBehavior f73775a;

    public C27056c(LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior) {
        this.f73775a = lensResultPanelBottomsheetBehavior;
    }

    /* renamed from: a */
    public final int mo5392a(View view, int i, int i2) {
        LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior = this.f73775a;
        return C1886a.m5145c(i, lensResultPanelBottomsheetBehavior.f73750h ? lensResultPanelBottomsheetBehavior.f73746d : lensResultPanelBottomsheetBehavior.f73747e, lensResultPanelBottomsheetBehavior.f73752j ? lensResultPanelBottomsheetBehavior.f73755m : lensResultPanelBottomsheetBehavior.f73751i);
    }

    /* renamed from: b */
    public final int mo5393b(int i) {
        LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior = this.f73775a;
        C26244b bVar = lensResultPanelBottomsheetBehavior.f73763u;
        if (bVar == null || !lensResultPanelBottomsheetBehavior.f73764v || !bVar.mo31462g(C26239a.ONELRP_REMOVE_CUSTOM_SCROLLING)) {
            return i;
        }
        LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior2 = this.f73775a;
        if (lensResultPanelBottomsheetBehavior2.f73757o == null) {
            return i;
        }
        CoordinatorLayout coordinatorLayout = lensResultPanelBottomsheetBehavior2.f73758p;
        coordinatorLayout.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = -1;
        for (int i3 = 0; i3 < coordinatorLayout.getChildCount(); i3++) {
            View childAt = coordinatorLayout.getChildAt(i3);
            arrayList.add(childAt);
            WeakReference weakReference = this.f73775a.f73757o;
            weakReference.getClass();
            if (childAt == weakReference.get()) {
                i2 = i3;
            }
        }
        if (i2 >= 0) {
            arrayList.add((View) arrayList.remove(i2));
        }
        return arrayList.indexOf(coordinatorLayout.getChildAt(i));
    }

    /* renamed from: d */
    public final int mo5395d(View view) {
        LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior = this.f73775a;
        return lensResultPanelBottomsheetBehavior.f73752j ? lensResultPanelBottomsheetBehavior.f73755m : lensResultPanelBottomsheetBehavior.f73751i;
    }

    /* renamed from: g */
    public final void mo5398g(int i) {
        C58974d dVar = LensResultPanelBottomsheetBehavior.f73737a;
        if (i == 1) {
            this.f73775a.mo32504z(1);
        }
    }

    /* renamed from: h */
    public final void mo5399h(View view, float f, float f2) {
        int i;
        int i2;
        int i3 = 3;
        if (f2 < 0.0f) {
            int top = view.getTop();
            LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior = this.f73775a;
            if (!lensResultPanelBottomsheetBehavior.f73750h || top > lensResultPanelBottomsheetBehavior.f73747e) {
                i = lensResultPanelBottomsheetBehavior.f73747e;
            } else {
                i = lensResultPanelBottomsheetBehavior.f73746d;
                this.f73775a.mo32497B(view, i3, i, true);
            }
        } else {
            LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior2 = this.f73775a;
            if (!lensResultPanelBottomsheetBehavior2.f73752j || !lensResultPanelBottomsheetBehavior2.mo32498C(view, f2) || (view.getTop() <= this.f73775a.f73751i && Math.abs(f) >= Math.abs(f2))) {
                if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    ((C58970a) ((C58970a) LensResultPanelBottomsheetBehavior.f73737a.mo56224b()).mo56372aa(49534)).mo56386p("onViewReleased(): almost 0 velocity");
                    int top2 = view.getTop();
                    LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior3 = this.f73775a;
                    int i4 = lensResultPanelBottomsheetBehavior3.f73747e;
                    if (top2 < i4) {
                        if (!lensResultPanelBottomsheetBehavior3.f73750h || top2 >= Math.abs(top2 - lensResultPanelBottomsheetBehavior3.f73751i)) {
                            i = this.f73775a.f73747e;
                        } else {
                            ((C58970a) ((C58970a) LensResultPanelBottomsheetBehavior.f73737a.mo56224b()).mo56372aa(49535)).mo56386p("onViewReleased(): almost 0 velocity going to 0");
                            i = this.f73775a.f73746d;
                            this.f73775a.mo32497B(view, i3, i, true);
                        }
                    } else if (Math.abs(top2 - i4) < Math.abs(top2 - this.f73775a.f73751i)) {
                        i = this.f73775a.f73747e;
                    } else {
                        i2 = this.f73775a.f73751i;
                    }
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - this.f73775a.f73747e) < Math.abs(top3 - this.f73775a.f73751i)) {
                        i = this.f73775a.f73747e;
                    } else {
                        i2 = this.f73775a.f73751i;
                    }
                }
                i3 = 4;
                this.f73775a.mo32497B(view, i3, i, true);
            }
            i = this.f73775a.f73755m;
            i3 = 5;
            this.f73775a.mo32497B(view, i3, i, true);
        }
        i3 = 6;
        this.f73775a.mo32497B(view, i3, i, true);
    }

    /* renamed from: i */
    public final boolean mo5400i(View view, int i) {
        LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior = this.f73775a;
        int i2 = lensResultPanelBottomsheetBehavior.f73753k;
        if (i2 == 1 || lensResultPanelBottomsheetBehavior.f73762t) {
            return false;
        }
        if (i2 == 3 && lensResultPanelBottomsheetBehavior.f73761s == i) {
            WeakReference weakReference = lensResultPanelBottomsheetBehavior.f73759q;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference2 = this.f73775a.f73757o;
        return weakReference2 != null && weakReference2.get() == view;
    }

    /* renamed from: j */
    public final int mo5401j(View view, int i) {
        return view.getLeft();
    }

    /* renamed from: m */
    public final void mo5404m(View view, int i, int i2) {
        C58974d dVar = LensResultPanelBottomsheetBehavior.f73737a;
        this.f73775a.mo32501w(i2);
    }
}
