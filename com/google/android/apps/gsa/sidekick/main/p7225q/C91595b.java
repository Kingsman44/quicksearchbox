package com.google.android.apps.gsa.sidekick.main.p7225q;

import com.google.android.apps.gsa.k.c;
import com.google.android.apps.gsa.sidekick.shared.training.QuestionKey;
import com.google.android.apps.p489g.p495e.C9285b;
import com.google.android.apps.p489g.p495e.C9286c;
import com.google.android.apps.p489g.p495e.C9287d;
import com.google.p375ai.p378b.C7918ou;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.sidekick.main.q.b */
/* compiled from: PG */
final class C91595b implements c {

    /* renamed from: a */
    final /* synthetic */ Iterable f255459a;

    /* renamed from: b */
    final /* synthetic */ C91598e f255460b;

    public C91595b(C91598e eVar, Iterable iterable) {
        this.f255460b = eVar;
        this.f255459a = iterable;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85956a(Object obj) {
        C9286c cVar = (C9286c) ((C9287d) obj).toBuilder();
        C91598e eVar = this.f255460b;
        Iterable<C9285b> iterable = this.f255459a;
        HashMap hashMap = new HashMap();
        for (C9285b bVar : Collections.unmodifiableList(((C9287d) cVar.instance).f32239e)) {
            C7918ou ouVar = bVar.f32230b;
            if (ouVar == null) {
                ouVar = C7918ou.f27824h;
            }
            hashMap.put(new QuestionKey(ouVar), bVar);
        }
        synchronized (eVar.f255469g) {
            for (C9285b bVar2 : iterable) {
                C7918ou ouVar2 = bVar2.f32230b;
                if (ouVar2 == null) {
                    ouVar2 = C7918ou.f27824h;
                }
                eVar.f255474l.remove(new QuestionKey(ouVar2));
            }
            hashMap.putAll(eVar.f255474l);
        }
        for (C9285b bVar3 : iterable) {
            C7918ou ouVar3 = bVar3.f32230b;
            if (ouVar3 == null) {
                ouVar3 = C7918ou.f27824h;
            }
            hashMap.remove(new QuestionKey(ouVar3));
        }
        cVar.copyOnWrite();
        ((C9287d) cVar.instance).f32239e = C9287d.emptyProtobufList();
        cVar.mo17480a(hashMap.values());
        return (C9287d) cVar.build();
    }
}
