package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.Intent;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.s */
/* compiled from: PG */
public final /* synthetic */ class C114480s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f317438a;

    public /* synthetic */ C114480s(Intent intent) {
        this.f317438a = intent;
    }

    public final Object apply(Object obj) {
        Intent intent = this.f317438a;
        Void voidR = (Void) obj;
        C59071e eVar = C114496u.f317466a;
        try {
            return C58833ax.m90834k((aas) C62942bv.parseFrom((C62942bv) aas.f134661u, intent.getByteArrayExtra("notification"), C62921ba.m95368a()));
        } catch (C62974ct unused) {
            C59104x c = C114496u.f317466a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ContextFenceReg");
            ((C59052c) ((C59052c) c).mo56372aa(28964)).mo56386p("Can't parse notification from awareness api intent.");
            return C58836b.f156633a;
        }
    }
}
