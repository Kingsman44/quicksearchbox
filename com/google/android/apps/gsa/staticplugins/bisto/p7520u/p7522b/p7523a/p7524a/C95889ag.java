package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95763ba;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ag */
/* compiled from: PG */
public final class C95889ag extends C95910e implements C95763ba {

    /* renamed from: c */
    private static final C59071e f268475c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.ag");

    /* renamed from: d */
    private final C95355bf f268476d;

    /* renamed from: e */
    private final C96023bs f268477e;

    /* renamed from: f */
    private final C89492cd f268478f;

    /* renamed from: g */
    private final C95764bb f268479g;

    public C95889ag(C95346ax axVar, C96023bs bsVar, C89492cd cdVar, C95848i iVar, C95764bb bbVar, C95850a aVar) {
        super(axVar, bsVar, "PhoneCallStatNew", cdVar, iVar, aVar);
        this.f268476d = axVar;
        this.f268477e = bsVar;
        this.f268478f = cdVar;
        this.f268479g = bbVar;
    }

    /* renamed from: d */
    public final void mo89753d(int i, int i2) {
        C59104x b = f268475c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PhoneCallStateNew");
        ((C59052c) ((C59052c) b).mo56372aa(15881)).mo56393w("Phone call state: %d -> %d", i, i2);
        if (i2 != i && i2 == 0) {
            super.mo89847j("DispatchingState", (Intent) null);
        }
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268477e.mo89837g();
        if (this.f268479g.f268131a == 0) {
            C59104x b = f268475c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PhoneCallStateNew");
            ((C59052c) ((C59052c) b).mo56372aa(15880)).mo56386p("Call is finished");
            super.mo89847j("DispatchingState", (Intent) null);
            return;
        }
        this.f268479g.mo89754a(this);
        this.f268476d.mo89277r(10);
    }

    /* renamed from: i */
    public final void mo89846i() {
        C58976aa aaVar = C58975e.f156826a;
        boolean z = false;
        this.f268869b = false;
        this.f268479g.mo89756c(this);
        C124548d b = this.f268478f.mo83401b(this.f268476d.mo89270k());
        if (b != null) {
            int al = b.mo106498al();
            if (al == 0) {
                throw null;
            } else if (al == 3) {
                z = true;
            }
        }
        this.f268476d.mo89277r(true != z ? 11 : 12);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo89847j(String str, Intent intent) {
        super.mo89847j(str, (Intent) null);
    }
}
