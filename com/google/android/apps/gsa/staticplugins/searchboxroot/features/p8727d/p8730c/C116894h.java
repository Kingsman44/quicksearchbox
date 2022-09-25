package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8730c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86234bq;
import com.google.android.apps.gsa.search.core.p6816p.C86235br;
import com.google.android.apps.gsa.search.core.p6816p.C86236bs;
import com.google.android.apps.gsa.search.core.p6816p.C86237bt;
import com.google.android.apps.gsa.search.core.p6816p.C86243bz;
import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89059o;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4453d.C57960f;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.c.h */
/* compiled from: PG */
public final class C116894h extends C68247h {

    /* renamed from: a */
    private final C68283d f324536a;

    /* renamed from: c */
    private final C68283d f324537c;

    /* renamed from: d */
    private final C69464a f324538d;

    /* renamed from: e */
    private final C68283d f324539e;

    /* renamed from: f */
    private final C68283d f324540f;

    /* renamed from: g */
    private final C68283d f324541g;

    /* renamed from: h */
    private final C68283d f324542h;

    /* renamed from: i */
    private final C69464a f324543i;

    /* renamed from: j */
    private final C68283d f324544j;

    public C116894h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C69464a aVar3, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C69464a aVar4, C68283d dVar7) {
        super(aVar2, new C68277d(C116894h.class), aVar);
        this.f324536a = C68236af.m98549d(dVar);
        this.f324537c = C68236af.m98549d(dVar2);
        this.f324538d = aVar3;
        this.f324539e = C68236af.m98549d(dVar3);
        this.f324540f = C68236af.m98549d(dVar4);
        this.f324541g = C68236af.m98549d(dVar5);
        this.f324542h = C68236af.m98549d(dVar6);
        this.f324543i = aVar4;
        this.f324544j = C68236af.m98549d(dVar7);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        long longValue = ((Long) list.get(0)).longValue();
        C86237bt btVar = (C86237bt) list.get(3);
        C57960f fVar = (C57960f) list.get(4);
        C89059o c = ((C89061q) list.get(5)).mo27433c();
        C86243bz bzVar = new C86243bz(C68219e.m98518a(this.f324538d), (C89859i) list.get(2), C68219e.m98518a(this.f324543i), (C86124t) list.get(6));
        bzVar.f233123b = (Query) list.get(1);
        bzVar.f233125d = longValue;
        bzVar.f233126e = c;
        C86246cb a = bzVar.mo79938a();
        int a2 = (int) btVar.f233066b.mo79743a(C90120fr.f250821am);
        if (a2 != 0) {
            while (btVar.f233069e.size() >= a2) {
                btVar.f233069e.poll();
            }
            C86236bs bsVar = new C86236bs(a, fVar);
            btVar.f233069e.add(bsVar);
            if (a.mo79884T()) {
                new C90873ag(a.mo79865A(), btVar.f233067c, "Receive SRP Query", new C86234bq(btVar, a, bsVar)).mo85223a(C86235br.f233062a);
            }
        }
        return C60856cj.m92900i(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f324536a.mo60297gq(), this.f324537c.mo60297gq(), this.f324539e.mo60297gq(), this.f324540f.mo60297gq(), this.f324541g.mo60297gq(), this.f324542h.mo60297gq(), this.f324544j.mo60297gq());
    }
}
