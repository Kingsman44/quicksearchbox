package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3917i.p3918a.C51350el;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.r */
/* compiled from: PG */
public final /* synthetic */ class C103638r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Query f288695a;

    public /* synthetic */ C103638r(Query query) {
        this.f288695a = query;
    }

    public final Object apply(Object obj) {
        C51334dw dwVar = (C51334dw) obj;
        byte[] dU = this.f288695a.mo84440dU("android.opa.extra.POSITIONAL_ATTRIBUTES");
        if (dU == null) {
            return dwVar;
        }
        try {
            C51350el elVar = (C51350el) C62942bv.parseFrom((C62942bv) C51350el.f133749b, dU, C62921ba.m95368a());
            C51303cs csVar = (C51303cs) dwVar.toBuilder();
            csVar.copyOnWrite();
            C51334dw dwVar2 = (C51334dw) csVar.instance;
            elVar.getClass();
            dwVar2.f133712z = elVar;
            dwVar2.f133685a |= 1073741824;
            return (C51334dw) csVar.build();
        } catch (C62974ct e) {
            C59104x c = C103642v.f288702a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AssistantRequestPM");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21557)).mo56386p("Cannot parse PositionalAttributes");
            return dwVar;
        }
    }
}
