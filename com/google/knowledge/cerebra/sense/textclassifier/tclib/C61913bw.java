package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.util.Log;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bw */
/* compiled from: PG */
public final /* synthetic */ class C61913bw implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f167386a;

    public /* synthetic */ C61913bw(C60870cx cxVar) {
        this.f167386a = cxVar;
    }

    public final void run() {
        try {
            this.f167386a.get();
        } catch (Throwable th) {
            Log.w("TCRefreshRunner", "Refresh run failed.", th);
        }
    }
}
