package com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: com.google.android.apps.gsa.staticplugins.googleappbrowser.settings.activity.h */
/* compiled from: PG */
public final /* synthetic */ class C101419h implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C101424m f282970a;

    public /* synthetic */ C101419h(C101424m mVar) {
        this.f282970a = mVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C101424m mVar = this.f282970a;
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        mVar.mo92295b();
        return true;
    }
}
