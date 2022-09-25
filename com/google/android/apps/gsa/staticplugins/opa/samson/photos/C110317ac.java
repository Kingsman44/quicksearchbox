package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.util.Base64;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86053n;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60470rb;
import com.google.p4715m.p4716a.p4717a.p4719b.C62657a;
import com.google.p4715m.p4716a.p4717a.p4719b.C62658b;
import com.google.p4715m.p4716a.p4717a.p4719b.C62659c;
import com.google.p4715m.p4716a.p4717a.p4719b.C62660d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.ac */
/* compiled from: PG */
public final /* synthetic */ class C110317ac implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110318ad f307473a;

    public /* synthetic */ C110317ac(C110318ad adVar) {
        this.f307473a = adVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110318ad adVar = this.f307473a;
        C86053n nVar = (C86053n) obj;
        HashMap hashMap = new HashMap();
        if (nVar != null) {
            String str = nVar.f232632a;
            if (str == null) {
                C58976aa aaVar = C58975e.f156826a;
                C60470rb rbVar = C60470rb.SUCCESS;
            } else {
                String g = adVar.f307478e.mo79673g();
                if (g == null) {
                    C58976aa aaVar2 = C58975e.f156826a;
                } else {
                    if (adVar.f307475b.mo79746e(C90014bt.f247197cc)) {
                        C62657a aVar = (C62657a) C62660d.f169183b.createBuilder();
                        C62658b bVar = (C62658b) C62659c.f169178d.createBuilder();
                        bVar.copyOnWrite();
                        C62659c cVar = (C62659c) bVar.instance;
                        cVar.f169180a |= 1;
                        cVar.f169181b = g;
                        bVar.copyOnWrite();
                        C62659c cVar2 = (C62659c) bVar.instance;
                        cVar2.f169180a |= 2;
                        cVar2.f169182c = str;
                        aVar.copyOnWrite();
                        C62660d dVar = (C62660d) aVar.instance;
                        C62659c cVar3 = (C62659c) bVar.build();
                        cVar3.getClass();
                        C62971cq cqVar = dVar.f169185a;
                        if (!cqVar.mo58948c()) {
                            dVar.f169185a = C62942bv.mutableCopy(cqVar);
                        }
                        dVar.f169185a.add(cVar3);
                        hashMap.put("X-Home-DeviceLinkedUserCreds", Base64.encodeToString(((C62660d) aVar.build()).toByteArray(), 10));
                    }
                    hashMap.put("Authorization", "Bearer ".concat(str));
                    hashMap.put("Accept-Language", ((bm) adVar.f307482i.mo27525b()).b());
                    hashMap.put("MOBILE_PROTOCOL_VERSION", "25");
                    hashMap.put("X-Backdrop-Client-Product", "dreamliner");
                }
            }
        }
        return hashMap;
    }
}
