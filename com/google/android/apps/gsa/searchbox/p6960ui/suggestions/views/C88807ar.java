package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.ar */
/* compiled from: PG */
public final /* synthetic */ class C88807ar implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SuggestionViewWithActions f240434a;

    /* renamed from: b */
    public final /* synthetic */ int f240435b;

    /* renamed from: c */
    public final /* synthetic */ String f240436c;

    public /* synthetic */ C88807ar(SuggestionViewWithActions suggestionViewWithActions, int i, String str) {
        this.f240434a = suggestionViewWithActions;
        this.f240435b = i;
        this.f240436c = str;
    }

    public final void onClick(View view) {
        Suggestion suggestion;
        SuggestionViewWithActions suggestionViewWithActions = this.f240434a;
        int i = this.f240435b;
        String str = this.f240436c;
        C88728ak akVar = suggestionViewWithActions.f240418o;
        if (akVar != null && (suggestion = suggestionViewWithActions.f240417n) != null) {
            akVar.mo82333hK(i, view, suggestion, str);
        }
    }
}
