package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.k */
/* compiled from: PG */
public final /* synthetic */ class C88827k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CoreSuggestionView f240488a;

    /* renamed from: b */
    public final /* synthetic */ int f240489b;

    public /* synthetic */ C88827k(CoreSuggestionView coreSuggestionView, int i) {
        this.f240488a = coreSuggestionView;
        this.f240489b = i;
    }

    public final void onClick(View view) {
        Suggestion suggestion;
        CoreSuggestionView coreSuggestionView = this.f240488a;
        int i = this.f240489b;
        C88728ak akVar = coreSuggestionView.f240418o;
        if (akVar != null && (suggestion = coreSuggestionView.f240417n) != null) {
            akVar.mo82333hK(i, view, suggestion, (String) null);
        }
    }
}
