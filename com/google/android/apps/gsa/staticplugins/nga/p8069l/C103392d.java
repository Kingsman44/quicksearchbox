package com.google.android.apps.gsa.staticplugins.nga.p8069l;

import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82361ci;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.geller.portable.C21978e;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58657nd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.io.IOException;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.l.d */
/* compiled from: PG */
public final /* synthetic */ class C103392d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C103393e f288215a;

    public /* synthetic */ C103392d(C103393e eVar) {
        this.f288215a = eVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C58495hd hdVar;
        C103393e eVar = this.f288215a;
        Geller a = eVar.f288222g.a();
        boolean z = false;
        for (String str : eVar.f288223h.mo79685s()) {
            if (a == null) {
                try {
                    hdVar = C58729pv.f156485a;
                } catch (IOException e) {
                    ((C58970a) ((C58970a) ((C58970a) C103393e.f288216a.mo56225c()).mo56382g(e)).mo56372aa(21514)).mo56389s("failed to get sync status on corpus %s", C103393e.f288217b.name());
                }
            } else {
                C65753ak akVar = C103393e.f288217b;
                String str2 = C103393e.f288218c;
                GellerDatabase c = a.mo27176c(str);
                if (c != null) {
                    C58490gz gzVar = new C58490gz(4);
                    C58800sl lA = c.mo27244b(akVar.name(), str2).entrySet().iterator();
                    while (lA.hasNext()) {
                        Map.Entry entry = (Map.Entry) lA.next();
                        gzVar.mo55429h((String) entry.getKey(), C58495hd.m89898l(new C58657nd((Map) entry.getValue(), C21978e.f60614a)));
                    }
                    hdVar = gzVar.mo55427f(true);
                } else {
                    throw new IOException("Database not found for user : " + str + " on " + akVar.name());
                }
            }
            if (hdVar.containsKey(C103393e.f288218c)) {
                C58495hd hdVar2 = (C58495hd) hdVar.get(C103393e.f288218c);
                Instant minus = eVar.f288225j.mo57444a().minus(C103393e.f288219d);
                if (!z) {
                    if (!Collection.EL.stream(hdVar2.entrySet()).noneMatch(new C103390b(minus))) {
                        z = false;
                    }
                }
                z = true;
            }
            z = true;
        }
        eVar.f288224i.mo75579d(new C82361ci("NGA_GELLER_SYNC_STALE", z));
        return C118826c.f331422a;
    }
}
