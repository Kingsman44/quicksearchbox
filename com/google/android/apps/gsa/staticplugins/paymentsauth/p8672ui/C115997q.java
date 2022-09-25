package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8669b.C115956a;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8669b.C115957b;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.q */
/* compiled from: PG */
public final /* synthetic */ class C115997q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ PasswordRenderer f321659a;

    /* renamed from: b */
    public final /* synthetic */ EditText f321660b;

    /* renamed from: c */
    public final /* synthetic */ Button f321661c;

    public /* synthetic */ C115997q(PasswordRenderer passwordRenderer, EditText editText, Button button) {
        this.f321659a = passwordRenderer;
        this.f321660b = editText;
        this.f321661c = button;
    }

    public final void onClick(View view) {
        PasswordRenderer passwordRenderer = this.f321659a;
        EditText editText = this.f321660b;
        Button button = this.f321661c;
        String obj = editText.getText().toString();
        if (!obj.isEmpty()) {
            C22945j jVar = passwordRenderer.f63126Q;
            C115956a aVar = (C115956a) C115957b.f321524c.createBuilder();
            aVar.copyOnWrite();
            C115957b bVar = (C115957b) aVar.instance;
            obj.getClass();
            bVar.f321526a |= 1;
            bVar.f321527b = obj;
            jVar.mo28345s("CLICK", "AUTHORIZE_BUTTON", C23245b.m43556a((C115957b) aVar.build()));
            button.setEnabled(false);
            button.setAlpha(0.5f);
        }
    }
}
