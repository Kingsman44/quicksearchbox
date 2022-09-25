package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3994s.p3995a.C53121cd;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.w */
/* compiled from: PG */
public final /* synthetic */ class C110930w implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C110512ac f309024a;

    /* renamed from: b */
    public final /* synthetic */ C53121cd f309025b;

    /* renamed from: c */
    public final /* synthetic */ SettableFuture f309026c;

    /* renamed from: d */
    public final /* synthetic */ C57017i f309027d;

    public /* synthetic */ C110930w(C110512ac acVar, C53121cd cdVar, SettableFuture settableFuture, C57017i iVar) {
        this.f309024a = acVar;
        this.f309025b = cdVar;
        this.f309026c = settableFuture;
        this.f309027d = iVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C110512ac acVar = this.f309024a;
        C53121cd cdVar = this.f309025b;
        SettableFuture settableFuture = this.f309026c;
        C57017i iVar = this.f309027d;
        C58833ax axVar = (C58833ax) obj;
        C59104x b = C110512ac.f308097a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaSSRequestSender");
        ((C59052c) ((C59052c) b).mo56372aa(26489)).mo56389s("processZerostateResponse handle zero state response with %s dataType", cdVar.name());
        if (axVar.mo56113h()) {
            acVar.f308106i.mo109913ak(cdVar.name(), true, "OK");
            settableFuture.mo57358p(acVar.mo98749b((C53422nh) axVar.mo56107c(), cdVar, iVar));
        } else if (!C57017i.f152204o.equals(iVar)) {
            settableFuture.mo57358p(acVar.mo98749b(C53422nh.f140182m, cdVar, iVar));
        } else {
            acVar.mo98752e(cdVar);
            settableFuture.mo57356n(C118826c.f331422a);
        }
    }
}
