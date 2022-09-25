package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.h */
/* compiled from: PG */
public final /* synthetic */ class C115988h implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ TextView f321645a;

    public /* synthetic */ C115988h(TextView textView) {
        this.f321645a = textView;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        int i;
        TextView textView = this.f321645a;
        Integer num = (Integer) obj;
        if (num.intValue() == 1) {
            i = R.string.payments_auth_fingerprint_try_again_message_attempt_1;
        } else if (num.intValue() == 2) {
            i = R.string.payments_auth_fingerprint_try_again_message_attempt_2;
        } else if (num.intValue() <= 2 || num.intValue() >= 4) {
            i = num.intValue() >= 4 ? R.string.payments_auth_fingerprint_try_again_message_attempt_last : 0;
        } else {
            i = R.string.payments_auth_fingerprint_try_again_message_attempt_3;
        }
        if (i != 0) {
            textView.setText(i);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(4);
    }
}
