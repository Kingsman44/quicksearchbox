package com.google.android.apps.search.googleapp.search.srp.external;

import android.net.Uri;
import android.util.Base64;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.p10412h.p10413a.C137462b;
import com.google.android.apps.search.googleapp.search.p10412h.p10413a.C137468h;
import com.google.android.apps.search.googleapp.search.p10420k.C137543b;
import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.apps.search.googleapp.search.srp.p10431a.C137696d;
import com.google.android.apps.search.googleapp.search.srp.p10432b.C137732f;
import com.google.android.apps.search.googleapp.urlhandler.C139786b;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.apps.search.googleapp.urlhandler.p10528a.C139782b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.coordinator.C43737c;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.shared.p3441a.C44077a;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.base.C58851bo;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60761r;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62912at;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5462h.C69685i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.external.h */
/* compiled from: PG */
public final class C137835h {

    /* renamed from: a */
    public final C21370a f374995a;

    /* renamed from: b */
    public final C137732f f374996b;

    /* renamed from: c */
    public final C59071e f374997c = C59071e.m91331h();

    /* renamed from: d */
    public final C46401p f374998d;

    /* renamed from: e */
    private final C44077a f374999e;

    /* renamed from: f */
    private final C44077a f375000f;

    /* renamed from: g */
    private final C136832c f375001g;

    /* renamed from: h */
    private final AtomicReference f375002h;

    /* renamed from: i */
    private final C43269t f375003i;

    /* renamed from: j */
    private final C139795f f375004j;

    /* renamed from: k */
    private final C137468h f375005k;

    /* renamed from: l */
    private final C139782b f375006l;

    /* renamed from: m */
    private final C139786b f375007m;

    /* renamed from: n */
    private final C137696d f375008n;

    /* renamed from: o */
    private final Executor f375009o;

    /* renamed from: p */
    private final C71422aw f375010p;

    /* renamed from: q */
    private final C43737c f375011q;

    /* renamed from: r */
    private final boolean f375012r;

    /* renamed from: s */
    private final C46401p f375013s;

    /* renamed from: t */
    private final C43737c f375014t;

    public C137835h(C44077a aVar, C44077a aVar2, C21370a aVar3, C136832c cVar, AtomicReference atomicReference, C43269t tVar, C139795f fVar, C137468h hVar, C139782b bVar, C137732f fVar2, C139786b bVar2, C137696d dVar, Executor executor, C71422aw awVar, C43737c cVar2, boolean z) {
        C44077a aVar4 = aVar2;
        AtomicReference atomicReference2 = atomicReference;
        C43269t tVar2 = tVar;
        C137696d dVar2 = dVar;
        Executor executor2 = executor;
        C71422aw awVar2 = awVar;
        C43737c cVar3 = cVar2;
        C69664n.m101061g(aVar3, "clock");
        C69664n.m101061g(cVar, "googleUrlAnalyzer");
        C69664n.m101061g(atomicReference2, "persistenceId");
        C69664n.m101061g(tVar2, "webCoordinatorInfo");
        C69664n.m101061g(dVar2, "adShieldClientHelper");
        C69664n.m101061g(executor2, "lightweightExecutor");
        C69664n.m101061g(awVar2, "lightweightScope");
        this.f374999e = aVar;
        this.f375000f = aVar4;
        this.f374995a = aVar3;
        this.f375001g = cVar;
        this.f375002h = atomicReference2;
        this.f375003i = tVar2;
        this.f375004j = fVar;
        this.f375005k = hVar;
        this.f375006l = bVar;
        this.f374996b = fVar2;
        this.f375007m = bVar2;
        this.f375008n = dVar2;
        this.f375009o = executor2;
        this.f375010p = awVar2;
        this.f375011q = cVar3;
        this.f375012r = z;
        this.f374998d = C137830c.m224073a(aVar);
        this.f375013s = aVar4.f114747a.mo50325a("search_query_name", C137542d.f374085g);
        this.f375014t = cVar3;
    }

