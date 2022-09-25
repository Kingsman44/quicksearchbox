package com.google.android.apps.gsa.staticplugins.fedass.p7941c.p7944c;

import android.text.TextUtils;
import com.google.android.apps.search.fedora.p10099e.C132807o;
import com.google.android.apps.search.fedora.p10099e.C132809q;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19397a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.c.c.a */
/* compiled from: PG */
public final /* synthetic */ class C100820a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C100820a f281779a = new C100820a();

    private /* synthetic */ C100820a() {
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            C59104x b = C100821b.f281780a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FedNspRegistration");
            ((C59052c) ((C59052c) b).mo56372aa(19570)).mo56386p("Federated Analytics Task not scheduled: FedAssPartnerFlags not present.");
            return Optional.empty();
        }
        C132809q qVar = ((C132807o) optional.get()).f362351e;
        if (qVar == null) {
            qVar = C132809q.f362352d;
        }
        if (!qVar.f362355b) {
            C59104x b2 = C100821b.f281780a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "FedNspRegistration");
            ((C59052c) ((C59052c) b2).mo56372aa(19569)).mo56386p("Federated Analytics Task not scheduled: fednsp_fa flag is OFF.");
            return Optional.empty();
        }
        C132809q qVar2 = ((C132807o) optional.get()).f362351e;
        if (qVar2 == null) {
            qVar2 = C132809q.f362352d;
        }
        String str = qVar2.f362356c;
        if (TextUtils.isEmpty(str)) {
            C59104x d = C100821b.f281780a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FedNspRegistration");
            ((C59052c) ((C59052c) d).mo56372aa(19568)).mo56386p("Federated Analytics Task not scheduled: empty population.");
            return Optional.empty();
        }
        C58976aa aaVar = C58975e.f156826a;
        C19397a aVar = new C19397a();
        aVar.mo24545b(str);
        aVar.f54267a = "FedNspTrainerSession";
        aVar.mo24546c(397181893);
        return Optional.m71637of(aVar.mo24544a());
    }
}
