package com.google.android.libraries.assistant.pcp.p1557g.p1563d;

import com.google.android.libraries.assistant.pcp.p1554e.C18630a;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.C18769h;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18712d;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18713e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3810d.C49161b;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.p4632a.C61349j;
import com.google.frameworks.client.data.android.p4632a.C61354o;
import com.google.frameworks.client.data.android.p4632a.C61355p;
import com.google.frameworks.client.data.android.p4632a.C61358s;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p5488io.grpc.C70846h;

/* renamed from: com.google.android.libraries.assistant.pcp.g.d.g */
/* compiled from: PG */
public final class C18763g implements C18769h {

    /* renamed from: a */
    public final C18630a f52873a;

    /* renamed from: b */
    private final C49161b f52874b;

    /* renamed from: c */
    private final Executor f52875c;

    /* renamed from: d */
    private final Executor f52876d;

    public C18763g(C49161b bVar, C18630a aVar, Executor executor, Executor executor2) {
        this.f52874b = bVar;
        this.f52873a = aVar;
        this.f52875c = executor;
        this.f52876d = executor2;
    }

    /* renamed from: a */
    public final C18713e mo21204a() {
        return C18712d.f52788d;
    }

    /* renamed from: b */
    public final C60870cx mo21205b(C18718c cVar) {
        C60870cx a = cVar.mo24114a(C18712d.f52786b);
        C60870cx a2 = cVar.mo24114a(C18712d.f52785a);
        C60870cx a3 = cVar.mo24114a(C18712d.f52787c);
        C60870cx[] cxVarArr = {a, a2, a3};
        C60870cx a4 = C47638k.m84753d(cxVarArr).mo51520a(C47810es.m84978r(new C18760d(a, a2, a3, cVar.mo24114a(C18712d.f52789e))), this.f52875c);
        C49161b bVar = this.f52874b;
        C70846h hVar = C61409d.f166071a;
        C61349j jVar = new C61349j();
        C61354o a5 = C61355p.m93860a(C58528ij.m90011K("pseudonymous", "incognito"));
        a5.f165916a = C58833ax.m90834k("AIzaSyBVRir-KhU9TnZc2h4FNNmMJKi1mLj4wAk");
        jVar.f165910b = C58833ax.m90834k(a5.mo57929a());
        C49161b bVar2 = (C49161b) bVar.mo62577p(hVar, new C61358s(jVar.mo57930b()));
        C47633f g = C47633f.m84733g(a4);
        Objects.requireNonNull(bVar2);
        return g.mo51516i(new C18761e(bVar2), this.f52876d).mo51515h(new C18762f(this), this.f52875c);
    }
}
