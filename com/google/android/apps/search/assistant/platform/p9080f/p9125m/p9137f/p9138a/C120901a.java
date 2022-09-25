package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9137f.p9138a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120695j;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120703r;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120887b;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2584f.C33475c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62963cj;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.f.a.a */
/* compiled from: PG */
public final class C120901a implements C120887b {

    /* renamed from: a */
    private static final C59071e f336132a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.m.f.a.a");

    /* renamed from: b */
    private final C120695j f336133b;

    /* renamed from: c */
    private final Map f336134c;

    /* renamed from: d */
    private final C120903c f336135d;

    public C120901a(C120695j jVar, Map map, C120903c cVar) {
        this.f336133b = jVar;
        this.f336134c = map;
        this.f336135d = cVar;
    }

    /* renamed from: a */
    private final C60870cx m200079a(C120816a aVar) {
        if (!this.f336134c.containsKey(C119889h.DEFAULT_ENGINE)) {
            return C60856cj.m92899h(new IllegalStateException("Default asr engine is not available."));
        }
        this.f336135d.mo104959a(C119889h.DEFAULT_ENGINE);
        return ((C120887b) ((C69464a) this.f336134c.get(C119889h.DEFAULT_ENGINE)).mo17428b()).mo104701b(aVar);
    }

    /* renamed from: b */
    public final C60870cx mo104701b(C120816a aVar) {
        C120703r rVar;
        C120703r rVar2;
        C120703r rVar3;
        C120695j jVar = this.f336133b;
        if (jVar.f335682b == 2) {
            rVar = (C120703r) jVar.f335683c;
        } else {
            rVar = C120703r.f335705e;
        }
        if ((rVar.f335707a & 1) != 0) {
            C120695j jVar2 = this.f336133b;
            if (jVar2.f335682b == 2) {
                rVar2 = (C120703r) jVar2.f335683c;
            } else {
                rVar2 = C120703r.f335705e;
            }
            C119893l lVar = rVar2.f335710d;
            if (lVar == null) {
                lVar = C119893l.f333893e;
            }
            if (!new C62963cj(lVar.f333896b, C119893l.f333892c).isEmpty()) {
                C120695j jVar3 = this.f336133b;
                if (jVar3.f335682b == 2) {
                    rVar3 = (C120703r) jVar3.f335683c;
                } else {
                    rVar3 = C120703r.f335705e;
                }
                C119893l lVar2 = rVar3.f335710d;
                if (lVar2 == null) {
                    lVar2 = C119893l.f333893e;
                }
                C62963cj<C119889h> cjVar = new C62963cj(lVar2.f333896b, C119893l.f333892c);
                C33475c cVar = this.f336135d.f336137a;
                List list = (List) Collection.EL.stream(cjVar).map(C120902b.f336136a).collect(C58370cn.f155946a);
                C69664n.m101061g(list, "stringList");
                cVar.f89586a.mo38877d("UTTERANCE_TIME_SELECTION preferred ASR Engines: ", list);
                for (C119889h hVar : cjVar) {
                    C69464a aVar2 = (C69464a) this.f336134c.get(hVar);
                    if (aVar2 != null) {
                        hVar.name();
                        this.f336135d.mo104959a(hVar);
                        return ((C120887b) aVar2.mo17428b()).mo104701b(aVar);
                    }
                    ((C59052c) ((C59052c) f336132a.mo56226d()).mo56372aa(35649)).mo56389s("Selected engine is not available: %s.", hVar.name());
                }
                return m200079a(aVar);
            }
        }
        ((C59052c) ((C59052c) f336132a.mo56226d()).mo56372aa(35647)).mo56386p("Utterance Time Selection asr orchestration is selected, but switch config is not passed. Using the default asr engine.");
        return m200079a(aVar);
    }
}
