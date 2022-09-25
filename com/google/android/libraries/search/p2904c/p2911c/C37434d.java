package com.google.android.libraries.search.p2904c.p2911c;

import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2911c.p2912a.C37430g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.search.c.c.d */
/* compiled from: PG */
public final /* synthetic */ class C37434d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C37446p f99382a;

    /* renamed from: b */
    public final /* synthetic */ C37430g f99383b;

    public /* synthetic */ C37434d(C37446p pVar, C37430g gVar) {
        this.f99382a = pVar;
        this.f99383b = gVar;
    }

    public final void run() {
        C37680i iVar;
        C37446p pVar = this.f99382a;
        C37430g gVar = this.f99383b;
        if (pVar.f99412g) {
            C59104x b = C37446p.f99406a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ALT.BytesReceiverBuffer");
            ((C59052c) ((C59052c) b).mo56372aa(52682)).mo56354G("#audio# skip adding processor (%s) as buffer (%s) is closed", C37331f.m66337a(gVar), C37331f.m66337a(pVar));
            return;
        }
        Iterator it = pVar.f99410e.iterator();
        while (it.hasNext()) {
            C37819l lVar = (C37819l) it.next();
            if (lVar.f100343b == 1) {
                iVar = (C37680i) lVar.f100344c;
            } else {
                iVar = C37680i.f100071c;
            }
            C63088z zVar = iVar.f100074b;
            gVar.mo40953c(zVar.mo59174N(), 0, zVar.mo59031d());
            zVar.mo59031d();
        }
        pVar.f99414i.add(gVar);
        C58976aa aaVar = C58975e.f156826a;
    }
}
