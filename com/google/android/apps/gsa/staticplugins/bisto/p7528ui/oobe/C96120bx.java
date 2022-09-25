package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.bx */
/* compiled from: PG */
public final /* synthetic */ class C96120bx implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96131ch f269099a;

    /* renamed from: b */
    public final /* synthetic */ String f269100b;

    public /* synthetic */ C96120bx(C96131ch chVar, String str) {
        this.f269099a = chVar;
        this.f269100b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C96131ch chVar = this.f269099a;
        chVar.f269125i.mo83417w(this.f269100b);
        chVar.getActivity().finish();
    }
}
