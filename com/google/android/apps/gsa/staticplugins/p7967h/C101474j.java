package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.assistant.p3803ag.p3804a.C48878u;
import com.google.assistant.p3803ag.p3804a.C48883z;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.j */
/* compiled from: PG */
public final /* synthetic */ class C101474j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f283122a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f283123b;

    public /* synthetic */ C101474j(C60870cx cxVar, C60870cx cxVar2) {
        this.f283122a = cxVar;
        this.f283123b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f283122a;
        C60870cx cxVar2 = this.f283123b;
        int i = C101483s.f283139m;
        C48878u uVar = (C48878u) C48883z.f126498c.createBuilder();
        Iterable iterable = (Iterable) C60856cj.m92909r(cxVar);
        uVar.copyOnWrite();
        C48883z zVar = (C48883z) uVar.instance;
        C62971cq cqVar = zVar.f126501b;
        if (!cqVar.mo58948c()) {
            zVar.f126501b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) zVar.f126501b);
        Iterable iterable2 = (Iterable) C60856cj.m92909r(cxVar2);
        uVar.copyOnWrite();
        C48883z zVar2 = (C48883z) uVar.instance;
        C62971cq cqVar2 = zVar2.f126500a;
        if (!cqVar2.mo58948c()) {
            zVar2.f126500a = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll(iterable2, (List) zVar2.f126500a);
        return (C48883z) uVar.build();
    }
}
