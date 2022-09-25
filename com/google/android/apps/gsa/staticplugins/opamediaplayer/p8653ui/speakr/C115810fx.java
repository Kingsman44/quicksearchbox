package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.support.p033v7.widget.C0603ds;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fx */
/* compiled from: PG */
public final class C115810fx extends C0603ds {

    /* renamed from: b */
    private final C115809fw f321155b;

    /* renamed from: c */
    private final C0653fo f321156c;

    /* renamed from: d */
    private RecyclerView f321157d;

    public C115810fx(C0653fo foVar, C115809fw fwVar) {
        this.f321156c = foVar;
        this.f321155b = fwVar;
    }

    /* renamed from: b */
    public final View mo2803b(C0653fo foVar) {
        RecyclerView recyclerView;
        View b = super.mo2803b(foVar);
        if (!(b == null || (recyclerView = this.f321157d) == null)) {
            C115808fv fvVar = (C115808fv) recyclerView.mAdapter;
            fvVar.getClass();
            int i = fvVar.f321153b;
            int position = this.f321156c.getPosition(b);
            int i2 = this.f321157d.mScrollState;
            boolean z = false;
            if (i2 == 1) {
                if (position == 0) {
                    position = 0;
                } else if (position != fvVar.f321152a.size() - 1) {
                    i2 = 1;
                }
                i2 = 1;
                z = true;
            }
            if (i != position && (i2 == 0 || z)) {
                this.f321155b.mo102268e(position);
            }
        }
        return b;
    }

    /* renamed from: g */
    public final void mo3197g(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.f321157d = recyclerView;
            recyclerView.clearOnScrollListeners();
            RecyclerView recyclerView2 = this.f321157d;
            recyclerView2.mOnFlingListener = null;
            super.mo3197g(recyclerView2);
        }
    }
}
