package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7728a.p7731b;

import com.google.android.apps.gsa.binaries.satin.app.C74313u;
import com.google.android.apps.gsa.binaries.satin.app.w;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C118959b;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119062r;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119066v;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6820r.C86497j;
import com.google.android.apps.gsa.search.core.p6820r.C86569o;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.a.b.c */
/* compiled from: PG */
public final class C98847c extends C118959b implements C86569o {

    /* renamed from: a */
    public static final C59071e f276205a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.b.a.b.c");

    /* renamed from: b */
    public final C85422c f276206b;

    /* renamed from: c */
    private final C22871g f276207c;

    /* renamed from: d */
    private final C98846b f276208d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98847c(C89356b bVar, Query query, C119066v vVar, C85422c cVar, C58833ax axVar, C22871g gVar, C74313u uVar) {
        super(bVar);
        C74313u uVar2 = uVar;
        this.f276206b = cVar;
        this.f276207c = gVar;
        C58976aa aaVar = C58975e.f156826a;
        C89066v vVar2 = C89066v.f241382a;
        vVar2.getClass();
        uVar2.f208104c = vVar2;
        bVar.getClass();
        uVar2.f208105d = bVar;
        query.getClass();
        uVar2.f208106e = query;
        uVar2.f208107f = Integer.valueOf(true != query.mo84403cj() ? 14 : 53);
        vVar.getClass();
        uVar2.f208108g = vVar;
        axVar.getClass();
        uVar2.f208109h = axVar;
        C68225k.m98529a(uVar2.f208104c, C89066v.class);
        C68225k.m98529a(uVar2.f208105d, C89356b.class);
        C68225k.m98529a(uVar2.f208106e, Query.class);
        C68225k.m98529a(uVar2.f208107f, Integer.class);
        C68225k.m98529a(uVar2.f208108g, C119066v.class);
        C68225k.m98529a(uVar2.f208109h, C58833ax.class);
        this.f276208d = new w(uVar2.f208102a, uVar2.f208103b, uVar2.f208104c, uVar2.f208105d, uVar2.f208106e, uVar2.f208107f, uVar2.f208108g, uVar2.f208109h);
    }

    /* renamed from: b */
    public final String mo79837b() {
        return "VoiceSearchFetcher with the hybrid graph";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C86497j mo91280c(Query query) {
        this.f276207c.mo28211k(this.f276208d.b.mo60297gq(), "Obtained ConnectivityContext.", new C98832a(this, query));
        return new C119062r(this.f276208d.f.mo60297gq());
    }
}
