package com.google.android.libraries.material.opensearchbar;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.google.android.libraries.material.opensearchbar.l */
/* compiled from: PG */
final class C28557l implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ OpenSearchView f77638a;

    public C28557l(OpenSearchView openSearchView) {
        this.f77638a = openSearchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f77638a.f77609k.setVisibility(charSequence.length() > 0 ? 0 : 8);
    }
}
