package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.assistant.shared.k;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66619cq;
import com.google.speech.p5208h.C66620cr;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.k */
/* compiled from: PG */
public final class C116315k extends C68247h {

    /* renamed from: a */
    private final C68283d f322470a;

    /* renamed from: c */
    private final C68283d f322471c;

    /* renamed from: d */
    private final C68283d f322472d;

    public C116315k(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C116315k.class), aVar);
        this.f322470a = C68236af.m98549d(dVar);
        this.f322471c = C68236af.m98549d(dVar2);
        this.f322472d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C118928k kVar;
        List list = (List) obj;
        C90021c cVar = (C90021c) list.get(0);
        C92473f fVar = (C92473f) list.get(1);
        Query query = (Query) list.get(2);
        if ((fVar.f258014b != C90536a.VOICE_ACTIONS || !k.b(cVar, query)) && !fVar.f258033u.equals("assistant-storybooks")) {
            kVar = new C118928k(C58836b.f156633a, C66620cr.f181240d);
        } else {
            C66619cq cqVar = (C66619cq) C66620cr.f181239c.createBuilder();
            cqVar.copyOnWrite();
            C66620cr crVar = (C66620cr) cqVar.instance;
            crVar.f181242a = 1 | crVar.f181242a;
            crVar.f181243b = 500;
            kVar = new C118928k(C58833ax.m90834k((C66620cr) cqVar.build()), C66620cr.f181240d);
        }
        return C60856cj.m92900i(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322470a.mo60297gq(), this.f322471c.mo60297gq(), this.f322472d.mo60297gq());
    }
}
