package com.google.android.apps.gsa.staticplugins.p7442bc;

import com.google.android.apps.gsa.p5851g.p5854f.C74528a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bc.aa */
/* compiled from: PG */
public final class C94505aa extends C68247h {

    /* renamed from: a */
    private final C68283d f264219a;

    /* renamed from: c */
    private final C68283d f264220c;

    public C94505aa(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C94505aa.class), aVar);
        this.f264219a = C68236af.m98549d(dVar);
        this.f264220c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        Query query = (Query) list.get(1);
        if (axVar.mo56113h()) {
            return ((C74528a) axVar.mo56107c()).mo70837b();
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264219a.mo60297gq(), this.f264220c.mo60297gq());
    }
}
