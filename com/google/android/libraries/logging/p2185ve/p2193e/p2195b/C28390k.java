package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2192d.C28349b;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import java.util.List;

/* renamed from: com.google.android.libraries.logging.ve.e.b.k */
/* compiled from: PG */
final class C28390k {
    /* renamed from: a */
    static C60218r m53070a(C28349b bVar, boolean z) {
        List b = bVar.mo33863b();
        for (int i = !z; i < b.size(); i++) {
            C28481u uVar = (C28481u) b.get(i);
            C60214n nVar = uVar.f77290c;
            if (nVar == null) {
                nVar = C60214n.f162914g;
            }
            if ((nVar.f162916a & 2048) != 0) {
                C60214n nVar2 = uVar.f77290c;
                if (nVar2 == null) {
                    nVar2 = C60214n.f162914g;
                }
                C60218r rVar = nVar2.f162921f;
                return rVar == null ? C60218r.f162925d : rVar;
            }
        }
        return null;
    }
}
