package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5224k.p5225a.C67226d;
import com.google.speech.p5224k.p5225a.C67227e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.c */
/* compiled from: PG */
public final class C106351c extends C68247h {

    /* renamed from: a */
    private final C68283d f296696a;

    public C106351c(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C106351c.class), aVar);
        this.f296696a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C58833ax axVar;
        if (((Boolean) obj).booleanValue()) {
            C67226d dVar = (C67226d) C67227e.f182706c.createBuilder();
            dVar.copyOnWrite();
            C67227e eVar = (C67227e) dVar.instance;
            eVar.f182710b = 1;
            eVar.f182709a = 1 | eVar.f182709a;
            axVar = C58833ax.m90834k((C67227e) dVar.build());
        } else {
            axVar = C58836b.f156633a;
        }
        return C60856cj.m92900i(new C118928k(axVar, C67227e.f182707d));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f296696a.mo60297gq();
    }
}
