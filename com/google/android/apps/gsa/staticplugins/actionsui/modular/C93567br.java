package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.view.View;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ListArgument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.shared.p7148ui.C90658bc;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p4152bb.p4153a.C55130gz;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55135hd;
import com.google.p4152bb.p4153a.C55136he;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.br */
/* compiled from: PG */
final class C93567br extends C90658bc {

    /* renamed from: a */
    final /* synthetic */ ListArgumentView f261258a;

    public C93567br(ListArgumentView listArgumentView) {
        this.f261258a = listArgumentView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo84951a(View view) {
        ListArgument listArgument = (ListArgument) this.f261258a.f261447m;
        Argument m = listArgument.f236185i.mo81278m(listArgument.f236144e.mo81207N());
        C55135hd hdVar = (C55135hd) m.f236145f.toBuilder();
        if (hdVar != null && ((C55136he) hdVar.instance).f145138g.size() > 0) {
            C55133hb a = C55133hb.m87600a(hdVar.mo54198a(0).f145123c);
            if (a == null) {
                a = C55133hb.NONE;
            }
            if (a == C55133hb.LIST_ITEM_POSITION) {
                C55130gz gzVar = (C55130gz) hdVar.mo54198a(0).toBuilder();
                int i = listArgument.f236140a;
                gzVar.copyOnWrite();
                C55134hc hcVar = (C55134hc) gzVar.instance;
                hcVar.f145121a |= 1;
                hcVar.f145122b = i;
                gzVar.copyOnWrite();
                ((C55134hc) gzVar.instance).f145126f = C55134hc.emptyIntList();
                int size = listArgument.f236188l.size();
                gzVar.copyOnWrite();
                C55134hc hcVar2 = (C55134hc) gzVar.instance;
                C62961ch chVar = hcVar2.f145126f;
                if (!chVar.mo58948c()) {
                    hcVar2.f145126f = C62942bv.mutableCopy(chVar);
                }
                hcVar2.f145126f.mo58916g(size);
                hdVar.mo54200c(0, gzVar);
            }
        }
        m.f236145f = (C55136he) hdVar.build();
        ModularAction modularAction = listArgument.f236144e;
        int i2 = listArgument.f236140a;
        m.mo81290y(modularAction);
        modularAction.f236100f.add(modularAction.f236100f.indexOf(modularAction.f236101g.get(i2)), m);
        modularAction.f236101g.append(m.f236140a, m);
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(listArgument.f236188l);
        e.mo55395g(Integer.valueOf(m.f236140a));
        listArgument.f236188l = e.mo55394f();
        C93595cs csVar = this.f261258a.f261444j;
        if (csVar != null) {
            C88507a aVar = (C88507a) csVar;
            if (aVar.mo82060w()) {
                aVar.f239225a.mo82100h(false, ((C93602cz) csVar).f239226b);
                aVar.mo82050m(2, 3);
            }
        }
    }
}
