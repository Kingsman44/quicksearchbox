package com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a;

import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131836h;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131837i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.a.n */
/* compiled from: PG */
public final class C131829n {

    /* renamed from: a */
    public final C131837i f360035a;

    /* renamed from: b */
    public final C21370a f360036b;

    /* renamed from: c */
    private final C60887da f360037c;

    public C131829n(C131837i iVar, C21370a aVar, C60887da daVar) {
        this.f360035a = iVar;
        this.f360036b = aVar;
        this.f360037c = daVar;
    }

    /* renamed from: a */
    public final C131836h mo110327a() {
        return this.f360035a.mo110317a();
    }

    /* renamed from: b */
    public final C60870cx mo110328b(Duration duration) {
        C60870cx c = this.f360035a.mo110319c();
        C131827l lVar = new C131827l(this);
        C60870cx h = C60922j.m93045h(c, C47810es.m84966f(lVar), this.f360037c);
        C131828m mVar = new C131828m(this, duration);
        C60870cx g = C60922j.m93044g(h, C47810es.m84963c(mVar), this.f360037c);
        C131826k kVar = C131826k.f360031a;
        return C60922j.m93044g(g, C47810es.m84963c(kVar), this.f360037c);
    }

    /* renamed from: c */
    public final Duration mo110329c() {
        return this.f360035a.mo110320d();
    }
}
