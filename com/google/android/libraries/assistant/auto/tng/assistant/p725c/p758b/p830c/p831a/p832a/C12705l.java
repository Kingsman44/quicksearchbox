package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p832a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12863g;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12864h;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16766p;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C12705l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12709p f39783a;

    /* renamed from: b */
    public final /* synthetic */ C16766p f39784b;

    public /* synthetic */ C12705l(C12709p pVar, C16766p pVar2) {
        this.f39783a = pVar;
        this.f39784b = pVar2;
    }

    public final void run() {
        C12709p pVar = this.f39783a;
        C16766p pVar2 = this.f39784b;
        C12863g gVar = pVar.f39794d;
        gVar.copyOnWrite();
        C12864h hVar = (C12864h) gVar.instance;
        C12864h hVar2 = C12864h.f40117i;
        pVar2.getClass();
        hVar.f40124f = pVar2;
        hVar.f40119a |= 16;
        pVar.f39794d = gVar;
        C59104x b = C12709p.f39791a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CDStateUpdater");
        ((C59052c) ((C59052c) b).mo56372aa(44411)).mo56386p("send updateAppOpenArgs to CDRenderingStateStream");
        pVar.f39793c.f155056f.mo54591h((C12864h) pVar.f39794d.build());
    }
}
