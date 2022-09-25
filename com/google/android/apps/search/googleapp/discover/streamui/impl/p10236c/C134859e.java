package com.google.android.apps.search.googleapp.discover.streamui.impl.p10236c;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.googleapp.discover.p10201m.C134470a;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137087ap;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57139aw;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57151h;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4880aq.C63733av;
import com.google.protos.p4880aq.C63745bg;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63933bt;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.c.e */
/* compiled from: PG */
public final class C134859e implements C134470a {

    /* renamed from: a */
    public static final C59071e f367125a = C59071e.m91331h();

    /* renamed from: b */
    public final Fragment f367126b;

    /* renamed from: c */
    public final Map f367127c = new LinkedHashMap();

    /* renamed from: d */
    public final Map f367128d = new LinkedHashMap();

    /* renamed from: e */
    public List f367129e;

    /* renamed from: f */
    private final C137087ap f367130f;

    /* renamed from: g */
    private final C136969bx f367131g;

    /* renamed from: h */
    private final C46801dp f367132h;

    /* renamed from: i */
    private boolean f367133i;

    /* renamed from: j */
    private boolean f367134j;

    /* renamed from: k */
    private boolean f367135k;

    public C134859e(C137087ap apVar, C136969bx bxVar, C46801dp dpVar, Fragment fragment) {
        C69664n.m101061g(bxVar, "promoManagerDataService");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(fragment, "fragment");
        this.f367130f = apVar;
        this.f367131g = bxVar;
        this.f367132h = dpVar;
        this.f367126b = fragment;
    }

    /* renamed from: k */
    public static final int m218685k(C137007dh dhVar) {
        C63959w wVar;
        Object obj;
        C63745bg bgVar;
        int i = dhVar.f372872b;
        if (i == 1) {
            C63733av avVar = (C63733av) dhVar.f372873c;
            if (avVar.f172310a == 6) {
                bgVar = (C63745bg) avVar.f172311b;
            } else {
                bgVar = C63745bg.f172450e;
            }
            if (bgVar.f172452a == 5) {
                return ((Integer) bgVar.f172453b).intValue();
            }
            return 0;
        }
        if (i == 2) {
            wVar = (C63959w) dhVar.f372873c;
        } else {
            wVar = C63959w.f172981b;
        }
        C62940bt r0 = C62942bv.checkIsLite(C63933bt.f172893e);
        wVar.mo58887l(r0);
        Object l = wVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        return ((C63933bt) obj).f172895a;
    }

    /* renamed from: l */
    public static final int m218686l(View view, View view2) {
        return Math.abs(m218687m(view2) - m218687m(view));
    }

    /* renamed from: m */
    private static final int m218687m(View view) {
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return iArr[1] + (view.getHeight() / 2);
    }

    /* renamed from: a */
    public final void mo111791a(C57151h hVar, View view, C57139aw awVar) {
        C69664n.m101061g(hVar, "agsaTooltipIdentifier");
        C69664n.m101061g(awVar, "triggerBehavior");
        if (awVar == C57139aw.UNSPECIFIED) {
            C59052c cVar = (C59052c) f367125a.mo56225c();
            cVar.mo56379ah(new C59094n(40525));
            cVar.mo56386p("Tooltip Manager cannot track views with TriggerBehavior.UNSPECIFIED.");
            return;
        }
        ((Set) Map.EL.computeIfAbsent(this.f367127c, Integer.valueOf(hVar.f152576a), C134856b.f367122a)).add(view);
        if (awVar == C57139aw.ON_FEED_OPEN_OR_SCROLL_END) {
            ((Set) Map.EL.computeIfAbsent(this.f367128d, Integer.valueOf(hVar.f152576a), C134857c.f367123a)).add(view);
            mo112035i();
        }
    }

    /* renamed from: b */
    public final void mo111792b() {
        this.f367127c.clear();
        this.f367128d.clear();
    }

    /* renamed from: c */
    public final void mo111793c() {
        this.f367135k = false;
    }

    /* renamed from: d */
    public final void mo111794d() {
        this.f367133i = false;
        mo112035i();
    }

    /* renamed from: e */
    public final void mo111795e() {
        this.f367133i = true;
        this.f367134j = true;
    }

    /* renamed from: f */
    public final void mo111796f() {
        this.f367135k = true;
        this.f367134j = false;
        mo112035i();
    }

    /* renamed from: g */
    public final void mo111797g(C57151h hVar, View view) {
        C69664n.m101061g(hVar, "agsaTooltipIdentifier");
        Set set = (Set) this.f367127c.get(Integer.valueOf(hVar.f152576a));
        if (set != null) {
            set.remove(view);
        }
        Set set2 = (Set) this.f367128d.get(Integer.valueOf(hVar.f152576a));
        if (set2 != null) {
            set2.remove(view);
        }
    }

    /* renamed from: h */
    public final void mo111798h() {
        this.f367132h.mo50707a(this.f367131g.mo113448e(), new C46792di() {
            /* renamed from: a */
            public final void mo18077a(Throwable th) {
                C69664n.m101061g(th, C42181t.f110467a);
                C59052c cVar = (C59052c) ((C59052c) C134859e.f367125a.mo56225c()).mo56382g(th);
                cVar.mo56379ah(new C59094n(40523));
                cVar.mo56386p("Error while subscribing to EligibleDiscoverTooltips DataSource from Discover");
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
                List list = (List) obj;
                C69664n.m101061g(list, "tooltips");
                C134859e eVar = C134859e.this;
                eVar.f367129e = list;
                eVar.mo112035i();
            }

            /* renamed from: c */
            public final /* synthetic */ void mo18079c() {
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = p5462h.p5482l.C69734n.m101144l((r0 = p5462h.p5463a.C69540x.m100847ac(r0)), new com.google.android.apps.search.googleapp.discover.streamui.impl.p10236c.C134858d(r5));
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112035i() {
        /*
            r5 = this;
            java.util.List r0 = r5.f367129e
            r1 = 0
            if (r0 == 0) goto L_0x001d
            h.l.k r0 = p5462h.p5463a.C69540x.m100847ac(r0)
            if (r0 == 0) goto L_0x001d
            com.google.android.apps.search.googleapp.discover.streamui.impl.c.d r2 = new com.google.android.apps.search.googleapp.discover.streamui.impl.c.d
            r2.<init>(r5)
            h.l.k r0 = p5462h.p5482l.C69734n.m101144l(r0, r2)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = p5462h.p5482l.C69734n.m101137e(r0)
            com.google.android.apps.search.googleapp.discover.streamui.impl.c.a r0 = (com.google.android.apps.search.googleapp.discover.streamui.impl.p10236c.C134855a) r0
            goto L_0x001e
        L_0x001d:
            r0 = r1
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            com.google.android.apps.search.googleapp.promomanager.b.dh r2 = r0.f367120a
            int r2 = m218685k(r2)
            android.view.View r3 = r0.f367121b
            com.google.android.apps.search.googleapp.promomanager.b.dh r0 = r0.f367120a
            com.google.android.apps.search.googleapp.promomanager.f.ap r4 = r5.f367130f
            r4.mo113504b(r2, r3, r0)
            r5.f367129e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.impl.p10236c.C134859e.mo112035i():void");
    }

    /* renamed from: j */
    public final int mo112036j() {
        if (this.f367133i || !this.f367135k) {
            return 1;
        }
        return this.f367134j ? 3 : 2;
    }
}
