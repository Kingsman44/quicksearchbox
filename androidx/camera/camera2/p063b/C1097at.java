package androidx.camera.camera2.p063b;

import androidx.camera.camera2.p062a.C0989b;
import androidx.camera.core.p069a.C1300an;
import androidx.camera.core.p069a.C1301ao;
import androidx.camera.core.p069a.C1302ap;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1343cc;
import androidx.camera.core.p069a.C1348ch;
import androidx.camera.core.p069a.C1373df;

/* renamed from: androidx.camera.camera2.b.at */
/* compiled from: PG */
class C1097at implements C1301ao {

    /* renamed from: a */
    static final C1097at f3277a = new C1097at();

    /* renamed from: a */
    public void mo3859a(C1373df dfVar, C1300an anVar) {
        C1302ap apVar = (C1302ap) C1348ch.m3675c(dfVar, C1373df.f3866m, (Object) null);
        C1308av avVar = C1343cc.f3824c;
        int i = C1302ap.m3495a().f3751e;
        if (apVar != null) {
            i = apVar.f3751e;
            anVar.mo4158b(apVar.f3752f);
            avVar = apVar.f3750d;
        }
        anVar.f3741b = C1339bz.m3626l(avVar);
        C0989b bVar = new C0989b(dfVar);
        anVar.f3742c = bVar.mo3740a(i);
        anVar.mo4159c(new C1137cf(bVar.mo3741b(new C1096as())));
        anVar.mo4161e(bVar.mo3743d());
    }
}
