package com.google.android.apps.gsa.staticplugins.webview;

import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6829h.C86377b;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86603d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.dm */
/* compiled from: PG */
public final class C118206dm extends C68247h {

    /* renamed from: a */
    private final C68283d f328167a;

    /* renamed from: c */
    private final C68283d f328168c;

    /* renamed from: d */
    private final C68283d f328169d;

    /* renamed from: e */
    private final C68283d f328170e;

    /* renamed from: f */
    private final C68283d f328171f;

    public C118206dm(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C118206dm.class), aVar);
        this.f328167a = C68236af.m98549d(dVar);
        this.f328168c = C68236af.m98549d(dVar2);
        this.f328169d = C68236af.m98549d(dVar3);
        this.f328170e = C68236af.m98549d(dVar4);
        this.f328171f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C86377b bVar = (C86377b) list.get(1);
        Query query = (Query) list.get(2);
        C86603d dVar = (C86603d) list.get(3);
        C58881cr crVar = (C58881cr) list.get(4);
        if (!C57940c.m88582i(cVar)) {
            return dVar.mo54597a(new C118198de(cVar, crVar, query, bVar));
        }
        Objects.requireNonNull(bVar);
        return dVar.mo54598b(new C118197dd(bVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f328167a.mo60297gq()), this.f328168c.mo60297gq(), this.f328169d.mo60297gq(), this.f328170e.mo60297gq(), this.f328171f.mo60297gq());
    }
}
