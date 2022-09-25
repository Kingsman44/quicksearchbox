package com.google.android.apps.gsa.nga.engine.recognition.p6117g.p6118a;

import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80556a;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80557b;
import com.google.android.apps.gsa.nga.shared.p6305ae.p6306a.C80561f;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.g.a.c */
/* compiled from: PG */
public final /* synthetic */ class C77635c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C80561f f213853a;

    public /* synthetic */ C77635c(C80561f fVar) {
        this.f213853a = fVar;
    }

    public final Object call() {
        C80561f fVar = this.f213853a;
        C80556a aVar = (C80556a) C80557b.f221114f.createBuilder();
        aVar.copyOnWrite();
        C80557b bVar = (C80557b) aVar.instance;
        fVar.getClass();
        bVar.f221117b = fVar;
        bVar.f221116a |= 1;
        return new AtomicReference((C80557b) aVar.build());
    }
}
