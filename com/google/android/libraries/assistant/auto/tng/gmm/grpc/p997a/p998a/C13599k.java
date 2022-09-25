package com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.p998a;

import com.google.android.libraries.assistant.auto.tng.assistant.p718a.p719a.C11961j;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13600b;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13601c;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13602d;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16766p;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16783a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.apps.tiktok.tracing.C47810es;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.a.k */
/* compiled from: PG */
public final class C13599k implements C13602d {

    /* renamed from: a */
    public final C13595g f41618a;

    /* renamed from: b */
    public final Executor f41619b;

    /* renamed from: c */
    public final C35470f f41620c;

    /* renamed from: d */
    public final C16783a f41621d;

    /* renamed from: e */
    public final C15481g f41622e;

    /* renamed from: f */
    public long f41623f;

    /* renamed from: g */
    public C16766p f41624g = C16766p.f49064d;

    /* renamed from: h */
    private final C11961j f41625h;

    /* renamed from: i */
    private final C13598j f41626i = new C13598j(this);

    public C13599k(C13595g gVar, C11961j jVar, Executor executor, C16783a aVar, C35470f fVar, C15481g gVar2) {
        this.f41618a = gVar;
        this.f41625h = jVar;
        this.f41619b = executor;
        this.f41621d = aVar;
        this.f41620c = fVar;
        this.f41622e = gVar2;
    }

    /* renamed from: a */
    public final void mo21186a(long j, C16766p pVar) {
        this.f41624g = pVar;
        C13595g gVar = this.f41618a;
        gVar.f41613d.execute(C47810es.m84977q(new C13589a(gVar)));
        this.f41625h.f38416a.add(this.f41626i);
        this.f41623f = j;
        C13595g gVar2 = this.f41618a;
        C13600b bVar = (C13600b) C13601c.f41627e.createBuilder();
        bVar.copyOnWrite();
        C13601c cVar = (C13601c) bVar.instance;
        cVar.f41630b = 1;
        cVar.f41629a = 1 | cVar.f41629a;
        long j2 = this.f41623f;
        bVar.copyOnWrite();
        C13601c cVar2 = (C13601c) bVar.instance;
        cVar2.f41629a |= 4;
        cVar2.f41632d = j2;
        gVar2.mo21183c((C13601c) bVar.build());
    }

    /* renamed from: b */
    public final void mo21187b() {
        C13595g gVar = this.f41618a;
        C13600b bVar = (C13600b) C13601c.f41627e.createBuilder();
        bVar.copyOnWrite();
        C13601c cVar = (C13601c) bVar.instance;
        cVar.f41630b = 2;
        cVar.f41629a |= 1;
        gVar.mo21183c((C13601c) bVar.build());
        C13595g gVar2 = this.f41618a;
        gVar2.f41613d.execute(C47810es.m84977q(new C13590b(gVar2, Long.valueOf(this.f41623f))));
    }
}
