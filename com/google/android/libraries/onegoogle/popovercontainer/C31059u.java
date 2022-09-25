package com.google.android.libraries.onegoogle.popovercontainer;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.u */
/* compiled from: PG */
public final /* synthetic */ class C31059u implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C31036ak f83649a;

    public /* synthetic */ C31059u(C31036ak akVar) {
        this.f83649a = akVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C31036ak akVar = this.f83649a;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        akVar.mo36730c();
        return false;
    }
}
