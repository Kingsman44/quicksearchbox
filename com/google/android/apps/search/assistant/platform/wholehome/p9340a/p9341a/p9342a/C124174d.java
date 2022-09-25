package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9342a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124210z;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C124174d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124176f f342918a;

    /* renamed from: b */
    public final /* synthetic */ C124210z f342919b;

    public /* synthetic */ C124174d(C124176f fVar, C124210z zVar) {
        this.f342918a = fVar;
        this.f342919b = zVar;
    }

    public final void run() {
        C124176f fVar = this.f342918a;
        C124210z zVar = this.f342919b;
        int i = zVar.f342972a;
        int i2 = 4;
        if (i != 0) {
            i2 = i != 1 ? i != 4 ? i != 5 ? 0 : 3 : 2 : 1;
        }
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            ((C59052c) ((C59052c) C124177g.f342922a.mo56224b()).mo56372aa(36110)).mo56386p("Handling CONNECT_RESPONSE message");
            C124177g gVar = fVar.f342921a;
            gVar.f342925d.mo5437b(gVar);
        } else if (i3 == 1) {
            ((C59052c) ((C59052c) C124177g.f342922a.mo56224b()).mo56372aa(36111)).mo56386p("Handling REMOTE_DEVICE_STATE_UPDATE message");
            fVar.f342921a.f342927f.execute(C47810es.m84977q(new C124172b(fVar, zVar)));
        } else if (i3 == 2) {
            ((C59052c) ((C59052c) C124177g.f342922a.mo56224b()).mo56372aa(36112)).mo56386p("Handling REMOTE_EXECUTION_REQUEST message");
            fVar.f342921a.f342927f.execute(C47810es.m84977q(new C124173c(fVar, zVar)));
        } else {
            throw new IllegalArgumentException("Unsupported message was received.");
        }
    }
}
