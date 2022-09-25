package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85421b;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.speech.audio.p7268e.C92194i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.e */
/* compiled from: PG */
final class C100608e implements C85421b {

    /* renamed from: a */
    private final C68214a f281320a;

    /* renamed from: b */
    private final Query f281321b;

    /* renamed from: c */
    private final C60870cx f281322c;

    /* renamed from: d */
    private final C86577w f281323d;

    /* renamed from: e */
    private final C89356b f281324e;

    /* renamed from: f */
    private final C58833ax f281325f;

    /* renamed from: g */
    private final u f281326g;

    /* renamed from: h */
    private final boolean f281327h;

    public C100608e(Query query, C60870cx cxVar, C86577w wVar, C89356b bVar, C58833ax axVar, boolean z, C68214a aVar, u uVar) {
        this.f281320a = aVar;
        this.f281321b = query;
        this.f281322c = cxVar;
        this.f281323d = wVar;
        this.f281324e = bVar;
        this.f281325f = axVar;
        this.f281326g = uVar;
        this.f281327h = z;
    }

    /* renamed from: a */
    public final C60870cx mo78931a(C60537to toVar, boolean z) {
        C60870cx cxVar;
        boolean isDone = this.f281322c.isDone();
        C58976aa aaVar = C58975e.f156826a;
        if (!isDone) {
            this.f281322c.cancel(!this.f281327h);
            C86577w wVar = this.f281323d;
            if (wVar != null) {
                cxVar = wVar.mo80181b();
            } else {
                cxVar = this.f281324e.mo83286e().mo54566a();
            }
            if (z) {
                ((C92194i) this.f281320a.mo27525b()).mo86849e(true);
            }
        } else {
            cxVar = C118826c.f331423b;
        }
        ((C74458k) ((C58847bk) this.f281325f).f156646a).mo70778e();
        return cxVar;
    }

    /* renamed from: b */
    public final void mo78932b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f281326g.h("VoiceSearchController", this.f281325f);
    }

    /* renamed from: c */
    public final boolean mo78933c(Query query) {
        return this.f281321b.mo84383cP(query);
    }

    /* renamed from: d */
    public final boolean mo78934d() {
        return this.f281322c.isDone();
    }
}
