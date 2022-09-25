package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.shared.bisto.C89681t;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.h */
/* compiled from: PG */
public final /* synthetic */ class C95151h implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C95144aj f266232a;

    /* renamed from: b */
    public final /* synthetic */ String f266233b;

    /* renamed from: c */
    public final /* synthetic */ Intent f266234c;

    public /* synthetic */ C95151h(C95144aj ajVar, String str, Intent intent) {
        this.f266232a = ajVar;
        this.f266233b = str;
        this.f266234c = intent;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C95144aj ajVar = this.f266232a;
        String str = this.f266233b;
        Intent intent = this.f266234c;
        Context context = ajVar.f266197c;
        SharedPreferences sharedPreferences = ajVar.f266198f;
        C91142g gVar = (C91142g) ajVar.f266202j.mo27525b();
        C89681t.m146054t(context, sharedPreferences, ajVar.f266204l, new C95142ah(ajVar, str, intent, cVar));
        return "detect devices";
    }
}
