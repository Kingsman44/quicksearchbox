package com.google.android.apps.gsa.staticplugins.opa.p8312ax;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86255j;
import com.google.android.apps.gsa.search.core.p6820r.C86385ag;
import com.google.android.apps.gsa.search.core.p6820r.C86386ah;
import com.google.android.apps.gsa.search.core.p6820r.C86387ai;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3910e.p3911a.C51194i;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ax.l */
/* compiled from: PG */
public final class C107636l extends C68247h {

    /* renamed from: a */
    private final C68283d f299456a;

    /* renamed from: c */
    private final C68283d f299457c;

    /* renamed from: d */
    private final C68283d f299458d;

    /* renamed from: e */
    private final C68283d f299459e;

    /* renamed from: f */
    private final C68283d f299460f;

    /* renamed from: g */
    private final C68283d f299461g;

    /* renamed from: h */
    private final C68283d f299462h;

    /* renamed from: i */
    private final C68283d f299463i;

    /* renamed from: j */
    private final C68283d f299464j;

    /* renamed from: k */
    private final C68283d f299465k;

    public C107636l(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7, C68283d dVar8, C68283d dVar9, C68283d dVar10) {
        super(aVar2, new C68277d(C107636l.class), aVar);
        this.f299456a = C68236af.m98549d(dVar);
        this.f299457c = C68236af.m98549d(dVar2);
        this.f299458d = C68236af.m98549d(dVar3);
        this.f299459e = C68236af.m98549d(dVar4);
        this.f299460f = C68236af.m98549d(dVar5);
        this.f299461g = C68236af.m98549d(dVar6);
        this.f299462h = C68236af.m98549d(dVar7);
        this.f299463i = C68236af.m98549d(dVar8);
        this.f299464j = C68236af.m98549d(dVar9);
        this.f299465k = C68236af.m98549d(dVar10);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C58833ax axVar2 = (C58833ax) list.get(2);
        C86255j jVar = (C86255j) list.get(3);
        C86232bo boVar = (C86232bo) list.get(4);
        C86387ai aiVar = (C86387ai) list.get(5);
        C85422c cVar = (C85422c) list.get(6);
        C85005h hVar = (C85005h) list.get(7);
        C22871g gVar = (C22871g) list.get(9);
        if (((Boolean) list.get(8)).booleanValue()) {
            jVar.mo79955c(((Query) axVar.mo56109e(query)).f252780s, boVar);
            gVar.mo28212l("Update states to launch OPA", new C107629e(cVar, hVar, query, axVar, gVar));
            obj2 = new C86386ah(C86385ag.f233475a, C118826c.f331423b);
        } else {
            if (axVar2.mo56113h() && (((C51195j) axVar2.mo56107c()).f133266a & 4) != 0) {
                C51194i iVar = ((C51195j) axVar2.mo56107c()).f133270e;
                if (iVar == null) {
                    iVar = C51194i.f133258e;
                }
                if ((2 & iVar.f133260a) != 0) {
                    gVar.mo28212l("Update dialog token for CCL", new C107630f(hVar, axVar2));
                }
            }
            obj2 = aiVar.mo80158a(C60856cj.m92900i(query), C60856cj.m92900i(boVar));
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f299456a.mo60297gq(), this.f299457c.mo60297gq(), this.f299458d.mo60297gq(), this.f299459e.mo60297gq(), this.f299460f.mo60297gq(), this.f299461g.mo60297gq(), this.f299462h.mo60297gq(), this.f299463i.mo60297gq(), this.f299464j.mo60297gq(), this.f299465k.mo60297gq());
    }
}
