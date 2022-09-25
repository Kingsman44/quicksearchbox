package com.google.android.apps.gsa.search.core.p6519al.p6540aj.p6541a;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6540aj.C84691a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86727g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.al.aj.a.a */
/* compiled from: PG */
public final class C84692a implements C84691a {

    /* renamed from: a */
    private final C68214a f230328a;

    public C84692a(C68214a aVar) {
        this.f230328a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78421a(Query query) {
        C84695d dVar = new C84695d(query);
        ((C86727g) this.f230328a.mo27525b()).mo80313b(dVar);
        return dVar;
    }

    /* renamed from: b */
    public final C60870cx mo78422b(Query query, C58833ax axVar, C58833ax axVar2) {
        C84696e eVar = new C84696e(query, axVar, axVar2);
        ((C86727g) this.f230328a.mo27525b()).mo80313b(eVar);
        return eVar;
    }

    /* renamed from: c */
    public final C60870cx mo78423c(Query query) {
        C84697f fVar = new C84697f(query);
        ((C86727g) this.f230328a.mo27525b()).mo80313b(fVar);
        return fVar;
    }

    /* renamed from: e */
    public final void mo78424e(Query query, Uri uri) {
        ((C86727g) this.f230328a.mo27525b()).mo80313b(new C84693b(query, uri));
    }

    /* renamed from: f */
    public final void mo78425f(Intent intent) {
        ((C86727g) this.f230328a.mo27525b()).mo80313b(new C84694c(intent));
    }

    /* renamed from: g */
    public final void mo78426g() {
        ((C86727g) this.f230328a.mo27525b()).mo80313b(new C84698g());
    }
}
