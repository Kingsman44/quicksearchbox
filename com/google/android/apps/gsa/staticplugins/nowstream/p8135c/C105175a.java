package com.google.android.apps.gsa.staticplugins.nowstream.p8135c;

import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91392d;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91398j;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91435q;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91732b;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91734d;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91736f;
import com.google.android.apps.gsa.sidekick.shared.p7244m.C91762b;
import com.google.android.apps.gsa.sidekick.shared.util.C91994m;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105220bo;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105227bv;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105230by;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105233ca;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105234cb;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105235cc;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105252ct;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105263dd;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e.C105337a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62971cq;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a */
/* compiled from: PG */
public final /* synthetic */ class C105175a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C105310b f293239a;

    /* renamed from: b */
    public final /* synthetic */ C91732b f293240b;

    public /* synthetic */ C105175a(C105310b bVar, C91732b bVar2) {
        this.f293239a = bVar;
        this.f293240b = bVar2;
    }

    public final void run() {
        C7718hj hjVar;
        C7642eo eoVar;
        C105310b bVar = this.f293239a;
        C91732b bVar2 = this.f293240b;
        C58976aa aaVar = C58975e.f156826a;
        if (bVar.f293841h) {
            for (C7718hj hjVar2 : bVar2.f255844j) {
                for (C91398j a : bVar.f293838e.mo77631a()) {
                    a.mo85735a(hjVar2);
                }
            }
            if (bVar2.f255837c) {
                for (C105230by byVar : bVar.f293834a.mo77631a()) {
                    C105263dd ddVar = byVar.f293502a;
                    ddVar.mo94677f("invalidated - refreshing");
                    if (((Boolean) ddVar.f293632y.mo94625j().f63720e).booleanValue()) {
                        ddVar.mo94685p();
                    } else {
                        if (ddVar.f293558Q == C8142xb.ACETONE_OVERLAY_MOMO) {
                            eoVar = C7642eo.INVALIDATED_NOW_CONTROLLER_MOMO;
                        } else {
                            eoVar = C7642eo.INVALIDATED_NOW_CONTROLLER;
                        }
                        ddVar.mo94690u(eoVar);
                    }
                }
            } else if (bVar2.f255838d) {
                for (C105235cc ccVar : bVar.f293835b.mo77631a()) {
                    C91762b bVar3 = bVar2.f255843i;
                    if (bVar3 == null) {
                        bVar3 = C91762b.f255898e;
                    }
                    C105263dd ddVar2 = ccVar.f293507a;
                    if (bVar3.f255902c) {
                        ddVar2.mo94677f("explicit refresh observed");
                        ddVar2.mo94692w();
                        ddVar2.f293622o.mo94708a();
                    } else {
                        ddVar2.mo94679j("background refresh observed");
                    }
                }
            } else if (bVar2.f255839e) {
                for (C105234cb cbVar : bVar.f293836c.mo77631a()) {
                    if (bVar2.f255843i == null) {
                        C91762b bVar4 = C91762b.f255898e;
                    }
                    C105263dd ddVar3 = cbVar.f293506a;
                    if (ddVar3.f293616i.mo79746e(C90010bp.f246995g)) {
                        ddVar3.mo94683n();
                    }
                    ddVar3.mo94679j("implicit refresh observed");
                }
            } else if (bVar2.f255846l) {
                for (C105227bv bvVar : bVar.f293840g.mo77631a()) {
                    C105263dd ddVar4 = bvVar.f293499a;
                    if (ddVar4.f293616i.mo79746e(C90010bp.f246995g) && ddVar4.f293630w.mo56113h()) {
                        Future future = ddVar4.f293550I;
                        if (future != null) {
                            future.cancel(false);
                            ddVar4.f293550I = null;
                        }
                        ((C91435q) ddVar4.f293630w.mo56107c()).mo85789b();
                        ddVar4.f293621n.mo94668a(true);
                        ddVar4.f293550I = ddVar4.f293612e.mo28208h("Auto hide scrim", C105263dd.f293541b, new C105233ca(ddVar4));
                    }
                }
            } else {
                for (C91734d dVar : bVar2.f255842h) {
                    if ((dVar.f255850a & 1) != 0) {
                        hjVar = dVar.f255851b;
                        if (hjVar == null) {
                            hjVar = C7718hj.f26927af;
                        }
                    } else {
                        hjVar = null;
                    }
                    long b = C91994m.m150995b(hjVar);
                    for (C91392d dVar2 : bVar.f293839f.mo77631a()) {
                        if (b == dVar2.f254977a) {
                            dVar2.mo85731a();
                        }
                    }
                }
                for (C91736f fVar : bVar2.f255841g) {
                    for (C91398j jVar : bVar.f293838e.mo77631a()) {
                        C7718hj hjVar3 = fVar.f255859c;
                        if (hjVar3 == null) {
                            hjVar3 = C7718hj.f26927af;
                        }
                        jVar.mo85736b(hjVar3);
                    }
                }
                if (bVar2.f255840f.size() != 0) {
                    for (C105220bo boVar : bVar.f293837d.mo77631a()) {
                        C62971cq cqVar = bVar2.f255840f;
                        C105263dd ddVar5 = boVar.f293491a;
                        ddVar5.mo94677f("entry added");
                        if (ddVar5.mo94669A()) {
                            new C105337a(ddVar5.f293611d, ddVar5.f293558Q, ddVar5.f293612e, ddVar5.f293613f, new C105252ct(ddVar5, cqVar)).mo94759e();
                        } else {
                            ddVar5.mo94686q(false);
                        }
                    }
                }
            }
        }
    }
}
