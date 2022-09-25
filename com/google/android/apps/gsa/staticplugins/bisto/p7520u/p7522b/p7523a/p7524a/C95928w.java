package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95351bb;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95354be;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95381ce;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.w */
/* compiled from: PG */
public final /* synthetic */ class C95928w implements C95354be {

    /* renamed from: a */
    public final /* synthetic */ C95931z f268597a;

    public /* synthetic */ C95928w(C95931z zVar) {
        this.f268597a = zVar;
    }

    /* renamed from: a */
    public final C58833ax mo89287a(byte[] bArr) {
        C95931z zVar = this.f268597a;
        C124721s a = C95381ce.m157720a(zVar.f268607g, zVar.f268605e.mo89270k(), 2, bArr, zVar.f268606f);
        if (a != null) {
            return C58833ax.m90834k(a);
        }
        C59104x c = C95931z.f268603c.mo56225c();
        c.mo56378ag(C58975e.f156826a, "InitState");
        ((C59052c) ((C59052c) c).mo56372aa(15858)).mo56386p("Unable to determine device type");
        throw new C95351bb("Unable to determine device type");
    }
}
