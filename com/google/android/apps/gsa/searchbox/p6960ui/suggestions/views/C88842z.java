package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.z */
/* compiled from: PG */
public final /* synthetic */ class C88842z implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OnDeviceAppResultSuggestionView f240538a;

    public /* synthetic */ C88842z(OnDeviceAppResultSuggestionView onDeviceAppResultSuggestionView) {
        this.f240538a = onDeviceAppResultSuggestionView;
    }

    public final void onClick(View view) {
        Suggestion suggestion;
        OnDeviceAppResultSuggestionView onDeviceAppResultSuggestionView = this.f240538a;
        C88728ak akVar = onDeviceAppResultSuggestionView.f240418o;
        if (akVar != null && (suggestion = onDeviceAppResultSuggestionView.f240417n) != null) {
            akVar.mo82333hK(1, view, suggestion, (String) null);
        }
    }
}
