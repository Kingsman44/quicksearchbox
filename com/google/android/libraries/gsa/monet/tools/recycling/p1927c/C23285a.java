package com.google.android.libraries.gsa.monet.tools.recycling.p1927c;

import com.google.android.libraries.gsa.monet.shared.C23110f;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1925a.C23275a;
import com.google.android.libraries.gsa.monet.tools.recycling.p1925a.C23276b;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.C23310c;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.RecyclingChildCoordinator$RecyclingChildData;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.c.a */
/* compiled from: PG */
public final class C23285a {
    /* renamed from: a */
    public static final void m43665a(String str, C23129y yVar, ProtoParcelable protoParcelable, C23310c cVar, C23110f fVar) {
        C23067b.m43230c(yVar.mo28577c(), "Scope name must be specified for %s", yVar);
        C23275a aVar = (C23275a) C23276b.f63746c.createBuilder();
        String str2 = yVar.f63478c;
        aVar.copyOnWrite();
        C23276b bVar = (C23276b) aVar.instance;
        str2.getClass();
        bVar.f63748a |= 1;
        bVar.f63749b = str2;
        RecyclingChildCoordinator$RecyclingChildData recyclingChildCoordinator$RecyclingChildData = new RecyclingChildCoordinator$RecyclingChildData(str, cVar, (C23276b) aVar.build());
        fVar.mo28364q(recyclingChildCoordinator$RecyclingChildData.f63675b, yVar, protoParcelable);
        cVar.mo28709h(recyclingChildCoordinator$RecyclingChildData, cVar.mo28704b());
    }
}
