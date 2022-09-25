package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123729aw;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123743bj;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123745bl;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123752bs;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123753bt;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.cn */
/* compiled from: PG */
public final /* synthetic */ class C106933cn implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C106941cv f297855a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f297856b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f297857c;

    /* renamed from: d */
    public final /* synthetic */ C106596h f297858d;

    public /* synthetic */ C106933cn(C106941cv cvVar, C60870cx cxVar, C60870cx cxVar2, C106596h hVar) {
        this.f297855a = cvVar;
        this.f297856b = cxVar;
        this.f297857c = cxVar2;
        this.f297858d = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C106941cv cvVar = this.f297855a;
        C60870cx cxVar = this.f297856b;
        C60870cx cxVar2 = this.f297857c;
        C106596h hVar = this.f297858d;
        cvVar.f297878f.mo77077a("5/9: Finished query pcp and media session.");
        C123746bm bmVar = (C123746bm) C60856cj.m92909r(cxVar);
        C123728av avVar = (C123728av) C60856cj.m92909r(cxVar2);
        if (!avVar.f341758d.isEmpty()) {
            C123743bj bjVar = (C123743bj) C123744bk.f341804l.createBuilder();
            bjVar.copyOnWrite();
            C123744bk bkVar = (C123744bk) bjVar.instance;
            bkVar.f341806a |= 1;
            bkVar.f341810e = 29;
            C123752bs bsVar = (C123752bs) C123753bt.f341832c.createBuilder();
            C123729aw awVar = (C123729aw) C123730ax.f341767b.createBuilder();
            awVar.mo106115b(avVar);
            bsVar.copyOnWrite();
            C123753bt btVar = (C123753bt) bsVar.instance;
            C123730ax axVar = (C123730ax) awVar.build();
            axVar.getClass();
            btVar.f341835b = axVar;
            btVar.f341834a |= 1;
            bjVar.copyOnWrite();
            C123744bk bkVar2 = (C123744bk) bjVar.instance;
            C123753bt btVar2 = (C123753bt) bsVar.build();
            btVar2.getClass();
            bkVar2.f341809d = btVar2;
            bkVar2.f341808c = 29;
            ((C58970a) ((C58970a) cvVar.f297873a.mo56224b()).mo56372aa(23399)).mo56386p("Resume media recommendation added.");
            C123745bl blVar = (C123745bl) bmVar.toBuilder();
            blVar.mo106126c((C123744bk) bjVar.build());
            bmVar = (C123746bm) blVar.build();
        }
        return cvVar.f297877e.mo95712a(bmVar, hVar);
    }
}
