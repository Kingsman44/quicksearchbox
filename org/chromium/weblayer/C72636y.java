package org.chromium.weblayer;

import android.os.RemoteException;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72327aw;

/* renamed from: org.chromium.weblayer.y */
/* compiled from: PG */
public final class C72636y {

    /* renamed from: a */
    public final C72634w f193208a;

    protected C72636y() {
        this.f193208a = null;
    }

    public C72636y(C72327aw awVar, C72634w wVar) {
        this.f193208a = wVar;
        try {
            awVar.mo63751v(new C72635x(this));
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
