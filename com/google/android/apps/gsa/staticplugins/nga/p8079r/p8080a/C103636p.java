package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3917i.p3918a.C51339ea;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.p */
/* compiled from: PG */
public final /* synthetic */ class C103636p implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Query f288693a;

    public /* synthetic */ C103636p(Query query) {
        this.f288693a = query;
    }

    public final Object apply(Object obj) {
        Query query = this.f288693a;
        C51303cs csVar = (C51303cs) ((C51334dw) obj).toBuilder();
        C58833ax j = C58833ax.m90833j(query.mo84440dU("bisto-device-properties"));
        if (j.mo56113h()) {
            try {
                C51334dw dwVar = (C51334dw) C62942bv.parseFrom((C62942bv) C51334dw.f133658ab, (byte[]) j.mo56107c(), C62921ba.m95368a());
                if ((dwVar.f133688b & 128) != 0) {
                    C51339ea eaVar = dwVar.f133662C;
                    if (eaVar == null) {
                        eaVar = C51339ea.f133718c;
                    }
                    csVar.copyOnWrite();
                    C51334dw dwVar2 = (C51334dw) csVar.instance;
                    eaVar.getClass();
                    dwVar2.f133662C = eaVar;
                    dwVar2.f133688b |= 128;
                }
            } catch (C62974ct e) {
                C59104x c = C103642v.f288702a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AssistantRequestPM");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(21556)).mo56386p("Failed reading Bisto device properties.");
            }
        }
        return (C51334dw) csVar.build();
    }
}
