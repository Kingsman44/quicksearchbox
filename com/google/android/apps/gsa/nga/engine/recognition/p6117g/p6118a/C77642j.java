package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80562g;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80563h;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.j */
/* compiled from: PG */
public final /* synthetic */ class C77642j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ ac f213861a;

    public /* synthetic */ C77642j(ac acVar) {
        this.f213861a = acVar;
    }

    public final Object call() {
        ac acVar = this.f213861a;
        C80562g gVar = (C80562g) C80563h.f221128r.createBuilder();
        String c = acVar.c();
        gVar.copyOnWrite();
        C80563h hVar = (C80563h) gVar.instance;
        hVar.f221130a |= 1;
        hVar.f221131b = c;
        return new AtomicReference((C80563h) gVar.build());
    }
}
