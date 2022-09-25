package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.libraries.search.p3055n.C39654ch;
import com.google.android.libraries.search.p3055n.C39655ci;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5218j.C66760aa;
import com.google.speech.p5218j.C67179x;
import com.google.speech.p5218j.C67180y;
import com.google.speech.p5218j.C67181z;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.ae */
/* compiled from: PG */
public final /* synthetic */ class C120838ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C39654ch f336013a;

    public /* synthetic */ C120838ae(C39654ch chVar) {
        this.f336013a = chVar;
    }

    public final Object apply(Object obj) {
        C39654ch chVar = this.f336013a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            C59104x c = C120844ak.f336019a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceAsr");
            ((C59052c) ((C59052c) c).mo56372aa(35620)).mo56389s("No auth token available for: %s; cannot perform query audio logging but will continue on-device ASR.", "https://www.googleapis.com/auth/googlenow");
            return null;
        }
        C67181z zVar = (C67181z) C66760aa.f181571b.createBuilder();
        C67179x xVar = (C67179x) C67180y.f182596f.createBuilder();
        String str = (String) axVar.mo56107c();
        xVar.copyOnWrite();
        C67180y yVar = (C67180y) xVar.instance;
        str.getClass();
        yVar.f182598a |= 1;
        yVar.f182599b = str;
        xVar.copyOnWrite();
        C67180y yVar2 = (C67180y) xVar.instance;
        yVar2.f182598a |= 2;
        yVar2.f182600c = "0";
        xVar.copyOnWrite();
        C67180y yVar3 = (C67180y) xVar.instance;
        yVar3.f182598a |= 4;
        yVar3.f182601d = "https://www.googleapis.com/auth/googlenow";
        zVar.mo59776b((C67180y) xVar.build());
        chVar.copyOnWrite();
        C39655ci ciVar = (C39655ci) chVar.instance;
        C66760aa aaVar = (C66760aa) zVar.build();
        C39655ci ciVar2 = C39655ci.f104377j;
        aaVar.getClass();
        ciVar.f104388i = aaVar;
        ciVar.f104380a |= 128;
        return null;
    }
}
