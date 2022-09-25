package com.google.android.apps.search.podcasts.widgets.p10623e;

import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.googlequicksearchbox.R;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.e.b */
/* compiled from: PG */
public final class C141230b {
    /* renamed from: a */
    public static final void m229247a(RecyclerView recyclerView, List list) {
        C69664n.m101061g(recyclerView, "recyclerView");
        C69664n.m101061g(list, "singleColViews");
        C0653fo foVar = recyclerView.mLayout;
        GridLayoutManager gridLayoutManager = foVar instanceof GridLayoutManager ? (GridLayoutManager) foVar : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.setSpanCount(recyclerView.getContext().getResources().getInteger(R.integer.podcasts_grid_col_count));
            gridLayoutManager.mSpanSizeLookup = new C141229a(recyclerView, list, gridLayoutManager);
        }
    }
}
