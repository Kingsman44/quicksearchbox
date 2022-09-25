package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.o */
/* compiled from: PG */
public final /* synthetic */ class C88831o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EnhancementSuggestionView f240495a;

    /* renamed from: b */
    public final /* synthetic */ int f240496b;

    public /* synthetic */ C88831o(EnhancementSuggestionView enhancementSuggestionView, int i) {
        this.f240495a = enhancementSuggestionView;
        this.f240496b = i;
    }

    public final void onClick(View view) {
        Suggestion suggestion;
        EnhancementSuggestionView enhancementSuggestionView = this.f240495a;
        int i = this.f240496b;
        C88728ak akVar = enhancementSuggestionView.f240418o;
        if (akVar != null && (suggestion = enhancementSuggestionView.f240417n) != null) {
            akVar.mo82333hK(i, view, suggestion, (String) null);
        }
    }
}
