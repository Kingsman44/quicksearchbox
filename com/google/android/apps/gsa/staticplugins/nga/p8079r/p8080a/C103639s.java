package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3917i.p3918a.C51336dy;
import com.google.assistant.p3897e.p3917i.p3918a.C51351em;
import com.google.assistant.p3897e.p3917i.p3918a.C51352en;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.s */
/* compiled from: PG */
public final /* synthetic */ class C103639s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Query f288696a;

    public /* synthetic */ C103639s(Query query) {
        this.f288696a = query;
    }

    public final Object apply(Object obj) {
        C51334dw dwVar = (C51334dw) obj;
        byte[] dU = this.f288696a.mo84440dU("android.opa.extra.EXTRA_FOREGROUND_APP");
        if (dU == null) {
            return dwVar;
        }
        try {
            C51303cs csVar = (C51303cs) dwVar.toBuilder();
            C51352en enVar = dwVar.f133660A;
            if (enVar == null) {
                enVar = C51352en.f133752d;
            }
            C51351em emVar = (C51351em) enVar.toBuilder();
            C51336dy dyVar = (C51336dy) C62942bv.parseFrom((C62942bv) C51336dy.f133713d, dU, C62921ba.m95368a());
            emVar.copyOnWrite();
            C51352en enVar2 = (C51352en) emVar.instance;
            dyVar.getClass();
            enVar2.f133756c = dyVar;
            enVar2.f133754a |= 8;
            csVar.copyOnWrite();
            C51334dw dwVar2 = (C51334dw) csVar.instance;
            C51352en enVar3 = (C51352en) emVar.build();
            enVar3.getClass();
            dwVar2.f133660A = enVar3;
            dwVar2.f133688b |= 2;
            return (C51334dw) csVar.build();
        } catch (C62974ct e) {
            C59104x c = C103642v.f288702a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AssistantRequestPM");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21555)).mo56386p("Cannot parse ForegroundApp");
            return dwVar;
        }
    }
}
