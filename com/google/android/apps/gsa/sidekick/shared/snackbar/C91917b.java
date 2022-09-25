package com.google.android.apps.gsa.sidekick.shared.snackbar;

import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.snackbar.b */
/* compiled from: PG */
final class C91917b extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ C91919d f256337a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91917b(C91919d dVar) {
        super("Auto dismiss");
        this.f256337a = dVar;
    }

    public final void run() {
        C91919d dVar = this.f256337a;
        Iterator it = dVar.f256341d.iterator();
        if (!it.hasNext()) {
            dVar.f256339b.mo85149n(dVar.f256342e);
        } else {
            C91918c cVar = (C91918c) it.next();
            throw null;
        }
    }
}
