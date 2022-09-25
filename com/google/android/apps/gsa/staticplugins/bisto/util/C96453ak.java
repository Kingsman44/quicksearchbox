package com.google.android.apps.gsa.staticplugins.bisto.util;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.ak */
/* compiled from: PG */
public final /* synthetic */ class C96453ak implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96456an f269831a;

    public /* synthetic */ C96453ak(C96456an anVar) {
        this.f269831a = anVar;
    }

    public final void run() {
        C96456an anVar = this.f269831a;
        C60870cx cxVar = anVar.f269839d;
        if (cxVar != null && !cxVar.isDone()) {
            anVar.f269839d.cancel(true);
        }
        anVar.f269839d = null;
    }
}
