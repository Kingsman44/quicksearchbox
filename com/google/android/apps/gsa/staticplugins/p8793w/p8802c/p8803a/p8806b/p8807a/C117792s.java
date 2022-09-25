package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.s */
/* compiled from: PG */
public final class C117792s extends C68247h {

    /* renamed from: a */
    private final C68283d f326926a;

    /* renamed from: c */
    private final C68283d f326927c;

    /* renamed from: d */
    private final C68283d f326928d;

    /* renamed from: e */
    private final C68283d f326929e;

    /* renamed from: f */
    private final C68283d f326930f;

    public C117792s(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C117792s.class), aVar);
        this.f326926a = C68236af.m98549d(dVar);
        this.f326927c = C68236af.m98549d(dVar2);
        this.f326928d = C68236af.m98549d(dVar3);
        this.f326929e = C68236af.m98549d(dVar4);
        this.f326930f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        b bVar = (b) list.get(0);
        Query query = (Query) list.get(1);
        C85596b bVar2 = (C85596b) list.get(2);
        boolean booleanValue = ((Boolean) list.get(3)).booleanValue();
        C58974d dVar = (C58974d) list.get(4);
        if (booleanValue) {
            return bVar2.mo20304d(bVar, query);
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326926a.mo60297gq(), this.f326927c.mo60297gq(), this.f326928d.mo60297gq(), this.f326929e.mo60297gq(), this.f326930f.mo60297gq());
    }
}
