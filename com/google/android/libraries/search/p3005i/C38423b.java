package com.google.android.libraries.search.p3005i;

import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protos.p5129p.p5131b.C65750ah;
import com.google.protos.p5129p.p5131b.C65751ai;
import com.google.protos.p5129p.p5131b.C65807ck;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.i.b */
/* compiled from: PG */
public final /* synthetic */ class C38423b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C38437d f101703a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f101704b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f101705c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f101706d;

    /* renamed from: e */
    public final /* synthetic */ C65807ck f101707e;

    public /* synthetic */ C38423b(C38437d dVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C65807ck ckVar) {
        this.f101703a = dVar;
        this.f101704b = cxVar;
        this.f101705c = cxVar2;
        this.f101706d = cxVar3;
        this.f101707e = ckVar;
    }

    public final Object call() {
        C38437d dVar = this.f101703a;
        C60870cx cxVar = this.f101704b;
        C60870cx cxVar2 = this.f101705c;
        C60870cx cxVar3 = this.f101706d;
        C65807ck ckVar = this.f101707e;
        C58526ih ihVar = new C58526ih();
        ihVar.mo55489i((Collection) C60856cj.m92909r(cxVar));
        ihVar.mo55489i((Collection) C60856cj.m92909r(cxVar2));
        ihVar.mo55489i((C58528ij) C60856cj.m92909r(cxVar3));
        C58528ij f = ihVar.mo55486f();
        if (!f.isEmpty()) {
            C62940bt btVar = C65751ai.f178618c;
            C65750ah ahVar = (C65750ah) C65751ai.f178617b.createBuilder();
            ahVar.mo59422a(f);
            ckVar.mo58885m(btVar, (C65751ai) ahVar.build());
        } else {
            dVar.f101737a.mo27214a();
        }
        return ckVar;
    }
}
