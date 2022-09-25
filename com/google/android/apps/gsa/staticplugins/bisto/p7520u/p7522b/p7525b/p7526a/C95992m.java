package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.p7526a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95352bc;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95381ce;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b.a.m */
/* compiled from: PG */
final class C95992m implements C95352bc {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f268745a;

    /* renamed from: b */
    final /* synthetic */ C95993n f268746b;

    public C95992m(C95993n nVar, SettableFuture settableFuture) {
        this.f268746b = nVar;
        this.f268745a = settableFuture;
    }

    /* renamed from: E */
    public final boolean mo89254E(String str, int i, int i2, byte[] bArr) {
        if (i != 4 || i2 != 2) {
            return false;
        }
        C59071e eVar = C95993n.f268747c;
        C58976aa aaVar = C58975e.f156826a;
        this.f268746b.f268749e.mo89275p(this);
        if (this.f268745a.isDone()) {
            return false;
        }
        if (C95381ce.m157720a((C89492cd) this.f268746b.f268751g.mo27525b(), str, 2, bArr, this.f268746b.f268752h) != null) {
            this.f268745a.mo57356n(C118826c.f331422a);
            return true;
        }
        C59104x c = C95993n.f268747c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "WiredInitState");
        ((C59052c) ((C59052c) c).mo56372aa(15989)).mo56386p("Unable to determine device type");
        this.f268745a.mo57357o(new Exception("Unable to determine device type"));
        return true;
    }
}
