package com.google.android.apps.gsa.staticplugins.nowcards.p8116f;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.cards.C91691f;
import com.google.android.apps.gsa.sidekick.shared.cards.C91692g;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91853a;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.sidekick.shared.util.C91992k;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104328bc;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104332bg;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104350n;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9281y;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32058a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7536ax;
import com.google.p375ai.p378b.C7898oa;
import com.google.p375ai.p378b.C7900oc;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57499g;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.f.z */
/* compiled from: PG */
final class C104900z implements C32058a {

    /* renamed from: a */
    final /* synthetic */ C104858aa f292313a;

    /* renamed from: b */
    private final Context f292314b;

    /* renamed from: c */
    private final C89291a f292315c;

    public C104900z(C104858aa aaVar, Context context, C89291a aVar) {
        this.f292313a = aaVar;
        this.f292314b = context;
        this.f292315c = aVar;
    }

    /* renamed from: a */
    public final void mo37841a(C57499g gVar, int i, C57438di diVar, View view, C57418cp cpVar) {
        C91691f fVar;
        Object obj;
        C7526an anVar;
        Object obj2;
        C57499g gVar2 = gVar;
        C57418cp cpVar2 = cpVar;
        C104858aa aaVar = this.f292313a;
        C104350n nVar = aaVar.f290314i;
        if (nVar.f290335e) {
            Context context = aaVar.f290307b;
            C91692g gVar3 = nVar.f290343m;
            C91857e eVar = aaVar.f290316k;
            eVar.getClass();
            fVar = new C104332bg(context, gVar3, aaVar, eVar, (String) null, aaVar.f290320o, aaVar.f290319n, aaVar.f290321p, aaVar.f290322q, aaVar.f290323r, aaVar.f290325t, nVar.f290346p, view);
        } else {
            Context context2 = aaVar.f290307b;
            C91692g gVar4 = nVar.f290343m;
            C91671j jVar = aaVar.f290309d;
            jVar.getClass();
            fVar = new C104328bc(context2, gVar4, aaVar, jVar, nVar.f290337g.mo86459e());
        }
        C62940bt r4 = C62942bv.checkIsLite(C7898oa.f27756d);
        gVar2.mo58887l(r4);
        if (!gVar2.f169962ag.mo58857o(r4.f169971d)) {
            C59104x d = C104858aa.f292218y.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PietPresenter");
            ((C59052c) ((C59052c) d).mo56372aa(22063)).mo56389s("Received an action with no recognized extensions for frame %s", diVar.f153420b);
            int i2 = C90755l.f253831a;
            return;
        }
        C62940bt r42 = C62942bv.checkIsLite(C7898oa.f27756d);
        gVar2.mo58887l(r42);
        Object l = gVar2.f169962ag.mo58854l(r42.f169971d);
        if (l == null) {
            obj = r42.f169969b;
        } else {
            obj = r42.mo58889c(l);
        }
        Context context3 = this.f292314b;
        C89291a aVar = this.f292315c;
        C7536ax axVar = ((C7898oa) obj).f27759b;
        if (axVar == null) {
            axVar = C7536ax.f26084o;
        }
        C9141ad g = C91992k.m150979g(context3, aVar, false, axVar);
        if (g != null) {
            if ((g.f31535a & 16777216) == 0) {
                C62940bt r43 = C62942bv.checkIsLite(C7900oc.f27762d);
                cpVar2.mo58887l(r43);
                if (cpVar2.f169962ag.mo58857o(r43.f169971d)) {
                    C62940bt r44 = C62942bv.checkIsLite(C7900oc.f27762d);
                    cpVar2.mo58887l(r44);
                    Object l2 = cpVar2.f169962ag.mo58854l(r44.f169971d);
                    if (l2 == null) {
                        obj2 = r44.f169969b;
                    } else {
                        obj2 = r44.mo58889c(l2);
                    }
                    C7900oc ocVar = (C7900oc) obj2;
                    if ((ocVar.f27764a & 1) != 0) {
                        C9281y yVar = (C9281y) g.toBuilder();
                        C8178yk ykVar = ocVar.f27765b;
                        if (ykVar == null) {
                            ykVar = C8178yk.f28736g;
                        }
                        yVar.copyOnWrite();
                        C9141ad adVar = (C9141ad) yVar.instance;
                        ykVar.getClass();
                        adVar.f31559y = ykVar;
                        adVar.f31535a |= 16777216;
                        g = (C9141ad) yVar.build();
                    }
                }
            }
            fVar.mo86200g(g);
            if (i == 1) {
                C91857e eVar2 = this.f292313a.f290316k;
                if (eVar2 == null) {
                    C59104x d2 = C104858aa.f292218y.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "PietPresenter");
                    ((C59052c) ((C59052c) d2).mo56372aa(22064)).mo56386p("MonetEventDispatcher was null in PietPresenter; PietPresenter should not be used outside of Monet");
                    return;
                }
                C91853a aVar2 = new C91853a();
                if ((g.f31535a & 8) != 0) {
                    anVar = g.f31540f;
                    if (anVar == null) {
                        anVar = C7526an.f26049l;
                    }
                } else {
                    anVar = null;
                }
                aVar2.f256167b = anVar;
                aVar2.f256166a = g;
                aVar2.mo86355b(this.f292313a.f290314i.f290342l.mo85966a());
                aVar2.f256168c = C9277u.PIET_FRAME;
                eVar2.mo86359a("EVENT_ENTRY_CLICK", "PietPresenter", aVar2.mo86354a());
            }
        }
    }
}
