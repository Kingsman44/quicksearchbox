package org.chromium.net.impl;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: org.chromium.net.impl.bh */
/* compiled from: PG */
final class C72475bh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C72499ce f192844a;

    public C72475bh(C72499ce ceVar) {
        this.f192844a = ceVar;
    }

    public final void run() {
        C72496cb cbVar = this.f192844a.f192909r;
        if (cbVar != null) {
            try {
                cbVar.mo64242i();
            } catch (IOException e) {
                Log.e(C72499ce.f192892a, "Exception when closing OutputChannel", e);
            }
        }
        HttpURLConnection httpURLConnection = this.f192844a.f192908q;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f192844a.f192908q = null;
        }
    }
}
