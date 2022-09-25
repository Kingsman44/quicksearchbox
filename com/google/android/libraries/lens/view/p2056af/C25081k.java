package com.google.android.libraries.lens.view.p2056af;

import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.search.p2871b.p2895i.C37256e;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.p4563i.C59880ap;
import com.google.common.p4552o.p4563i.C59897bf;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.p4438c.p4439a.C57913b;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.p4750c.C62948a;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.libraries.lens.view.af.k */
/* compiled from: PG */
public final /* synthetic */ class C25081k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25086p f68338a;

    /* renamed from: b */
    public final /* synthetic */ C37254c f68339b;

    public /* synthetic */ C25081k(C25086p pVar, C37254c cVar) {
        this.f68338a = pVar;
        this.f68339b = cVar;
    }

    public final void run() {
        long j;
        Object obj;
        C25086p pVar = this.f68338a;
        C37256e f = this.f68339b.mo40782f();
        if (f.mo40799e().mo56113h()) {
            j = ((Long) f.mo40799e().mo56107c()).longValue();
        } else {
            j = pVar.f68347e.mo26872d();
        }
        long j2 = j;
        Long l = (Long) pVar.f68352j.get(f.mo40798c().f98877b);
        Map map = pVar.f68352j;
        String b = C25086p.m46381b(f.mo40798c().f98877b, f);
        Long valueOf = Long.valueOf(j2);
        map.put(b, valueOf);
        if (pVar.f68348f == null && C25086p.f68345c.containsKey(f.mo40798c().f98877b)) {
            Collection.EL.forEach(pVar.f68353k, C25074d.f68326a);
            pVar.f68350h.clear();
            pVar.f68348f = (C58528ij) C25086p.f68345c.get(f.mo40798c().f98877b);
        }
        C57915d dVar = ((C57913b) f.mo40797b().instance).f154903d;
        if (dVar == null) {
            dVar = C57915d.f154905a;
        }
        C62940bt r4 = C62942bv.checkIsLite(C59898bg.f161867w);
        dVar.mo58887l(r4);
        Object l2 = dVar.f169962ag.mo58854l(r4.f169971d);
        if (l2 == null) {
            obj = r4.f169969b;
        } else {
            obj = r4.mo58889c(l2);
        }
        C59898bg bgVar = (C59898bg) obj;
        if (C25086p.f68344b.containsKey(f.mo40798c().f98877b)) {
            C25085o oVar = (C25085o) C25086p.f68344b.get(f.mo40798c().f98877b);
            String b2 = C25086p.m46381b(oVar.f68341a, f);
            String str = oVar.f68342b;
            if (pVar.f68352j.containsKey(b2)) {
                Long l3 = (Long) pVar.f68352j.get(b2);
                l3.getClass();
                long longValue = l3.longValue();
                if (l == null || l.longValue() <= longValue) {
                    pVar.f68350h.put(str, new C25082l(longValue));
                    if (f.mo40798c().f98877b.equals("LENS_HYBRID_TRANSLATION_RECEIVED")) {
                        Map map2 = pVar.f68350h;
                        C59880ap apVar = bgVar.f161888t;
                        if (apVar == null) {
                            apVar = C59880ap.f161815c;
                        }
                        C62910ar arVar = apVar.f161818b;
                        if (arVar == null) {
                            arVar = C62910ar.f169858c;
                        }
                        C62948a.m95455f(arVar);
                        map2.put("HybridTranslateNetworkLatency", new C25082l(longValue));
                    }
                    if (C25086p.f68346d.contains(f.mo40798c().f98877b)) {
                        Collection.EL.forEach(pVar.f68353k, new C25075e(longValue, j2, bgVar));
                    } else if ("LENS_HYBRID_TRANSLATION_RECEIVED".equals(f.mo40798c().f98877b)) {
                        Collection.EL.forEach(pVar.f68353k, new C25076f(longValue, j2, bgVar));
                    } else {
                        Collection.EL.forEach(pVar.f68353k, new C25077g(longValue, j2));
                    }
                } else {
                    ((C58970a) ((C58970a) C25086p.f68343a.mo56226d()).mo56372aa(49655)).mo56363P("End-event %s (time : %d) doesn't have a corresponding start-event logged yet. The last pair (%s, %s) occurred at (%d, %d). Ignoring this to avoid reporting incorrect latency for %s.", f.mo40798c().f98877b, valueOf, b2, f.mo40798c().f98877b, Long.valueOf(longValue), l, str);
                    return;
                }
            }
        }
        C58528ij ijVar = pVar.f68348f;
        if (ijVar == null || !ijVar.contains(f.mo40798c().f98877b)) {
            C59897bf bfVar = bgVar.f161885q;
            if (bfVar == null) {
                bfVar = C59897bf.f161859f;
            }
            if ((bfVar.f161861a & 1) != 0 && C25086p.f68345c.containsKey(f.mo40798c().f98877b)) {
                Set set = pVar.f68349g;
                C59897bf bfVar2 = bgVar.f161885q;
                if (bfVar2 == null) {
                    bfVar2 = C59897bf.f161859f;
                }
                set.add(bfVar2.f161862b);
                return;
            }
            return;
        }
        Set set2 = pVar.f68349g;
        C59897bf bfVar3 = bgVar.f161885q;
        if (bfVar3 == null) {
            bfVar3 = C59897bf.f161859f;
        }
        set2.remove(bfVar3.f161862b);
        if (pVar.f68349g.isEmpty()) {
            C25758g gVar = pVar.f68351i;
            C58487gw gwVar = (C58487gw) Collection.EL.stream(pVar.f68350h.entrySet()).sorted(Comparator.CC.comparingLong(C25078h.f68335a)).collect(C58370cn.m89401a(C25079i.f68336a, C25080j.f68337a));
            gVar.mo5706i(C58833ax.m90834k(new C25084n()));
            pVar.f68348f = null;
        }
    }
}
