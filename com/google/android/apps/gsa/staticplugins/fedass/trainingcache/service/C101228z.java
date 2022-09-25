package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service;

import com.google.android.libraries.assistant.trainingcache.agsa.C19427e;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.z */
/* compiled from: PG */
public final /* synthetic */ class C101228z implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C101202ad f282509a;

    public /* synthetic */ C101228z(C101202ad adVar) {
        this.f282509a = adVar;
    }

    public final Object call() {
        C19427e eVar = (C19427e) this.f282509a.f282481a.f282464b.f281666d.mo27525b();
        if (!eVar.f54329b.get()) {
            return null;
        }
        EkhoWriter.nativeEndSession(((EkhoWriter) eVar.f54333f.get()).f54364a.get(), 0);
        return null;
    }
}
