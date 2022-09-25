package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.p */
/* compiled from: PG */
public final class C117789p extends C68247h {

    /* renamed from: a */
    private final C68283d f326918a;

    /* renamed from: c */
    private final C68283d f326919c;

    public C117789p(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C117789p.class), aVar);
        this.f326918a = C68236af.m98549d(dVar);
        this.f326919c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C85596b bVar = (C85596b) list.get(1);
        if (!query.mo84364bx("android.opa.extra.CONVERSATION_DELTA")) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return bVar.mo20302b((C52081en) C62942bv.parseFrom((C62942bv) C52081en.f136679i, query.mo84439dT(), C62921ba.m95368a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326918a.mo60297gq(), this.f326919c.mo60297gq());
    }
}
