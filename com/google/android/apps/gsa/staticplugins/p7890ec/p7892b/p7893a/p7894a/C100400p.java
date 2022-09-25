package com.google.android.apps.gsa.staticplugins.p7890ec.p7892b.p7893a.p7894a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92449f;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92451h;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ec.b.a.a.p */
/* compiled from: PG */
public final class C100400p extends C68247h {

    /* renamed from: a */
    private final C68283d f280704a;

    /* renamed from: c */
    private final C68283d f280705c;

    /* renamed from: d */
    private final C68283d f280706d;

    public C100400p(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C100400p.class), aVar);
        this.f280704a = C68236af.m98549d(dVar);
        this.f280705c = C68236af.m98549d(dVar2);
        this.f280706d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        HotwordResultMetadata hotwordResultMetadata;
        List list = (List) obj;
        C92473f fVar = (C92473f) list.get(0);
        Query query = (Query) list.get(2);
        C92449f fVar2 = new C92449f(fVar.f258028p, fVar.f258025m, fVar.f258005A, fVar.f258027o, fVar.f258034v, fVar.f258026n, fVar.f258036x, ((C92460b) list.get(1)).mo87204p(), fVar.f258012H, fVar.f258013I);
        if (query.mo84456dj() && (hotwordResultMetadata = query.f252756N) != null) {
            C92451h.m151927a(fVar2, hotwordResultMetadata);
        }
        C92451h.m151928b(fVar2, fVar.f258011G);
        return C60856cj.m92900i(fVar2.mo87150b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f280704a.mo60297gq(), this.f280705c.mo60297gq(), this.f280706d.mo60297gq());
    }
}
