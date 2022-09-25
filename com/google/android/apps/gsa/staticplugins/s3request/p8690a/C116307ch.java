package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import android.content.Context;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67189ag;
import com.google.speech.p5224k.p5225a.C67190ah;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.ch */
/* compiled from: PG */
public final class C116307ch extends C68247h {

    /* renamed from: a */
    private final C68283d f322453a;

    /* renamed from: c */
    private final C68283d f322454c;

    public C116307ch(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C116307ch.class), aVar);
        this.f322453a = C68236af.m98549d(dVar);
        this.f322454c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        int a;
        List list = (List) obj;
        Context context = (Context) list.get(0);
        Query query = (Query) list.get(1);
        C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
        if (query.mo84364bx("android.opa.extra.VOICE_SEARCH_TTS_ENCODING") && (a = C67189ag.m97437a(query.mo84263a("android.opa.extra.VOICE_SEARCH_TTS_ENCODING"))) != 0) {
            aeVar.copyOnWrite();
            C67190ah ahVar = (C67190ah) aeVar.instance;
            ahVar.f182628g = a;
            ahVar.f182622a |= 128;
        }
        if (query.mo84364bx("android.opa.extra.VOICE_SEARCH_TTS_SAMPLE_RATE_HZ")) {
            int a2 = query.mo84263a("android.opa.extra.VOICE_SEARCH_TTS_SAMPLE_RATE_HZ");
            aeVar.copyOnWrite();
            C67190ah ahVar2 = (C67190ah) aeVar.instance;
            ahVar2.f182622a |= 32768;
            ahVar2.f182634m = a2;
        }
        return C60856cj.m92900i(new C118928k(C58833ax.m90834k((C67190ah) aeVar.build()), C67190ah.f182620r));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322453a.mo60297gq(), this.f322454c.mo60297gq());
    }
}
