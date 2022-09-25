package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6737i.C85494a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.h */
/* compiled from: PG */
public final class C116312h extends C68247h {

    /* renamed from: a */
    private final C68283d f322461a;

    /* renamed from: c */
    private final C68283d f322462c;

    /* renamed from: d */
    private final C68283d f322463d;

    /* renamed from: e */
    private final C69464a f322464e;

    public C116312h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C69464a aVar3) {
        super(aVar2, new C68277d(C116312h.class), aVar);
        this.f322461a = C68236af.m98549d(dVar);
        this.f322462c = C68236af.m98549d(dVar2);
        this.f322463d = C68236af.m98549d(dVar3);
        this.f322464e = aVar3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C86124t tVar = (C86124t) list.get(0);
        return ((C85494a) list.get(2)).mo79018c((Query) list.get(1), ((C84466a) C68219e.m98518a(this.f322464e).mo27525b()).mo78026b("Build Assistant Request", C118575h.GRAPH_ASSISTANT_VOICE_SEARCH, C118575h.GRAPH_VOICE_SEARCH_REQUEST));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322461a.mo60297gq(), this.f322462c.mo60297gq(), this.f322463d.mo60297gq());
    }
}
