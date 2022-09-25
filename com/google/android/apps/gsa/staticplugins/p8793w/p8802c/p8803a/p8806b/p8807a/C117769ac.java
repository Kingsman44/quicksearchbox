package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85721i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.ac */
/* compiled from: PG */
public final class C117769ac extends C68247h {

    /* renamed from: a */
    private final C68283d f326864a;

    /* renamed from: c */
    private final C68283d f326865c;

    public C117769ac(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C117769ac.class), aVar);
        this.f326864a = C68236af.m98549d(dVar);
        this.f326865c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean z = false;
        Query query = (Query) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        if (axVar.mo56113h()) {
            if (((C85721i) axVar.mo56107c()).mo79366b() == 2) {
                z = true;
            }
            query = query.mo84244G(z);
        }
        return C60856cj.m92900i(query);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326864a.mo60297gq(), this.f326865c.mo60297gq());
    }
}
