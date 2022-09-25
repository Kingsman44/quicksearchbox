package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85728p;
import com.google.android.apps.gsa.search.core.p6519al.p6630bz.p6631a.C85047b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.ah */
/* compiled from: PG */
public final class C117774ah extends C68247h {

    /* renamed from: a */
    private final C68283d f326882a;

    /* renamed from: c */
    private final C68283d f326883c;

    /* renamed from: d */
    private final C68283d f326884d;

    /* renamed from: e */
    private final C68283d f326885e;

    /* renamed from: f */
    private final C68283d f326886f;

    public C117774ah(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C117774ah.class), aVar);
        this.f326882a = C68236af.m98549d(dVar);
        this.f326883c = C68236af.m98549d(dVar2);
        this.f326884d = C68236af.m98549d(dVar3);
        this.f326885e = C68236af.m98549d(dVar4);
        this.f326886f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C85047b bVar = (C85047b) list.get(0);
        b bVar2 = (b) list.get(1);
        C85728p pVar = (C85728p) list.get(2);
        Query query = (Query) list.get(3);
        C58974d dVar = (C58974d) list.get(4);
        if (!query.f252770i.equals("##.##.##.#############!!!")) {
            ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(18649)).mo56386p("Sending query to POP.");
            String str = query.f252770i;
        }
        return bVar.mo78669a(query.mo84238A().mo84309au());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326882a.mo60297gq(), this.f326883c.mo60297gq(), this.f326884d.mo60297gq(), this.f326885e.mo60297gq(), this.f326886f.mo60297gq());
    }
}
