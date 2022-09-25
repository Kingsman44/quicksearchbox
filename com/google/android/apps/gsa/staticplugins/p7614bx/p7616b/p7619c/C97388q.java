package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.q */
/* compiled from: PG */
public final /* synthetic */ class C97388q implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C97359ab f271962a;

    public /* synthetic */ C97388q(C97359ab abVar) {
        this.f271962a = abVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C97359ab abVar = this.f271962a;
        if (!((Boolean) ((C97369al) abVar.f271888b).f271935f.f63720e).booleanValue() && !((Boolean) ((C97369al) abVar.f271888b).f271933d.f63720e).booleanValue()) {
            ((Activity) abVar.f271889c.mo56107c()).finish();
        }
    }
}
