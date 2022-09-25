package com.google.android.libraries.geller.p1818f;

import com.google.android.libraries.geller.p1817e.C21781f;
import com.google.android.libraries.geller.p1817e.C21782g;
import com.google.android.libraries.geller.p1818f.p1819a.C21789d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5030q.p5032b.C65039ax;
import com.google.protos.p4985f.p5030q.p5032b.C65042b;
import com.google.protos.p4985f.p5030q.p5032b.C65057d;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.geller.f.bd */
/* compiled from: PG */
public final /* synthetic */ class C21821bd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C21826bi f60211a;

    public /* synthetic */ C21821bd(C21826bi biVar) {
        this.f60211a = biVar;
    }

    public final C60870cx apply(Object obj) {
        C65057d dVar;
        C65057d dVar2;
        C21826bi biVar = this.f60211a;
        C65039ax axVar = (C65039ax) obj;
        ArrayList arrayList = new ArrayList(axVar.f176128a.size());
        for (C65042b bVar : axVar.f176128a) {
            C65753ak b = C65753ak.m96797b(bVar.f176141c);
            if (b == null) {
                b = C65753ak.UNKNOWN;
            }
            if (bVar.f176139a == 2) {
                dVar = (C65057d) bVar.f176140b;
            } else {
                dVar = C65057d.f176173d;
            }
            ArrayList arrayList2 = new ArrayList(dVar.f176175a);
            if (bVar.f176139a == 2) {
                dVar2 = (C65057d) bVar.f176140b;
            } else {
                dVar2 = C65057d.f176173d;
            }
            C62971cq cqVar = dVar2.f176176b;
            if (!b.name().startsWith("ENCRYPTED_")) {
                arrayList.add(C60856cj.m92900i(new C21817b(b, C58485gu.m89842j(arrayList2), C58485gu.m89842j(cqVar))));
            } else {
                C21782g gVar = (C21782g) ((C58847bk) biVar.f60232p).f156646a;
                C21789d.m40905b(biVar.f60218b);
                arrayList.add(C60922j.m93044g(C60922j.m93044g(gVar.f60092c.mo27113a(), C47810es.m84963c(new C21781f(arrayList2)), gVar.f60093d), C47810es.m84963c(new C21815ay(b, cqVar)), biVar.f60223g));
            }
        }
        return C60856cj.m92896e(arrayList);
    }
}
