package com.google.android.apps.gsa.staticplugins.actionsui;

import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.p4152bb.p4153a.C55112gh;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.ar */
/* compiled from: PG */
final class C93451ar implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C55112gh f260831a;

    /* renamed from: b */
    final /* synthetic */ LocalResultsView f260832b;

    public C93451ar(LocalResultsView localResultsView, C55112gh ghVar) {
        this.f260832b = localResultsView;
        this.f260831a = ghVar;
    }

    public final void onClick(View view) {
        LocalResultsView localResultsView = this.f260832b;
        localResultsView.f260754a.mo87769a((LocationArgument) localResultsView.f261447m, this.f260831a);
    }
}
