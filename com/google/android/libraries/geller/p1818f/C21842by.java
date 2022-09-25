package com.google.android.libraries.geller.p1818f;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62963cj;
import com.google.protos.p5129p.p5130a.C65720e;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.geller.f.by */
/* compiled from: PG */
public final /* synthetic */ class C21842by implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C21846cb f60280a;

    /* renamed from: b */
    public final /* synthetic */ C65720e f60281b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f60282c;

    public /* synthetic */ C21842by(C21846cb cbVar, C65720e eVar, C60870cx cxVar) {
        this.f60280a = cbVar;
        this.f60281b = eVar;
        this.f60282c = cxVar;
    }

    public final Object call() {
        C21846cb cbVar = this.f60280a;
        C65720e eVar = this.f60281b;
        C60870cx cxVar = this.f60282c;
        synchronized (cbVar.f60298a) {
            cbVar.f60299b.keySet().removeAll(new C62963cj(eVar.f178553b, C65720e.f178549c));
        }
        return (Map) C60856cj.m92909r(cxVar);
    }
}
