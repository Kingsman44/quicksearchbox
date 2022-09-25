package com.google.android.gms.cloudmessaging;

import android.util.Log;
import com.google.android.gms.tasks.C146010af;
import java.io.IOException;

/* renamed from: com.google.android.gms.cloudmessaging.r */
/* compiled from: PG */
public final /* synthetic */ class C143691r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C146010af f389553a;

    public /* synthetic */ C143691r(C146010af afVar) {
        this.f389553a = afVar;
    }

    public final void run() {
        C146010af afVar = this.f389553a;
        if (afVar.f394698a.mo122509w(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
