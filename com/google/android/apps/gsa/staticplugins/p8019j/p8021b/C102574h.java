package com.google.android.apps.gsa.staticplugins.p8019j.p8021b;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.p6519al.p6737i.C85494a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.b.h */
/* compiled from: PG */
public final class C102574h extends C86734a implements C85494a {

    /* renamed from: a */
    public final C68214a f286272a;

    /* renamed from: b */
    public final C68214a f286273b;

    /* renamed from: c */
    public final C68214a f286274c;

    /* renamed from: f */
    public final C68214a f286275f;

    /* renamed from: g */
    public final C68214a f286276g;

    /* renamed from: h */
    public final C118831d f286277h;

    /* renamed from: i */
    public final C118831d f286278i;

    /* renamed from: j */
    private final C22871g f286279j;

    /* renamed from: k */
    private final C22871g f286280k;

    public C102574h(C68214a aVar, C68214a aVar2, C22871g gVar, C22871g gVar2, C68214a aVar3, C118827a aVar4, C68214a aVar5, C68214a aVar6) {
        super(C118575h.WORKER_ASSISTANT_REQUEST, "assistantrequest");
        this.f286272a = aVar;
        this.f286273b = aVar2;
        this.f286279j = gVar;
        this.f286280k = gVar2;
        this.f286276g = aVar3;
        this.f286274c = aVar5;
        this.f286275f = aVar6;
        this.f286277h = aVar4.mo77944g(C118569b.ASSISTANT_REQUEST_BUILD_TIME_MS, C118575h.WORKER_ASSISTANT_REQUEST);
        this.f286278i = aVar4.mo77944g(C118569b.ASSISTANT_REQUEST_SIZE_BYTES, C118575h.WORKER_ASSISTANT_REQUEST);
    }

    /* renamed from: f */
    private final void m170099f(C60870cx cxVar) {
        ((C89859i) this.f286276g.mo27525b()).mo83702b(C89849ae.ASSISTANT_HEADER_INITIALIZATION_START);
        new C90873ag(cxVar, this.f286279j, "buildAssistantRequestForTextSearch", new C102567a(this, this.f286277h.mo104019a())).mo85223a(C102568b.f286259a);
    }

    /* renamed from: a */
    public final C60870cx mo79016a(Query query) {
        C60870cx b = this.f286280k.mo28202b("buildAssistantRequestWithPinholeParams", new C102571e(this, query));
        m170099f(b);
        return b;
    }

    /* renamed from: b */
    public final C60870cx mo79017b(Query query, C89356b bVar) {
        C60870cx b = this.f286279j.mo28202b("buildAssistantRequestForTextSearch", new C102569c(this, bVar, query));
        m170099f(b);
        return b;
    }

    /* renamed from: c */
    public final C60870cx mo79018c(Query query, C89356b bVar) {
        C60870cx b = this.f286279j.mo28202b("buildAssistantRequestForVoiceSearch", new C102570d(this, bVar, query));
        m170099f(b);
        return b;
    }

    /* renamed from: d */
    public final C60870cx mo79019d(Query query) {
        return this.f286280k.mo28202b("buildDeviceCapabilities", new C102572f(this, query));
    }

    /* renamed from: e */
    public final C60870cx mo79020e(Query query) {
        return this.f286280k.mo28201a("buildRequestContext", new C102573g(this, query));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
