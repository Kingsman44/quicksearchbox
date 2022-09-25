package com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9395c.p9396a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124687cz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.c.c.a.af */
/* compiled from: PG */
public final /* synthetic */ class C124560af implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124571aq f343637a;

    /* renamed from: b */
    public final /* synthetic */ C124687cz f343638b;

    /* renamed from: c */
    public final /* synthetic */ String f343639c;

    /* renamed from: d */
    public final /* synthetic */ C70862aj f343640d;

    public /* synthetic */ C124560af(C124571aq aqVar, C124687cz czVar, String str, C70862aj ajVar) {
        this.f343637a = aqVar;
        this.f343638b = czVar;
        this.f343639c = str;
        this.f343640d = ajVar;
    }

    public final void accept(Object obj) {
        C124571aq aqVar = this.f343637a;
        C124687cz czVar = this.f343638b;
        String str = this.f343639c;
        C70862aj ajVar = this.f343640d;
        C124570ap apVar = (C124570ap) obj;
        if (apVar.mo106534a().mo106485Z() && (czVar.f343988a & 2) != 0) {
            String str2 = czVar.f343990c;
            String b = apVar.mo106535b();
            if (apVar.mo106534a() == null || b == null) {
                C59104x d = C124571aq.f343658a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoDeviceService");
                ((C59052c) ((C59052c) d).mo56372aa(36261)).mo56354G("Invalid information deviceInfo: %s, accountName: %s", apVar.mo106534a(), b);
            } else {
                C124620am p = apVar.mo106534a().mo106518p(b);
                C58976aa aaVar = C58975e.f156826a;
                if (p == null || !str2.equals(p.f343764b)) {
                    C59104x b2 = C124571aq.f343658a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "BistoDeviceService");
                    ((C59052c) ((C59052c) b2).mo56372aa(36263)).mo56354G("Device ID/DUSI Updated %s %s", str, str2);
                    aqVar.f343665g.mo83380V(str, b, new C124592t(str2));
                }
            }
        }
        C124571aq.m204232i(apVar, ajVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
