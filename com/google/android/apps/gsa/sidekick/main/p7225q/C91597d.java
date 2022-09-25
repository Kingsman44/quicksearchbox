package com.google.android.apps.gsa.sidekick.main.p7225q;

import com.google.android.apps.gsa.k.c;
import com.google.android.apps.gsa.sidekick.shared.training.QuestionKey;
import com.google.android.apps.p489g.p495e.C9285b;
import com.google.android.apps.p489g.p495e.C9286c;
import com.google.android.apps.p489g.p495e.C9287d;
import com.google.p375ai.p378b.C7918ou;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.sidekick.main.q.d */
/* compiled from: PG */
final class C91597d implements c {

    /* renamed from: a */
    final /* synthetic */ C91598e f255462a;

    public C91597d(C91598e eVar) {
        this.f255462a = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85958a(Object obj) {
        C9287d dVar = (C9287d) obj;
        HashMap hashMap = new HashMap();
        for (C9285b bVar : dVar.f32239e) {
            C7918ou ouVar = bVar.f32230b;
            if (ouVar == null) {
                ouVar = C7918ou.f27824h;
            }
            hashMap.put(new QuestionKey(ouVar), bVar);
        }
        synchronized (this.f255462a.f255469g) {
            if (this.f255462a.f255474l.isEmpty()) {
                return null;
            }
            hashMap.putAll(this.f255462a.f255474l);
            C91598e eVar = this.f255462a;
            Map map = eVar.f255473k;
            if (map != null) {
                map.putAll(eVar.f255474l);
            }
            this.f255462a.f255474l.clear();
            C9286c cVar = (C9286c) dVar.toBuilder();
            cVar.copyOnWrite();
            ((C9287d) cVar.instance).f32239e = C9287d.emptyProtobufList();
            cVar.mo17480a(hashMap.values());
            return (C9287d) cVar.build();
        }
    }
}
