package com.google.android.libraries.search.assistant.p2566g.p2567a.p2568a;

import com.google.android.libraries.search.assistant.p2566g.C33418m;
import com.google.android.libraries.search.assistant.p2566g.C33430y;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.g.a.a.j */
/* compiled from: PG */
public final class C33403j extends C33418m {

    /* renamed from: a */
    public final Map f89464a;

    /* renamed from: b */
    public final ExecutorService f89465b;

    /* renamed from: c */
    private final C46128f f89466c;

    public C33403j(Map map, C46128f fVar, ExecutorService executorService) {
        this.f89464a = map;
        this.f89466c = fVar;
        this.f89465b = executorService;
    }

    /* renamed from: b */
    public final void mo38831b(C33430y yVar, C70862aj ajVar) {
        C60870cx cxVar;
        if ((yVar.f89531a & 1) != 0) {
            C60870cx c = this.f89466c.mo50216c(yVar.f89532b);
            C33395b bVar = C33395b.f89454a;
            cxVar = C60846c.m92879h(c, C46167as.class, C47810es.m84966f(bVar), C60826bg.f164896a);
        } else {
            cxVar = C60856cj.m92899h(Status.f186906d.mo61677b("Account name missing.").asException());
        }
        C33394a aVar = new C33394a(this, yVar);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(aVar), this.f89465b);
        C33402i iVar = new C33402i(ajVar);
        C60856cj.m92911t(h, C47810es.m84974n(iVar), this.f89465b);
    }
}
