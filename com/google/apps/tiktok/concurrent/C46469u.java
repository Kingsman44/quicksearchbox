package com.google.apps.tiktok.concurrent;

/* renamed from: com.google.apps.tiktok.concurrent.u */
/* compiled from: PG */
public final /* synthetic */ class C46469u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46472x f121596a;

    public /* synthetic */ C46469u(C46472x xVar) {
        this.f121596a = xVar;
    }

    public final void run() {
        C46472x xVar = this.f121596a;
        boolean b = xVar.f121607d.mo50467b();
        synchronized (xVar.f121608e) {
            boolean z = false;
            if (!b) {
                try {
                    if (!xVar.f121610g.isEmpty()) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C46471w wVar = C46471w.STOPPED;
            int ordinal = xVar.f121613j.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    if (!z) {
                        xVar.mo50475c();
                    }
                }
            } else if (z) {
                xVar.mo50474b(xVar.mo50473a((C46470v) null).f121597a);
            }
        }
    }
}
