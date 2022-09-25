package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86243bz;
import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.j */
/* compiled from: PG */
public final class C117651j extends C68247h {

    /* renamed from: a */
    private final C68283d f326571a;

    /* renamed from: c */
    private final C68283d f326572c;

    /* renamed from: d */
    private final C69464a f326573d;

    /* renamed from: e */
    private final C69464a f326574e;

    /* renamed from: f */
    private final C68283d f326575f;

    /* renamed from: g */
    private final C68283d f326576g;

    /* renamed from: h */
    private final C68283d f326577h;

    public C117651j(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C69464a aVar3, C69464a aVar4, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C117651j.class), aVar);
        this.f326571a = C68236af.m98549d(dVar);
        this.f326572c = C68236af.m98549d(dVar2);
        this.f326573d = aVar3;
        this.f326574e = aVar4;
        this.f326575f = C68236af.m98549d(dVar3);
        this.f326576g = C68236af.m98549d(dVar4);
        this.f326577h = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C68214a a = C68219e.m98518a(this.f326573d);
        C68214a a2 = C68219e.m98518a(this.f326574e);
        Query query = (Query) list.get(2);
        C117634ae aeVar = (C117634ae) list.get(3);
        C58976aa aaVar = C58975e.f156826a;
        long j = query.f252745C;
        C86243bz bzVar = new C86243bz(a2, (C89859i) list.get(1), a, (C86124t) list.get(4));
        bzVar.f233122a = query;
        bzVar.f233125d = j;
        C86246cb a3 = bzVar.mo79938a();
        if (axVar.mo56113h()) {
            a3.mo79912ac((ActionData) axVar.mo56107c());
        }
        aeVar.f326538i = a3;
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326571a.mo60297gq(), this.f326572c.mo60297gq(), this.f326575f.mo60297gq(), this.f326576g.mo60297gq(), this.f326577h.mo60297gq());
    }
}
