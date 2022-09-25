package com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f;

import com.google.android.apps.gsa.binaries.satin.app.bas;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.elements.interfaces.ControllerModuleLoader;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40067g;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40058w;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40060y;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40304a;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40354g;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3151e.C40506f;
import com.google.android.libraries.search.video.p3191a.C41448g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57790v;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57792x;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57817n;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.f.j */
/* compiled from: PG */
public final class C40541j {

    /* renamed from: a */
    public static final C59071e f106398a = C59071e.m91331h();

    /* renamed from: b */
    public static final List f106399b = C69540x.m100947e("google-sans", "google-sans-medium");

    /* renamed from: c */
    public final C40354g f106400c;

    /* renamed from: d */
    public final C40537f f106401d;

    /* renamed from: e */
    public final C46801dp f106402e;

    /* renamed from: f */
    public final C40506f f106403f;

    /* renamed from: g */
    public final C40060y f106404g;

    /* renamed from: h */
    public final C28423g f106405h;

    /* renamed from: i */
    public C40058w f106406i;

    /* renamed from: j */
    public final C40305b f106407j;

    /* renamed from: k */
    public final C41448g f106408k;

    /* renamed from: l */
    private final C40304a f106409l;

    /* renamed from: com.google.android.libraries.search.rendering.xuikit.f.f.j$a */
    /* compiled from: PG */
    public final class C40542a implements C46792di {

        /* renamed from: a */
        public final C21196h f106410a;

        public C40542a(C21196h hVar) {
            this.f106410a = hVar;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59052c cVar = (C59052c) ((C59052c) C40541j.f106398a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(53351));
            cVar.mo56386p("XBlendFragment received an error from the locally cached input");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C40544l lVar = (C40544l) obj;
            C69664n.m101061g(lVar, "xBlendFragmentRenderingInput");
            C40541j.this.f106400c.f105991a = lVar.f106413a;
            C57784p pVar = lVar.f106414b;
            int i = pVar.f154384a;
            if ((i & 1) != 0) {
                if ((i & 16) != 0) {
                    C40067g k = C40541j.this.f106407j.mo32552k();
                    C57792x xVar = pVar.f154388e;
                    if (xVar == null) {
                        xVar = C57792x.f154404b;
                    }
                    ControllerModuleLoader moduleLoader = k.f105281a.getModuleLoader();
                    if (moduleLoader != null) {
                        for (C57790v vVar : xVar.f154406a) {
                            moduleLoader.loadModule(vVar.f154401a.mo59174N(), new ArrayList(vVar.f154402b));
                        }
                    }
                }
                C57817n nVar = lVar.f106415c;
                C69664n.m101061g(nVar, "xBlendNewVeTreeLoggingMetadata");
                C40058w wVar = C40541j.this.f106406i;
                if (wVar != null) {
                    wVar.mo42158f();
                }
                C40538g b = C40535d.m70260b(C40541j.this.f106401d);
                b.mo42320k(nVar);
                b.mo42319h().ifPresent(new C40540i(C40541j.this, this));
                C40541j.this.f106407j.mo32553l().mo42108a(this.f106410a, pVar);
                return;
            }
            this.f106410a.mo26215b((byte[]) null);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C40541j(AccountId accountId, C40354g gVar, C40537f fVar, C41448g gVar2, C46801dp dpVar, C40304a aVar, C40506f fVar2, C40060y yVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(gVar, "featureAttributionId");
        C69664n.m101061g(gVar2, "videoInitializer");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(yVar, "gilElementsInteractionLoggerFactory");
        this.f106400c = gVar;
        this.f106401d = fVar;
        this.f106408k = gVar2;
        this.f106402e = dpVar;
        this.f106409l = aVar;
        this.f106403f = fVar2;
        this.f106404g = yVar;
        this.f106405h = C45954d.m82060a(accountId);
        C40538g b = C40535d.m70260b(fVar);
        C57695ab f = b.mo42317f();
        f.getClass();
        ((bas) aVar).f204909c = f;
        b.mo42318g().ifPresent(new C40543k(aVar));
        this.f106407j = aVar.mo32542a();
    }
}
