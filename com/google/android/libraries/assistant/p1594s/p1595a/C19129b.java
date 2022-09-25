package com.google.android.libraries.assistant.p1594s.p1595a;

import com.google.android.libraries.assistant.p1594s.p1595a.p1596a.C19128a;
import com.google.android.libraries.assistant.p1594s.p1599c.C19200b;
import com.google.android.libraries.assistant.p1594s.p1599c.C19201c;
import com.google.android.libraries.assistant.p1594s.p1599c.C19202d;
import com.google.android.libraries.assistant.p1594s.p1599c.C19206h;
import com.google.android.libraries.assistant.p1594s.p1599c.C19210l;
import com.google.android.libraries.assistant.p1594s.p1599c.C19213o;
import com.google.android.libraries.assistant.p1594s.p1599c.C19214p;
import com.google.android.libraries.assistant.p1594s.p1599c.C19215q;
import com.google.android.libraries.assistant.p1594s.p1600d.p1601a.C19217a;
import com.google.android.libraries.assistant.p1594s.p1600d.p1601a.C19219c;
import com.google.android.libraries.assistant.p1594s.p1600d.p1601a.C19220d;
import com.google.android.libraries.assistant.p1594s.p1600d.p1601a.C19222f;
import com.google.android.libraries.assistant.p1594s.p1600d.p1601a.C19224h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.s.a.b */
/* compiled from: PG */
final class C19129b implements Callable {

    /* renamed from: a */
    final /* synthetic */ C19200b f53596a;

    /* renamed from: b */
    final /* synthetic */ C19130c f53597b;

    public C19129b(C19130c cVar, C19200b bVar) {
        this.f53597b = cVar;
        this.f53596a = bVar;
    }

