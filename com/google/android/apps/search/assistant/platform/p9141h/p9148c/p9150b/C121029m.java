package com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9150b;

import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121035d;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121036e;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.h.c.b.m */
/* compiled from: PG */
public final class C121029m implements C121036e, C121035d {

    /* renamed from: a */
    public static final C59071e f336404a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.h.c.b.m");

    /* renamed from: b */
    public final C68214a f336405b;

    /* renamed from: c */
    private final C60887da f336406c;

    /* renamed from: d */
    private final C42876ab f336407d;

    public C121029m(C60887da daVar, C42876ab abVar, C68214a aVar) {
        this.f336406c = daVar;
        this.f336407d = abVar;
        this.f336405b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo105029a() {
        return C60922j.m93044g(this.f336407d.mo46042d(), C47810es.m84963c(C121025i.f336398a), this.f336406c);
    }

    /* renamed from: b */
    public final C60870cx mo105026b(Boolean bool) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C60870cx a = this.f336407d.mo46039a(new C121027k(atomicBoolean, bool), this.f336406c);
        C121028l lVar = new C121028l(this, atomicBoolean);
        C60856cj.m92911t(a, C47810es.m84974n(lVar), this.f336406c);
        return a;
    }
}
