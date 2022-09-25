package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.widget.CompoundButton;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.aa */
/* compiled from: PG */
final class C115978aa implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ PasswordRenderer f321608a;

    public C115978aa(PasswordRenderer passwordRenderer) {
        this.f321608a = passwordRenderer;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f321608a.f63126Q.mo28345s("CLICK", "FINGERPRINT_CHECKBOX_CHECKED", ProtoParcelable.f63423a);
        } else {
            this.f321608a.f63126Q.mo28345s("CLICK", "FINGERPRINT_CHECKBOX_UNCHECKED", ProtoParcelable.f63423a);
        }
    }
}
