package com.google.android.libraries.p590as.p611d.p613b.p614a.p615a;

import com.google.android.libraries.p590as.p611d.p612a.C10971d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.as.d.b.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C10977d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f36113a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f36114b;

    public /* synthetic */ C10977d(C60870cx cxVar, C60870cx cxVar2) {
        this.f36113a = cxVar;
        this.f36114b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f36113a;
        C60870cx cxVar2 = this.f36114b;
        C10986m mVar = (C10986m) C10987n.f36129d.createBuilder();
        C10976c cVar = (C10976c) C60856cj.m92909r(cxVar);
        mVar.copyOnWrite();
        C10987n nVar = (C10987n) mVar.instance;
        cVar.getClass();
        nVar.f36132b = cVar;
        nVar.f36131a |= 1;
        C62971cq cqVar = ((C10971d) C60856cj.m92909r(cxVar2)).f36101a;
        mVar.copyOnWrite();
        C10987n nVar2 = (C10987n) mVar.instance;
        C62971cq cqVar2 = nVar2.f36133c;
        if (!cqVar2.mo58948c()) {
            nVar2.f36133c = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) nVar2.f36133c);
        return (C10987n) mVar.build();
    }
}
