package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.i */
/* compiled from: PG */
final class C88825i implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ CompactSuggestionView f240485a;

    public C88825i(CompactSuggestionView compactSuggestionView) {
        this.f240485a = compactSuggestionView;
    }

    public final void onFocusChange(View view, boolean z) {
        FrameLayout frameLayout = this.f240485a.f240316b;
        if (frameLayout != null && z) {
            frameLayout.requestFocus();
        }
    }
}
