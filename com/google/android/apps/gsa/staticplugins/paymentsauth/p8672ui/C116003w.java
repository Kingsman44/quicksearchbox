package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.widget.CheckBox;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.w */
/* compiled from: PG */
public final /* synthetic */ class C116003w implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ CheckBox f321672a;

    public /* synthetic */ C116003w(CheckBox checkBox) {
        this.f321672a = checkBox;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        CheckBox checkBox = this.f321672a;
        checkBox.setVisibility(true != ((Boolean) obj).booleanValue() ? 8 : 0);
        checkBox.setText(R.string.payments_auth_use_biometric_checkbox_hint);
    }
}
