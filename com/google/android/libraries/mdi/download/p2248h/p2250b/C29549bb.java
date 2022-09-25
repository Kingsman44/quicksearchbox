package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.android.libraries.mdi.download.C28695aa;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C28796ck;
import com.google.android.libraries.mdi.download.C28797cl;
import com.google.android.libraries.mdi.download.C28798cm;
import com.google.android.libraries.mdi.download.C28803cr;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.libraries.mdi.download.h.b.bb */
/* compiled from: PG */
public final /* synthetic */ class C29549bb implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29551bd f80085a;

    public /* synthetic */ C29549bb(C29551bd bdVar) {
        this.f80085a = bdVar;
    }

    public final Object apply(Object obj) {
        C29551bd bdVar = this.f80085a;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            return C58836b.f156633a;
        }
        C28796ck ckVar = (C28796ck) C28797cl.f78255b.createBuilder();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C28803cr crVar = (C28803cr) guVar.get(i);
            if (bdVar.f80089a.mo56113h()) {
                C28695aa p = ((C28787cb) bdVar.f80089a.mo56107c()).mo34436p();
                String str = crVar.f78271e;
                str.getClass();
                C62995dn dnVar = p.f77967a;
                long longValue = dnVar.containsKey(str) ? ((Long) dnVar.get(str)).longValue() : 0;
                if (longValue > 0) {
                    C28798cm cmVar = (C28798cm) crVar.toBuilder();
                    cmVar.copyOnWrite();
                    C28803cr crVar2 = (C28803cr) cmVar.instance;
                    crVar2.f78267a |= 1024;
                    crVar2.f78277k = longValue;
                    crVar = (C28803cr) cmVar.build();
                } else {
                    C28695aa p2 = ((C28787cb) bdVar.f80089a.mo56107c()).mo34436p();
                    String str2 = crVar.f78270d;
                    str2.getClass();
                    C62995dn dnVar2 = p2.f77967a;
                    long longValue2 = dnVar2.containsKey(str2) ? ((Long) dnVar2.get(str2)).longValue() : 0;
                    if (longValue2 > 0) {
                        C28798cm cmVar2 = (C28798cm) crVar.toBuilder();
                        cmVar2.copyOnWrite();
                        C28803cr crVar3 = (C28803cr) cmVar2.instance;
                        crVar3.f78267a |= 1024;
                        crVar3.f78277k = longValue2;
                        crVar = (C28803cr) cmVar2.build();
                    }
                }
            }
            C28798cm cmVar3 = (C28798cm) crVar.toBuilder();
            cmVar3.copyOnWrite();
            C28803cr crVar4 = (C28803cr) cmVar3.instance;
            crVar4.f78268b = 1;
            crVar4.f78267a = 1 | crVar4.f78267a;
            C28803cr crVar5 = (C28803cr) cmVar3.build();
            ckVar.copyOnWrite();
            C28797cl clVar = (C28797cl) ckVar.instance;
            crVar5.getClass();
            C62971cq cqVar = clVar.f78258a;
            if (!cqVar.mo58948c()) {
                clVar.f78258a = C62942bv.mutableCopy(cqVar);
            }
            clVar.f78258a.add(crVar5);
        }
        return C58833ax.m90834k((C28797cl) ckVar.build());
    }
}
