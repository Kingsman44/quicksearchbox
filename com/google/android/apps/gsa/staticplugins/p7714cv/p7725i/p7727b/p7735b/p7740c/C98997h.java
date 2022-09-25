package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7740c;

import com.google.android.apps.gsa.binaries.satin.app.C74055gy;
import com.google.android.apps.gsa.binaries.satin.app.ha;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.c.h */
/* compiled from: PG */
public final class C98997h extends C118959b implements C86569o {

    /* renamed from: a */
    public static final C59071e f276778a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.b.b.c.h");

    /* renamed from: b */
    public final C85422c f276779b;

    /* renamed from: c */
    private final C22871g f276780c;

    /* renamed from: d */
    private final C98996g f276781d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98997h(C89356b bVar, Query query, C119066v vVar, C85422c cVar, C58833ax axVar, C22871g gVar, C74055gy gyVar) {
        super(bVar);
        C74055gy gyVar2 = gyVar;
        this.f276779b = cVar;
        this.f276780c = gVar;
        C58976aa aaVar = C58975e.f156826a;
        C89066v vVar2 = C89066v.f241382a;
        vVar2.getClass();
        gyVar2.f206257c = vVar2;
        bVar.getClass();
        gyVar2.f206258d = bVar;
        query.getClass();
        gyVar2.f206259e = query;
        gyVar2.f206260f = Integer.valueOf(true != query.mo84403cj() ? 14 : 53);
        vVar.getClass();
        gyVar2.f206261g = vVar;
        axVar.getClass();
        gyVar2.f206262h = axVar;
        C68225k.m98529a(gyVar2.f206257c, C89066v.class);
        C68225k.m98529a(gyVar2.f206258d, C89356b.class);
        C68225k.m98529a(gyVar2.f206259e, Query.class);
        C68225k.m98529a(gyVar2.f206260f, Integer.class);
        C68225k.m98529a(gyVar2.f206261g, C119066v.class);
        C68225k.m98529a(gyVar2.f206262h, C58833ax.class);
        this.f276781d = new ha(gyVar2.f206255a, gyVar2.f206256b, gyVar2.f206257c, gyVar2.f206258d, gyVar2.f206259e, gyVar2.f206260f, gyVar2.f206261g, gyVar2.f206262h);
    }

    /* renamed from: b */
    public final String mo79837b() {
        return "VoiceSearchFetcher with the hybrid graph";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C86497j mo91280c(Query query) {
        this.f276780c.mo28211k(this.f276781d.b.mo60297gq(), "Obtained ConnectivityContext.", new C98995f(this, query));
        return new C119062r(this.f276781d.f.mo60297gq());
    }
}
