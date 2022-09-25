package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.gsa.p1825a.p1827b.C22020a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ce */
/* compiled from: PG */
public final /* synthetic */ class C96128ce implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96131ch f269110a;

    /* renamed from: b */
    public final /* synthetic */ String f269111b;

    /* renamed from: c */
    public final /* synthetic */ Context f269112c;

    public /* synthetic */ C96128ce(C96131ch chVar, String str, Context context) {
        this.f269110a = chVar;
        this.f269111b = str;
        this.f269112c = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C96131ch chVar = this.f269110a;
        String str = this.f269111b;
        Context context = this.f269112c;
        Intent intent = new Intent("android.intent.action.VIEW");
        str.getClass();
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("search.app.goo.gl").appendQueryParameter("link", "https://assistant.google.com").appendQueryParameter("apn", "com.google.android.googlequicksearchbox");
        appendQueryParameter.appendQueryParameter("amv", String.valueOf(chVar.f269118b.intValue() + 1));
        appendQueryParameter.appendQueryParameter("al", C22020a.m41268a(str, 747).toString());
        intent.setData(appendQueryParameter.build());
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
