package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.Activity;
import android.app.AlertDialog;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.core.p096h.C1951d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.h */
/* compiled from: PG */
public final /* synthetic */ class C96258h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96431q f269415a;

    /* renamed from: b */
    public final /* synthetic */ String f269416b;

    /* renamed from: c */
    public final /* synthetic */ String[] f269417c;

    /* renamed from: d */
    public final /* synthetic */ String f269418d;

    /* renamed from: e */
    public final /* synthetic */ String f269419e;

    public /* synthetic */ C96258h(C96431q qVar, String str, String[] strArr, String str2, String str3) {
        this.f269415a = qVar;
        this.f269416b = str;
        this.f269417c = strArr;
        this.f269418d = str2;
        this.f269419e = str3;
    }

    public final void onClick(View view) {
        C96431q qVar = this.f269415a;
        String str = this.f269416b;
        String[] strArr = this.f269417c;
        String str2 = this.f269418d;
        String str3 = this.f269419e;
        Activity activity = qVar.getActivity();
        if (activity != null) {
            AlertDialog create = new AlertDialog.Builder(new ContextThemeWrapper(activity, R.style.AccountLinkingDialog)).setTitle(qVar.getString(R.string.sleep_account_linking_legalese_title, new Object[]{str})).setMessage(C1951d.m5280a(qVar.getString(R.string.sleep_account_linking_legalese, new Object[]{str}), 12)).setNegativeButton(R.string.bisto_no_thanks_button, C96420n.f269742a).setPositiveButton(R.string.bisto_account_linking_consent_positive, new C96429o(qVar, str, strArr, str2, str3)).create();
            create.show();
            ((TextView) create.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
