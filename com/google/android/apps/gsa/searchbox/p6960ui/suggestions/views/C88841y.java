package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.y */
/* compiled from: PG */
public final /* synthetic */ class C88841y implements C88799aj {

    /* renamed from: a */
    public final /* synthetic */ OnDeviceAppResultSuggestionView f240537a;

    public /* synthetic */ C88841y(OnDeviceAppResultSuggestionView onDeviceAppResultSuggestionView) {
        this.f240537a = onDeviceAppResultSuggestionView;
    }

    /* renamed from: a */
    public final void mo82591a(View view, int i) {
        int i2;
        OnDeviceAppResultSuggestionView onDeviceAppResultSuggestionView = this.f240537a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i == 0) {
            i2 = onDeviceAppResultSuggestionView.getResources().getDimensionPixelSize(R.dimen.core_suggestion_action_button_visible_width);
        } else {
            i2 = onDeviceAppResultSuggestionView.getResources().getDimensionPixelSize(R.dimen.core_suggestion_action_button_invisible_width);
        }
        layoutParams.width = i2;
    }
}
