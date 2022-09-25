package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106286n;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.temporal.Temporal;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.c */
/* compiled from: PG */
public final /* synthetic */ class C106243c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106261u f296444a;

    /* renamed from: b */
    public final /* synthetic */ C106286n f296445b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f296446c;

    public /* synthetic */ C106243c(C106261u uVar, C106286n nVar, Bundle bundle) {
        this.f296444a = uVar;
        this.f296445b = nVar;
        this.f296446c = bundle;
    }

    public final void run() {
        C106261u uVar = this.f296444a;
        uVar.f296478k.add(new C106229a(this.f296445b, this.f296446c, uVar.f296475h.mo57444a()));
        Instant a = uVar.f296475h.mo57444a();
        if (!uVar.f296479l.isPresent() || Duration.between((Temporal) uVar.f296479l.get(), a).compareTo(C106261u.f296469b) >= 0) {
            int size = uVar.f296478k.size();
            if (size > 100) {
                C59104x d = C106261u.f296468a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "NgaEntryPointEventSendr");
                ((C59052c) ((C59052c) d).mo56372aa(25193)).mo56387q("Large event data queue size: %d", size);
                uVar.f296479l = Optional.m71637of(a);
            }
            if (!uVar.f296478k.isEmpty()) {
                Duration between = Duration.between(((C106258r) uVar.f296478k.get(0)).mo95462c(), a);
                if (between.compareTo(C106261u.f296470c) > 0) {
                    C59104x d2 = C106261u.f296468a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "NgaEntryPointEventSendr");
                    ((C59052c) ((C59052c) d2).mo56372aa(25192)).mo56388r("Long enqueue delay: %d ms", between.toMillis());
                    uVar.f296479l = Optional.m71637of(a);
                }
            }
        }
        uVar.f296480m.mo95472b();
    }
}
