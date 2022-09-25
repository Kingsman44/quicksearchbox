package com.google.android.apps.gsa.staticplugins.actionsui;

import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.p4152bb.p4153a.C55112gh;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.aq */
/* compiled from: PG */
final class C93450aq implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C55112gh f260829a;

    /* renamed from: b */
    final /* synthetic */ LocalResultsView f260830b;

    public C93450aq(LocalResultsView localResultsView, C55112gh ghVar) {
        this.f260830b = localResultsView;
        this.f260829a = ghVar;
    }

    public final void onClick(View view) {
        LocalResultsView localResultsView = this.f260830b;
        localResultsView.f260754a.mo87769a((LocationArgument) localResultsView.f261447m, this.f260829a);
    }
}
