package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.aq */
/* compiled from: PG */
public final /* synthetic */ class C88806aq implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SuggestionViewWithActions f240433a;

    public /* synthetic */ C88806aq(SuggestionViewWithActions suggestionViewWithActions) {
        this.f240433a = suggestionViewWithActions;
    }

    public final void onClick(View view) {
        SuggestionViewWithActions suggestionViewWithActions = this.f240433a;
        if (suggestionViewWithActions.f240395d) {
            C88819c.m144204a(suggestionViewWithActions.getContext(), suggestionViewWithActions.f240392a, suggestionViewWithActions.f240393b, true);
            suggestionViewWithActions.f240395d = false;
            suggestionViewWithActions.f240418o.mo82333hK(-2, view, suggestionViewWithActions.f240417n, (String) null);
            return;
        }
        suggestionViewWithActions.mo82576y();
        if (suggestionViewWithActions.f240394c) {
            suggestionViewWithActions.mo82575x(true);
        } else {
            suggestionViewWithActions.f240418o.mo82471p(-1, suggestionViewWithActions, suggestionViewWithActions.f240417n);
        }
    }
}
