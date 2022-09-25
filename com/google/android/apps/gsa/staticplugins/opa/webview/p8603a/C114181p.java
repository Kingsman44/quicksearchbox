package com.google.android.apps.gsa.staticplugins.opa.webview.p8603a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.a.p */
/* compiled from: PG */
public final class C114181p extends C68247h {

    /* renamed from: a */
    private final C68283d f316590a;

    /* renamed from: c */
    private final C68283d f316591c;

    public C114181p(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C114181p.class), aVar);
        this.f316590a = C68236af.m98549d(dVar);
        this.f316591c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        Query query = (Query) list.get(1);
        if (C57940c.m88583j(cVar)) {
            query = (Query) ((C58833ax) C57940c.m88577d(cVar)).mo56107c();
        } else {
            Throwable th = (Throwable) C57940c.m88575b(cVar).mo56111f();
            if (th != null) {
                ((C59052c) ((C59052c) ((C59052c) C114180o.f316589a.mo56225c()).mo56382g(th)).mo56372aa(28813)).mo56386p("Error taking the original query.");
            } else {
                ((C59052c) ((C59052c) C114180o.f316589a.mo56225c()).mo56372aa(28812)).mo56386p("Unknown error taking the original query.");
            }
        }
        return C60856cj.m92900i(query);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f316590a.mo60297gq()), this.f316591c.mo60297gq());
    }
}
