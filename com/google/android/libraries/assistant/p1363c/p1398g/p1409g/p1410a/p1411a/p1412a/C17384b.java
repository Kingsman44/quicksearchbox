package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.p5208h.C66652ds;
import java.util.concurrent.Callable;
import p5488io.grpc.p5533i.C70868g;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C17384b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C17399q f50264a;

    /* renamed from: b */
    public final /* synthetic */ C57981b f50265b;

    public /* synthetic */ C17384b(C17399q qVar, C57981b bVar) {
        this.f50264a = qVar;
        this.f50265b = bVar;
    }

    public final Object call() {
        C17399q qVar = this.f50264a;
        C57981b bVar = this.f50265b;
        C58976aa aaVar = C58975e.f156826a;
        C17398p pVar = new C17398p(bVar, new C60904dr(qVar.f50292b));
        C17393k kVar = new C17393k(pVar, (C70868g) ((C66652ds) qVar.f50293c.mo17428b()).mo59701b(C47686k.m84827a(pVar)), qVar.f50292b);
        C46459k.m82829b(bVar.mo20440jJ(kVar), "S3ConnectionImpl: s3 request streaming failed", new Object[0]);
        return new C17383a(pVar, kVar);
    }
}
