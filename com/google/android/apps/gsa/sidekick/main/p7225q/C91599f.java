package com.google.android.apps.gsa.sidekick.main.p7225q;

import com.google.android.apps.p489g.p495e.C9285b;
import com.google.p375ai.p378b.C7573c;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7751ip;
import com.google.p375ai.p378b.C7752iq;
import com.google.p375ai.p378b.C7918ou;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.q.f */
/* compiled from: PG */
public final class C91599f {
    /* renamed from: a */
    public static List m149844a(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C9285b bVar = (C9285b) it.next();
            C7918ou ouVar = bVar.f32230b;
            if (ouVar == null) {
                ouVar = C7918ou.f27824h;
            }
            C7573c cVar = (C7573c) C7708h.f26894n.createBuilder();
            C7681g gVar = C7681g.ANSWER_TRAINING_QUESTION;
            cVar.copyOnWrite();
            C7708h hVar = (C7708h) cVar.instance;
            hVar.f26897b = gVar.f26835cv;
            hVar.f26896a |= 1;
            C7708h hVar2 = (C7708h) cVar.build();
            C7751ip ipVar = (C7751ip) C7752iq.f27124E.createBuilder();
            long seconds = TimeUnit.MILLISECONDS.toSeconds(ouVar.f27830e);
            ipVar.copyOnWrite();
            C7752iq iqVar = (C7752iq) ipVar.instance;
            iqVar.f27131a |= 16;
            iqVar.f27140j = seconds;
            ipVar.copyOnWrite();
            C7752iq iqVar2 = (C7752iq) ipVar.instance;
            hVar2.getClass();
            iqVar2.f27133c = hVar2;
            iqVar2.f27132b = 1;
            ipVar.copyOnWrite();
            C7752iq iqVar3 = (C7752iq) ipVar.instance;
            ouVar.getClass();
            iqVar3.f27153w = ouVar;
            iqVar3.f27131a |= 524288;
            if ((bVar.f32229a & 2) != 0) {
                C7718hj hjVar = bVar.f32231c;
                if (hjVar == null) {
                    hjVar = C7718hj.f26927af;
                }
                ipVar.copyOnWrite();
                C7752iq iqVar4 = (C7752iq) ipVar.instance;
                hjVar.getClass();
                iqVar4.f27135e = hjVar;
                iqVar4.f27134d = 2;
            }
            arrayList.add((C7752iq) ipVar.build());
        }
        return arrayList;
    }
}
