package com.google.android.apps.gsa.staticplugins.accl.p7331c.p7332a;

import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.p6487s3.C84335x;
import com.google.android.apps.gsa.search.core.p6519al.p6656cl.C85133a;
import com.google.android.apps.gsa.shared.util.C90768bl;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.libraries.gsa.conversation.p1852f.C22588o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.speech.p5208h.p5210b.C66572b;
import com.google.speech.p5224k.p5225a.C67190ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.a.n */
/* compiled from: PG */
public final class C92762n implements C22588o {

    /* renamed from: a */
    public static final C59071e f258869a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.c.a.n");

    /* renamed from: b */
    public final Object f258870b = new Object();

    /* renamed from: c */
    public SettableFuture f258871c;

    /* renamed from: d */
    private final C22871g f258872d;

    /* renamed from: e */
    private final C92758j f258873e;

    /* renamed from: f */
    private final C92751c f258874f;

    /* renamed from: g */
    private final C85133a f258875g;

    /* renamed from: h */
    private final C22871g f258876h;

    /* renamed from: i */
    private C60870cx f258877i;

    public C92762n(C22871g gVar, C92758j jVar, C92751c cVar, C85133a aVar, C22871g gVar2) {
        this.f258872d = gVar;
        this.f258873e = jVar;
        this.f258874f = cVar;
        this.f258875g = aVar;
        this.f258876h = gVar2;
    }

    /* renamed from: c */
    private final C60870cx m152793c(C92439c cVar) {
        SettableFuture settableFuture;
        synchronized (this.f258870b) {
            SettableFuture settableFuture2 = this.f258871c;
            if (settableFuture2 != null && !settableFuture2.isDone()) {
                this.f258871c.mo57356n(C58836b.f156633a);
            }
            this.f258871c = new SettableFuture();
            C60870cx cxVar = this.f258877i;
            if (cxVar != null) {
                new C90873ag(cxVar, this.f258876h, "Stopping NetworkRecognitionRunner", new C92759k(this)).mo85223a(C92760l.f258867a);
            }
            this.f258877i = this.f258875g.mo78729c((C84295m) C90768bl.m148268a(this.f258872d, C84295m.class, new C92755g(new C92761m(this))), cVar, new C84335x());
            settableFuture = this.f258871c;
            settableFuture.getClass();
        }
        return settableFuture;
    }

    /* renamed from: a */
    public final C60870cx mo27693a(C67190ah ahVar) {
        C92758j jVar = this.f258873e;
        ahVar.getClass();
        C90931ca caVar = (C90931ca) jVar.f258863a.mo17428b();
        caVar.getClass();
        String str = (String) jVar.f258864b.mo17428b();
        str.getClass();
        C92754f fVar = (C92754f) jVar.f258865c.mo17428b();
        fVar.getClass();
        return m152793c(new C92757i(ahVar, caVar, str, fVar));
    }

    /* renamed from: b */
    public final C60870cx mo87455b(C66572b bVar) {
        C92751c cVar = this.f258874f;
        bVar.getClass();
        C90931ca caVar = (C90931ca) cVar.f258828a.mo17428b();
        caVar.getClass();
        String str = (String) cVar.f258829b.mo17428b();
        str.getClass();
        C92754f fVar = (C92754f) cVar.f258830c.mo17428b();
        fVar.getClass();
        return m152793c(new C92750b(bVar, caVar, str, fVar));
    }
}
