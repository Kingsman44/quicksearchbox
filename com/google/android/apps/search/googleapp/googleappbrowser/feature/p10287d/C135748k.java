package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10287d;

import android.support.p031v4.app.C0167am;
import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135531ae;
import com.google.android.apps.search.googleapp.googleappbrowser.p10262c.C135538al;
import com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10265a.C135572a;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.p10538b.C139866a;
import com.google.android.apps.search.googleapp.silkpane.p10485a.C139272a;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139279a;
import com.google.android.apps.search.googleapp.silkpane.p10486b.C139280b;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.C139787a;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.p10530a.C139789b;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.d.k */
/* compiled from: PG */
public final class C135748k {

    /* renamed from: a */
    public static final C59071e f369742a = C59071e.m91331h();

    /* renamed from: b */
    public final AccountId f369743b;

    /* renamed from: c */
    public final C135739b f369744c;

    /* renamed from: d */
    public final C135741d f369745d;

    /* renamed from: e */
    public final C135531ae f369746e;

    /* renamed from: f */
    public final C135538al f369747f;

    /* renamed from: g */
    public final C135755p f369748g;

    /* renamed from: h */
    public final C71422aw f369749h;

    /* renamed from: i */
    public final C28443m f369750i;

    /* renamed from: j */
    public final C47770dh f369751j;

    /* renamed from: k */
    public final C139866a f369752k;

    /* renamed from: l */
    public final C139272a f369753l;

    /* renamed from: m */
    public final C28306ab f369754m;

    /* renamed from: n */
    public final C28310af f369755n;

    /* renamed from: o */
    public final C46439e f369756o;

    /* renamed from: p */
    public final C135572a f369757p;

    /* renamed from: q */
    public final C139787a f369758q;

    /* renamed from: r */
    public final C139789b f369759r;

    /* renamed from: s */
    public final C46440f f369760s = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) C135748k.f369742a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(40609));
            cVar.mo56386p("Failed set default values for GAB settings.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C135748k.this.f369752k.mo115320a(C139873i.BROWSER_PAGE_LINK, true);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: t */
    public final C46440f f369761t = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) C135748k.f369742a.mo56225c()).mo56382g(th);
            cVar.mo56379ah(new C59094n(40608));
            cVar.mo56386p("Failed refresh GAIA cookies .");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
            C0167am activity = C135748k.this.f369745d.getActivity();
            C69664n.m101058d(activity);
            C139272a aVar = C135748k.this.f369753l;
            C139279a aVar2 = (C139279a) C139280b.f378830g.createBuilder();
            aVar2.copyOnWrite();
            C139280b bVar = (C139280b) aVar2.instance;
            bVar.f378832a |= 1;
            bVar.f378833b = "https://support.google.com/websearch/?p=aga_browsing";
            aVar2.copyOnWrite();
            C139280b bVar2 = (C139280b) aVar2.instance;
            bVar2.f378832a |= 2;
            bVar2.f378834c = true;
            aVar2.copyOnWrite();
            C139280b bVar3 = (C139280b) aVar2.instance;
            bVar3.f378832a |= 8;
            bVar3.f378836e = true;
            C47810es.m84979s(activity, aVar.mo114864a((C139280b) aVar2.build(), C135748k.this.f369743b));
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    public C135748k(AccountId accountId, C135739b bVar, C135741d dVar, C135531ae aeVar, C135538al alVar, C135755p pVar, C71422aw awVar, C28443m mVar, C47770dh dhVar, C139866a aVar, C139272a aVar2, C28306ab abVar, C28310af afVar, C46439e eVar, C135572a aVar3, C139787a aVar4, C139789b bVar2) {
        C135739b bVar3 = bVar;
        C135531ae aeVar2 = aeVar;
        C135755p pVar2 = pVar;
        C71422aw awVar2 = awVar;
        C28443m mVar2 = mVar;
        C47770dh dhVar2 = dhVar;
        C28306ab abVar2 = abVar;
        C28310af afVar2 = afVar;
        C46439e eVar2 = eVar;
        C135572a aVar5 = aVar3;
        C139787a aVar6 = aVar4;
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar3, "dataServiceWrapper");
        C69664n.m101061g(aeVar2, "firstRunDataService");
        C69664n.m101061g(pVar2, "cookieRefresher");
        C69664n.m101061g(awVar2, "lightweightScope");
        C69664n.m101061g(mVar2, "interactionLogger");
        C69664n.m101061g(dhVar2, "traceCreation");
        C69664n.m101061g(abVar2, "viewVisualElements");
        C69664n.m101061g(afVar2, "visualElements");
        C69664n.m101061g(eVar2, "futuresMixin");
        C69664n.m101061g(aVar5, "gabLegacyAppFlowLogger");
        C69664n.m101061g(aVar6, "urlHandlerPageLogger");
        this.f369743b = accountId;
        this.f369744c = bVar3;
        this.f369745d = dVar;
        this.f369746e = aeVar2;
        this.f369747f = alVar;
        this.f369748g = pVar2;
        this.f369749h = awVar2;
        this.f369750i = mVar2;
        this.f369751j = dhVar2;
        this.f369752k = aVar;
        this.f369753l = aVar2;
        this.f369754m = abVar2;
        this.f369755n = afVar2;
        this.f369756o = eVar2;
        this.f369757p = aVar5;
        this.f369758q = aVar6;
        this.f369759r = bVar2;
    }
}
