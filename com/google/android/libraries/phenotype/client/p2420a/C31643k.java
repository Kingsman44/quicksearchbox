package com.google.android.libraries.phenotype.client.p2420a;

import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.phenotype.client.a.k */
/* compiled from: PG */
public final /* synthetic */ class C31643k implements C146025e {
    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C31638f fVar;
        Configurations configurations = (Configurations) abVar.mo122488g();
        C31633a aVar = (C31633a) C31634b.f85107i.createBuilder();
        String str = configurations.f393980a;
        aVar.copyOnWrite();
        C31634b bVar = (C31634b) aVar.instance;
        str.getClass();
        bVar.f85109a |= 1;
        bVar.f85110b = str;
        String str2 = configurations.f393982c;
        aVar.copyOnWrite();
        C31634b bVar2 = (C31634b) aVar.instance;
        str2.getClass();
        bVar2.f85109a |= 4;
        bVar2.f85112d = str2;
        boolean z = configurations.f393985f;
        aVar.copyOnWrite();
        C31634b bVar3 = (C31634b) aVar.instance;
        bVar3.f85109a |= 8;
        bVar3.f85115g = z;
        long j = configurations.f393986g;
        aVar.copyOnWrite();
        C31634b bVar4 = (C31634b) aVar.instance;
        bVar4.f85109a |= 16;
        bVar4.f85116h = j;
        byte[] bArr = configurations.f393981b;
        int i = 2;
        if (bArr != null) {
            C63088z A = C63088z.m96139A(bArr);
            aVar.copyOnWrite();
            C31634b bVar5 = (C31634b) aVar.instance;
            bVar5.f85109a |= 2;
            bVar5.f85111c = A;
        }
        Configuration[] configurationArr = configurations.f393983d;
        int length = configurationArr.length;
        int i2 = 0;
        while (i2 < length) {
            Configuration configuration = configurationArr[i2];
            Flag[] flagArr = configuration.f393977b;
            int length2 = flagArr.length;
            int i3 = 0;
            while (i3 < length2) {
                Flag flag = flagArr[i3];
                int i4 = flag.f394009g;
                if (i4 == 1) {
                    C31637e eVar = (C31637e) C31638f.f85127e.createBuilder();
                    String str3 = flag.f394003a;
                    eVar.copyOnWrite();
                    C31638f fVar2 = (C31638f) eVar.instance;
                    str3.getClass();
                    fVar2.f85129a |= 1;
                    fVar2.f85132d = str3;
                    long b = flag.mo121837b();
                    eVar.copyOnWrite();
                    C31638f fVar3 = (C31638f) eVar.instance;
                    fVar3.f85130b = 1;
                    fVar3.f85131c = Long.valueOf(b);
                    fVar = (C31638f) eVar.build();
                } else if (i4 == i) {
                    C31637e eVar2 = (C31637e) C31638f.f85127e.createBuilder();
                    String str4 = flag.f394003a;
                    eVar2.copyOnWrite();
                    C31638f fVar4 = (C31638f) eVar2.instance;
                    str4.getClass();
                    fVar4.f85129a |= 1;
                    fVar4.f85132d = str4;
                    boolean e = flag.mo121841e();
                    eVar2.copyOnWrite();
                    C31638f fVar5 = (C31638f) eVar2.instance;
                    fVar5.f85130b = 2;
                    fVar5.f85131c = Boolean.valueOf(e);
                    fVar = (C31638f) eVar2.build();
                } else if (i4 == 3) {
                    C31637e eVar3 = (C31637e) C31638f.f85127e.createBuilder();
                    String str5 = flag.f394003a;
                    eVar3.copyOnWrite();
                    C31638f fVar6 = (C31638f) eVar3.instance;
                    str5.getClass();
                    fVar6.f85129a |= 1;
                    fVar6.f85132d = str5;
                    double a = flag.mo121836a();
                    eVar3.copyOnWrite();
                    C31638f fVar7 = (C31638f) eVar3.instance;
                    fVar7.f85130b = 3;
                    fVar7.f85131c = Double.valueOf(a);
                    fVar = (C31638f) eVar3.build();
                } else if (i4 == 4) {
                    C31637e eVar4 = (C31637e) C31638f.f85127e.createBuilder();
                    String str6 = flag.f394003a;
                    eVar4.copyOnWrite();
                    C31638f fVar8 = (C31638f) eVar4.instance;
                    str6.getClass();
                    fVar8.f85129a |= 1;
                    fVar8.f85132d = str6;
                    String c = flag.mo121838c();
                    eVar4.copyOnWrite();
                    C31638f fVar9 = (C31638f) eVar4.instance;
                    fVar9.f85130b = 4;
                    fVar9.f85131c = c;
                    fVar = (C31638f) eVar4.build();
                } else if (i4 == 5) {
                    C31637e eVar5 = (C31637e) C31638f.f85127e.createBuilder();
                    String str7 = flag.f394003a;
                    eVar5.copyOnWrite();
                    C31638f fVar10 = (C31638f) eVar5.instance;
                    str7.getClass();
                    fVar10.f85129a |= 1;
                    fVar10.f85132d = str7;
                    C63088z A2 = C63088z.m96139A(flag.mo121843f());
                    eVar5.copyOnWrite();
                    C31638f fVar11 = (C31638f) eVar5.instance;
                    fVar11.f85130b = 5;
                    fVar11.f85131c = A2;
                    fVar = (C31638f) eVar5.build();
                } else {
                    throw new IllegalArgumentException("Unrecognized flag type: " + i4);
                }
                aVar.copyOnWrite();
                C31634b bVar6 = (C31634b) aVar.instance;
                fVar.getClass();
                C62971cq cqVar = bVar6.f85113e;
                if (!cqVar.mo58948c()) {
                    bVar6.f85113e = C62942bv.mutableCopy(cqVar);
                }
                bVar6.f85113e.add(fVar);
                i3++;
                i = 2;
            }
            String[] strArr = configuration.f393978c;
            if (strArr != null) {
                for (String str8 : strArr) {
                    aVar.copyOnWrite();
                    C31634b bVar7 = (C31634b) aVar.instance;
                    str8.getClass();
                    C62971cq cqVar2 = bVar7.f85114f;
                    if (!cqVar2.mo58948c()) {
                        bVar7.f85114f = C62942bv.mutableCopy(cqVar2);
                    }
                    bVar7.f85114f.add(str8);
                }
            }
            i2++;
            i = 2;
        }
        return (C31634b) aVar.build();
    }
}
