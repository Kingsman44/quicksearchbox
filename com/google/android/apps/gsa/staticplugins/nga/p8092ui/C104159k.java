package com.google.android.apps.gsa.staticplugins.nga.p8092ui;

import android.view.View;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C104022en;
import com.google.android.apps.gsa.staticplugins.nga.p8089t.C104026er;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.k */
/* compiled from: PG */
public final /* synthetic */ class C104159k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C104163o f289721a;

    public /* synthetic */ C104159k(C104163o oVar) {
        this.f289721a = oVar;
    }

    public final void onClick(View view) {
        C104163o oVar = this.f289721a;
        oVar.f289728d.edit().putBoolean(C90507o.f253033w, true).apply();
        C104026er erVar = oVar.f289730f;
        C90875ai.m148465b(C104155g.f289713a, erVar.mo93918b(new C104022en(erVar)), oVar.f289731g, "[NGA] NgaDataUpdateFragment.startUpdate").mo85223a(C104156h.f289714a);
    }
}
