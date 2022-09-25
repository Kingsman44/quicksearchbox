package com.google.android.libraries.search.location.p3029a.p3030a;

import com.google.android.libraries.search.location.p3029a.C38629bu;
import com.google.android.libraries.search.location.p3029a.C38630bv;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.location.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C38578g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C38580i f101977a;

    public /* synthetic */ C38578g(C38580i iVar) {
        this.f101977a = iVar;
    }

    public final Object apply(Object obj) {
        C38580i iVar = this.f101977a;
        C38576e eVar = (C38576e) obj;
        C38573b bVar = eVar.f101976b;
        if (bVar == null) {
            bVar = C38573b.f101961d;
        }
        if (!iVar.mo41504b(bVar.f101964b)) {
            C38573b bVar2 = eVar.f101976b;
            if (((bVar2 == null ? C38573b.f101961d : bVar2).f101963a & 2) != 0) {
                if (bVar2 == null) {
                    bVar2 = C38573b.f101961d;
                }
                C38630bv bvVar = bVar2.f101965c;
                if (bvVar == null) {
                    return C38630bv.f102073e;
                }
                return bvVar;
            }
        }
        C38629bu buVar = (C38629bu) C38630bv.f102073e.createBuilder();
        buVar.copyOnWrite();
        C38630bv bvVar2 = (C38630bv) buVar.instance;
        bvVar2.f102075a |= 1;
        bvVar2.f102076b = false;
        buVar.copyOnWrite();
        C38630bv bvVar3 = (C38630bv) buVar.instance;
        bvVar3.f102078d = 0;
        bvVar3.f102075a |= 4;
        return (C38630bv) buVar.build();
    }
}
