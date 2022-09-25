package com.google.android.apps.search.lens.service;

import android.os.Bundle;
import com.google.android.libraries.lens.sdk.p2045c.C24918c;
import com.google.android.libraries.lens.sdk.p2045c.C24919d;
import com.google.android.libraries.lens.sdk.p2045c.C24920e;
import com.google.android.libraries.lens.sdk.p2045c.C24923h;
import com.google.android.libraries.lens.sdk.p2047d.C24932b;
import com.google.android.libraries.lens.sdk.p2047d.C24936f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.lens.service.c */
/* compiled from: PG */
final class C139946c extends C24932b {

    /* renamed from: a */
    private static final C59071e f380404a = C59071e.m91332i("com.google.android.apps.search.lens.service.c");

    /* renamed from: b */
    private final C24923h f380405b;

    public C139946c(C24923h hVar) {
        this.f380405b = hVar;
    }

    /* renamed from: a */
    public final void mo30146a(C24936f fVar) {
        C59104x b = f380404a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LensServiceBinder");
        ((C59052c) ((C59052c) b).mo56372aa(41490)).mo56386p("attach");
        C24923h hVar = this.f380405b;
        int callingUid = getCallingUid();
        C59104x b2 = C24923h.f68044a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "LensServiceController");
        ((C59052c) ((C59052c) b2).mo56372aa(48949)).mo56387q("attach uid %d", callingUid);
        hVar.f68045b.execute(new C24919d(hVar, callingUid, fVar));
    }

    /* renamed from: b */
    public final void mo30147b() {
        C59104x b = f380404a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LensServiceBinder");
        ((C59052c) ((C59052c) b).mo56372aa(41491)).mo56386p("detach");
        C24923h hVar = this.f380405b;
        int callingUid = getCallingUid();
        C59104x b2 = C24923h.f68044a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "LensServiceController");
        ((C59052c) ((C59052c) b2).mo56372aa(48953)).mo56387q("detach uid %d", callingUid);
        hVar.f68045b.execute(new C24920e(hVar, callingUid));
    }

    /* renamed from: c */
    public final void mo30148c(Bundle bundle) {
        C59104x b = f380404a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LensServiceBinder");
        ((C59052c) ((C59052c) b).mo56372aa(41492)).mo56386p("onClientEvent");
        C24923h hVar = this.f380405b;
        int callingUid = getCallingUid();
        C59104x b2 = C24923h.f68044a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "LensServiceController");
        ((C59052c) ((C59052c) b2).mo56372aa(48956)).mo56387q("onClientEvent uid %d", callingUid);
        hVar.f68045b.execute(new C24918c(hVar, callingUid, bundle));
    }
}
