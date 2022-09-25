package com.google.android.libraries.lens.sdk.p2045c;

import android.os.RemoteException;
import com.google.android.libraries.lens.sdk.p2047d.C24936f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.sdk.c.d */
/* compiled from: PG */
public final /* synthetic */ class C24919d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24923h f68036a;

    /* renamed from: b */
    public final /* synthetic */ int f68037b;

    /* renamed from: c */
    public final /* synthetic */ C24936f f68038c;

    public /* synthetic */ C24919d(C24923h hVar, int i, C24936f fVar) {
        this.f68036a = hVar;
        this.f68037b = i;
        this.f68038c = fVar;
    }

    public final void run() {
        String[] packagesForUid;
        int length;
        C24923h hVar = this.f68036a;
        int i = this.f68037b;
        C24936f fVar = this.f68038c;
        C59104x b = C24923h.f68044a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LensServiceController");
        ((C59052c) ((C59052c) b).mo56372aa(48950)).mo56387q("attachInner uid %d", i);
        Map map = hVar.f68049f;
        Integer valueOf = Integer.valueOf(i);
        if (((C24914a) map.get(valueOf)) == null) {
            String str = null;
            if (!(i == -1 || (packagesForUid = hVar.f68046c.getPackagesForUid(i)) == null || (length = packagesForUid.length) == 0)) {
                if (length > 1) {
                    C59104x d = C24923h.f68044a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "LensServiceController");
                    ((C59052c) ((C59052c) d).mo56372aa(48948)).mo56395y("There were %d packages instead of the expected 1. Ignoring extra packages... [%s]", length, packagesForUid);
                }
                str = packagesForUid[0];
            }
            if (str != null) {
                C24914a aVar = new C24914a(i, str, fVar);
                try {
                    fVar.asBinder().linkToDeath(new C24922g(hVar, aVar), 0);
                    hVar.f68049f.put(valueOf, aVar);
                } catch (RemoteException unused) {
                }
            } else {
                C59104x d2 = C24923h.f68044a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "LensServiceController");
                ((C59052c) ((C59052c) d2).mo56372aa(48951)).mo56387q("Failed to get package name for uid %d", i);
            }
        } else {
            C59104x d3 = C24923h.f68044a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "LensServiceController");
            ((C59052c) ((C59052c) d3).mo56372aa(48952)).mo56386p("Client reattached.");
        }
    }
}
