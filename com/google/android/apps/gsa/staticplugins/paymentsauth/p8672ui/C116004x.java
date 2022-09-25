package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.x */
/* compiled from: PG */
public final /* synthetic */ class C116004x implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ TextView f321673a;

    public /* synthetic */ C116004x(TextView textView) {
        this.f321673a = textView;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        TextView textView = this.f321673a;
        Integer num = (Integer) obj;
        if (num.intValue() == 3) {
            PasswordRenderer.m192274e(textView, R.string.payments_auth_new_biometric_added_should_use_password);
        } else if (num.intValue() == 4) {
            PasswordRenderer.m192274e(textView, R.string.payments_auth_too_many_fingerprint_retries_should_use_password);
        } else {
            textView.setVisibility(8);
        }
    }
}
