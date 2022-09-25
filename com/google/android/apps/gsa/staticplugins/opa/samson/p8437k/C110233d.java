package com.google.android.apps.gsa.staticplugins.opa.samson.p8437k;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110398b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114811bh;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28294l;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.p4566l.C60214n;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.k.d */
/* compiled from: PG */
final class C110233d implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C110234e f307175a;

    public C110233d(C110234e eVar) {
        this.f307175a = eVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        try {
            this.f307175a.mo98492d(new Bundle());
        } catch (RemoteException e) {
            C59104x c = C110234e.f307176a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AmBinderSess");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25885)).mo56386p("remote exception updating ui bundle");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Bundle bundle;
        List list = (List) obj;
        try {
            C110234e eVar = this.f307175a;
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < size; i++) {
                C28292j jVar = new C28292j(67335);
                jVar.mo33795i(5);
                jVar.f76976d = true;
                arrayList2.add(jVar);
            }
            C60321oe b = C28285c.m52875b(C28293k.m52906c(new C28292j(67334), C58557jl.m90127h(arrayList2, C110231b.f307173a)), 67333);
            C89949q.m146521e(b, false);
            b.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                C114811bh bhVar = (C114811bh) list.get(i2);
                C87565h hVar = new C87565h();
                hVar.f236532ac = bhVar.mo101617a();
                hVar.f236556b = e.ac;
                hVar.f236523a = "and.opa.aod.oem.chip";
                C60214n g = C28285c.m52880g((C28292j) arrayList2.get(i2));
                if (g != null) {
                    hVar.f236571q = C28294l.m52913c(g);
                }
                if (bhVar.mo101619c() != null) {
                    C110398b bVar = eVar.f307177b;
                    String d = bhVar.mo101620d();
                    Intent c = bhVar.mo101619c();
                    c.getClass();
                    bundle = bVar.mo98626b(d, d, (C87565h) null, true, c);
                } else {
                    bundle = eVar.f307177b.mo98626b(bhVar.mo101621e(), bhVar.mo101620d(), hVar, true, (Intent) null);
                }
                arrayList.add(bundle);
            }
            int a = (int) eVar.f307178c.mo79743a(C90014bt.f247454hU);
            if (arrayList.size() > a) {
                arrayList.subList(a, arrayList.size()).clear();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArrayList("suggestion_chips", arrayList);
            ArrayList arrayList3 = new ArrayList();
            C87565h hVar2 = new C87565h();
            hVar2.f236556b = e.ad;
            hVar2.f236523a = "and.opa.aod.oem.logo";
            arrayList3.add(eVar.f307177b.mo98627c(hVar2, -1));
            bundle2.putParcelableArrayList("entry_points", arrayList3);
            bundle2.putByteArray("impression_bytes", b.toByteArray());
            eVar.mo98492d(bundle2);
        } catch (RemoteException e) {
            C59104x c2 = C110234e.f307176a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AmBinderSess");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(25886)).mo56386p("remote exception updating ui bundle");
        }
    }
}
