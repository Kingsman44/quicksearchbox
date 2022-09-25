package com.google.android.apps.gsa.search.shared.p6941ui;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.sidekick.main.p7227s.C91616e;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.f */
/* compiled from: PG */
public final /* synthetic */ class C88526f implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C88528h f239253a;

    public /* synthetic */ C88526f(C88528h hVar) {
        this.f239253a = hVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C88528h hVar = this.f239253a;
        C91616e eVar = (C91616e) adapterView.getAdapter().getItem(i);
        C90772bp.m148317y(hVar.getContext(), hVar.f239255a);
        hVar.dismiss();
    }
}
