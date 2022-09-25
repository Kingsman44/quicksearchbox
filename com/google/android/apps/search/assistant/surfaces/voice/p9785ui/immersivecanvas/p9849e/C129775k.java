package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.LogoView;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.e.k */
/* compiled from: PG */
final class C129775k implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ LogoView f356092a;

    /* renamed from: b */
    final /* synthetic */ ImageView f356093b;

    public C129775k(LogoView logoView, ImageView imageView) {
        this.f356092a = logoView;
        this.f356093b = imageView;
    }

    public final void afterTextChanged(Editable editable) {
        if (C58837ba.m90859h(editable.toString())) {
            this.f356092a.setVisibility(0);
            this.f356093b.setVisibility(8);
            return;
        }
        this.f356092a.setVisibility(8);
        this.f356093b.setVisibility(0);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
