package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.p.bb */
/* compiled from: PG */
public final class C86219bb extends C68247h {

    /* renamed from: a */
    private final C68283d f232990a;

    /* renamed from: c */
    private final C68283d f232991c;

    /* renamed from: d */
    private final C68283d f232992d;

    /* renamed from: e */
    private final C68283d f232993e;

    /* renamed from: f */
    private final C68283d f232994f;

    /* renamed from: g */
    private final C68283d f232995g;

    public C86219bb(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C86219bb.class), aVar);
        this.f232990a = C68236af.m98549d(dVar);
        this.f232991c = C68236af.m98549d(dVar2);
        this.f232992d = C68236af.m98549d(dVar3);
        this.f232993e = C68236af.m98549d(dVar4);
        this.f232994f = C68236af.m98549d(dVar5);
        this.f232995g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C21370a aVar = (C21370a) list.get(0);
        Query query = (Query) list.get(1);
        C86237bt btVar = (C86237bt) list.get(2);
        ((Long) list.get(3)).longValue();
        C68282c cVar = (C68282c) list.get(4);
        C68283d dVar = this.f232995g;
        if (C57940c.m88583j(cVar)) {
            return C60856cj.m92900i((C58833ax) cVar.mo60292a());
        }
        return dVar.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f232990a.mo60297gq(), this.f232991c.mo60297gq(), this.f232992d.mo60297gq(), this.f232993e.mo60297gq(), C68236af.m98546a(this.f232994f.mo60297gq()));
    }
}
