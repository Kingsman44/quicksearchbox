package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.protos.p4932ax.p4933a.C64269i;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.n */
/* compiled from: PG */
public final /* synthetic */ class C88830n implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EnhancementSuggestionView f240493a;

    /* renamed from: b */
    public final /* synthetic */ C64269i f240494b;

    public /* synthetic */ C88830n(EnhancementSuggestionView enhancementSuggestionView, C64269i iVar) {
        this.f240493a = enhancementSuggestionView;
        this.f240494b = iVar;
    }

    public final void onClick(View view) {
        Suggestion suggestion;
        EnhancementSuggestionView enhancementSuggestionView = this.f240493a;
        C64269i iVar = this.f240494b;
        C88728ak akVar = enhancementSuggestionView.f240418o;
        if (akVar != null && (suggestion = enhancementSuggestionView.f240417n) != null) {
            akVar.f240012r.mo82417x(suggestion);
            akVar.f240012r.mo82416w(iVar);
            suggestion.f108919t = iVar.f173767c;
            C88727aj.m143677E(suggestion, Collections.unmodifiableMap(iVar.f173768d));
            akVar.f240007m.mo44280t(suggestion, enhancementSuggestionView, iVar.f173767c);
        }
    }
}
