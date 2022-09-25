package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90139r;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.speech.embedded.TaggerResult;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.q */
/* compiled from: PG */
public final class C98547q extends C68247h {

    /* renamed from: a */
    private final C68283d f275183a;

    /* renamed from: c */
    private final C68283d f275184c;

    /* renamed from: d */
    private final C68283d f275185d;

    public C98547q(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C98547q.class), aVar);
        this.f275183a = C68236af.m98549d(dVar);
        this.f275184c = C68236af.m98549d(dVar2);
        this.f275185d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean z = false;
        b bVar = (b) list.get(0);
        Query query = (Query) list.get(1);
        C86124t tVar = (C86124t) list.get(2);
        if (bVar.b != 1) {
            return C60856cj.m92900i(false);
        }
        TaggerResult taggerResult = bVar.c;
        taggerResult.getClass();
        String str = taggerResult.f118518a;
        if (query.mo84337bV()) {
            z = C98528aa.m163207a(str, (int) tVar.mo79743a(C90139r.f251867o));
        } else if (!query.mo84326bK()) {
            z = true;
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f275183a.mo60297gq(), this.f275184c.mo60297gq(), this.f275185d.mo60297gq());
    }
}
