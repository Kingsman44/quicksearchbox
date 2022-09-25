package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.x */
/* compiled from: PG */
final class C12676x implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C57987f f39725a;

    /* renamed from: b */
    final /* synthetic */ Executor f39726b;

    public C12676x(C57987f fVar, Executor executor) {
        this.f39725a = fVar;
        this.f39726b = executor;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (!(th instanceof CancellationException)) {
            ((C59052c) ((C59052c) ((C59052c) C12678z.f39728a.mo56226d()).mo56382g(th)).mo56372aa(44379)).mo56386p("Limited connectivity producer failed");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        C57987f fVar = this.f39725a;
        Executor executor = this.f39726b;
        if (axVar.mo56113h()) {
            C60856cj.m92911t((C60870cx) axVar.mo56107c(), C47810es.m84974n(new C12677y(fVar)), executor);
        }
    }
}
