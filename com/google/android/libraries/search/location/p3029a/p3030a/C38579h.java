package com.google.android.libraries.search.location.p3029a.p3030a;

import com.google.android.libraries.search.location.p3029a.C38630bv;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.location.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C38579h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C38580i f101978a;

    /* renamed from: b */
    public final /* synthetic */ C38630bv f101979b;

    public /* synthetic */ C38579h(C38580i iVar, C38630bv bvVar) {
        this.f101978a = iVar;
        this.f101979b = bvVar;
    }

    public final Object apply(Object obj) {
        C38580i iVar = this.f101978a;
        C38630bv bvVar = this.f101979b;
        C38576e eVar = (C38576e) obj;
        C38573b bVar = eVar.f101976b;
        if (bVar == null) {
            bVar = C38573b.f101961d;
        }
        if (!iVar.mo41504b(bVar.f101964b)) {
            return eVar;
        }
        C38572a aVar = (C38572a) C38573b.f101961d.createBuilder();
        aVar.copyOnWrite();
        C38573b bVar2 = (C38573b) aVar.instance;
        bvVar.getClass();
        bVar2.f101965c = bvVar;
        bVar2.f101963a |= 2;
        long b = iVar.f101982b.mo26870b();
        aVar.copyOnWrite();
        C38573b bVar3 = (C38573b) aVar.instance;
        bVar3.f101963a |= 1;
        bVar3.f101964b = b;
        C38573b bVar4 = (C38573b) aVar.build();
        C38575d dVar = (C38575d) eVar.toBuilder();
        dVar.copyOnWrite();
        C38576e eVar2 = (C38576e) dVar.instance;
        bVar4.getClass();
        eVar2.f101976b = bVar4;
        eVar2.f101975a |= 2;
        return (C38576e) dVar.build();
    }
}
