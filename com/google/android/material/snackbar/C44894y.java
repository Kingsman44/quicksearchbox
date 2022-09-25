package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.material.snackbar.y */
/* compiled from: PG */
final class C44894y implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C44870aa f117151a;

    public C44894y(C44870aa aaVar) {
        this.f117151a = aaVar;
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C44870aa aaVar = this.f117151a;
        C44895z zVar = (C44895z) message.obj;
        synchronized (aaVar.f117114a) {
            if (aaVar.f117116c == zVar || aaVar.f117117d == zVar) {
                aaVar.mo48360d(zVar, 2);
            }
        }
        return true;
    }
}
