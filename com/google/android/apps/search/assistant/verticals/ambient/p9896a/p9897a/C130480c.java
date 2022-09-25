package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9897a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.C130477a;
import com.google.android.apps.search.assistant.verticals.ambient.p9905c.C130586e;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9966a.C131264f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.a.c */
/* compiled from: PG */
public final class C130480c implements C130477a {

    /* renamed from: a */
    public final C58974d f357451a;

    /* renamed from: b */
    public final C130586e f357452b;

    /* renamed from: c */
    private final C60887da f357453c;

    /* renamed from: d */
    private final C131258a f357454d;

    /* renamed from: e */
    private final boolean f357455e;

    /* renamed from: f */
    private C60870cx f357456f = C60866ct.f164955a;

    public C130480c(C130603a aVar, C60887da daVar, C131258a aVar2, C130586e eVar, boolean z) {
        this.f357451a = aVar.mo109740b(this);
        this.f357453c = daVar;
        this.f357454d = aVar2;
        this.f357452b = eVar;
        this.f357455e = z;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo109707a(C106596h hVar, C53715bm bmVar) {
        if (bmVar.f141023a != 12) {
            return C60866ct.f164955a;
        } else if (!this.f357455e) {
            ((C58970a) ((C58970a) this.f357451a.mo56224b()).mo56372aa(38895)).mo56386p("App suggestions for Hybrid Hotseat are disabled.");
            return C60866ct.f164955a;
        } else {
            if (!this.f357456f.isDone()) {
                this.f357456f.cancel(true);
            }
            C47633f e = C47633f.m84733g(((C131264f) this.f357454d).mo110140a(hVar)).mo51516i(new C130478a(this), this.f357453c).mo51513e(RuntimeException.class, new C130479b(this), this.f357453c);
            this.f357456f = e;
            return e;
        }
    }
}
