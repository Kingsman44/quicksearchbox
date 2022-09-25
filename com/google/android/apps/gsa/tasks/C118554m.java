package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87702ak;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87703al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87704am;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.tasks.m */
/* compiled from: PG */
public final /* synthetic */ class C118554m implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C118556o f329150a;

    /* renamed from: b */
    public final /* synthetic */ C118557p f329151b;

    public /* synthetic */ C118554m(C118556o oVar, C118557p pVar) {
        this.f329150a = oVar;
        this.f329151b = pVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C118556o oVar = this.f329150a;
        C118557p pVar = this.f329151b;
        C118517bt btVar = oVar.f329158e.f329163c;
        C118522by byVar = oVar.f329154a;
        C118476ak akVar = pVar.f329159a;
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.BACKGROUND_TASK;
        gVar.f239199a = 1;
        gVar.f239204f = "backgroundtask";
        ClientConfig clientConfig = new ClientConfig(gVar);
        C88489j jVar = new C88489j(C87739bu.BACKGROUND_TASK_STARTED);
        C62940bt btVar2 = C87702ak.f237160a;
        C87703al alVar = (C87703al) C87704am.f237161d.createBuilder();
        alVar.copyOnWrite();
        C87704am amVar = (C87704am) alVar.instance;
        amVar.f237164b = byVar.f329106cj;
        amVar.f237163a |= 1;
        alVar.copyOnWrite();
        C87704am amVar2 = (C87704am) alVar.instance;
        akVar.getClass();
        amVar2.f237165c = akVar;
        amVar2.f237163a |= 2;
        jVar.mo82014b(btVar2, (C87704am) alVar.build());
        return btVar.f328936b.mo28210j(btVar.f328937c.mo82005d(clientConfig, jVar.mo82013a(), C88244um.UNBIND_BACKGROUND_CLIENT, C118517bt.f328935a), String.valueOf(String.valueOf(byVar)).concat("-ss-result-transform"), C118516bs.f328934a);
    }
}
