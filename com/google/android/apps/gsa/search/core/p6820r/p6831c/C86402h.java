package com.google.android.apps.gsa.search.core.p6820r.p6831c;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86361a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.c.h */
/* compiled from: PG */
public final class C86402h extends C68247h {

    /* renamed from: a */
    private final C68283d f233527a;

    /* renamed from: c */
    private final C68283d f233528c;

    public C86402h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C86402h.class), aVar);
        this.f233527a = C68236af.m98549d(dVar);
        this.f233528c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return C60856cj.m92900i(((C86361a) list.get(1)).mo80122a((Query) list.get(0)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233527a.mo60297gq(), this.f233528c.mo60297gq());
    }
}
