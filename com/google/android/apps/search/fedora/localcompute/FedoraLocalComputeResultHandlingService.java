package com.google.android.apps.search.fedora.localcompute;

import android.content.Context;
import com.google.android.apps.search.fedora.p10093b.C132723d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.C144829p;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19412p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class FedoraLocalComputeResultHandlingService extends C133062d {

    /* renamed from: a */
    public static final C59071e f362794a = C59071e.m91332i("com.google.android.apps.search.fedora.localcompute.FedoraLocalComputeResultHandlingService");

    /* renamed from: b */
    public Context f362795b;

    /* renamed from: c */
    public Map f362796c;

    /* renamed from: d */
    public Executor f362797d;

    /* renamed from: a */
    public final void mo110959a(InAppTrainerOptions inAppTrainerOptions, boolean z, C144829p pVar) {
        C59071e eVar = f362794a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraLCResultSrvc");
        ((C59052c) ((C59052c) b).mo56372aa(39849)).mo56386p("handleResult()");
        Optional a = C132723d.m215735a(this.f362795b, inAppTrainerOptions.f391081m);
        if (a.isEmpty()) {
            pVar.mo120242a(Status.f389617c);
            return;
        }
        Optional a2 = C132723d.m215735a(this.f362795b, inAppTrainerOptions.f391078j);
        if (a2.isEmpty()) {
            pVar.mo120242a(Status.f389617c);
            return;
        }
        a.get();
        a2.get();
        String str = inAppTrainerOptions.f391070a;
        if (!this.f362796c.containsKey(str)) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FedoraLCResultSrvc");
            ((C59052c) ((C59052c) d).mo56372aa(39853)).mo56389s("No results handling found for lc session: %s", str);
            pVar.mo120242a(Status.f389617c);
            return;
        }
        C19412p pVar2 = (C19412p) this.f362796c.get(str);
        if (pVar2 == null) {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FedoraLCResultSrvc");
            ((C59052c) ((C59052c) c).mo56372aa(39852)).mo56389s("results handler cannot be NULL. Found null for lc session: %s", str);
            pVar.mo120242a(Status.f389617c);
            return;
        }
        C133060b bVar = new C133060b(this, z, str, inAppTrainerOptions, pVar2, a, a2, pVar);
        C47633f g = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(bVar), this.f362797d));
        C133061c cVar = new C133061c(str);
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(cVar), this.f362797d);
    }
}
