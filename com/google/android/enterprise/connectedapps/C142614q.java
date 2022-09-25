package com.google.android.enterprise.connectedapps;

import android.os.Bundle;
import android.util.Log;
import com.google.android.enterprise.connectedapps.internal.C142577b;
import com.google.android.enterprise.connectedapps.internal.CrossProfileBundleCallSender;
import com.google.android.enterprise.connectedapps.p10715b.C142561b;
import com.google.android.enterprise.connectedapps.p10715b.C142562c;

/* renamed from: com.google.android.enterprise.connectedapps.q */
/* compiled from: PG */
public final /* synthetic */ class C142614q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C142543ac f386941a;

    public /* synthetic */ C142614q(C142543ac acVar) {
        this.f386941a = acVar;
    }

    public final void run() {
        C142543ac acVar = this.f386941a;
        Log.i("CrossProfileSender", "drainAsyncQueue");
        while (true) {
            C142623z zVar = (C142623z) acVar.f386819n.pollFirst();
            if (zVar != null) {
                C142542ab abVar = new C142542ab(acVar, zVar);
                try {
                    C142552al alVar = (C142552al) acVar.f386813h.get();
                    if (alVar == null) {
                        Log.w("CrossProfileSender", "OngoingCrossProfileCall: not bound anymore, adding back to queue");
                        acVar.f386819n.add(zVar);
                        return;
                    }
                    Bundle makeBundleCall = new CrossProfileBundleCallSender(alVar, zVar.f386950a, zVar.f386951b, abVar).makeBundleCall(zVar.f386952c);
                    if (makeBundleCall.containsKey("throwable")) {
                        acVar.mo117159k(abVar.f386801a);
                        throw new C142561b((RuntimeException) C142577b.m231205a(makeBundleCall));
                    }
                } catch (C142562c unused) {
                    Log.w("CrossProfileSender", "OngoingCrossProfileCall: UnavailableProfileException, adding back to queue");
                    acVar.f386819n.add(zVar);
                    return;
                }
            } else {
                return;
            }
        }
    }
}
