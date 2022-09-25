package com.google.android.apps.search.googleapp.search.srp.p10435e;

import android.content.Context;
import com.google.android.apps.gsa.p8867w.p8879i.C118802c;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133691m;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.search.p10404a.C137389j;
import com.google.android.apps.search.googleapp.search.p10405b.C137396a;
import com.google.android.apps.search.googleapp.search.p10411g.C137454c;
import com.google.android.apps.search.googleapp.search.p10418j.C137531e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.android.libraries.search.silk.web.core.C40754h;
import com.google.android.libraries.search.silk.web.core.C40755i;
import com.google.android.libraries.web.profile.p3431a.C44051c;
import com.google.android.libraries.web.profile.p3431a.p3434b.C44041d;
import com.google.android.libraries.web.shared.p3441a.C44077a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.cache.C46401p;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.p4751a.C62949a;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.ao */
/* compiled from: PG */
public final class C137764ao {

    /* renamed from: a */
    public static final C58974d f374755a = C58974d.m91134h("QueryFreeRequestDataDS");

    /* renamed from: b */
    public final boolean f374756b;

    /* renamed from: c */
    public final boolean f374757c;

    /* renamed from: d */
    public final boolean f374758d;

    /* renamed from: e */
    public final boolean f374759e;

    /* renamed from: f */
    public final boolean f374760f;

    /* renamed from: g */
    public final C69585o f374761g;

    /* renamed from: h */
    public final C44051c f374762h;

    /* renamed from: i */
    public final C44041d f374763i;

    /* renamed from: j */
    public final Context f374764j;

    /* renamed from: k */
    public final C137389j f374765k;

    /* renamed from: l */
    public final C137396a f374766l;

    /* renamed from: m */
    public final C137799x f374767m;

    /* renamed from: n */
    public final C133691m f374768n;

    /* renamed from: o */
    public final C136832c f374769o;

    /* renamed from: p */
    public final C137454c f374770p;

    /* renamed from: q */
    public final C137531e f374771q;

    /* renamed from: r */
    public final C32221c f374772r;

    /* renamed from: s */
    public final C40754h f374773s;

    /* renamed from: t */
    public final C46401p f374774t;

    /* renamed from: u */
    public final C137783h f374775u;

    /* renamed from: v */
    public final Duration f374776v;

    /* renamed from: w */
    public final C118802c f374777w;

    /* renamed from: x */
    private final C40755i f374778x;

    /* renamed from: y */
    private final C44077a f374779y;

    /* renamed from: z */
    private final C137749a f374780z;

    public C137764ao(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, C62910ar arVar, C71422aw awVar, C69585o oVar, C44051c cVar, C44041d dVar, Context context, C40755i iVar, C137389j jVar, C46175b bVar, AccountId accountId, C118802c cVar2, C137396a aVar, C137799x xVar, C21370a aVar2, C133691m mVar, C136832c cVar3, C137454c cVar4, C137531e eVar, C32221c cVar5, C44077a aVar3, C137749a aVar4, C60888db dbVar) {
        C69585o oVar2 = oVar;
        C44051c cVar6 = cVar;
        Context context2 = context;
        C40755i iVar2 = iVar;
        C137396a aVar5 = aVar;
        C133691m mVar2 = mVar;
        C136832c cVar7 = cVar3;
        C32221c cVar8 = cVar5;
        C44077a aVar6 = aVar3;
        C137749a aVar7 = aVar4;
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar2, "lightweightContext");
        C69664n.m101061g(cVar6, "cookieManager");
        C69664n.m101061g(context2, "context");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(aVar5, "agsaClassicSearchData");
        C69664n.m101061g(aVar2, "clock");
        C69664n.m101061g(mVar2, "customTabsAvailability");
        C69664n.m101061g(cVar7, "googleUrlAnalyzer");
        C69664n.m101061g(cVar8, "zwiebackCookieProvider");
        C69664n.m101061g(dbVar, "lightweightExecutor");
        this.f374756b = z;
        this.f374757c = z2;
        this.f374758d = z3;
        this.f374759e = z4;
        this.f374760f = z6;
        this.f374761g = oVar2;
        this.f374762h = cVar6;
        this.f374763i = dVar;
        this.f374764j = context2;
        this.f374778x = iVar2;
        this.f374765k = jVar;
        this.f374777w = cVar2;
        this.f374766l = aVar5;
        this.f374767m = xVar;
        this.f374768n = mVar2;
        this.f374769o = cVar7;
        this.f374770p = cVar4;
        this.f374771q = eVar;
        this.f374772r = cVar8;
        this.f374779y = aVar6;
        this.f374780z = aVar7;
        this.f374773s = iVar2.mo42701a(z5);
        C46401p a = aVar6.f114747a.mo50325a("queryFreeRequestDataCache", C137768as.f374783c);
        this.f374774t = a;
        this.f374775u = new C137783h(a, new C137752ac(this, (C69577g) null), aVar7.f374711a, aVar7.f374712b);
        this.f374776v = C62949a.m95468c(arVar);
    }
}
