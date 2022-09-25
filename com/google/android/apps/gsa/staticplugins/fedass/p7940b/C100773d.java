package com.google.android.apps.gsa.staticplugins.fedass.p7940b;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100741g;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.libraries.assistant.trainingcache.agsa.C19423a;
import com.google.android.libraries.assistant.trainingcache.agsa.C19424b;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaintenance;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoRealtimeLogging;
import com.google.android.libraries.assistant.trainingcache.bindings.IRealtimeLogger;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67287ar;
import com.google.speech.p5228m.C67351o;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.b.d */
/* compiled from: PG */
public final /* synthetic */ class C100773d implements C100741g {

    /* renamed from: a */
    public final /* synthetic */ C100777h f281678a;

    public /* synthetic */ C100773d(C100777h hVar) {
        this.f281678a = hVar;
    }

    /* renamed from: a */
    public final void mo92032a(Object obj) {
        C67351o oVar;
        C100777h hVar = this.f281678a;
        C67270aa d = ((C100784o) hVar.f281683b.mo17428b()).mo92050d((C132800h) obj, false);
        C19424b bVar = (C19424b) hVar.f281684c.mo17428b();
        C59104x b = C19424b.f54325a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "EkhoMaintenanceWrp");
        ((C59052c) ((C59052c) b).mo56372aa(47831)).mo56386p("performCacheMaintenance");
        if (!C19424b.m37089b(d)) {
            oVar = null;
        } else {
            EkhoRealtimeLogging.nativeSetRealtimeLogger((IRealtimeLogger) bVar.f54326b.mo27525b());
            EkhoMaintenance ekhoMaintenance = new EkhoMaintenance();
            try {
                ekhoMaintenance.mo24637c(d);
                oVar = ekhoMaintenance.mo24636b();
                ekhoMaintenance.close();
            } catch (Throwable th) {
                C19423a.m37088a(th, th);
            }
        }
        if (oVar != null) {
            C19435g gVar = (C19435g) hVar.f281685d.mo17428b();
            gVar.mo24622d("Ekho.Cleanup.NumBytesCached", oVar.f183070c);
            gVar.mo24622d("Ekho.Cleanup.NumBytesDeleted", oVar.f183071d);
            gVar.mo24622d("Ekho.Cleanup.NumEventsCached", oVar.f183068a);
            gVar.mo24622d("Ekho.Cleanup.NumEventsDeleted", oVar.f183069b);
            gVar.mo24622d("Ekho.Cleanup.CycleLength.Time", TimeUnit.MICROSECONDS.toSeconds(oVar.f183073f));
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
                    gVar.mo24623e("Ekho.Cleanup.TTLOverdue.Time", ((Long) entry.getKey()).longValue(), ((Long) entry.getValue()).longValue());
                }
                return;
            }
            return;
        }
        return;
        throw th;
    }
}
