package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131701c;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131713d;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131720e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.b.j */
/* compiled from: PG */
public final class C131700j implements C131720e {

    /* renamed from: a */
    public final C131692b f359809a;

    /* renamed from: b */
    public final Set f359810b = new HashSet();

    /* renamed from: c */
    private final ExecutorService f359811c;

    /* renamed from: d */
    private final Class f359812d;

    /* renamed from: e */
    private final C47632e f359813e = new C47632e();

    public C131700j(C130603a aVar, ExecutorService executorService, C131692b bVar, Class cls) {
        aVar.mo109740b(this);
        this.f359811c = executorService;
        this.f359809a = bVar;
        this.f359812d = cls;
    }

    /* renamed from: a */
    public final C60870cx mo110273a(C131713d dVar) {
        return this.f359813e.mo51512b(new C131699i(this, dVar), this.f359811c);
    }

    /* renamed from: b */
    public final C60870cx mo110274b(C131713d dVar) {
        return this.f359813e.mo51512b(new C131694d(this, dVar), this.f359811c);
    }

    /* renamed from: c */
    public final void mo110275c(C53715bm bmVar, long j) {
        this.f359812d.getSimpleName();
        C46459k.m82829b(this.f359809a.mo110270d(bmVar, j), "Failed to trigger %s", this.f359812d.getSimpleName());
    }

    /* renamed from: d */
    public final C60870cx mo110276d(C131701c cVar) {
        return this.f359813e.mo51512b(new C131698h(this, cVar), this.f359811c);
    }
}
