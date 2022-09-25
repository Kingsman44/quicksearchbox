package com.google.android.apps.gsa.staticplugins.bisto.p7515q;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95354be;
import com.google.android.p10712d.C142467gk;
import com.google.android.p10712d.C142468gl;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.q.f */
/* compiled from: PG */
public final /* synthetic */ class C95845f implements C95354be {

    /* renamed from: a */
    public final /* synthetic */ int f268395a;

    public /* synthetic */ C95845f(int i) {
        this.f268395a = i;
    }

    /* renamed from: a */
    public final C58833ax mo89287a(byte[] bArr) {
        int i = this.f268395a;
        try {
            C142468gl glVar = (C142468gl) C62942bv.parseFrom((C62942bv) C142468gl.f386620l, bArr, C62921ba.m95368a());
            C59104x b = C95848i.f268399a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HotwordActivator");
            C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(15474);
            C142467gk a = C142467gk.m231089a(glVar.f386623b);
            if (a == null) {
                a = C142467gk.OTA_UNKNOWN;
            }
            cVar.mo56352E("Received OtaState : %s; TS: %d", glVar, a.f386619k);
            if (i != glVar.f386626e) {
                return C58836b.f156633a;
            }
            return C58833ax.m90834k(glVar);
        } catch (C62974ct e) {
            C59104x c = C95848i.f268399a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HotwordActivator");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15475)).mo56386p("Unable to parse message");
            return C58836b.f156633a;
        }
    }
}
