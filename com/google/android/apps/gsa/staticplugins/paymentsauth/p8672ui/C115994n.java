package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.widget.Button;
import android.widget.EditText;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.n */
/* compiled from: PG */
public final /* synthetic */ class C115994n implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ PasswordRenderer f321653a;

    /* renamed from: b */
    public final /* synthetic */ EditText f321654b;

    /* renamed from: c */
    public final /* synthetic */ TextInputLayout f321655c;

    /* renamed from: d */
    public final /* synthetic */ Button f321656d;

    public /* synthetic */ C115994n(PasswordRenderer passwordRenderer, EditText editText, TextInputLayout textInputLayout, Button button) {
        this.f321653a = passwordRenderer;
        this.f321654b = editText;
        this.f321655c = textInputLayout;
        this.f321656d = button;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        String str;
        PasswordRenderer passwordRenderer = this.f321653a;
        EditText editText = this.f321654b;
        TextInputLayout textInputLayout = this.f321655c;
        Button button = this.f321656d;
        Integer num = (Integer) obj;
        if (num.intValue() == 1) {
            str = passwordRenderer.f321606b.getString(R.string.payments_auth_password_try_again_message_attempt_1);
        } else if (num.intValue() == 2) {
            str = passwordRenderer.f321606b.getString(R.string.payments_auth_password_try_again_message_attempt_2);
        } else if (num.intValue() > 2) {
            C58833ax axVar = (C58833ax) ((C115981ad) passwordRenderer.f321605a).f321630f.f63720e;
            str = axVar.mo56113h() ? (String) axVar.mo56107c() : passwordRenderer.f321606b.getString(R.string.payments_auth_password_try_again_message_attempt_last);
        } else {
            str = null;
        }
        if (str != null) {
            editText.setText(BuildConfig.FLAVOR);
            textInputLayout.f117310d.mo48510h(true);
            textInputLayout.mo48470e(str);
            textInputLayout.mo48475i(R.style.passwordInputErrorHintStyle);
            button.setEnabled(true);
            button.setAlpha(1.0f);
        }
    }
}
