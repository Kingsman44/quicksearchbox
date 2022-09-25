package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.p979a;

import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p1002d.C13625i;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13499a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13510c;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13512e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51418gz;
import com.google.assistant.p3897e.p3917i.p3918a.C51420ha;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C13505f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13508i f41430a;

    public /* synthetic */ C13505f(C13508i iVar) {
        this.f41430a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C13508i iVar = this.f41430a;
        C13625i iVar2 = (C13625i) obj;
        C51420ha haVar = iVar2.f41656b;
        if (haVar == null) {
            haVar = C51420ha.f133933d;
        }
        int a = C51418gz.m86179a(haVar.f133937c);
        if (a == 0) {
            a = 1;
        }
        if (Objects.equals(iVar2, C13625i.f41653c) || a == 1) {
            C59104x d = C13508i.f41432a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "LocationEtaSelector");
            ((C59052c) ((C59052c) d).mo56372aa(44874)).mo56386p("Could not retrieve any navigation state from GMM");
            C13510c l = C13512e.m29782l();
            ((C13499a) l).f41418k = 7;
            return C60856cj.m92900i(l.mo21131a());
        } else if (a - 1 != 2) {
            C60870cx c = iVar.mo21140c();
            C13506g gVar = new C13506g(iVar);
            return C60922j.m93045h(c, C47810es.m84966f(gVar), iVar.f41434b);
        } else {
            C59104x d2 = C13508i.f41432a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "LocationEtaSelector");
            ((C59052c) ((C59052c) d2).mo56372aa(44876)).mo56386p("GMM active navigation state is not supported");
            C13510c l2 = C13512e.m29782l();
            ((C13499a) l2).f41418k = 7;
            return C60856cj.m92900i(l2.mo21131a());
        }
    }
}
