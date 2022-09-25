package com.google.android.apps.gsa.assistant.settings.features.voiceselection;

import android.support.p033v7.widget.C0603ds;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.voiceselection.as */
/* compiled from: PG */
public final class C73525as extends C0603ds {

    /* renamed from: b */
    private final C73524ar f194540b;

    /* renamed from: c */
    private final C0653fo f194541c;

    /* renamed from: d */
    private RecyclerView f194542d;

    public C73525as(C0653fo foVar, C73524ar arVar) {
        this.f194541c = foVar;
        this.f194540b = arVar;
    }

    /* renamed from: b */
    public final View mo2803b(C0653fo foVar) {
        RecyclerView recyclerView;
        View b = super.mo2803b(foVar);
        if (!(b == null || (recyclerView = this.f194542d) == null)) {
            n nVar = recyclerView.mAdapter;
            nVar.getClass();
            int i = nVar.b;
            int position = this.f194541c.getPosition(b);
            RecyclerView recyclerView2 = this.f194542d;
            recyclerView2.getClass();
            int i2 = recyclerView2.mScrollState;
            boolean z = false;
            if (i2 == 1) {
                if (position == 0) {
                    position = 0;
                } else if (position != nVar.a.size() - 1) {
                    i2 = 1;
                }
                i2 = 1;
                z = true;
            }
            if (i != position && (i2 == 0 || z)) {
                this.f194540b.mo65023b(position);
            }
        }
        return b;
    }

    /* renamed from: g */
    public final void mo3197g(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.f194542d = recyclerView;
            recyclerView.clearOnScrollListeners();
            RecyclerView recyclerView2 = this.f194542d;
            recyclerView2.mOnFlingListener = null;
            super.mo3197g(recyclerView2);
        }
    }
}
