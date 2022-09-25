package com.google.android.apps.gsa.staticplugins.p7773dc.p7775b;

import com.google.android.apps.gsa.search.core.p6820r.C86497j;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.p7773dc.p7777d.C99359a;
import com.google.android.apps.gsa.staticplugins.p7773dc.p7777d.C99360b;
import com.google.android.apps.gsa.staticplugins.p7773dc.p7777d.C99361c;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dc.b.c */
/* compiled from: PG */
public final class C99343c extends C68247h {

    /* renamed from: a */
    private final C68283d f277969a;

    /* renamed from: c */
    private final C68283d f277970c;

    public C99343c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C99343c.class), aVar);
        this.f277969a = C68236af.m98549d(dVar);
        this.f277970c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C99361c cVar = (C99361c) list.get(0);
        C60870cx cxVar = (C60870cx) list.get(1);
        SettableFuture settableFuture = new SettableFuture();
        SettableFuture settableFuture2 = cVar.f278001c;
        C60870cx h = C60922j.m93045h(settableFuture, new C99359a(), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        C58838bb.m90884s(settableFuture2.mo57358p(h), "Fetch can only be called once");
        try {
            C86497j g = cVar.f277999a.mo79838g(cxVar);
            settableFuture.mo57358p(g.mo80184c());
            return C60856cj.m92900i(new C99360b(g));
        } catch (Throwable th) {
            settableFuture.mo57357o(th);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f277969a.mo60297gq(), this.f277970c.mo60297gq());
    }
}
