package com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a;

import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.p10154a.C133707a;
import com.google.android.apps.search.googleapp.customtabs.p10156f.C133771b;
import com.google.common.base.C58838bb;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.a.v */
/* compiled from: PG */
public final /* synthetic */ class C133736v implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C133739y f364253a;

    /* renamed from: b */
    public final /* synthetic */ C133714af f364254b;

    public /* synthetic */ C133736v(C133739y yVar, C133714af afVar) {
        this.f364253a = yVar;
        this.f364254b = afVar;
    }

    public final Object call() {
        C133731q qVar;
        boolean z;
        C133739y yVar = this.f364253a;
        C133714af afVar = this.f364254b;
        int i = afVar.f364210b;
        synchronized (yVar.f364259b) {
            ConcurrentMap concurrentMap = yVar.f364260c;
            Integer valueOf = Integer.valueOf(i);
            WeakReference weakReference = (WeakReference) concurrentMap.get(valueOf);
            if (weakReference == null) {
                qVar = null;
            } else {
                qVar = (C133731q) weakReference.get();
            }
            if (qVar == null) {
                yVar.f364260c.remove(valueOf);
                qVar = yVar.mo111373b(i, true);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            C58838bb.m90868c(afVar.f364210b == qVar.f364235d);
            synchronized (qVar) {
                if (!qVar.f364241j) {
                    qVar.f364240i = afVar;
                    C133707a aVar = qVar.f364236e;
                    C133712ad adVar = afVar.f364211c;
                    if (adVar == null) {
                        adVar = C133712ad.f364202d;
                    }
                    C133771b bVar = adVar.f364206c;
                    if (bVar == null) {
                        bVar = C133771b.f364368e;
                    }
                    aVar.mo111348h(bVar, true, qVar.f364234c);
                    qVar.f364242k = false;
                    qVar.f364241j = true;
                } else {
                    throw new IllegalStateException("Session was already prepared");
                }
            }
        }
        return qVar;
    }
}
