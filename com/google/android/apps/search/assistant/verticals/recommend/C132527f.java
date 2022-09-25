package com.google.android.apps.search.assistant.verticals.recommend;

import com.google.android.apps.search.assistant.platform.p9141h.p9162h.C121125c;
import com.google.android.apps.search.assistant.verticals.recommend.p10072c.C132519c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.verticals.recommend.f */
/* compiled from: PG */
public final class C132527f {

    /* renamed from: a */
    private final C132519c f361686a;

    /* renamed from: b */
    private final C60887da f361687b;

    /* renamed from: c */
    private final boolean f361688c;

    /* renamed from: d */
    private final C121125c f361689d;

    public C132527f(C132519c cVar, C60887da daVar, C121125c cVar2, boolean z) {
        this.f361686a = cVar;
        this.f361687b = daVar;
        this.f361689d = cVar2;
        this.f361688c = z;
    }

    /* renamed from: a */
    public final C60870cx mo110796a(String str) {
        C60870cx a = this.f361686a.mo110792a();
        if (!this.f361688c) {
            return C60922j.m93044g(this.f361686a.mo110792a(), C47810es.m84963c(new C132516c(str)), this.f361687b);
        }
        C60870cx g = C60922j.m93044g(this.f361689d.mo105058a(), C47810es.m84963c(C132524d.f361681a), this.f361687b);
        return C60856cj.m92895d(a, g).mo57334a(C47810es.m84978r(new C132526e(a, g, str)), this.f361687b);
    }
}
