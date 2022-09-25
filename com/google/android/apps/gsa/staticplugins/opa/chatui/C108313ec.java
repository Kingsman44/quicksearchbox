package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ec */
/* compiled from: PG */
public final /* synthetic */ class C108313ec implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108317eg f301311a;

    /* renamed from: b */
    public final /* synthetic */ String f301312b;

    public /* synthetic */ C108313ec(C108317eg egVar, String str) {
        this.f301311a = egVar;
        this.f301312b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C108317eg egVar = this.f301311a;
        String str = this.f301312b;
        dialogInterface.dismiss();
        egVar.mo96767a(str);
    }
}
