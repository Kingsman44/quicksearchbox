package com.google.android.apps.search.assistant.platform.p9141h.p9156f.p9157a;

import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121090b;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121093c;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.h.f.a.g */
/* compiled from: PG */
public final class C121079g implements C121090b, C121093c {

    /* renamed from: a */
    public static final C59071e f336488a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.h.f.a.g");

    /* renamed from: b */
    public final C68214a f336489b;

    /* renamed from: c */
    private final C60887da f336490c;

    /* renamed from: d */
    private final C42876ab f336491d;

    public C121079g(C60887da daVar, C42876ab abVar, C68214a aVar) {
        this.f336490c = daVar;
        this.f336491d = abVar;
        this.f336489b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo105043a() {
        return C60922j.m93044g(this.f336491d.mo46042d(), C47810es.m84963c(C121076d.f336484a), this.f336490c);
    }

    /* renamed from: b */
    public final C60870cx mo105044b() {
        return C60922j.m93044g(this.f336491d.mo46042d(), C47810es.m84963c(C121074b.f336482a), this.f336490c);
    }

    /* renamed from: c */
    public final C60870cx mo105045c(List list) {
        C60870cx a = this.f336491d.mo46039a(new C121075c(list), this.f336490c);
        C121078f fVar = new C121078f(this);
        C60856cj.m92911t(a, C47810es.m84974n(fVar), this.f336490c);
        return a;
    }

    /* renamed from: d */
    public final C60870cx mo105046d(Locale locale) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C60870cx a = this.f336491d.mo46039a(new C121073a(atomicBoolean, locale), this.f336490c);
        C121077e eVar = new C121077e(this, atomicBoolean);
        C60856cj.m92911t(a, C47810es.m84974n(eVar), this.f336490c);
        return a;
    }
}
