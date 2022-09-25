package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.contacts.ap;
import com.google.android.apps.gsa.contacts.ci;
import com.google.android.apps.gsa.contacts.cp;
import com.google.android.apps.gsa.nga.shared.p6345h.C81298cb;
import com.google.android.apps.gsa.nga.shared.p6345h.C81299cc;
import com.google.android.apps.gsa.nga.shared.p6345h.C81300cd;
import com.google.android.apps.gsa.nga.shared.p6345h.C81301ce;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.fd */
/* compiled from: PG */
public final /* synthetic */ class C81209fd implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ cp f222350a;

    public /* synthetic */ C81209fd(cp cpVar) {
        this.f222350a = cpVar;
    }

    public final Object apply(Object obj) {
        cp cpVar = this.f222350a;
        C81301ce ceVar = (C81301ce) obj;
        C81300cd cdVar = (C81300cd) C81301ce.f222549f.createBuilder();
        ci[] ciVarArr = {ci.b, ci.c, ci.a};
        for (int i = 0; i < 3; i++) {
            ci ciVar = ciVarArr[i];
            ArrayList arrayList = new ArrayList();
            for (ap apVar : cpVar.a(ciVar)) {
                C81298cb cbVar = (C81298cb) C81299cc.f222543e.createBuilder();
                String str = apVar.b;
                cbVar.copyOnWrite();
                C81299cc ccVar = (C81299cc) cbVar.instance;
                str.getClass();
                ccVar.f222545a |= 1;
                ccVar.f222546b = str;
                String str2 = apVar.c;
                cbVar.copyOnWrite();
                C81299cc ccVar2 = (C81299cc) cbVar.instance;
                str2.getClass();
                ccVar2.f222545a |= 2;
                ccVar2.f222547c = str2;
                double d = apVar.d;
                cbVar.copyOnWrite();
                C81299cc ccVar3 = (C81299cc) cbVar.instance;
                ccVar3.f222545a |= 4;
                ccVar3.f222548d = d;
                arrayList.add((C81299cc) cbVar.build());
            }
            if (ciVar == ci.b) {
                cdVar.copyOnWrite();
                C81301ce ceVar2 = (C81301ce) cdVar.instance;
                C62971cq cqVar = ceVar2.f222553c;
                if (!cqVar.mo58948c()) {
                    ceVar2.f222553c = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) arrayList, (List) ceVar2.f222553c);
            } else if (ciVar == ci.c) {
                cdVar.copyOnWrite();
                C81301ce ceVar3 = (C81301ce) cdVar.instance;
                C62971cq cqVar2 = ceVar3.f222554d;
                if (!cqVar2.mo58948c()) {
                    ceVar3.f222554d = C62942bv.mutableCopy(cqVar2);
                }
                C62947c.addAll((Iterable) arrayList, (List) ceVar3.f222554d);
            } else if (ciVar == ci.a) {
                cdVar.copyOnWrite();
                C81301ce ceVar4 = (C81301ce) cdVar.instance;
                C62971cq cqVar3 = ceVar4.f222555e;
                if (!cqVar3.mo58948c()) {
                    ceVar4.f222555e = C62942bv.mutableCopy(cqVar3);
                }
                C62947c.addAll((Iterable) arrayList, (List) ceVar4.f222555e);
            }
        }
        long j = cpVar.a;
        cdVar.copyOnWrite();
        C81301ce ceVar5 = (C81301ce) cdVar.instance;
        ceVar5.f222551a |= 1;
        ceVar5.f222552b = j;
        return (C81301ce) cdVar.build();
    }
}
