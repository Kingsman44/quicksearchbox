package com.google.android.apps.gsa.staticplugins.gearhead;

import android.content.IntentFilter;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.ab */
/* compiled from: PG */
public final /* synthetic */ class C101291ab implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282697a;

    public /* synthetic */ C101291ab(C101325be beVar) {
        this.f282697a = beVar;
    }

    public final void run() {
        C101325be beVar = this.f282697a;
        C101309at atVar = new C101309at(beVar);
        beVar.f282752I = atVar;
        IntentFilter intentFilter = new IntentFilter("com.google.android.apps.gsa.staticplugins.gearhead.TRIGGER_VOICE_SESSION");
        intentFilter.addAction("com.google.android.apps.gsa.staticplugins.gearhead.TRIGGER_VOICE_SESSION");
        beVar.f282786p.registerReceiver(atVar, intentFilter);
    }
}
