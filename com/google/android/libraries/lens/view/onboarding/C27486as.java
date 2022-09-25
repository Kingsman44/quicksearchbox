package com.google.android.libraries.lens.view.onboarding;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: com.google.android.libraries.lens.view.onboarding.as */
/* compiled from: PG */
public final /* synthetic */ class C27486as implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C27493az f75163a;

    public /* synthetic */ C27486as(C27493az azVar) {
        this.f75163a = azVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C27493az azVar = this.f75163a;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        azVar.f75182c.requireActivity().finish();
        return true;
    }
}
