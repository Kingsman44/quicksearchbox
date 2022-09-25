package androidx.camera.camera2.p063b;

import androidx.camera.core.p069a.C1302ap;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.C1359cs;
import androidx.core.p097i.C1974i;
import androidx.p054b.p055a.p058c.C0895a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.dj */
/* compiled from: PG */
public final /* synthetic */ class C1168dj implements C0895a {

    /* renamed from: a */
    public final /* synthetic */ C1171dm f3421a;

    public /* synthetic */ C1168dj(C1171dm dmVar) {
        this.f3421a = dmVar;
    }

    /* renamed from: a */
    public final Object mo523a(Object obj) {
        C1171dm dmVar = this.f3421a;
        Void voidR = (Void) obj;
        C1147cp cpVar = dmVar.f3427d;
        boolean z = dmVar.f3435l == 2;
        int i = dmVar.f3435l;
        C1170dl.m3241a(i);
        C1974i.m5314b(z, "Invalid state state:".concat(C1170dl.m3241a(i)));
        List<C1314ba> b = dmVar.f3431h.mo4242b();
        ArrayList arrayList = new ArrayList();
        for (C1314ba baVar : b) {
            C1974i.m5314b(baVar instanceof C1359cs, "Surface must be SessionProcessorSurface");
            arrayList.add((C1359cs) baVar);
        }
        dmVar.f3430g = new C1126bv(cpVar, arrayList);
        dmVar.f3425b.mo4246d();
        dmVar.f3435l = 3;
        C1357cq cqVar = dmVar.f3429f;
        if (cqVar != null) {
            dmVar.mo3930k(cqVar);
        }
        if (dmVar.f3432i != null) {
            List asList = Arrays.asList(new C1302ap[]{dmVar.f3432i});
            dmVar.f3432i = null;
            dmVar.mo3928i(asList);
        }
        return null;
    }
}
