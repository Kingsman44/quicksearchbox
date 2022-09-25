package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.ad */
/* compiled from: PG */
public final /* synthetic */ class C88793ad implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C88795af f240410a;

    public /* synthetic */ C88793ad(C88795af afVar) {
        this.f240410a = afVar;
    }

    public final void onClick(View view) {
        Suggestion suggestion;
        C88795af afVar = this.f240410a;
        C88728ak akVar = afVar.f240418o;
        if (akVar != null && (suggestion = afVar.f240417n) != null) {
            akVar.mo82473t(suggestion);
            akVar.mo82352k(afVar, suggestion);
        }
    }
}
