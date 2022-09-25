package com.google.android.apps.search.googleapp.stampviewer.p10497i;

import com.google.p4242bp.p4253e.p4254a.C56181a;
import com.google.p4242bp.p4253e.p4254a.C56182b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.i.d */
/* compiled from: PG */
public final class C139425d {
    /* renamed from: a */
    public static C56182b m226559a(C56182b bVar) {
        C56181a aVar = (C56181a) C56182b.f149689f.createBuilder();
        String str = bVar.f149693c;
        aVar.copyOnWrite();
        C56182b bVar2 = (C56182b) aVar.instance;
        str.getClass();
        bVar2.f149691a |= 2;
        bVar2.f149693c = str;
        C62971cq cqVar = bVar.f149694d;
        aVar.copyOnWrite();
        C56182b bVar3 = (C56182b) aVar.instance;
        C62971cq cqVar2 = bVar3.f149694d;
        if (!cqVar2.mo58948c()) {
            bVar3.f149694d = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) bVar3.f149694d);
        boolean z = bVar.f149695e;
        aVar.copyOnWrite();
        C56182b bVar4 = (C56182b) aVar.instance;
        bVar4.f149691a |= 4;
        bVar4.f149695e = z;
        return (C56182b) aVar.build();
    }
}
