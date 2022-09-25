package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9318j;

import com.google.android.libraries.geller.portable.Geller;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62971cq;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p5129p.p5130a.C65732q;
import com.google.protos.p5129p.p5130a.C65733r;
import com.google.protos.p5129p.p5130a.C65734s;
import com.google.protos.p5129p.p5130a.C65737v;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.j.b */
/* compiled from: PG */
public final /* synthetic */ class C123263b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123269h f340987a;

    /* renamed from: b */
    public final /* synthetic */ String f340988b;

    /* renamed from: c */
    public final /* synthetic */ C65733r f340989c;

    public /* synthetic */ C123263b(C123269h hVar, String str, C65733r rVar) {
        this.f340987a = hVar;
        this.f340988b = str;
        this.f340989c = rVar;
    }

    public final C60870cx apply(Object obj) {
        C123269h hVar = this.f340987a;
        String str = this.f340988b;
        Geller geller = (Geller) obj;
        C62971cq<C65732q> cqVar = this.f340989c.f178578b;
        ArrayList arrayList = new ArrayList();
        C65734s sVar = (C65734s) C65737v.f178587b.createBuilder();
        for (C65732q qVar : cqVar) {
            C65753ak b = C65753ak.m96797b(qVar.f178571a);
            if (b == null) {
                b = C65753ak.UNKNOWN;
            }
            C65753ak akVar = b;
            C65031ap apVar = qVar.f178572b;
            if (apVar == null) {
                apVar = C65031ap.f176100j;
            }
            C65031ap apVar2 = apVar;
            String str2 = apVar2.f176103b == 1 ? (String) apVar2.f176104c : null;
            C63662ac acVar = qVar.f178573c;
            if (acVar == null) {
                acVar = C63662ac.f172144a;
            }
            arrayList.add(C60922j.m93044g(geller.mo27182i(str, akVar, str2, apVar2, acVar), C47810es.m84963c(new C123264c(akVar, sVar)), hVar.f340999b));
        }
        return C60922j.m93044g(C60856cj.m92906o(arrayList), C47810es.m84963c(new C123265d(sVar)), hVar.f340999b);
    }
}
