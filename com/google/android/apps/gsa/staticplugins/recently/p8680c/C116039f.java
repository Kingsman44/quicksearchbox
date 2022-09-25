package com.google.android.apps.gsa.staticplugins.recently.p8680c;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.c.f */
/* compiled from: PG */
public final class C116039f extends C68247h {

    /* renamed from: a */
    private final C68283d f321776a;

    /* renamed from: c */
    private final C68283d f321777c;

    /* renamed from: d */
    private final C68283d f321778d;

    public C116039f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C116039f.class), aVar);
        this.f321776a = C68236af.m98549d(dVar);
        this.f321777c = C68236af.m98549d(dVar2);
        this.f321778d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C85089a aVar = (C85089a) list.get(1);
        Query query = (Query) list.get(2);
        if (C57940c.m88582i(cVar) && ((Boolean) C57940c.m88577d(cVar)).booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
            if (query.mo84391cX() && !query.mo84338bW()) {
                aVar.mo78707k(query.f252770i, query.mo84346be(), (Bitmap) null);
            }
            aVar.mo78709m(query.f252770i, query.mo84346be());
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f321776a.mo60297gq()), this.f321777c.mo60297gq(), this.f321778d.mo60297gq());
    }
}
