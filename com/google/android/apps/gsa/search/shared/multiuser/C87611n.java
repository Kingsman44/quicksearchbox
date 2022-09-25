package com.google.android.apps.gsa.search.shared.multiuser;

import android.os.RemoteException;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.search.shared.multiuser.n */
/* compiled from: PG */
final class C87611n extends C90883aq {

    /* renamed from: a */
    private final C87612o f236677a;

    /* renamed from: b */
    private final C87601d f236678b;

    public C87611n(C87612o oVar, C87601d dVar) {
        super("RemoteMultiUserDS_CB", 1, 0);
        this.f236677a = oVar;
        this.f236678b = dVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if ((th instanceof CancellationException) || (th instanceof InterruptedException)) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            throw new RuntimeException(th);
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C87604g gVar = (C87604g) obj;
        try {
            C58976aa aaVar = C58975e.f156826a;
            this.f236677a.mo81745a(gVar, this.f236678b);
        } catch (RemoteException e) {
            mo17910gl(e);
        }
    }
}
