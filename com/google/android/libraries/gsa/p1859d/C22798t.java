package com.google.android.libraries.gsa.p1859d;

import android.util.Log;

/* renamed from: com.google.android.libraries.gsa.d.t */
/* compiled from: PG */
final class C22798t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C22799u f62758a;

    public C22798t(C22799u uVar) {
        this.f62758a = uVar;
    }

    public final void run() {
        C22799u uVar = this.f62758a;
        if (uVar.f62764g) {
            try {
                uVar.f62762e.unbindService(uVar);
            } catch (IllegalArgumentException e) {
                Log.d("LauncherClient", "Unbind failed, ignoring", e);
            }
            uVar.f62764g = false;
        }
    }
}
