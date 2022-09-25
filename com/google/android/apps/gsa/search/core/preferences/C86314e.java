package com.google.android.apps.gsa.search.core.preferences;

import android.accounts.Account;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.googlequicksearchbox.R;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.e */
/* compiled from: PG */
public final class C86314e extends ProgressDialog implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final C86054o f233370a;

    /* renamed from: b */
    public final C68214a f233371b;

    /* renamed from: c */
    public boolean f233372c;

    /* renamed from: d */
    public final Account f233373d;

    /* renamed from: e */
    private final String f233374e;

    public C86314e(Context context, C86054o oVar, C68214a aVar, String str, Account account) {
        super(context);
        this.f233370a = oVar;
        this.f233371b = aVar;
        this.f233374e = str;
        this.f233373d = account;
        String F = account != null ? account.name : oVar.mo79659F();
        setTitle(R.string.manage_search_history_authenticating_title);
        setMessage(getContext().getResources().getString(R.string.manage_search_history_authenticating_message, new Object[]{F}));
        setIndeterminate(true);
        setCancelable(true);
        setOnCancelListener(this);
        setButton(-2, getContext().getResources().getString(R.string.manage_search_history_authenticating_cancel), new C86301c(this));
    }

    /* renamed from: a */
    public final void mo80028a() {
        this.f233372c = true;
        dismiss();
    }

    /* renamed from: b */
    public final void mo80029b() {
        show();
        Uri parse = Uri.parse(this.f233374e);
        Account account = this.f233373d;
        if (account == null) {
            account = this.f233370a.mo79668a();
        }
        this.f233370a.mo79677k(account, parse, "hist", new C86313d(this, account, parse));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        mo80028a();
    }
}
