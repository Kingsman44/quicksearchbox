package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui.PasswordRenderer;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.y */
/* compiled from: PG */
public final /* synthetic */ class C116005y implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f321674a;

    public /* synthetic */ C116005y(FrameLayout frameLayout) {
        this.f321674a = frameLayout;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        TextView textView = (TextView) this.f321674a.findViewById(R.id.payments_auth_password_legal_message);
        textView.getClass();
        if (!axVar.mo56113h() || ((String) axVar.mo56107c()).isEmpty()) {
            textView.setVisibility(8);
        } else {
            textView.setText(Html.fromHtml((String) axVar.mo56107c()));
            textView.setVisibility(0);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        PasswordRenderer.URLSpanNoUnderline.m192276a(textView);
    }
}
