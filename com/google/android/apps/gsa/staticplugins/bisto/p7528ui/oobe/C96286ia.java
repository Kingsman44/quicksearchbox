package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ia */
/* compiled from: PG */
public final /* synthetic */ class C96286ia implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96289id f269461a;

    /* renamed from: b */
    public final /* synthetic */ String f269462b;

    public /* synthetic */ C96286ia(C96289id idVar, String str) {
        this.f269461a = idVar;
        this.f269462b = str;
    }

    public final void onClick(View view) {
        C96289id idVar = this.f269461a;
        String str = this.f269462b;
        idVar.mo89948n(R.string.herbie_skip_dialog_title, String.format(idVar.getString(R.string.herbie_skip_dialog_message), new Object[]{str}), new C96287ib(idVar), new C96288ic(idVar), R.string.herbie_continue);
    }
}
