package com.google.android.apps.gsa.publicsearch;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.publicsearch.y */
/* compiled from: PG */
final class C84226y implements C90757ba {

    /* renamed from: a */
    public C84206f f229226a;

    /* renamed from: fN */
    public final void mo77682fN(int i) {
        C84206f fVar = this.f229226a;
        if (fVar != null) {
            try {
                Parcel gA = fVar.mo17260gA();
                gA.writeInt(i);
                fVar.mo17263hf(1, gA);
            } catch (RemoteException e) {
                C59104x d = C84200aa.f229194a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PublicSession");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7109)).mo56386p("RemoteException: ");
            }
        }
    }
}
