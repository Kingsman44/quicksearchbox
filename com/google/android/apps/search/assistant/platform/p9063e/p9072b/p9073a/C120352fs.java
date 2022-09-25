package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120508e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47630c;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.fs */
/* compiled from: PG */
public final /* synthetic */ class C120352fs implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C120259cq f334838a;

    /* renamed from: b */
    public final /* synthetic */ C120508e f334839b;

    /* renamed from: c */
    public final /* synthetic */ Executor f334840c;

    public /* synthetic */ C120352fs(C120259cq cqVar, C120508e eVar, Executor executor) {
        this.f334838a = cqVar;
        this.f334839b = eVar;
        this.f334840c = executor;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C120259cq cqVar = this.f334838a;
        C120508e eVar = this.f334839b;
        Executor executor = this.f334840c;
        Objects.requireNonNull(cVar);
        cqVar.mo104713a(new C120349fp(cVar), cqVar.f334623a);
        C47630c a = eVar.mo104774a();
        cVar.mo5436a(C47810es.m84977q(new C120350fq(a)), executor);
        a.mo51508f(new C120351fr(cqVar, cVar), executor);
        return "provideAudioInputSession";
    }
}
