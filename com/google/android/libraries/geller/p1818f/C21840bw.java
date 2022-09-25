package com.google.android.libraries.geller.p1818f;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62963cj;
import com.google.protos.p5129p.p5130a.C65720e;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.geller.f.bw */
/* compiled from: PG */
public final /* synthetic */ class C21840bw implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C21841bx f60267a;

    /* renamed from: b */
    public final /* synthetic */ C65720e f60268b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f60269c;

    public /* synthetic */ C21840bw(C21841bx bxVar, C65720e eVar, C60870cx cxVar) {
        this.f60267a = bxVar;
        this.f60268b = eVar;
        this.f60269c = cxVar;
    }

    public final Object call() {
        C21841bx bxVar = this.f60267a;
        C65720e eVar = this.f60268b;
        C60870cx cxVar = this.f60269c;
        synchronized (bxVar.f60272b) {
            bxVar.f60273c.keySet().removeAll(new C62963cj(eVar.f178553b, C65720e.f178549c));
        }
        return (Map) C60856cj.m92909r(cxVar);
    }
}
