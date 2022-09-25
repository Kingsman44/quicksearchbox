package com.google.android.apps.gsa.search.core.p6820r.p6831c;

import com.google.android.apps.gsa.search.shared.actions.errors.C87415c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
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

/* renamed from: com.google.android.apps.gsa.search.core.r.c.j */
/* compiled from: PG */
public final class C86404j extends C68247h {

    /* renamed from: a */
    private final C68283d f233530a;

    /* renamed from: c */
    private final C68283d f233531c;

    public C86404j(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C86404j.class), aVar);
        this.f233530a = C68236af.m98549d(dVar);
        this.f233531c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax b = C57940c.m88575b((C68282c) list.get(1));
        C58838bb.m90884s(b.mo56113h(), "Trying to extract an error from an input graph which did not fail.");
        return C60856cj.m92900i(C87415c.m141581a((Query) list.get(0), (Throwable) b.mo56107c()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233530a.mo60297gq(), C68236af.m98546a(this.f233531c.mo60297gq()));
    }
}
