package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.p5208h.C66652ds;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import p5488io.grpc.p5533i.C70868g;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C15507b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C15527v f46464a;

    /* renamed from: b */
    public final /* synthetic */ C57981b f46465b;

    public /* synthetic */ C15507b(C15527v vVar, C57981b bVar) {
        this.f46464a = vVar;
        this.f46465b = bVar;
    }

    public final Object call() {
        C15527v vVar = this.f46464a;
        C57981b bVar = this.f46465b;
        C58976aa aaVar = C58975e.f156826a;
        ArrayDeque arrayDeque = new ArrayDeque();
        C60904dr drVar = new C60904dr(vVar.f46502b);
        C15526u uVar = new C15526u(bVar, arrayDeque, vVar.f46502b, drVar, vVar.f46504d);
        C15519n nVar = new C15519n(uVar, (C70868g) ((C66652ds) vVar.f46503c.mo17428b()).mo59701b(C47686k.m84827a(uVar)), arrayDeque, drVar);
        C46459k.m82829b(bVar.mo20440jJ(nVar), "S3ConnectionImpl: s3 request streaming failed", new Object[0]);
        return new C15506a(uVar, nVar);
    }
}
