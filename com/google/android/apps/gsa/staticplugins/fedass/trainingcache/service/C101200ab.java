package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100763ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100764ac;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100767af;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100768ag;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.ab */
/* compiled from: PG */
public final /* synthetic */ class C101200ab implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C101202ad f282475a;

    /* renamed from: b */
    public final /* synthetic */ List f282476b;

    public /* synthetic */ C101200ab(C101202ad adVar, List list) {
        this.f282475a = adVar;
        this.f282476b = list;
    }

    public final Object call() {
        C101202ad adVar = this.f282475a;
        List list = this.f282476b;
        C100768ag agVar = adVar.f282481a.f282464b;
        ((C19435g) agVar.f281668f.mo27525b()).mo24619a("Ekho.DeleteCacheWithoutRemovingAccounts.Started");
        C100742h.m166943a(new C100763ab(agVar, list)).mo92035e(new C100764ac(agVar)).mo92037h(new C100767af(agVar));
        return null;
    }
}
