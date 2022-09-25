package com.google.android.libraries.lens.view.p2174v;

import com.google.android.libraries.mdi.download.C28797cl;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protos.p5129p.p5131b.C65807ck;
import com.google.protos.p5129p.p5131b.C65808cl;
import com.google.protos.p5129p.p5131b.C65813cq;
import com.google.protos.p5129p.p5131b.C65829df;
import com.google.protos.p5129p.p5131b.C65830dg;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.v.e */
/* compiled from: PG */
public final /* synthetic */ class C28143e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f76563a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f76564b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f76565c;

    /* renamed from: d */
    public final /* synthetic */ C65813cq f76566d;

    public /* synthetic */ C28143e(C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C65813cq cqVar) {
        this.f76563a = cxVar;
        this.f76564b = cxVar2;
        this.f76565c = cxVar3;
        this.f76566d = cqVar;
    }

    public final Object call() {
        C60870cx cxVar = this.f76563a;
        C60870cx cxVar2 = this.f76564b;
        C60870cx cxVar3 = this.f76565c;
        C65813cq cqVar = this.f76566d;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar2);
        C65807ck ckVar = (C65807ck) ((C65808cl) C60856cj.m92909r(cxVar)).toBuilder();
        ckVar.copyOnWrite();
        C65808cl clVar = (C65808cl) ckVar.instance;
        clVar.f178900b = cqVar.f178923h;
        clVar.f178899a |= 16;
        C62940bt btVar = C65830dg.f178958c;
        C65829df dfVar = (C65829df) C65830dg.f178957b.createBuilder();
        dfVar.mo59431a((C58528ij) C60856cj.m92909r(cxVar3));
        ckVar.mo58885m(btVar, (C65830dg) dfVar.build());
        if (axVar.mo56113h()) {
            ckVar.mo58885m(C28797cl.f78256c, (C28797cl) axVar.mo56107c());
        }
        return (C65808cl) ckVar.build();
    }
}
