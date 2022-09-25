package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.support.p033v7.widget.C0603ds;
import android.support.p033v7.widget.C0625en;
import android.support.p033v7.widget.C0626eo;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0668gc;
import android.support.p033v7.widget.C0669gd;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.ab */
/* compiled from: PG */
public final class C15327ab extends C0603ds {

    /* renamed from: b */
    public RecyclerView f46003b;

    /* renamed from: c */
    private final int f46004c;

    /* renamed from: d */
    private C0626eo f46005d;

    /* renamed from: e */
    private C0653fo f46006e;

    public C15327ab(int i) {
        this.f46004c = i;
    }

    /* renamed from: j */
    private final C0626eo m31905j(C0653fo foVar) {
        if (this.f46005d == null || foVar != this.f46006e) {
            this.f46006e = foVar;
            this.f46005d = new C0625en(foVar);
        }
        return this.f46005d;
    }

    /* renamed from: b */
    public final View mo2803b(C0653fo foVar) {
        C0626eo j = m31905j(foVar);
        int childCount = foVar.getChildCount();
        View view = null;
        if (childCount != 0) {
            int paddingTop = ((C0625en) j).f2386a.getPaddingTop();
            int i = Integer.MAX_VALUE;
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = foVar.getChildAt(i2);
                childAt.getClass();
                int abs = Math.abs(j.mo2841d(childAt) - paddingTop);
                int i3 = abs < i ? abs : i;
                if (abs < i) {
                    view = childAt;
                }
                i2++;
                i = i3;
            }
            View childAt2 = foVar.getChildAt(childCount - 1);
            childAt2.getClass();
            if (foVar.getPosition(childAt2) == foVar.getItemCount() - 1) {
                if (Math.abs(j.mo2838a(childAt2) - j.mo2843f()) < i) {
                    return childAt2;
                }
            }
        }
        return view;
    }

    /* renamed from: c */
    public final int[] mo2804c(C0653fo foVar, View view) {
        int[] iArr = new int[2];
        iArr[1] = m31905j(foVar).mo2841d(view) - this.f46004c;
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C0669gd mo2853d(C0653fo foVar) {
        if (!(foVar instanceof C0668gc)) {
            return null;
        }
        RecyclerView recyclerView = this.f46003b;
        recyclerView.getClass();
        return new C15326aa(this, recyclerView.getContext(), foVar);
    }

    /* renamed from: g */
    public final void mo3197g(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.mOnFlingListener = null;
        }
        super.mo3197g(recyclerView);
        this.f46003b = recyclerView;
    }
}
