package com.facebook.litho.widget;

import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.litho.widget.dg */
/* compiled from: PG */
final class C6502dg extends StaggeredGridLayoutManager {

    /* renamed from: m */
    private int[] f19273m;

    /* renamed from: n */
    private final WeakReference f19274n = new WeakReference((Object) null);

    public C6502dg(int i, int i2) {
        super(i, i2);
    }

    public final C0654fp generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C6472cd) {
            return new C6501df((C6472cd) layoutParams);
        }
        return super.generateLayoutParams(layoutParams);
    }

    /* renamed from: m */
    public final int[] mo2330m(int[] iArr) {
        return super.mo2330m(mo13587o());
    }

    /* renamed from: n */
    public final int[] mo2331n() {
        return super.mo2330m(mo13587o());
    }

    /* renamed from: o */
    public final int[] mo13587o() {
        if (this.f19273m == null) {
            this.f19273m = new int[this.f1837a];
        }
        return this.f19273m;
    }

    public final void onLayoutCompleted(C0670ge geVar) {
        super.onLayoutCompleted(geVar);
        RecyclerView recyclerView = (RecyclerView) this.f19274n.get();
        if (recyclerView != null) {
            recyclerView.getHandler().postAtFrontOfQueue(new C6500de(recyclerView));
            this.f19274n.clear();
        }
    }
}
