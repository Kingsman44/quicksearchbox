package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.bf */
/* compiled from: PG */
public final class C116278bf extends C68247h {

    /* renamed from: a */
    private final C68283d f322390a;

    /* renamed from: c */
    private final C68283d f322391c;

    /* renamed from: d */
    private final C68283d f322392d;

    public C116278bf(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C116278bf.class), aVar);
        this.f322390a = C68236af.m98549d(dVar);
        this.f322391c = C68236af.m98549d(dVar2);
        this.f322392d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(1);
        C68283d dVar = this.f322392d;
        if (((C92473f) list.get(0)).f258014b != C90536a.VOICE_ACTIONS || query.mo84434dO()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return C60922j.m93044g(dVar.mo60297gq(), C116262aq.f322362a, C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322390a.mo60297gq(), this.f322391c.mo60297gq());
    }
}
