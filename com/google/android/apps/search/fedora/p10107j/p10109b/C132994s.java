package com.google.android.apps.search.fedora.p10107j.p10109b;

import com.google.android.apps.search.fedora.p10094c.C132727b;
import com.google.android.apps.search.fedora.p10094c.C132729d;
import com.google.android.apps.search.fedora.p10094c.C132730e;
import com.google.android.apps.search.fedora.p10094c.C132733h;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaintenance;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoRealtimeLogging;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67287ar;
import com.google.speech.p5228m.C67351o;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.fedora.j.b.s */
/* compiled from: PG */
public final /* synthetic */ class C132994s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C133001z f362696a;

    public /* synthetic */ C132994s(C133001z zVar) {
        this.f362696a = zVar;
    }

    public final void accept(Object obj) {
        C67351o oVar;
        EkhoMaintenance ekhoMaintenance;
        C133001z zVar = this.f362696a;
        C67270aa aaVar = (C67270aa) obj;
        try {
            C132730e eVar = zVar.f362717i;
            C59104x b = C132730e.f362155a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FedoraEkhoMaintenance");
            ((C59052c) ((C59052c) b).mo56372aa(39806)).mo56386p("performCacheMaintenance");
            if (!C132730e.m215744a(aaVar)) {
                oVar = null;
            } else {
                C132727b.m215742a(eVar.f362157c.f362154a);
                EkhoRealtimeLogging.nativeSetRealtimeLogger(eVar.f362156b);
                C132733h hVar = eVar.f362158d;
                ekhoMaintenance = new EkhoMaintenance();
                ekhoMaintenance.mo24637c(aaVar);
                oVar = ekhoMaintenance.mo24636b();
                ekhoMaintenance.close();
            }
            if (oVar != null) {
                zVar.f362718j.mo110966d("Ekho.Cleanup.NumBytesCached", oVar.f183070c);
                zVar.f362718j.mo110966d("Ekho.Cleanup.NumBytesDeleted", oVar.f183071d);
                zVar.f362718j.mo110966d("Ekho.Cleanup.NumEventsCached", oVar.f183068a);
                zVar.f362718j.mo110966d("Ekho.Cleanup.NumEventsDeleted", oVar.f183069b);
                zVar.f362718j.mo110966d("Ekho.Cleanup.CycleLength.Time", oVar.f183073f / 1000000);
                C67287ar arVar = oVar.f183072e;
                if (arVar == null) {
                    arVar = C67287ar.f182903b;
                }
                if (arVar.f182905a.size() > 0) {
                    C67287ar arVar2 = oVar.f183072e;
                    if (arVar2 == null) {
                        arVar2 = C67287ar.f182903b;
                    }
                    for (Map.Entry entry : Collections.unmodifiableMap(arVar2.f182905a).entrySet()) {
                        zVar.f362718j.mo110967e("Ekho.Cleanup.TTLOverdue.Time", ((Long) entry.getKey()).longValue(), ((Long) entry.getValue()).longValue());
                    }
                    return;
                }
                return;
            }
            return;
        } catch (IOException e) {
            C59104x d = C133001z.f362708a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FedoraCacheServer");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(39966)).mo56386p("performCacheMaintenance failed!");
            return;
        } catch (Throwable th) {
            C132729d.m215743a(th, th);
        }
        throw th;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
