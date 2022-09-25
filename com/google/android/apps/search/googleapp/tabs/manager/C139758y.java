package com.google.android.apps.search.googleapp.tabs.manager;

import android.content.DialogInterface;
import com.google.apps.tiktok.concurrent.C46459k;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.y */
/* compiled from: PG */
public final /* synthetic */ class C139758y implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C139720ac f379864a;

    public /* synthetic */ C139758y(C139720ac acVar) {
        this.f379864a = acVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C139720ac acVar = this.f379864a;
        acVar.mo115199m();
        C46459k.m82829b(acVar.f379773f.mo110973b(), "Failed to close all tabs", new Object[0]);
    }
}