    public final /* synthetic */ Object call() {
        Object obj;
        C19130c cVar = this.f53597b;
        C19200b bVar = this.f53596a;
        C58976aa aaVar = C58975e.f156826a;
        C19201c cVar2 = (C19201c) C19202d.f53762d.createBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : cVar.f53599b.entrySet()) {
            C19127a aVar = (C19127a) entry.getValue();
            aVar.mo24291e();
            int i = bVar.f53756a;
            C62961ch chVar = bVar.f53757b;
            if ((i & 128) != 0 && chVar.size() > 0 && !bVar.f53757b.contains(entry.getKey())) {
                entry.getKey();
            } else if ((bVar.f53756a & 256) != 0 && ((Integer) entry.getKey()).intValue() != 500) {
                entry.getKey();
            } else if (aVar.mo24289b(bVar)) {
                C58833ax d = aVar.mo24290d();
                if (d.mo56113h()) {
                    for (String str : (List) d.mo56107c()) {
                    }
                }
                C19213o oVar = bVar.f53759d;
                if (oVar == null) {
                    oVar = C19213o.f53797f;
                }
                if (oVar.f53802d.size() > 0) {
                    C19213o oVar2 = bVar.f53759d;
                    if (oVar2 == null) {
                        oVar2 = C19213o.f53797f;
                    }
                    oVar2.f53802d.size();
                    int intValue = ((Integer) entry.getKey()).intValue();
                    C19213o oVar3 = bVar.f53759d;
                    if (oVar3 == null) {
                        oVar3 = C19213o.f53797f;
                    }
                    C19130c.m36543a(aVar, intValue, oVar3);
                } else {
                    C19222f fVar = bVar.f53758c;
                    if (fVar == null) {
                        fVar = C19222f.f53818b;
                    }
                    C19213o oVar4 = fVar.f53820a;
                    if (oVar4 == null) {
                        oVar4 = C19213o.f53797f;
                    }
                    if (oVar4.f53802d.size() > 0) {
                        int intValue2 = ((Integer) entry.getKey()).intValue();
                        C19222f fVar2 = bVar.f53758c;
                        if (fVar2 == null) {
                            fVar2 = C19222f.f53818b;
                        }
                        C19213o oVar5 = fVar2.f53820a;
                        if (oVar5 == null) {
                            oVar5 = C19213o.f53797f;
                        }
                        C19130c.m36543a(aVar, intValue2, oVar5);
                    }
                }
                C19202d a = aVar.mo24288a(bVar);
                for (C19220d dVar : a.f53764a) {
                    cVar2.copyOnWrite();
                    C19202d dVar2 = (C19202d) cVar2.instance;
                    dVar.getClass();
                    C62971cq cqVar = dVar2.f53764a;
                    if (!cqVar.mo58948c()) {
                        dVar2.f53764a = C62942bv.mutableCopy(cqVar);
                    }
                    dVar2.f53764a.add(dVar);
                    arrayList.add(dVar);
                }
                for (C19210l lVar : a.f53765b) {
                    cVar2.copyOnWrite();
                    C19202d dVar3 = (C19202d) cVar2.instance;
                    lVar.getClass();
                    C62971cq cqVar2 = dVar3.f53765b;
                    if (!cqVar2.mo58948c()) {
                        dVar3.f53765b = C62942bv.mutableCopy(cqVar2);
                    }
                    dVar3.f53765b.add(lVar);
                }
                for (C19206h a2 : a.f53766c) {
                    cVar2.mo24313a(a2);
                }
            }
        }
        C19128a aVar2 = cVar.f53600c;
        C19214p pVar = (C19214p) C19215q.f53805d.createBuilder();
        Iterator it = arrayList.iterator();
        int i2 = 1;
        int i3 = -1;
        while (true) {
            if (it.hasNext()) {
                C19220d dVar4 = (C19220d) it.next();
                if (i2 != 1) {
                    int a3 = C19219c.m36593a(dVar4.f53816b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    if (i2 != a3) {
                        C59104x c = C19128a.f53594a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "AIEngineUtils");
                        ((C59052c) ((C59052c) c).mo56372aa(47825)).mo56386p("#sendCallbackAsIntent: Couldn't merge callbacks with different event IDs.");
                        break;
                    }
                } else {
                    i2 = C19219c.m36593a(dVar4.f53816b);
                    if (i2 == 0) {
                        i2 = 1;
                    }
                }
                if (i2 - 1 != 4) {
                    C59104x c2 = C19128a.f53594a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "AIEngineUtils");
                    ((C59052c) ((C59052c) c2).mo56372aa(47823)).mo56386p("#sendCallbackAsIntent: unsupported event ID.");
                    break;
                }
                C62940bt r10 = C62942bv.checkIsLite(C19224h.f53824a);
                dVar4.mo58887l(r10);
                Object l = dVar4.f169962ag.mo58854l(r10.f169971d);
                if (l == null) {
                    obj = r10.f169969b;
                } else {
                    obj = r10.mo58889c(l);
                }
                C19215q qVar = (C19215q) obj;
                if (qVar.f53808b.size() != 0) {
                    if (i3 != -1) {
                        if (i3 != qVar.f53809c) {
                            C59104x c3 = C19128a.f53594a.mo56225c();
                            c3.mo56378ag(C58975e.f156826a, "AIEngineUtils");
                            ((C59052c) ((C59052c) c3).mo56372aa(47824)).mo56386p("#sendCallbackAsIntent: Couldn't merge callbacks with different suggestions request IDs.");
                            break;
                        }
                    } else {
                        i3 = qVar.f53809c;
                    }
                    if (i3 != -1) {
                        for (C19210l lVar2 : qVar.f53808b) {
                            pVar.copyOnWrite();
                            C19215q qVar2 = (C19215q) pVar.instance;
                            lVar2.getClass();
                            C62971cq cqVar3 = qVar2.f53808b;
                            if (!cqVar3.mo58948c()) {
                                qVar2.f53808b = C62942bv.mutableCopy(cqVar3);
                            }
                            qVar2.f53808b.add(lVar2);
                        }
                    }
                }
            } else if (((C19215q) pVar.instance).f53808b.size() != 0) {
                pVar.copyOnWrite();
                C19215q qVar3 = (C19215q) pVar.instance;
                qVar3.f53807a |= 1;
                qVar3.f53809c = i3;
                C19217a aVar3 = (C19217a) C19220d.f53813c.createBuilder();
                aVar3.copyOnWrite();
                C19220d dVar5 = (C19220d) aVar3.instance;
                dVar5.f53816b = i2 - 1;
                dVar5.f53815a |= 1;
                aVar3.mo58885m(C19224h.f53824a, (C19215q) pVar.build());
                aVar2.mo24293a((C19220d) aVar3.build());
            }
        }
        return (C19202d) cVar2.build();
    }
}
