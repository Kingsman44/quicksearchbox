package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8914d.C118986a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.ad */
/* compiled from: PG */
public final class C106324ad extends C68247h {

    /* renamed from: a */
    private final C68283d f296627a;

    /* renamed from: c */
    private final C68283d f296628c;

    /* renamed from: d */
    private final C68283d f296629d;

    /* renamed from: e */
    private final C68283d f296630e;

    public C106324ad(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C106324ad.class), aVar);
        this.f296627a = C68236af.m98549d(dVar);
        this.f296628c = C68236af.m98549d(dVar2);
        this.f296629d = C68236af.m98549d(dVar3);
        this.f296630e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C92460b bVar;
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C92486a aVar = (C92486a) list.get(1);
        C118986a aVar2 = (C118986a) list.get(2);
        C58833ax axVar = (C58833ax) list.get(3);
        if (axVar.mo56113h()) {
            bVar = ((C74458k) axVar.mo56107c()).mo70774a();
        } else {
            C59104x d = C106323ac.f296626a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SessionParamsModule");
            ((C59052c) ((C59052c) d).mo56372aa(25304)).mo56386p("AudioListeningSessionAdapterOptional is not present");
            int i = C90755l.f253831a;
            bVar = aVar2.mo104088a(query, aVar.mo87252z(query));
        }
        return C60856cj.m92900i(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f296627a.mo60297gq(), this.f296628c.mo60297gq(), this.f296629d.mo60297gq(), this.f296630e.mo60297gq());
    }
}
