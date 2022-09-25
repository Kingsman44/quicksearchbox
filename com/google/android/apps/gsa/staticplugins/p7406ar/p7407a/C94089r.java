package com.google.android.apps.gsa.staticplugins.p7406ar.p7407a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.a.r */
/* compiled from: PG */
public final class C94089r extends C68247h {

    /* renamed from: a */
    private final C68283d f262890a;

    /* renamed from: c */
    private final C68283d f262891c;

    public C94089r(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C94089r.class), aVar);
        this.f262890a = C68236af.m98549d(dVar);
        this.f262891c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C85923cq cqVar = (C85923cq) list.get(0);
        C85981c cVar = new C85981c();
        if (((C86124t) list.get(1)).mo79746e(C90110fh.f250584I)) {
            cVar.mo79640f(new Uri.Builder().scheme(cqVar.mo83212j()).encodedAuthority(cqVar.mo83211i()).path("/httpservice/web/ExploreService/GetPivots").build());
        } else {
            cVar.mo79640f(new Uri.Builder().scheme("https").authority("www.google.com").path("/httpservice/web/ExploreService/GetPivots").build());
        }
        return C60856cj.m92900i(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f262890a.mo60297gq(), this.f262891c.mo60297gq());
    }
}
