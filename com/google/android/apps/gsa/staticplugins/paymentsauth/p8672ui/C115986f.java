package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.f */
/* compiled from: PG */
public final /* synthetic */ class C115986f implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f321642a;

    public /* synthetic */ C115986f(FrameLayout frameLayout) {
        this.f321642a = frameLayout;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        FrameLayout frameLayout = this.f321642a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            TextView textView = (TextView) frameLayout.findViewById(R.id.payments_auth_fingerprint_hint);
            textView.getClass();
            textView.setText((CharSequence) axVar.mo56107c());
        }
    }
}
