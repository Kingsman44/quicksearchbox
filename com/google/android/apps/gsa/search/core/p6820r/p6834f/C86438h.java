package com.google.android.apps.gsa.search.core.p6820r.p6834f;

import com.google.android.apps.gsa.search.core.p6816p.C86211au;
import com.google.android.apps.gsa.shared.p6968aa.C89021as;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.r.f.h */
/* compiled from: PG */
public final class C86438h extends C68247h {

    /* renamed from: a */
    private final C68283d f233603a;

    /* renamed from: c */
    private final C68283d f233604c;

    public C86438h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C86438h.class), aVar);
        this.f233603a = C68236af.m98549d(dVar);
        this.f233604c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C89021as asVar = (C89021as) list.get(0);
        C86211au auVar = (C86211au) list.get(1);
        if (asVar.mo82999g().mo83003e()) {
            synchronized (auVar.f232962c) {
                auVar.f232963d = true;
            }
            auVar.f233010k.mo79918ai(auVar.f232966g.mo26872d());
        }
        return C60856cj.m92900i(asVar.mo82997b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f233603a.mo60297gq(), this.f233604c.mo60297gq());
    }
}
