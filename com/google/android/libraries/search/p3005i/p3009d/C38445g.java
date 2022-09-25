package com.google.android.libraries.search.p3005i.p3009d;

import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protos.p5129p.p5131b.C65758ap;
import com.google.protos.p5129p.p5131b.C65759aq;
import com.google.protos.p5129p.p5131b.C65807ck;
import com.google.protos.p5129p.p5131b.C65808cl;
import com.google.protos.p5129p.p5131b.C65813cq;
import com.google.protos.p5129p.p5131b.C65829df;
import com.google.protos.p5129p.p5131b.C65830dg;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.i.d.g */
/* compiled from: PG */
public final /* synthetic */ class C38445g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f101754a;

    /* renamed from: b */
    public final /* synthetic */ C65813cq f101755b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f101756c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f101757d;

    public /* synthetic */ C38445g(C60870cx cxVar, C65813cq cqVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f101754a = cxVar;
        this.f101755b = cqVar;
        this.f101756c = cxVar2;
        this.f101757d = cxVar3;
    }

    public final Object call() {
        C60870cx cxVar = this.f101754a;
        C65813cq cqVar = this.f101755b;
        C60870cx cxVar2 = this.f101756c;
        C60870cx cxVar3 = this.f101757d;
        C65807ck ckVar = (C65807ck) ((C65808cl) C60856cj.m92909r(cxVar)).toBuilder();
        ckVar.copyOnWrite();
        C65808cl clVar = (C65808cl) ckVar.instance;
        clVar.f178900b = cqVar.f178923h;
        clVar.f178899a |= 16;
        C62940bt btVar = C65759aq.f178772d;
        C65758ap apVar = (C65758ap) C65759aq.f178771c.createBuilder();
        C52428rj rjVar = (C52428rj) C60856cj.m92909r(cxVar2);
        apVar.copyOnWrite();
        C65759aq aqVar = (C65759aq) apVar.instance;
        rjVar.getClass();
        aqVar.f178775b = rjVar;
        aqVar.f178774a |= 1;
        ckVar.mo58885m(btVar, (C65759aq) apVar.build());
        C62940bt btVar2 = C65830dg.f178958c;
        C65829df dfVar = (C65829df) C65830dg.f178957b.createBuilder();
        dfVar.mo59431a((Iterable) C60856cj.m92909r(cxVar3));
        ckVar.mo58885m(btVar2, (C65830dg) dfVar.build());
        return (C65808cl) ckVar.build();
    }
}
