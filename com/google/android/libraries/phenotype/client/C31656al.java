package com.google.android.libraries.phenotype.client;

import android.util.Base64;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4522b.C58724pq;
import com.google.frameworks.client.data.p4631a.C61331a;
import com.google.p343ac.p346b.C6649k;
import com.google.p343ac.p346b.C6650l;
import com.google.protobuf.C63088z;
import java.util.List;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.libraries.phenotype.client.al */
/* compiled from: PG */
public final class C31656al {
    /* renamed from: a */
    public static C6650l m58995a(List list) {
        C58485gu F = C58485gu.m89836F(C58701ou.f156429a, list);
        C6649k kVar = (C6649k) C6650l.f19886b.createBuilder();
        int i = ((C58724pq) F).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C63088z A = C63088z.m96139A(Base64.decode((String) F.get(i2), 8));
            kVar.copyOnWrite();
            C6650l lVar = (C6650l) kVar.instance;
            lVar.mo13719a();
            lVar.f19888a.add(A);
        }
        return (C6650l) kVar.build();
    }

    /* renamed from: b */
    public static C70334de m58996b(List list) {
        C70334de deVar = new C70334de();
        deVar.mo62033h(C70297cz.m102495c(C61331a.m93818a(202964622), C70334de.f187480b), m58995a(list).toByteArray());
        return deVar;
    }
}
