package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7571b;

import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.b.k */
/* compiled from: PG */
public final /* synthetic */ class C96911k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96914n f270894a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f270895b;

    public /* synthetic */ C96911k(C96914n nVar, C58528ij ijVar) {
        this.f270894a = nVar;
        this.f270895b = ijVar;
    }

    public final Object apply(Object obj) {
        Integer num;
        C96914n nVar = this.f270894a;
        C58528ij ijVar = this.f270895b;
        Void voidR = (Void) obj;
        C58526ih ihVar = new C58526ih();
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            C96918r rVar = (C96918r) lA.next();
            C96919s sVar = nVar.f270900c;
            long b = sVar.f270918e.mo26870b();
            long j = rVar.f270911b;
            if (j >= b || b - j <= C96919s.f270915b) {
                long j2 = j < b ? 0 : j - b;
                C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                long max = Math.max(j2 - C96919s.f270914a, 0);
                afVar.copyOnWrite();
                C118472ag agVar = (C118472ag) afVar.instance;
                agVar.f328821a |= 1;
                agVar.f328822b = max;
                long j3 = C96919s.f270914a;
                afVar.copyOnWrite();
                C118472ag agVar2 = (C118472ag) afVar.instance;
                agVar2.f328821a |= 2;
                agVar2.f328823c = j3;
                C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
                C62940bt btVar = C96917q.f270903d;
                C96917q qVar = rVar.f270912c;
                if (qVar == null) {
                    qVar = C96917q.f270902c;
                }
                ajVar.mo58885m(btVar, qVar);
                C118476ak akVar = (C118476ak) ajVar.build();
                afVar.copyOnWrite();
                C118472ag agVar3 = (C118472ag) afVar.instance;
                akVar.getClass();
                agVar3.f328827g = akVar;
                agVar3.f328821a |= 32;
                if (((C84474e) sVar.f270916c.mo27525b()).mo78089ac()) {
                    afVar.copyOnWrite();
                    C118472ag agVar4 = (C118472ag) afVar.instance;
                    agVar4.f328824d = 1;
                    agVar4.f328821a |= 4;
                }
                num = sVar.f270917d.mo103751b(C118522by.TRIGGER_BUBBLE, (C118472ag) afVar.build());
            } else {
                num = null;
            }
            if (num != null) {
                ihVar.mo55373c(num);
            }
        }
        return ihVar.mo55486f();
    }
}
