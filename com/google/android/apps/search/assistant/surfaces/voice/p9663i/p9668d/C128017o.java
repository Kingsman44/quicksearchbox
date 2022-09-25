package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.o */
/* compiled from: PG */
final class C128017o implements C128010h {

    /* renamed from: a */
    public static final C58974d f352290a = C58974d.m91134h("MSManager");

    /* renamed from: b */
    public final ExecutorService f352291b;

    /* renamed from: c */
    public final C128022t f352292c;

    /* renamed from: d */
    private final C47632e f352293d = new C47632e();

    public C128017o(ExecutorService executorService, C128022t tVar) {
        this.f352291b = executorService;
        this.f352292c = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo108303a(C51347ei eiVar) {
        C60870cx b = mo108304b(C58485gu.m89846n(eiVar));
        C128011i iVar = new C128011i(eiVar);
        return C60922j.m93044g(b, C47810es.m84963c(iVar), this.f352291b);
    }

    /* renamed from: b */
    public final C60870cx mo108304b(C58485gu guVar) {
        return this.f352293d.mo51512b(new C128015m(this, guVar), this.f352291b);
    }

    /* renamed from: c */
    public final void mo108305c(C58485gu guVar) {
        C60870cx b = this.f352293d.mo51512b(new C128014l(this, guVar), this.f352291b);
        C128016n nVar = new C128016n();
        C60856cj.m92911t(b, C47810es.m84974n(nVar), this.f352291b);
    }
}
