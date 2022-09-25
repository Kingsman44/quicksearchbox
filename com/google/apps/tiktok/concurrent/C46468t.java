package com.google.apps.tiktok.concurrent;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.concurrent.t */
/* compiled from: PG */
public final /* synthetic */ class C46468t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46472x f121594a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f121595b;

    public /* synthetic */ C46468t(C46472x xVar, C60870cx cxVar) {
        this.f121594a = xVar;
        this.f121595b = cxVar;
    }

    public final void run() {
        C46472x xVar = this.f121594a;
        C60870cx cxVar = this.f121595b;
        synchronized (xVar.f121608e) {
            C46470v vVar = (C46470v) xVar.f121610g.remove(cxVar);
            C46471w wVar = C46471w.STOPPED;
            if (xVar.f121613j.ordinal() == 2) {
                if (vVar == xVar.f121615l) {
                    if (xVar.f121610g.isEmpty()) {
                        xVar.mo50475c();
                    } else {
                        xVar.mo50476d((C46470v) null);
                    }
                }
            }
        }
    }
}
