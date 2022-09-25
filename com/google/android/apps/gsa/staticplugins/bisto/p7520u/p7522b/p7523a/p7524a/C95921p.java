package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89493ce;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95764bb;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.p */
/* compiled from: PG */
public final class C95921p extends C95910e {

    /* renamed from: c */
    private static final C59071e f268577c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.p");

    /* renamed from: d */
    private final C95346ax f268578d;

    /* renamed from: e */
    private final C96023bs f268579e;

    /* renamed from: f */
    private final C89492cd f268580f;

    /* renamed from: g */
    private final C89493ce f268581g;

    /* renamed from: h */
    private final C95764bb f268582h;

    public C95921p(C95346ax axVar, C96023bs bsVar, C89492cd cdVar, C89493ce ceVar, C95848i iVar, C95764bb bbVar, C95850a aVar) {
        super(axVar, bsVar, "DispatchingState", cdVar, iVar, aVar);
        this.f268578d = axVar;
        this.f268579e = bsVar;
        this.f268580f = cdVar;
        this.f268581g = ceVar;
        this.f268582h = bbVar;
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268579e.mo89840j(true);
        if (this.f268582h.f268131a == 0) {
            C124548d b = this.f268580f.mo83401b(this.f268578d.mo89270k());
            if (b == null) {
                C59104x c = f268577c.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DispatchingState");
                ((C59052c) ((C59052c) c).mo56372aa(15852)).mo56386p("Null deviceInfo");
                super.mo89847j("VQInteractingState", (Intent) null);
            } else if (this.f268581g.mo83439a(b)) {
                super.mo89847j("OffHeadStateInteracting", (Intent) null);
            } else {
                super.mo89847j("VQInteractingState", (Intent) null);
            }
        } else {
            super.mo89847j("PhoneCallStatNew", (Intent) null);
        }
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo89847j(String str, Intent intent) {
        super.mo89847j(str, (Intent) null);
    }
}
