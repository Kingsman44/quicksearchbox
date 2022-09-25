package com.google.android.libraries.assistant.trainingcache.agsa;

import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaintenance;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoRealtimeLogging;
import com.google.android.libraries.assistant.trainingcache.bindings.IRealtimeLogger;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67349m;
import dagger.C68214a;
import java.io.File;

/* renamed from: com.google.android.libraries.assistant.trainingcache.agsa.b */
/* compiled from: PG */
public final class C19424b {

    /* renamed from: a */
    public static final C59071e f54325a = C59071e.m91332i("com.google.android.libraries.assistant.trainingcache.agsa.b");

    /* renamed from: b */
    public final C68214a f54326b;

    public C19424b(C68214a aVar) {
        this.f54326b = aVar;
    }

    /* renamed from: b */
    public static boolean m37089b(C67270aa aaVar) {
        if (new File(aaVar.f182859b).exists()) {
            return true;
        }
        C59104x d = f54325a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "EkhoMaintenanceWrp");
        ((C59052c) ((C59052c) d).mo56372aa(47832)).mo56386p("Cache directory unavailable.");
        return false;
    }

    /* renamed from: a */
    public final C67349m mo24614a(C67270aa aaVar) {
        C59104x b = f54325a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "EkhoMaintenanceWrp");
        ((C59052c) ((C59052c) b).mo56372aa(47830)).mo56386p("getCacheMetrics");
        if (!m37089b(aaVar)) {
            return null;
        }
        EkhoRealtimeLogging.nativeSetRealtimeLogger((IRealtimeLogger) this.f54326b.mo27525b());
        EkhoMaintenance ekhoMaintenance = new EkhoMaintenance();
        try {
            ekhoMaintenance.mo24637c(aaVar);
            C67349m a = ekhoMaintenance.mo24635a();
            ekhoMaintenance.close();
            return a;
        } catch (Throwable th) {
            C19423a.m37088a(th, th);
        }
        throw th;
    }
}
