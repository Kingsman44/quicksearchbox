package com.google.android.apps.search.fedora.p10107j.p10109b;

import com.google.android.apps.search.fedora.p10107j.p10108a.C132955b;
import com.google.android.apps.search.fedora.p10107j.p10108a.C132968o;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.speech.p5228m.C67278ai;
import p3186j$.util.Objects;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.fedora.j.b.i */
/* compiled from: PG */
public final class C132984i extends C132968o {

    /* renamed from: b */
    private static final C59071e f362676b = C59071e.m91332i("com.google.android.apps.search.fedora.j.b.i");

    /* renamed from: a */
    public final C133001z f362677a;

    /* renamed from: c */
    private final C60887da f362678c;

    /* renamed from: d */
    private final C47632e f362679d = new C47632e();

    public C132984i(C133001z zVar, C60887da daVar) {
        this.f362677a = zVar;
        this.f362678c = daVar;
    }

    /* renamed from: b */
    public final void mo110944b(C132955b bVar, C70862aj ajVar) {
        C59104x b = f362676b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraCacheServer");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(39954);
        int b2 = C67278ai.m97449b(bVar.f362642b);
        if (b2 == 0) {
            b2 = 1;
        }
        cVar.mo56389s("Received the training cache event = %s.", C67278ai.m97448a(b2));
        C60870cx b3 = this.f362679d.mo51512b(new C132975a(this, bVar), this.f362678c);
        C132980e eVar = new C132980e(ajVar);
        C60856cj.m92911t(b3, C47810es.m84974n(eVar), this.f362678c);
    }

    /* renamed from: c */
    public final void mo110945c(C70862aj ajVar) {
        C59104x b = f362676b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraCacheServer");
        ((C59052c) ((C59052c) b).mo56372aa(39955)).mo56386p("Received the request to clear training cache.");
        C47632e eVar = this.f362679d;
        C133001z zVar = this.f362677a;
        Objects.requireNonNull(zVar);
        C60870cx b2 = eVar.mo51512b(new C132978c(zVar), this.f362678c);
        C132983h hVar = new C132983h(ajVar);
        C60856cj.m92911t(b2, C47810es.m84974n(hVar), this.f362678c);
    }

    /* renamed from: d */
    public final void mo110946d(C70862aj ajVar) {
        C59104x b = f362676b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraCacheServer");
        ((C59052c) ((C59052c) b).mo56372aa(39956)).mo56386p("Received the request to log training cache stats.");
        C47632e eVar = this.f362679d;
        C133001z zVar = this.f362677a;
        Objects.requireNonNull(zVar);
        C60870cx b2 = eVar.mo51512b(new C132977b(zVar), this.f362678c);
        C132982g gVar = new C132982g(ajVar);
        C60856cj.m92911t(b2, C47810es.m84974n(gVar), this.f362678c);
    }

    /* renamed from: e */
    public final void mo110947e(C70862aj ajVar) {
        C59104x b = f362676b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraCacheServer");
        ((C59052c) ((C59052c) b).mo56372aa(39957)).mo56386p("Received the cache maintenance request.");
        C47632e eVar = this.f362679d;
        C133001z zVar = this.f362677a;
        Objects.requireNonNull(zVar);
        C60870cx b2 = eVar.mo51512b(new C132979d(zVar), this.f362678c);
        C132981f fVar = new C132981f(ajVar);
        C60856cj.m92911t(b2, C47810es.m84974n(fVar), this.f362678c);
    }
}
