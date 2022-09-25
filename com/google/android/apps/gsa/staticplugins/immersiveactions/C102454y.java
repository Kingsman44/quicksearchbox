package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.LocationArgument;
import com.google.android.apps.gsa.staticplugins.actionsui.C93454au;
import com.google.p4152bb.p4153a.C55112gh;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.y */
/* compiled from: PG */
final class C102454y implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C55112gh f285929a;

    /* renamed from: b */
    final /* synthetic */ ImmersiveActionsLocalResultsView f285930b;

    public C102454y(ImmersiveActionsLocalResultsView immersiveActionsLocalResultsView, C55112gh ghVar) {
        this.f285930b = immersiveActionsLocalResultsView;
        this.f285929a = ghVar;
    }

    public final void onClick(View view) {
        ImmersiveActionsLocalResultsView immersiveActionsLocalResultsView = this.f285930b;
        C93454au auVar = immersiveActionsLocalResultsView.f260754a;
        if (auVar != null) {
            auVar.mo87769a((LocationArgument) immersiveActionsLocalResultsView.f261447m, this.f285929a);
        }
    }
}
