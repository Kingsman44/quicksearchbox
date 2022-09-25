package com.google.android.apps.gsa.sidekick.main.p7216k;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.proactive.C84174j;
import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.staticplugins.p7686co.p7695i.C98444k;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.p375ai.p378b.C7749in;
import com.google.p375ai.p378b.C8142xb;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.sidekick.main.k.c */
/* compiled from: PG */
public final /* synthetic */ class C91449c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C91454h f255077a;

    /* renamed from: b */
    public final /* synthetic */ C8142xb f255078b;

    public /* synthetic */ C91449c(C91454h hVar, C8142xb xbVar) {
        this.f255077a = hVar;
        this.f255078b = xbVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C91454h hVar = this.f255077a;
        C8142xb xbVar = this.f255078b;
        C98444k k = ((C84160c) hVar.f255086c.mo27525b()).mo77610k(String.format(Locale.US, "Handle Rendering Stopped (%b, %s)", new Object[]{true, xbVar.name()}));
        ((C84174j) hVar.f255092i.mo27525b()).mo77581b(C7749in.RENDERING_STOPPED, xbVar.f28649u, false, k);
        k.mo91113b();
        return C118826c.f331422a;
    }
}
