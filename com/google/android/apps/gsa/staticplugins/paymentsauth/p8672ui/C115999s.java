package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui.PasswordRenderer;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.s */
/* compiled from: PG */
public final /* synthetic */ class C115999s implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ PasswordRenderer f321666a;

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f321667b;

    /* renamed from: c */
    public final /* synthetic */ TextView f321668c;

    public /* synthetic */ C115999s(PasswordRenderer passwordRenderer, FrameLayout frameLayout, TextView textView) {
        this.f321666a = passwordRenderer;
        this.f321667b = frameLayout;
        this.f321668c = textView;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        PasswordRenderer passwordRenderer = this.f321666a;
        FrameLayout frameLayout = this.f321667b;
        TextView textView = this.f321668c;
        String str = (String) obj;
        TextView textView2 = (TextView) frameLayout.findViewById(R.id.payments_auth_password_account_name);
        textView2.getClass();
        textView2.setText(str);
        String replace = "https://accounts.google.com/RecoverAccount?Email=%email%".replace("%email%", str);
        textView.setText(Html.fromHtml(passwordRenderer.f321606b.getString(R.string.payments_auth_forgot_password, new Object[]{replace})));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        PasswordRenderer.URLSpanNoUnderline.m192276a(textView);
    }
}
