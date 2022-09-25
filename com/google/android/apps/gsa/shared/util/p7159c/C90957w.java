package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.shared.util.c.w */
/* compiled from: PG */
public final /* synthetic */ class C90957w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C90876aj f254167a;

    public /* synthetic */ C90957w(C90876aj ajVar) {
        this.f254167a = ajVar;
    }

    public final void run() {
        C90876aj ajVar = this.f254167a;
        if (!ajVar.f254088a.isDone()) {
            ajVar.mo57357o(new TimeoutException());
            ajVar.f254088a.cancel(true);
        }
    }
}
