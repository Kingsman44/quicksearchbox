package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.p489g.p493c.C9132e;
import com.google.android.apps.p489g.p493c.C9133f;
import com.google.android.apps.p489g.p493c.C9135h;
import com.google.android.gms.location.C144870aa;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C7805kp;
import com.google.p375ai.p378b.C7874nd;
import com.google.p375ai.p378b.C8174yg;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.bh */
/* compiled from: PG */
final class C91523bh extends C91525bj {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo85862a(C9133f fVar) {
        if ((fVar.f31431a & 16) != 0) {
            return fVar.f31436f;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: b */
    public final boolean mo85863b(C9133f fVar, long j, List list) {
        if (!C91525bj.m149697j(fVar, j, (Long) null)) {
            C7799kj kjVar = fVar.f31433c;
            if (kjVar == null) {
                kjVar = C7799kj.f27263h;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C9135h hVar = (C9135h) it.next();
                if ((hVar.f31443a & 1) != 0) {
                    C7799kj kjVar2 = hVar.f31444b;
                    if (kjVar2 == null) {
                        kjVar2 = C7799kj.f27263h;
                    }
                    if (kjVar.equals(kjVar2)) {
                        return false;
                    }
                }
            }
            C58976aa aaVar = C58975e.f156826a;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo85864c(C9132e eVar, Map map, C58881cr crVar) {
        C144870aa aaVar = new C144870aa();
        aaVar.mo120365c(-1);
        aaVar.f391811c = 60000;
        aaVar.f391810b = 300000;
        aaVar.f391809a = 6;
        C7718hj hjVar = ((C9133f) eVar.instance).f31432b;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        C7874nd ndVar = hjVar.f26938J;
        if (ndVar == null) {
            ndVar = C7874nd.f27577J;
        }
        C8174yg ygVar = ndVar.f27593e;
        if (ygVar == null) {
            ygVar = C8174yg.f28719i;
        }
        for (C7805kp kpVar : ygVar.f28724e) {
            int i = kpVar.f27286a;
            if ((i & 1) == 0 || (i & 2) == 0 || (i & 16) == 0 || kpVar.f27291f <= C59203do.f157270a) {
                C59104x d = C91525bj.f255276a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PendingNotificationAdap");
                ((C59052c) ((C59052c) d).mo56372aa(11679)).mo56386p("Geofence is incomplete");
            } else {
                long longValue = ((C91498am) crVar).mo6453a().longValue();
                eVar.copyOnWrite();
                C9133f fVar = (C9133f) eVar.instance;
                C62964ck ckVar = fVar.f31438h;
                if (!ckVar.mo58948c()) {
                    fVar.f31438h = C62942bv.mutableCopy(ckVar);
                }
                fVar.f31438h.mo58929f(longValue);
                aaVar.mo120366d("notification_" + longValue);
                aaVar.mo120364b(kpVar.f27287b, kpVar.f27288c, (float) kpVar.f27291f);
                map.put(aaVar.mo120363a(), kpVar);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo85865d(C7874nd ndVar, C7874nd ndVar2) {
        if (ndVar == null && ndVar2 == null) {
            return false;
        }
        if (!(ndVar == null || ndVar2 == null || super.mo85865d(ndVar, ndVar2))) {
            C8174yg ygVar = ndVar.f27593e;
            if (ygVar == null) {
                ygVar = C8174yg.f28719i;
            }
            C8174yg ygVar2 = ndVar2.f27593e;
            if (ygVar2 == null) {
                ygVar2 = C8174yg.f28719i;
            }
            return !ygVar.equals(ygVar2);
        }
    }
}
