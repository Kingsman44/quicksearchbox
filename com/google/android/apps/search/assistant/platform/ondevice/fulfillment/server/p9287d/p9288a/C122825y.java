package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a;

import com.google.android.apps.gsa.binaries.satin.app.C74303to;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.C122794a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9295i.p9296a.p9297a.C122969b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.d.a.y */
/* compiled from: PG */
public final /* synthetic */ class C122825y implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C122799ad f340206a;

    public /* synthetic */ C122825y(C122799ad adVar) {
        this.f340206a = adVar;
    }

    public final Object call() {
        C122799ad adVar = this.f340206a;
        if (adVar.f340151c == null) {
            C122809i iVar = adVar.f340154f;
            if (iVar == null) {
                C122794a aVar = new C122794a(adVar.f340149a, adVar.f340152d.mo105894a());
                C74303to toVar = (C74303to) adVar.f340153e.f340169a.f340510a.mo17428b();
                toVar.getClass();
                C122809i iVar2 = new C122809i(new C122969b(aVar, toVar));
                adVar.f340154f = iVar2;
                iVar2.hashCode();
                iVar = iVar2;
            }
            return iVar.mo105751a();
        }
        throw new C122798ac();
    }
}
