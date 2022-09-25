package com.google.apps.tiktok.dataservice.local;

import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.apps.tiktok.dataservice.local.ac */
/* compiled from: PG */
public final /* synthetic */ class C46828ac implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46838am f122245a;

    public /* synthetic */ C46828ac(C46838am amVar) {
        this.f122245a = amVar;
    }

    public final void run() {
        C46838am amVar = this.f122245a;
        C58800sl lA = amVar.f122257a.mo55367b().keySet().iterator();
        while (lA.hasNext()) {
            amVar.mo50843d((C46841ap) lA.next());
        }
    }
}
