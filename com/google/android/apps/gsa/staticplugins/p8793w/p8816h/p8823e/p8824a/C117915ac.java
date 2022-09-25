package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a;

import android.databinding.C0118a;
import com.google.android.apps.gsa.search.core.p6816p.C86227bj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import com.google.p4449cd.C57954d;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.a.ac */
/* compiled from: PG */
public final class C117915ac extends C68247h {

    /* renamed from: a */
    private final C68283d f327289a;

    /* renamed from: c */
    private final C68283d f327290c;

    /* renamed from: d */
    private final C68283d f327291d;

    public C117915ac(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C117915ac.class), aVar);
        this.f327289a = C68236af.m98549d(dVar);
        this.f327290c = C68236af.m98549d(dVar2);
        this.f327291d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C57954d dVar = (C57954d) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        if (C57940c.m88582i(cVar)) {
            try {
                C58976aa aaVar = C58975e.f156826a;
                obj2 = C58833ax.m90834k(((C86227bj) cVar.mo60292a()).f233010k);
            } catch (ExecutionException e) {
                C0118a.m116x(C117952v.f327374a.mo56226d(), "Exception while Network fetch S3FetchTask.", 18930, e, C58975e.f156826a, "CarAssistTextSearchComp");
            }
            return C60856cj.m92900i(obj2);
        }
        C58976aa aaVar2 = C58975e.f156826a;
        obj2 = C58836b.f156633a;
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f327289a.mo60297gq()), this.f327290c.mo60297gq(), this.f327291d.mo60297gq());
    }
}
