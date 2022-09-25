package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import com.google.speech.p5224k.p5225a.C67244v;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.bl */
/* compiled from: PG */
public final class C116284bl extends C68247h {

    /* renamed from: a */
    private final C68283d f322403a;

    /* renamed from: c */
    private final C68283d f322404c;

    public C116284bl(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C116284bl.class), aVar);
        this.f322403a = C68236af.m98549d(dVar);
        this.f322404c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C67244v vVar = (C67244v) list.get(1);
        if (C57940c.m88582i(cVar)) {
            C58976aa aaVar = C58975e.f156826a;
            vVar = (C67244v) C57940c.m88577d(cVar);
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        return C60856cj.m92900i(new C118928k(C58833ax.m90834k(vVar), C67244v.f182772t));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f322403a.mo60297gq()), this.f322404c.mo60297gq());
    }
}
