package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.u */
/* compiled from: PG */
public final /* synthetic */ class C116001u implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f321670a;

    public /* synthetic */ C116001u(FrameLayout frameLayout) {
        this.f321670a = frameLayout;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        TextView textView = (TextView) this.f321670a.findViewById(R.id.payments_auth_password_order_summary_h2);
        textView.getClass();
        if (!axVar.mo56113h() || ((String) axVar.mo56107c()).isEmpty()) {
            textView.setVisibility(8);
            return;
        }
        textView.setText((CharSequence) axVar.mo56107c());
        textView.setVisibility(0);
    }
}
