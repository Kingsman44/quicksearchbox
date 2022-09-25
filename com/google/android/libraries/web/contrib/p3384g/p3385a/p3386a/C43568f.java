package com.google.android.libraries.web.contrib.p3384g.p3385a.p3386a;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.web.contrib.p3384g.C43582c;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58893dc;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.libraries.web.contrib.g.a.a.f */
/* compiled from: PG */
public final class C43568f implements C43582c {

    /* renamed from: a */
    public final C60887da f113746a;

    /* renamed from: b */
    public final C44315a f113747b;

    /* renamed from: c */
    private final AtomicReference f113748c = new AtomicReference();

    public C43568f(C60887da daVar, C44315a aVar) {
        this.f113746a = daVar;
        this.f113747b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo46627a() {
        C60870cx cxVar = (C60870cx) DesugarAtomicReference.updateAndGet(this.f113748c, new C43563a(this));
        C58893dc.m90996a(cxVar);
        return cxVar;
    }

    /* renamed from: b */
    public final C60870cx mo46628b() {
        C60870cx a = C2169h.m6027a(new C43565c(this));
        C43567e eVar = C43567e.f113745a;
        return C60922j.m93044g(a, C47810es.m84963c(eVar), C60826bg.f164896a);
    }
}
