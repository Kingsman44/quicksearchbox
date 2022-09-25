package com.google.android.libraries.search.video.p3194d;

import com.google.android.libraries.search.video.p3191a.C41447f;
import com.google.common.util.concurrent.C60887da;
import com.google.frameworks.client.data.android.C61531o;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57149f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.video.d.b */
/* compiled from: PG */
public final class C41491b {

    /* renamed from: a */
    private final C41495f f108389a;

    /* renamed from: b */
    private final Map f108390b = new HashMap();

    public C41491b(C41495f fVar) {
        this.f108389a = fVar;
    }

    /* renamed from: a */
    public final C41490a mo44012a(C57143b bVar) {
        C57149f fVar = bVar.f152540k;
        if (fVar == null) {
            fVar = C57149f.f152565f;
        }
        String str = fVar.f152567a;
        if (this.f108390b.containsKey(str)) {
            return (C41490a) this.f108390b.get(str);
        }
        C41495f fVar2 = this.f108389a;
        C41447f fVar3 = (C41447f) fVar2.f108404a.mo17428b();
        fVar3.getClass();
        C60887da daVar = (C60887da) fVar2.f108405b.mo17428b();
        daVar.getClass();
        ((C60887da) fVar2.f108406c.mo17428b()).getClass();
        C61531o oVar = (C61531o) fVar2.f108407d.mo17428b();
        oVar.getClass();
        bVar.getClass();
        C41494e eVar = new C41494e(fVar3, daVar, oVar, bVar);
        this.f108390b.put(str, eVar);
        return eVar;
    }
}
