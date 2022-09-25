package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58781rt;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7725hq;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7728ht;
import com.google.p375ai.p378b.C7744ii;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.ax */
/* compiled from: PG */
public final class C91319ax implements C90991b {

    /* renamed from: a */
    public final C21370a f254862a;

    /* renamed from: b */
    public final Queue f254863b = new C58781rt(new C58425eo(10));

    /* renamed from: c */
    private final C91330bh f254864c;

    public C91319ax(C91330bh bhVar, C21370a aVar) {
        this.f254864c = bhVar;
        this.f254862a = aVar;
    }

    /* renamed from: a */
    public final C7726hr mo85610a(C7726hr hrVar, C91318aw awVar) {
        C62971cq<C7726hr> cqVar = hrVar.f27012c;
        ArrayList arrayList = new ArrayList();
        for (C7726hr hrVar2 : cqVar) {
            if ((hrVar2.f27010a & 2) != 0) {
                C91330bh bhVar = this.f254864c;
                C7718hj hjVar = hrVar2.f27015f;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
                if (!bhVar.mo85587f(hjVar, hrVar2.f27013d)) {
                    awVar.f254859a++;
                } else {
                    arrayList.add(hrVar2);
                }
            } else {
                ArrayList b = C58597ky.m90211b(hrVar2.f27013d);
                ArrayList arrayList2 = new ArrayList();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    C7718hj hjVar2 = (C7718hj) b.get(i);
                    if (this.f254864c.mo85586e(hjVar2)) {
                        arrayList2.add(hjVar2);
                    } else {
                        awVar.f254860b++;
                    }
                }
                if (arrayList2.size() != hrVar2.f27013d.size()) {
                    C7725hq hqVar = (C7725hq) hrVar2.toBuilder();
                    hqVar.copyOnWrite();
                    ((C7726hr) hqVar.instance).f27013d = C7726hr.emptyProtobufList();
                    hqVar.mo16949b(arrayList2);
                    hrVar2 = (C7726hr) hqVar.build();
                }
                C7726hr a = mo85610a(hrVar2, awVar);
                if (a.f27013d.size() != 0 || a.f27012c.size() != 0) {
                    arrayList.add(a);
                }
            }
        }
        C7725hq hqVar2 = (C7725hq) hrVar.toBuilder();
        hqVar2.copyOnWrite();
        ((C7726hr) hqVar2.instance).f27012c = C7726hr.emptyProtobufList();
        hqVar2.mo16948a(arrayList);
        return (C7726hr) hqVar2.build();
    }

    /* renamed from: b */
    public final C7744ii mo85611b(C7744ii iiVar) {
        if ((iiVar.f27056a & 1) == 0) {
            return iiVar;
        }
        C7726hr hrVar = iiVar.f27057b;
        if (hrVar == null) {
            hrVar = C7726hr.f27008i;
        }
        C91318aw awVar = new C91318aw(this.f254862a);
        C7726hr a = mo85610a(hrVar, awVar);
        if (awVar.f254859a > 0 || awVar.f254860b > 0) {
            this.f254863b.add(awVar);
        }
        C7728ht htVar = (C7728ht) iiVar.toBuilder();
        htVar.copyOnWrite();
        C7744ii iiVar2 = (C7744ii) htVar.instance;
        a.getClass();
        iiVar2.f27057b = a;
        iiVar2.f27056a |= 1;
        return (C7744ii) htVar.build();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("EntryTreePruner");
        synchronized (this.f254863b) {
            for (C91318aw gS : this.f254863b) {
                gS.mo17602gS(fVar.mo85281e((Object) null));
            }
        }
    }
}
