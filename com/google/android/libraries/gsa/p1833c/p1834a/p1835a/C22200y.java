package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.shared.p6968aa.C89035bf;
import com.google.android.apps.gsa.shared.p7012bb.p7016d.C89380h;
import com.google.android.apps.gsa.shared.p7012bb.p7018f.C89402a;
import com.google.common.p4552o.C60325oi;
import com.google.common.p4552o.C60333oq;

/* renamed from: com.google.android.libraries.gsa.c.a.a.y */
/* compiled from: PG */
final class C22200y implements C89035bf {

    /* renamed from: a */
    private final C89402a f61283a;

    /* renamed from: b */
    private final C89380h f61284b;

    public C22200y(C89380h hVar, C89402a aVar) {
        this.f61284b = hVar;
        this.f61283a = aVar;
    }

    /* renamed from: a */
    public final void mo27400a(C60325oi oiVar) {
        this.f61284b.mo83315a(oiVar);
    }

    /* renamed from: b */
    public final void mo27401b(C60333oq oqVar) {
        this.f61284b.mo83315a(oqVar);
        this.f61283a.mo83324a(C118569b.NETWORK_BYTES_SENT).mo104025g(oqVar.f163292n);
        this.f61283a.mo83324a(C118569b.NETWORK_BYTES_RECEIVED).mo104025g(oqVar.f163293o);
    }
}
