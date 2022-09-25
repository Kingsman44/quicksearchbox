package org.chromium.weblayer;

import android.os.RemoteException;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72327aw;

/* renamed from: org.chromium.weblayer.ab */
/* compiled from: PG */
public final class C72566ab {

    /* renamed from: a */
    private final C72327aw f193099a;

    protected C72566ab() {
        this.f193099a = null;
    }

    public C72566ab(C72327aw awVar) {
        this.f193099a = awVar;
    }

    /* renamed from: a */
    public final void mo64432a(String str, boolean z) {
        C72604bm.m107399a();
        try {
            this.f193099a.mo63736g(str, z);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: b */
    public final boolean mo64433b(C72637z zVar) {
        C72565aa aaVar;
        C72604bm.m107399a();
        if (zVar != null) {
            try {
                aaVar = new C72565aa(zVar);
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        } else {
            aaVar = null;
        }
        return this.f193099a.mo63748s(aaVar);
    }
}
