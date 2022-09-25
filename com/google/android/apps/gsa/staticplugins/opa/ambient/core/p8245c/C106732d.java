package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8245c;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83796l;
import com.google.android.apps.gsa.opa.smartspace.p6454c.C83751g;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.C110695h;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.C50702an;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.c.d */
/* compiled from: PG */
public final class C106732d implements C83796l {

    /* renamed from: a */
    public final C58974d f297444a;

    /* renamed from: b */
    public final C90021c f297445b;

    /* renamed from: c */
    public final C83751g f297446c;

    /* renamed from: d */
    public final C106729a f297447d;

    /* renamed from: e */
    private final C110695h f297448e;

    /* renamed from: f */
    private final C60888db f297449f;

    public C106732d(C110695h hVar, C83564a aVar, C60888db dbVar, C90021c cVar, C83751g gVar, C106729a aVar2) {
        this.f297448e = hVar;
        this.f297444a = aVar.mo76900a("MediaRecsSSCandidate");
        this.f297449f = dbVar;
        this.f297445b = cVar;
        this.f297446c = gVar;
        this.f297447d = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo77189a(C50738bc bcVar) {
        C110695h hVar = this.f297448e;
        C50702an anVar = (C50702an) bcVar.toBuilder();
        anVar.copyOnWrite();
        C50738bc bcVar2 = (C50738bc) anVar.instance;
        bcVar2.f132044k = null;
        bcVar2.f132034a &= -513;
        return C47633f.m84733g(hVar.mo77189a((C50738bc) anVar.build())).mo51515h(new C106730b(this, bcVar), this.f297449f);
    }
}
