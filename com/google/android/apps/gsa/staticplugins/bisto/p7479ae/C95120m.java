package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.m */
/* compiled from: PG */
final class C95120m extends Handler {

    /* renamed from: a */
    private final WeakReference f266129a;

    public C95120m(C95121n nVar) {
        this.f266129a = new WeakReference(nVar);
    }

    public final void handleMessage(Message message) {
        C95121n nVar = (C95121n) this.f266129a.get();
        if (nVar == null) {
            super.handleMessage(message);
            return;
        }
        int i = message.what;
        if (i == 4) {
            nVar.f266101b.mo88945v();
        } else if (i != 5) {
            super.handleMessage(message);
        } else {
            nVar.f266101b.mo88944u();
        }
    }
}
