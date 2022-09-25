package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.ab */
/* compiled from: PG */
public final /* synthetic */ class C88791ab implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ PromoSuggestionView f240408a;

    public /* synthetic */ C88791ab(PromoSuggestionView promoSuggestionView) {
        this.f240408a = promoSuggestionView;
    }

    public final void onClick(View view) {
        Suggestion suggestion;
        PromoSuggestionView promoSuggestionView = this.f240408a;
        C88728ak akVar = promoSuggestionView.f240418o;
        if (akVar != null && (suggestion = promoSuggestionView.f240417n) != null) {
            akVar.mo82333hK(1, view, suggestion, (String) null);
        }
    }
}
