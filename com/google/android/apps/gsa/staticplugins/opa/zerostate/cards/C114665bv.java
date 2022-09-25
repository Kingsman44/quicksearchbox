package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3861at.C50470yg;
import com.google.assistant.p3861at.C50471yh;
import com.google.assistant.p3861at.C50472yi;
import com.google.assistant.p3861at.C50474yk;
import com.google.assistant.p3861at.C50475yl;
import com.google.assistant.p3861at.C50476ym;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.bv */
/* compiled from: PG */
public final /* synthetic */ class C114665bv implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114675ce f318110a;

    public /* synthetic */ C114665bv(C114675ce ceVar) {
        this.f318110a = ceVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114675ce ceVar = this.f318110a;
        act act = (act) obj;
        if (!(act == null || (act.f128894a & 16384) == 0)) {
            C59071e eVar = C114676cf.f318125a;
            C50474yk ykVar = act.f128908o;
            if (ykVar == null) {
                ykVar = C50474yk.f131364b;
            }
            boolean z = false;
            for (C50470yg ygVar : ykVar.f131366a) {
                if (ygVar.f131353b.equals("/m/013b00bh") && ygVar.f131356e) {
                    z = true;
                }
            }
            if (z) {
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
                ceVar.mo101515d((acx) acw.build(), new C114663bt(ceVar));
                return;
            }
        }
        ceVar.mo101514c();
    }
}
