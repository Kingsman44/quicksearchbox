package com.google.android.libraries.assistant.auto.tng.assistant.p720b.p721a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12115d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57996c;
import com.google.protobuf.C63088z;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.b.a.c */
/* compiled from: PG */
public final class C11967c implements C57974a {

    /* renamed from: a */
    public static final C59071e f38428a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.b.a.c");

    /* renamed from: b */
    public C63088z f38429b;

    /* renamed from: c */
    private final C11969e f38430c;

    /* renamed from: d */
    private final Executor f38431d;

    public C11967c(C11969e eVar, Executor executor) {
        this.f38430c = eVar;
        this.f38431d = new C60904dr(executor);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C63088z zVar = ((C12115d) obj).f38736b;
        if (!zVar.mo59173M()) {
            this.f38431d.execute(C47810es.m84977q(new C11965a(this, zVar)));
        }
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C60870cx cxVar;
        C63088z zVar = this.f38429b;
        if (zVar == null) {
            ((C59052c) ((C59052c) f38428a.mo56226d()).mo56372aa(43932)).mo56386p("No audio is streamed into AudioLogSink.");
            return;
        }
        C11969e eVar = this.f38430c;
        if (zVar.mo59173M()) {
            cxVar = C60856cj.m92899h(new IllegalArgumentException("Empty audio, skipping."));
        } else {
            C11968d dVar = new C11968d(eVar, zVar);
            cxVar = C60856cj.m92904m(C47810es.m84978r(dVar), eVar.f38437d);
        }
        C11966b bVar = new C11966b();
        C60856cj.m92911t(cxVar, C47810es.m84974n(bVar), this.f38431d);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f38428a.mo56226d()).mo56382g(th)).mo56372aa(43933)).mo56386p("Deliver AudioStreamChunk failed.");
    }
}