    /* renamed from: a */
    public final void mo113990a(Uri uri, C139851q qVar, boolean z, boolean z2) {
        C137542d dVar;
        C69685i iVar;
        Instant ofEpochMilli = Instant.ofEpochMilli(this.f374995a.mo26870b());
        C46401p pVar = this.f374998d;
        C69664n.m101060f(ofEpochMilli, C42181t.f110467a);
        C69664n.m101061g(ofEpochMilli, "instant");
        C62912at atVar = C62912at.f169862a;
        C137828a aVar = (C137828a) C137829b.f374984d.createBuilder();
        aVar.copyOnWrite();
        C137829b bVar = (C137829b) aVar.instance;
        boolean z3 = true;
        bVar.f374986a |= 1;
        bVar.f374987b = true;
        C63042fg b = C62949a.m95467b(ofEpochMilli);
        aVar.copyOnWrite();
        C137829b bVar2 = (C137829b) aVar.instance;
        b.getClass();
        bVar2.f374988c = b;
        bVar2.f374986a |= 2;
        pVar.mo50381d(atVar, aVar.build());
        C139798i iVar2 = (C139798i) C139823j.f380066m.createBuilder();
        iVar2.copyOnWrite();
        C139823j jVar = (C139823j) iVar2.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        iVar2.copyOnWrite();
        C139823j jVar2 = (C139823j) iVar2.instance;
        jVar2.f380068a |= 512;
        jVar2.f380078k = !z2;
        iVar2.copyOnWrite();
        C139823j jVar3 = (C139823j) iVar2.instance;
        jVar3.f380068a |= 1024;
        jVar3.f380079l = true;
        if (this.f375012r) {
            dVar = ((C137543b) this.f375014t.mo5768a()).mo113804a();
        } else {
            C46370ah a = this.f375013s.mo50378a(C62912at.f169862a);
            dVar = a != null ? (C137542d) a.f121384a : null;
            if (dVar == null) {
                dVar = C137542d.f374085g;
                C69664n.m101060f(dVar, "getDefaultInstance()");
            }
        }
        C137418g gVar = dVar.f374092f;
        if (gVar == null) {
            gVar = C137418g.f373767r;
        }
        String str = gVar.f373770b;
        C69664n.m101060f(str, "currentSearchQuery.queryOptions.query");
        if (str.length() != 0) {
            iVar2.copyOnWrite();
            C139823j jVar4 = (C139823j) iVar2.instance;
            str.getClass();
            jVar4.f380068a |= 64;
            jVar4.f380075h = str;
        }
        String str2 = (String) this.f375002h.get();
        if (str2 != null) {
            iVar2.copyOnWrite();
            C139823j jVar5 = (C139823j) iVar2.instance;
            jVar5.f380068a |= 8;
            jVar5.f380072e = str2;
        }
        if (z) {
            C136832c cVar = this.f375001g;
            int i = C136832c.f372447a;
            String uri2 = cVar.mo113405k().build().toString();
            iVar2.copyOnWrite();
            C139823j jVar6 = (C139823j) iVar2.instance;
            uri2.getClass();
            jVar6.f380068a |= 256;
            jVar6.f380077j = uri2;
        }
        C69664n.m101060f(iVar2, "newBuilder().apply {\n   …tring()\n        }\n      }");
        if (z2) {
            this.f375004j.mo115250a(uri, (C139823j) iVar2.build());
            return;
        }
        Uri a2 = this.f375001g.mo113395a(uri);
        Uri uri3 = a2 == null ? uri : a2;
        if (this.f375001g.mo113402h(uri3)) {
            this.f375006l.mo115233a(uri3);
            this.f375007m.mo115236a(uri3).ifPresent(new C137832e(iVar2));
            C137468h hVar = this.f375005k;
            Profile d = this.f375003i.mo46386d();
            C69664n.m101061g(uri3, "originalUri");
            C69664n.m101061g(d, "profile");
            if (hVar.f373897e.mo113402h(uri3)) {
                C60870cx a3 = C71663i.m104688a(C71803m.m105042c(hVar.f373900h, (C69585o) null, (C71424ay) null, new C137462b(hVar, uri3, d, (C69577g) null), 3));
                C60856cj.m92911t(a3, C47810es.m84974n(new C137833f(this)), this.f375009o);
                this.f375004j.mo115251b(a3, (C139823j) iVar2.build());
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        if (a2 != null) {
            Optional a4 = this.f375007m.mo115236a(uri);
            if (a4.isPresent()) {
                iVar = new C69685i(uri, a4.get());
            } else {
                long nextLong = C58851bo.f156649a.nextLong();
                C58838bb.m90869d(this.f375007m.mo115237b(uri), "Expected a first-party URL");
                if (uri.getQueryParameter("agsac") != null) {
                    z3 = false;
                }
                C58838bb.m90869d(z3, "The URL already has a click id");
                iVar = new C69685i(uri.buildUpon().appendQueryParameter("agsac", Base64.encodeToString(C60761r.m92760f(nextLong), 11)).build(), Long.valueOf(nextLong));
            }
            Long l = (Long) iVar.f186053b;
            C69664n.m101060f(l, "clickId");
            long longValue = l.longValue();
            iVar2.copyOnWrite();
            C139823j jVar7 = (C139823j) iVar2.instance;
            jVar7.f380068a |= 4;
            jVar7.f380071d = longValue;
            C71803m.m105043d(this.f375010p, (C69585o) null, (C71424ay) null, new C137834g(this, (Uri) iVar.f186052a, (C69577g) null), 3);
        }
        this.f375004j.mo115251b(this.f375008n.mo113910a(uri3), (C139823j) iVar2.build());
    }
}
