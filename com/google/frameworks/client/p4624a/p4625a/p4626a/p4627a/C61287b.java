package com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a;

import android.util.Log;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.frameworks.client.a.a.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C61287b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f165766a;

    public /* synthetic */ C61287b(C60870cx cxVar) {
        this.f165766a = cxVar;
    }

    public final void run() {
        C60870cx cxVar = this.f165766a;
        int i = C61292g.f165777b;
        if (((C60873d) cxVar).value instanceof C60873d.C60875b) {
            Log.d("ClientLoggingBackend", "Log cancelled. The app has crashed.");
        }
    }
}
