package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import android.os.PowerManager;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3994s.p3995a.C53121cd;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.x */
/* compiled from: PG */
public final /* synthetic */ class C110931x implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C110512ac f309028a;

    /* renamed from: b */
    public final /* synthetic */ C53121cd f309029b;

    /* renamed from: c */
    public final /* synthetic */ C57017i f309030c;

    /* renamed from: d */
    public final /* synthetic */ SettableFuture f309031d;

    public /* synthetic */ C110931x(C110512ac acVar, C53121cd cdVar, C57017i iVar, SettableFuture settableFuture) {
        this.f309028a = acVar;
        this.f309029b = cdVar;
        this.f309030c = iVar;
        this.f309031d = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C110512ac acVar = this.f309028a;
        C53121cd cdVar = this.f309029b;
        C57017i iVar = this.f309030c;
        SettableFuture settableFuture = this.f309031d;
        Exception exc = (Exception) obj;
        String name = exc.getClass().getName();
        PowerManager powerManager = (PowerManager) acVar.f308101d.f228396g.getSystemService("power");
        if (powerManager == null) {
            C59104x d = C83794j.f228388a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaSsSharedUtils");
            ((C59052c) ((C59052c) d).mo56372aa(6844)).mo56386p("Context.POWER_SERVICE was not available.");
        } else if (powerManager.isDeviceIdleMode()) {
            name = String.valueOf(name).concat(":IDLE");
        }
        acVar.f308106i.mo109913ak(cdVar.name(), false, name);
        ((C58970a) ((C58970a) acVar.f308104g.mo56226d()).mo56372aa(26490)).mo56389s("%s data could not be extracted from Zerostate response", cdVar.name());
        C59104x d2 = C110512ac.f308097a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(exc)).mo56372aa(26491)).mo56389s("Failed to get ZeroStateResponse from AssistantClientSyncWorker with error %s", exc);
        if (!C57017i.f152204o.equals(iVar)) {
            settableFuture.mo57358p(acVar.mo98749b(C53422nh.f140182m, cdVar, iVar));
            return;
        }
        acVar.mo98752e(cdVar);
        settableFuture.mo57356n(C118826c.f331422a);
    }
}
