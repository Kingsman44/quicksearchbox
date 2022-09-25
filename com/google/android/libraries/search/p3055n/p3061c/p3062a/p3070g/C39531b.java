package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3070g;

import android.content.Intent;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39385aa;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i.C39617i;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i.C39618j;

/* renamed from: com.google.android.libraries.search.n.c.a.g.b */
/* compiled from: PG */
public final /* synthetic */ class C39531b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C39532c f104089a;

    /* renamed from: b */
    public final /* synthetic */ Intent f104090b;

    public /* synthetic */ C39531b(C39532c cVar, Intent intent) {
        this.f104089a = cVar;
        this.f104090b = intent;
    }

    public final void run() {
        C39532c cVar = this.f104089a;
        String action = this.f104090b.getAction();
        if (action == null) {
            return;
        }
        if (action.equals("android.intent.action.SCREEN_ON") || action.equals("android.intent.action.SCREEN_OFF")) {
            C39385aa aaVar = cVar.f104091a.f104096e;
            aaVar.getClass();
            C39617i iVar = (C39617i) C39618j.f104289c.createBuilder();
            iVar.copyOnWrite();
            C39618j jVar = (C39618j) iVar.instance;
            jVar.f104291a |= 1;
            jVar.f104292b = true;
            aaVar.mo41797a((C39618j) iVar.build());
        }
    }
}
