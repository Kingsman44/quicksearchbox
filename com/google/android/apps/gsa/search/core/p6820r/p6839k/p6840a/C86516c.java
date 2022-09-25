package com.google.android.apps.gsa.search.core.p6820r.p6839k.p6840a;

import com.google.android.apps.gsa.search.core.google.C85886bi;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.k.a.c */
/* compiled from: PG */
public final class C86516c extends C68247h {

    /* renamed from: a */
    private final C68283d f233799a;

    /* renamed from: c */
    private final C68283d f233800c;

    public C86516c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C86516c.class), aVar);
        this.f233799a = C68236af.m98549d(dVar);
        this.f233800c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return C60856cj.m92900i(((C85886bi) list.get(0)).mo79519a((Query) list.get(1)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233799a.mo60297gq(), this.f233800c.mo60297gq());
    }
}
