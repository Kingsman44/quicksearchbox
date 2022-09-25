package com.google.android.apps.gsa.voiceinteraction.p8866a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89852b;
import com.google.android.libraries.search.logging.p3039b.C38830b;
import com.google.android.libraries.search.logging.p3039b.C38833e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.a.b */
/* compiled from: PG */
public final class C118702b implements C89852b {

    /* renamed from: a */
    public final C68214a f331113a;

    /* renamed from: b */
    private final C38830b f331114b;

    /* renamed from: c */
    private final C38833e f331115c;

    /* renamed from: d */
    private final Executor f331116d;

    public C118702b(C38830b bVar, C38833e eVar, C68214a aVar, Executor executor) {
        this.f331114b = bVar;
        this.f331115c = eVar;
        this.f331113a = aVar;
        this.f331116d = executor;
    }

    /* renamed from: a */
    public final void mo79810a(C60555uf ufVar, String str) {
        C60870cx a = this.f331114b.mo41663a(ufVar, this.f331115c);
        C118701a aVar = new C118701a(this, str);
        C60922j.m93044g(a, C47810es.m84963c(aVar), this.f331116d);
    }
}
