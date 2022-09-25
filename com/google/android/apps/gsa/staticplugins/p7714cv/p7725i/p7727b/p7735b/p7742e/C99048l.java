package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7742e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.e.l */
/* compiled from: PG */
public final class C99048l extends C68247h {

    /* renamed from: a */
    private final C68283d f276973a;

    /* renamed from: c */
    private final C68283d f276974c;

    /* renamed from: d */
    private final C68283d f276975d;

    /* renamed from: e */
    private final C68283d f276976e;

    public C99048l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C99048l.class), aVar);
        this.f276973a = C68236af.m98549d(dVar);
        this.f276974c = C68236af.m98549d(dVar2);
        this.f276975d = C68236af.m98549d(dVar3);
        this.f276976e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C68283d dVar = this.f276974c;
        C68283d dVar2 = this.f276975d;
        if (!((C86124t) list.get(1)).mo79746e(C90086ek.f250337bI) || !query.mo84412cs()) {
            return dVar2.mo60297gq();
        }
        return dVar.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f276973a.mo60297gq(), this.f276976e.mo60297gq());
    }
}
