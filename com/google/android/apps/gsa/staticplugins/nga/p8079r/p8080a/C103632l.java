package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.p6294a.C80498f;
import com.google.android.apps.gsa.nga.shared.p6335c.C81018a;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.CloudFulfillmentData;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c.C103551m;
import com.google.assistant.p3897e.p3910e.p3911a.C51188c;
import com.google.assistant.p3897e.p3910e.p3911a.C51189d;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.l */
/* compiled from: PG */
public final /* synthetic */ class C103632l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ CloudFulfillmentData f288677a;

    /* renamed from: b */
    public final /* synthetic */ C69464a f288678b;

    /* renamed from: c */
    public final /* synthetic */ C69464a f288679c;

    /* renamed from: d */
    public final /* synthetic */ Query f288680d;

    /* renamed from: e */
    public final /* synthetic */ C69464a f288681e;

    /* renamed from: f */
    public final /* synthetic */ C69464a f288682f;

    /* renamed from: g */
    public final /* synthetic */ C58833ax f288683g;

    /* renamed from: h */
    public final /* synthetic */ C103551m f288684h;

    /* renamed from: i */
    public final /* synthetic */ C81252aq f288685i;

    /* renamed from: j */
    public final /* synthetic */ C86054o f288686j;

    public /* synthetic */ C103632l(CloudFulfillmentData cloudFulfillmentData, C69464a aVar, C69464a aVar2, Query query, C69464a aVar3, C69464a aVar4, C58833ax axVar, C103551m mVar, C81252aq aqVar, C86054o oVar) {
        this.f288677a = cloudFulfillmentData;
        this.f288678b = aVar;
        this.f288679c = aVar2;
        this.f288680d = query;
        this.f288681e = aVar3;
        this.f288682f = aVar4;
        this.f288683g = axVar;
        this.f288684h = mVar;
        this.f288685i = aqVar;
        this.f288686j = oVar;
    }

    public final Object apply(Object obj) {
        CloudFulfillmentData cloudFulfillmentData = this.f288677a;
        C69464a aVar = this.f288678b;
        C69464a aVar2 = this.f288679c;
        Query query = this.f288680d;
        C69464a aVar3 = this.f288681e;
        C69464a aVar4 = this.f288682f;
        C58833ax axVar = this.f288683g;
        C103551m mVar = this.f288684h;
        C81252aq aqVar = this.f288685i;
        C86054o oVar = this.f288686j;
        C51189d dVar = (C51189d) obj;
        C52081en enVar = dVar.f133255g;
        if (enVar == null) {
            enVar = C52081en.f136679i;
        }
        C52091ex exVar = enVar.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        C52090ew ewVar = (C52090ew) exVar.toBuilder();
        C80498f fVar = cloudFulfillmentData.f222917c;
        String str = fVar.f220978c;
        String str2 = fVar.f220979d;
        C81018a.f222073l.mo74803c(ewVar, C103629i.f288674a);
        C81018a.f222062a.mo74803c(ewVar, new C103634n(str, str2));
        C81018a.f222063b.mo74803c(ewVar, new C103635o(aVar, aVar2));
        C81018a.f222064c.mo74803c(ewVar, new C103636p(query));
        C81018a.f222064c.mo74803c(ewVar, new C103637q(aVar3));
        C81018a.f222064c.mo74803c(ewVar, new C103638r(query));
        C81018a.f222064c.mo74803c(ewVar, new C103639s(query));
        if (((C90021c) aVar3.mo17428b()).mo79746e(C90014bt.f247444hK) && ((C74713bn) aVar4.mo17428b()).mo71078c()) {
            C81018a.f222063b.mo74803c(ewVar, new C103640t(aVar3));
            C81018a.f222064c.mo74803c(ewVar, new C103641u(axVar, aVar3, mVar, aVar4));
            C81018a.f222067f.mo74803c(ewVar, C103630j.f288675a);
            C81018a.f222072k.mo74803c(ewVar, new C103633m(aqVar, oVar));
        }
        C52081en enVar2 = dVar.f133255g;
        if (enVar2 == null) {
            enVar2 = C52081en.f136679i;
        }
        C52079el elVar = (C52079el) enVar2.toBuilder();
        C51188c cVar = (C51188c) dVar.toBuilder();
        elVar.copyOnWrite();
        C52081en enVar3 = (C52081en) elVar.instance;
        C52091ex exVar2 = (C52091ex) ewVar.build();
        exVar2.getClass();
        enVar3.f136685e = exVar2;
        enVar3.f136681a |= 16;
        cVar.copyOnWrite();
        C51189d dVar2 = (C51189d) cVar.instance;
        C52081en enVar4 = (C52081en) elVar.build();
        enVar4.getClass();
        dVar2.f133255g = enVar4;
        dVar2.f133249a |= 64;
        return (C51189d) cVar.build();
    }
}
