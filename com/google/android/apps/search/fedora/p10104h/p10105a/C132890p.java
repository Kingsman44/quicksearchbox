package com.google.android.apps.search.fedora.p10104h.p10105a;

import com.google.android.apps.search.fedora.metrics.C133072j;
import com.google.android.apps.search.fedora.p10096d.C132741a;
import com.google.android.apps.search.fedora.p10104h.C132901j;
import com.google.android.apps.search.fedora.p10104h.C132904m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63259d;
import com.google.speech.p5199c.p5200a.C66460e;
import com.google.speech.p5199c.p5200a.C66461f;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.h.a.p */
/* compiled from: PG */
public final class C132890p {

    /* renamed from: a */
    public static final C59071e f362525a = C59071e.m91332i("com.google.android.apps.search.fedora.h.a.p");

    /* renamed from: b */
    public final C132901j f362526b;

    /* renamed from: c */
    public final C132904m f362527c;

    /* renamed from: d */
    public final C132741a f362528d;

    /* renamed from: e */
    private final C133072j f362529e;

    /* renamed from: f */
    private final Executor f362530f;

    public C132890p(C132901j jVar, C132904m mVar, C133072j jVar2, C132741a aVar, Executor executor) {
        this.f362526b = jVar;
        this.f362527c = mVar;
        this.f362529e = jVar2;
        this.f362528d = aVar;
        this.f362530f = executor;
    }

    /* renamed from: a */
    public final void mo110927a(C63259d dVar, Optional optional) {
        C133072j jVar = this.f362529e;
        C66460e eVar = (C66460e) C66461f.f180719g.createBuilder();
        eVar.copyOnWrite();
        C66461f fVar = (C66461f) eVar.instance;
        dVar.getClass();
        fVar.f180725e = dVar;
        fVar.f180721a |= 8;
        jVar.mo110968f((C66461f) eVar.build());
        C60856cj.m92911t(C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(new C132885k(this, dVar)), this.f362530f)).mo51516i(new C132886l(this, optional), this.f362530f).f164926b, C47810es.m84974n(new C132889o()), this.f362530f);
    }
}
