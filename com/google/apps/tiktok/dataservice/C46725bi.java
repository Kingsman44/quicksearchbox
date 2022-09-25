package com.google.apps.tiktok.dataservice;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.dataservice.bi */
/* compiled from: PG */
public final /* synthetic */ class C46725bi implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46726bj f122045a;

    public /* synthetic */ C46725bi(C46726bj bjVar) {
        this.f122045a = bjVar;
    }

    public final void run() {
        C60870cx cxVar;
        C46726bj bjVar = this.f122045a;
        synchronized (bjVar.f122047b.f122052a) {
            C46727bk bkVar = (C46727bk) bjVar.f122047b.f122053b.get(bjVar.f122046a);
            cxVar = null;
            if (bkVar != null) {
                int i = bkVar.f122051b;
                if (i > 1) {
                    bkVar.f122051b = i - 1;
                } else {
                    cxVar = bkVar.f122050a;
                    bjVar.f122047b.f122053b.remove(bjVar.f122046a);
                }
            }
        }
        if (cxVar != null) {
            cxVar.cancel(false);
        }
    }
}
