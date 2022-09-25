package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.v */
/* compiled from: PG */
public final /* synthetic */ class C116002v implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f321671a;

    public /* synthetic */ C116002v(FrameLayout frameLayout) {
        this.f321671a = frameLayout;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        FrameLayout frameLayout = this.f321671a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            TextView textView = (TextView) frameLayout.findViewById(R.id.payments_auth_password_title);
            textView.getClass();
            textView.setText((CharSequence) axVar.mo56107c());
        }
    }
}
