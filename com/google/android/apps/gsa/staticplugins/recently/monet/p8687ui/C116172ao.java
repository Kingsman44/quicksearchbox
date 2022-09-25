package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p576aq.C10542e;
import com.google.android.libraries.p576aq.C10562y;
import com.google.android.libraries.p576aq.C10563z;
import com.google.android.libraries.p576aq.p578b.C10505al;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.ao */
/* compiled from: PG */
public final class C116172ao extends C116176e {

    /* renamed from: i */
    public final C10542e f322135i;

    public C116172ao(C10562y yVar, Resources resources, Context context, DialogInterface.OnCancelListener onCancelListener) {
        super(resources, context, onCancelListener);
        C10542e h = C10563z.m25516h(BuildConfig.FLAVOR);
        this.f322135i = h;
        String string = this.f322142c.getString(R.string.recently_search_history_authenticating_message);
        yVar.f35335b.mo18608a(f322140b).mo18605a(this).mo18604b(C10563z.m25517i(new C10505al(new C10563z[]{h}, string)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AlertDialog mo102532a() {
        String string = this.f322142c.getString(R.string.recently_search_history_authenticating_title);
        String string2 = this.f322142c.getString(R.string.recently_search_history_authenticating_cancel);
        ProgressDialog progressDialog = new ProgressDialog(this.f322143d);
        progressDialog.setTitle(string);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setOnCancelListener(this.f322144e);
        progressDialog.setButton(-2, string2, new C116171an(this));
        return progressDialog;
    }
}
