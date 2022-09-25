package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.widget.Toast;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.av */
/* compiled from: PG */
public final /* synthetic */ class C96464av implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C96467ay f269862a;

    /* renamed from: b */
    public final /* synthetic */ String f269863b;

    public /* synthetic */ C96464av(C96467ay ayVar, String str) {
        this.f269862a = ayVar;
        this.f269863b = str;
    }

    public final void run() {
        C96467ay ayVar = this.f269862a;
        Toast.makeText(ayVar.f269869c, this.f269863b, 1).show();
    }
}
