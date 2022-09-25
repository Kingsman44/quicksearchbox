package com.google.android.libraries.search.p3005i.p3007b;

import com.google.apps.tiktok.p3663j.C47346d;
import com.google.apps.tiktok.p3663j.C47348f;
import com.google.apps.tiktok.p3663j.C47349g;
import com.google.apps.tiktok.p3663j.C47350h;
import com.google.apps.tiktok.p3663j.C47351i;
import com.google.apps.tiktok.p3663j.C47354l;
import com.google.apps.tiktok.p3663j.C47355m;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.i.b.j */
/* compiled from: PG */
public final class C38433j {

    /* renamed from: a */
    public final C38434k f101732a;

    public C38433j(C38434k kVar) {
        this.f101732a = kVar;
    }

    /* renamed from: a */
    public final C47355m mo41419a(String str, String str2, C58528ij ijVar, C62910ar arVar) {
        C47348f fVar = new C47348f();
        fVar.f123067a = C47350h.ON_NETWORK_UNMETERED;
        C47349g a = fVar.mo51221a();
        C47348f fVar2 = new C47348f();
        fVar2.f123067a = C47350h.ON_CHARGER;
        return mo41420b(str, str2, ijVar, arVar, C58528ij.m90011K(a, fVar2.mo51221a()));
    }

    /* renamed from: b */
    public final C47355m mo41420b(String str, String str2, C58528ij ijVar, C62910ar arVar, C58528ij ijVar2) {
        C47354l lVar = new C47354l();
        lVar.f123076a = C47351i.m84169a(str);
        lVar.f123078c = new C38432i(this, str2, ijVar);
        C47346d dVar = new C47346d();
        C62948a.m95465p(arVar);
        dVar.mo51220c(arVar.f169860a, TimeUnit.SECONDS);
        C58800sl lA = ijVar2.iterator();
        while (lA.hasNext()) {
            dVar.mo51219b((C47349g) lA.next());
        }
        lVar.f123077b = dVar.mo51218a();
        return lVar.mo51226a();
    }
}
