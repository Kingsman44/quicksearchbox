package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.assistant.p3861at.C50470yg;
import com.google.assistant.p3861at.C50471yh;
import com.google.assistant.p3861at.C50472yi;
import com.google.assistant.p3861at.C50474yk;
import com.google.assistant.p3861at.C50475yl;
import com.google.assistant.p3861at.C50476ym;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cs */
/* compiled from: PG */
public final /* synthetic */ class C114849cs implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114860dc f318638a;

    /* renamed from: b */
    public final /* synthetic */ C114750d f318639b;

    public /* synthetic */ C114849cs(C114860dc dcVar, C114750d dVar) {
        this.f318638a = dcVar;
        this.f318639b = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114860dc dcVar = this.f318638a;
        C114750d dVar = this.f318639b;
        act act = (act) obj;
        if (!(act == null || (act.f128894a & 16384) == 0)) {
            C58976aa aaVar = C58975e.f156826a;
            C50474yk ykVar = act.f128908o;
            if (ykVar == null) {
                ykVar = C50474yk.f131364b;
            }
            boolean z = true;
            for (C50470yg ygVar : ykVar.f131366a) {
                if (ygVar.f131353b.equals("/m/013b00bh")) {
                    z = ygVar.f131356e;
                }
            }
            if (!z) {
                dcVar.mo101657b(dVar);
                return;
            }
        }
        acw acw = (acw) acx.f128971H.createBuilder();
        C50475yl ylVar = (C50475yl) C50476ym.f131367b.createBuilder();
        C50471yh yhVar = (C50471yh) C50472yi.f131358e.createBuilder();
        yhVar.copyOnWrite();
        C50472yi yiVar = (C50472yi) yhVar.instance;
        yiVar.f131360a |= 1;
        yiVar.f131361b = "/m/013b00bh";
        yhVar.copyOnWrite();
        C50472yi yiVar2 = (C50472yi) yhVar.instance;
        yiVar2.f131360a |= 2;
        yiVar2.f131362c = true;
        yhVar.copyOnWrite();
        C50472yi yiVar3 = (C50472yi) yhVar.instance;
        yiVar3.f131360a |= 4;
        yiVar3.f131363d = true;
        ylVar.mo53400a(yhVar);
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C50476ym ymVar = (C50476ym) ylVar.build();
        ymVar.getClass();
        acx.f128997n = ymVar;
        acx.f128984a |= 2048;
        new C90873ag(dcVar.f318680m.d(dcVar.f318678k.mo79668a(), (acx) acw.build(), 5000, TimeUnit.MILLISECONDS, dcVar.getClass().getSimpleName()), dcVar.f318672e, "updateAssistantSettings", C114847cq.f318634a).mo85223a(new C114842cl(dcVar, dVar));
    }
}
