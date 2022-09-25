package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bv */
/* compiled from: PG */
public final /* synthetic */ class C61912bv implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C61914bx f167384a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f167385b;

    public /* synthetic */ C61912bv(C61914bx bxVar, C60870cx cxVar) {
        this.f167384a = bxVar;
        this.f167385b = cxVar;
    }

    public final void run() {
        List<SettableFuture> list;
        C60887da daVar;
        boolean z;
        C61914bx bxVar = this.f167384a;
        C60870cx cxVar = this.f167385b;
        synchronized (bxVar) {
            list = bxVar.f167390d;
            bxVar.f167390d = bxVar.f167389c;
            bxVar.f167389c = new ArrayList();
            daVar = null;
            if (!bxVar.f167390d.isEmpty()) {
                z = true;
            } else {
                if (!bxVar.f167388b) {
                    C60887da daVar2 = bxVar.f167387a;
                    bxVar.f167387a = null;
                    daVar = daVar2;
                }
                z = false;
            }
        }
        for (SettableFuture settableFuture : list) {
            try {
                settableFuture.mo57356n(cxVar.get());
            } catch (Throwable th) {
                settableFuture.mo57357o(th);
            }
        }
        if (z) {
            bxVar.mo58353c();
        }
        if (daVar != null) {
            daVar.shutdown();
        }
    }
}
