package com.google.android.apps.gsa.search.core.p6519al.p6538ai.p6539a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6538ai.C84687a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86727g;
import com.google.common.p4552o.C60494rz;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.al.ai.a.a */
/* compiled from: PG */
public final class C84688a implements C84687a {

    /* renamed from: a */
    private final C68214a f230323a;

    public C84688a(C68214a aVar) {
        this.f230323a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78419a(Uri uri, Long l, C60494rz rzVar) {
        C84689b bVar = new C84689b(uri, l, rzVar);
        ((C86727g) this.f230323a.mo27525b()).mo80313b(bVar);
        return bVar;
    }

    /* renamed from: b */
    public final C60870cx mo78420b(Uri uri) {
        C84690c cVar = new C84690c(uri);
        ((C86727g) this.f230323a.mo27525b()).mo80313b(cVar);
        return cVar;
    }
}
