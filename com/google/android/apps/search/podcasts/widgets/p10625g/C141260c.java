package com.google.android.apps.search.podcasts.widgets.p10625g;

import android.graphics.Rect;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.g.c */
/* compiled from: PG */
public final class C141260c extends C0648fj {

    /* renamed from: a */
    final /* synthetic */ int f383501a;

    public C141260c(int i) {
        this.f383501a = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        C69664n.m101061g(rect, "outRect");
        C69664n.m101061g(view, "view");
        C69664n.m101061g(geVar, "state");
        super.getItemOffsets(rect, view, recyclerView, geVar);
        C0653fo foVar = recyclerView.mLayout;
        GridLayoutManager gridLayoutManager = foVar instanceof GridLayoutManager ? (GridLayoutManager) foVar : null;
        int i = gridLayoutManager != null ? gridLayoutManager.mSpanCount : 1;
        C0640fb fbVar = recyclerView.mAdapter;
        int itemCount = fbVar != null ? fbVar.getItemCount() : 0;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (itemCount > 0 && childAdapterPosition >= itemCount - i) {
            rect.set(rect.left, rect.top, rect.right, rect.bottom + this.f383501a);
        }
    }
}
