package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p854c;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12866j;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12867k;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p868d.C12897a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p868d.C12900d;
import com.google.assistant.p3897e.p3921j.C52654zt;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.c.x */
/* compiled from: PG */
public final /* synthetic */ class C12857x implements C58817ah {
    public final Object apply(Object obj) {
        C12866j jVar = (C12866j) C12867k.f40128d.createBuilder();
        C12897a aVar = (C12897a) C12900d.f40164b.createBuilder();
        for (C12867k kVar : (List) obj) {
            C12900d dVar = kVar.f40131b;
            if (dVar == null) {
                dVar = C12900d.f40164b;
            }
            C62971cq cqVar = dVar.f40166a;
            aVar.copyOnWrite();
            C12900d dVar2 = (C12900d) aVar.instance;
            dVar2.mo20840a();
            C62947c.addAll((Iterable) cqVar, (List) dVar2.f40166a);
            if ((kVar.f40130a & 2) != 0) {
                C52654zt ztVar = kVar.f40132c;
                if (ztVar == null) {
                    ztVar = C52654zt.f138233e;
                }
                jVar.copyOnWrite();
                C12867k kVar2 = (C12867k) jVar.instance;
                ztVar.getClass();
                kVar2.f40132c = ztVar;
                kVar2.f40130a |= 2;
            }
        }
        C12900d dVar3 = (C12900d) aVar.build();
        jVar.copyOnWrite();
        C12867k kVar3 = (C12867k) jVar.instance;
        dVar3.getClass();
        kVar3.f40131b = dVar3;
        kVar3.f40130a |= 1;
        return (C12867k) jVar.build();
    }
}
