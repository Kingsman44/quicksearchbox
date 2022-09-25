package com.google.android.gms.learning.dynamite.training;

import android.os.RemoteException;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.internal.training.C144802f;
import com.google.android.libraries.micore.learning.training.nflrunner.C29753k;
import com.google.fcp.client.http.C61102k;

/* renamed from: com.google.android.gms.learning.dynamite.training.i */
/* compiled from: PG */
final class C144713i {

    /* renamed from: a */
    public static final C61102k f391508a = C144709e.f391504a;

    /* renamed from: a */
    public static C61102k m235224a(C144802f fVar, C144573b bVar, C144827n nVar, C29753k kVar) {
        try {
            if (fVar.mo120227d()) {
                kVar.mo34910j(fVar.mo120228e());
                if (!fVar.mo120229f()) {
                    kVar.mo34903c(-1);
                }
                fVar.mo120225b(bVar.mo120017ay());
                return new C144711g(fVar);
            } else if (fVar.mo120226c()) {
                nVar.mo120056h(1794);
                return f391508a;
            } else {
                nVar.mo120056h(1793);
                return C144710f.f391505a;
            }
        } catch (RemoteException e) {
            throw new IllegalStateException("unexpected RemoteException", e);
        }
    }
}
