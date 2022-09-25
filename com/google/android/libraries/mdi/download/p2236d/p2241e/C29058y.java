package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.android.libraries.mdi.download.C29384eh;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.p4566l.C60125aq;
import com.google.common.p4552o.p4566l.C60126ar;
import com.google.common.p4552o.p4566l.C60148bm;
import com.google.common.p4552o.p4566l.C60149bn;
import com.google.common.p4552o.p4566l.C60150bo;
import com.google.common.p4552o.p4566l.C60151bp;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.e.y */
/* compiled from: PG */
public final /* synthetic */ class C29058y implements C58817ah {
    public final Object apply(Object obj) {
        C60148bm bmVar = (C60148bm) C60151bp.f162720e.createBuilder();
        long j = 0;
        long j2 = 0;
        for (C29384eh ehVar : (List) obj) {
            C60149bn bnVar = (C60149bn) C60150bo.f162714e.createBuilder();
            C60125aq aqVar = (C60125aq) C60126ar.f162612j.createBuilder();
            C29392ep epVar = ehVar.f79656b;
            if (epVar == null) {
                epVar = C29392ep.f79679g;
            }
            String str = epVar.f79683c;
            aqVar.copyOnWrite();
            C60126ar arVar = (C60126ar) aqVar.instance;
            str.getClass();
            arVar.f162614a |= 4;
            arVar.f162617d = str;
            C29392ep epVar2 = ehVar.f79656b;
            if (epVar2 == null) {
                epVar2 = C29392ep.f79679g;
            }
            String str2 = epVar2.f79682b;
            aqVar.copyOnWrite();
            C60126ar arVar2 = (C60126ar) aqVar.instance;
            str2.getClass();
            arVar2.f162614a |= 1;
            arVar2.f162615b = str2;
            int i = ehVar.f79659e;
            aqVar.copyOnWrite();
            C60126ar arVar3 = (C60126ar) aqVar.instance;
            arVar3.f162614a |= 2;
            arVar3.f162616c = i;
            long j3 = ehVar.f79657c;
            aqVar.copyOnWrite();
            C60126ar arVar4 = (C60126ar) aqVar.instance;
            arVar4.f162614a |= 64;
            arVar4.f162621h = j3;
            String str3 = ehVar.f79658d;
            aqVar.copyOnWrite();
            C60126ar arVar5 = (C60126ar) aqVar.instance;
            str3.getClass();
            arVar5.f162614a |= 128;
            arVar5.f162622i = str3;
            C60126ar arVar6 = (C60126ar) aqVar.build();
            bnVar.copyOnWrite();
            C60150bo boVar = (C60150bo) bnVar.instance;
            arVar6.getClass();
            boVar.f162717b = arVar6;
            boVar.f162716a |= 1;
            long j4 = ehVar.f79661g;
            bnVar.copyOnWrite();
            C60150bo boVar2 = (C60150bo) bnVar.instance;
            boVar2.f162716a |= 2;
            boVar2.f162718c = j4;
            long j5 = ehVar.f79660f;
            bnVar.copyOnWrite();
            C60150bo boVar3 = (C60150bo) bnVar.instance;
            boVar3.f162716a |= 4;
            boVar3.f162719d = j5;
            bmVar.copyOnWrite();
            C60151bp bpVar = (C60151bp) bmVar.instance;
            C60150bo boVar4 = (C60150bo) bnVar.build();
            boVar4.getClass();
            C62971cq cqVar = bpVar.f162723b;
            if (!cqVar.mo58948c()) {
                bpVar.f162723b = C62942bv.mutableCopy(cqVar);
            }
            bpVar.f162723b.add(boVar4);
            j += ehVar.f79661g;
            j2 += ehVar.f79660f;
        }
        bmVar.copyOnWrite();
        C60151bp bpVar2 = (C60151bp) bmVar.instance;
        bpVar2.f162722a |= 1;
        bpVar2.f162724c = j;
        bmVar.copyOnWrite();
        C60151bp bpVar3 = (C60151bp) bmVar.instance;
        bpVar3.f162722a |= 2;
        bpVar3.f162725d = j2;
        return (C60151bp) bmVar.build();
    }
}
