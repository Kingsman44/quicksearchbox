package com.google.android.apps.gsa.staticplugins.gearhead;

import android.content.IntentFilter;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.f */
/* compiled from: PG */
public final /* synthetic */ class C101336f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282825a;

    public /* synthetic */ C101336f(C101325be beVar) {
        this.f282825a = beVar;
    }

    public final void run() {
        C101325be beVar = this.f282825a;
        C101310au auVar = new C101310au(beVar);
        beVar.f282753J = auVar;
        beVar.f282786p.registerReceiver(auVar, new IntentFilter("com.google.android.apps.gsa.staticplugins.gearhead.TRIGGER_ZWIEBACK_DEBUG_INTENT"));
    }
}
