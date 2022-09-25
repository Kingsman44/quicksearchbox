package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h;

import android.content.Intent;
import android.support.p031v4.app.Fragment;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.w */
/* compiled from: PG */
public final /* synthetic */ class C102074w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Fragment f284767a;

    /* renamed from: b */
    public final /* synthetic */ String f284768b;

    public /* synthetic */ C102074w(Fragment fragment, String str) {
        this.f284767a = fragment;
        this.f284768b = str;
    }

    public final void run() {
        this.f284767a.startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 212).putExtra("extra.accountName", this.f284768b), 0);
    }
}
