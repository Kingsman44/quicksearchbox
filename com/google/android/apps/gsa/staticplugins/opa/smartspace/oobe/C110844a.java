package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.a */
/* compiled from: PG */
public final /* synthetic */ class C110844a implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ SmartspaceOOBEActivity f308830a;

    public /* synthetic */ C110844a(SmartspaceOOBEActivity smartspaceOOBEActivity) {
        this.f308830a = smartspaceOOBEActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f308830a.finish();
    }
}
