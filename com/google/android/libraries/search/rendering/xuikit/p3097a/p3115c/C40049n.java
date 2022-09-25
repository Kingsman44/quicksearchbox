package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28449s;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28376al;
import com.google.android.libraries.logging.p2185ve.synthetic.C28470n;
import com.google.android.libraries.search.logging.p3046g.C39214t;
import com.google.android.libraries.search.logging.p3046g.C39215u;
import com.google.android.libraries.search.logging.p3046g.C39216v;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60204do;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4387a.p4390b.p4391a.C57692h;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4387a.p4390b.p4391a.C57693i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4816ai.p4818b.C63204j;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64252a;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64253b;
import com.google.protos.youtube.elements.C66192df;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.n */
/* compiled from: PG */
public final /* synthetic */ class C40049n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40058w f105223a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f105224b;

    public /* synthetic */ C40049n(C40058w wVar, C58485gu guVar) {
        this.f105223a = wVar;
        this.f105224b = guVar;
    }

    public final void run() {
        C28439i iVar;
        C40058w wVar = this.f105223a;
        C58485gu guVar = this.f105224b;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C66192df dfVar = (C66192df) guVar.get(i);
            C40035ap a = C40030ak.m69542a(dfVar);
            int i2 = 1;
            if (a instanceof C40029aj) {
                C40029aj ajVar = (C40029aj) a;
                C66192df dfVar2 = ajVar.f105189b;
                synchronized (wVar.f105251h) {
                    if (!wVar.f105254k.containsKey(Integer.valueOf(dfVar2.f180000c))) {
                        C57693i iVar2 = ajVar.f105188a;
                        C28313c a2 = wVar.f105245b.mo33805a(C28427h.m53115a(iVar2.f154084b));
                        a2.mo33858f(C28375ak.m53059a((long) dfVar2.f180000c));
                        if ((iVar2.f154083a & 64) != 0) {
                            a2.mo33858f(C28449s.m53155a(iVar2.f154090h));
                        }
                        if ((iVar2.f154083a & 32) != 0) {
                            C62940bt btVar = C39216v.f103175a;
                            C39214t tVar = (C39214t) C39215u.f103167f.createBuilder();
                            String str = iVar2.f154089g;
                            tVar.copyOnWrite();
                            C39215u uVar = (C39215u) tVar.instance;
                            str.getClass();
                            uVar.f103169a |= 1;
                            uVar.f103170b = str;
                            a2.mo33858f(new C28353e(btVar, (C39215u) tVar.build()));
                        }
                        if ((iVar2.f154083a & 4) != 0) {
                            C63204j jVar = iVar2.f154086d;
                            if (jVar == null) {
                                jVar = C63204j.f170749e;
                            }
                            a2.mo33858f(new C28353e(C28376al.f77109a, jVar));
                        }
                        if ((iVar2.f154083a & 128) != 0) {
                            try {
                                C60204do doVar = iVar2.f154091i;
                                if (doVar == null) {
                                    doVar = C60204do.f162875a;
                                }
                                a2.mo33858f(new C28353e(C28376al.f77111c, (aqs) C62942bv.parseFrom((C62942bv) aqs.f159780k, doVar.toByteArray(), C62921ba.f169869a)));
                            } catch (C62974ct e) {
                                C59052c cVar = (C59052c) ((C59052c) C40058w.f105244a.mo56225c()).mo56382g(e);
                                C58976aa aaVar = C40364q.f106014a;
                                C64252a aVar = (C64252a) wVar.f105252i.mo42422a().toBuilder();
                                int i3 = iVar2.f154084b;
                                aVar.copyOnWrite();
                                C64253b bVar = (C64253b) aVar.instance;
                                bVar.f173733a |= 16;
                                bVar.f173738f = i3;
                                cVar.mo56378ag(aaVar, (C64253b) aVar.build());
                                ((C59052c) cVar.mo56372aa(53305)).mo56387q("Error parsing VisualElementLiteProto from VisualElementProto for veId %d.", iVar2.f154084b);
                            }
                        }
                        synchronized (wVar.f105251h) {
                            iVar = (C28439i) wVar.f105254k.get(Integer.valueOf(dfVar2.f180001d));
                            if (iVar == null) {
                                iVar = (C28439i) wVar.f105254k.get(wVar.f105255l.get(Integer.valueOf(dfVar2.f180001d)));
                                iVar.getClass();
                            }
                        }
                        C28439i a3 = C28470n.m53226a(iVar, a2);
                        int a4 = C57692h.m88519a(iVar2.f154085c);
                        if (a4 != 0) {
                            if (a4 == 2) {
                                i2 = 2;
                            }
                        }
                        a3.mo33892i(i2);
                        wVar.f105254k.put(Integer.valueOf(dfVar2.f180000c), a3);
                    }
                }
            } else if ((a instanceof C40034ao) || (a instanceof C40032am)) {
                int i4 = dfVar.f180000c;
                synchronized (wVar.f105251h) {
                    Map map = wVar.f105254k;
                    Integer valueOf = Integer.valueOf(i4);
                    C58838bb.m90883r(true ^ map.containsKey(valueOf));
                    if (!wVar.f105255l.containsKey(valueOf)) {
                        int i5 = dfVar.f180001d;
                        Map map2 = wVar.f105254k;
                        Integer valueOf2 = Integer.valueOf(i5);
                        if (map2.containsKey(valueOf2)) {
                            wVar.f105255l.put(valueOf, valueOf2);
                        } else {
                            Map map3 = wVar.f105255l;
                            Integer num = (Integer) map3.get(valueOf2);
                            num.getClass();
                            map3.put(valueOf, num);
                        }
                    }
                }
            }
        }
        if (!wVar.f105250g) {
            wVar.f105246c.mo33922f();
        }
    }
}
