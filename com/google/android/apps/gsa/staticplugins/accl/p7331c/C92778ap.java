package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84380z;
import com.google.android.apps.gsa.staticplugins.accl.p7338h.C92847b;
import com.google.android.libraries.gsa.conversation.p1837a.C22333n;
import com.google.android.libraries.gsa.conversation.p1837a.C22334o;
import com.google.android.libraries.gsa.conversation.p1852f.C22591r;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.ap */
/* compiled from: PG */
final class C92778ap extends C22334o {

    /* renamed from: a */
    public final C22591r f258909a;

    /* renamed from: b */
    public final C84380z f258910b;

    /* renamed from: c */
    public final C92847b f258911c;

    /* renamed from: d */
    private final C69464a f258912d;

    /* renamed from: e */
    private C60870cx f258913e;

    public C92778ap(C69464a aVar, C22591r rVar, C84380z zVar, C92847b bVar) {
        this.f258912d = aVar;
        this.f258909a = rVar;
        this.f258910b = zVar;
        this.f258911c = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C22333n mo27546a() {
        return C22333n.OUTPUT;
    }

    /* renamed from: b */
    public final C60870cx mo27547b() {
        C60870cx h = C60922j.m93045h((C60870cx) this.f258912d.mo17428b(), new C92777ao(this), C60826bg.f164896a);
        this.f258913e = h;
        return h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C60870cx mo27548c() {
        C60870cx cxVar = this.f258913e;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        return C118826c.f331423b;
    }
}
