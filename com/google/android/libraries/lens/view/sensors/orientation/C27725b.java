package com.google.android.libraries.lens.view.sensors.orientation;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.sensors.orientation.b */
/* compiled from: PG */
public final /* synthetic */ class C27725b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C27727d f75695a;

    public /* synthetic */ C27725b(C27727d dVar) {
        this.f75695a = dVar;
    }

    public final Object call() {
        C27727d dVar = this.f75695a;
        if (dVar.f75701e != null) {
            return null;
        }
        C27726c cVar = new C27726c(dVar, dVar.f75697a);
        cVar.enable();
        dVar.f75701e = cVar;
        return null;
    }
}
