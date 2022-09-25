package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.r */
/* compiled from: PG */
public final /* synthetic */ class C88834r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ HorizontalIconSuggestionView f240499a;

    public /* synthetic */ C88834r(HorizontalIconSuggestionView horizontalIconSuggestionView) {
        this.f240499a = horizontalIconSuggestionView;
    }

    public final void onClick(View view) {
        Suggestion suggestion;
        HorizontalIconSuggestionView horizontalIconSuggestionView = this.f240499a;
        C88728ak akVar = horizontalIconSuggestionView.f240418o;
        if (akVar != null && (suggestion = horizontalIconSuggestionView.f240417n) != null) {
            akVar.mo82333hK(0, view, suggestion, (String) null);
        }
    }
}
