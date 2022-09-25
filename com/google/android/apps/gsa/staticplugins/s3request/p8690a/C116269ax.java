package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.ax */
/* compiled from: PG */
public final class C116269ax extends C68247h {

    /* renamed from: a */
    private final C68283d f322370a;

    /* renamed from: c */
    private final C68283d f322371c;

    /* renamed from: d */
    private final C68283d f322372d;

    /* renamed from: e */
    private final C68283d f322373e;

    public C116269ax(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C116269ax.class), aVar);
        this.f322370a = C68236af.m98549d(dVar);
        this.f322371c = C68236af.m98549d(dVar2);
        this.f322372d = C68236af.m98549d(dVar3);
        this.f322373e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C92473f fVar = (C92473f) list.get(0);
        C90021c cVar = (C90021c) list.get(1);
        Query query = (Query) list.get(2);
        C68283d dVar = this.f322373e;
        if ((fVar.f258014b != C90536a.VOICE_ACTIONS || !query.mo84434dO()) && (fVar.f258014b != C90536a.CLOCKWORK || !query.mo84399cf() || !query.mo84364bx("android.opa.extra.CONVERSATION_DELTA"))) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return C60922j.m93044g(dVar.mo60297gq(), C116261ap.f322361a, C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322370a.mo60297gq(), this.f322371c.mo60297gq(), this.f322372d.mo60297gq());
    }
}
