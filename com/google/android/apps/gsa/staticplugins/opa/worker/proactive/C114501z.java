package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.Intent;
import com.google.android.apps.gsa.opa.p6443g.C83679a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3803ag.p3804a.C48800ah;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.z */
/* compiled from: PG */
public final /* synthetic */ class C114501z implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114384af f317476a;

    /* renamed from: b */
    public final /* synthetic */ Intent f317477b;

    /* renamed from: c */
    public final /* synthetic */ C114417bi f317478c;

    /* renamed from: d */
    public final /* synthetic */ Intent f317479d;

    public /* synthetic */ C114501z(C114384af afVar, Intent intent, C114417bi biVar, Intent intent2) {
        this.f317476a = afVar;
        this.f317477b = intent;
        this.f317478c = biVar;
        this.f317479d = intent2;
    }

    public final void run() {
        C114384af afVar = this.f317476a;
        Intent intent = this.f317477b;
        C114417bi biVar = this.f317478c;
        Intent intent2 = this.f317479d;
        if (afVar.f317147i.mo81696h(intent)) {
            afVar.f317147i.mo81700l(afVar.f317142d, intent, biVar.f317253a);
        } else {
            afVar.f317143e.mo65089a(intent);
        }
        if (intent2.hasExtra("proactive_api_metadata")) {
            C58976aa aaVar = C58975e.f156826a;
            byte[] byteArrayExtra = intent2.getByteArrayExtra("proactive_api_metadata");
            if (byteArrayExtra != null) {
                try {
                    C62921ba a = C62921ba.m95368a();
                    C83679a aVar = afVar.f317149k;
                    C48851br brVar = ((C48800ah) C62942bv.parseFrom((C62942bv) C48800ah.f126269b, byteArrayExtra, a)).f126271a;
                    if (brVar == null) {
                        brVar = C48851br.f126412f;
                    }
                    aVar.mo77006b(brVar, 201, C58836b.f156633a);
                } catch (C62974ct e) {
                    C59104x c = C114384af.f317139a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "NotificationActions");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(28972)).mo56386p("invalid proto proactiveApiMetaDataBytes");
                }
            }
        }
    }
}
