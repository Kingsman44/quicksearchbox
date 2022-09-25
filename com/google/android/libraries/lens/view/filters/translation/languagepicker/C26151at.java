package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.at */
/* compiled from: PG */
public final /* synthetic */ class C26151at implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ LanguagePickerFragmentPeer f71059a;

    public /* synthetic */ C26151at(LanguagePickerFragmentPeer languagePickerFragmentPeer) {
        this.f71059a = languagePickerFragmentPeer;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        LanguagePickerFragmentPeer languagePickerFragmentPeer = this.f71059a;
        RecyclerView recyclerView = languagePickerFragmentPeer.f71004a;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), languagePickerFragmentPeer.f71004a.getPaddingTop(), languagePickerFragmentPeer.f71004a.getPaddingRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
    }
}
