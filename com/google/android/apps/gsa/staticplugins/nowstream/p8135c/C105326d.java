package com.google.android.apps.gsa.staticplugins.nowstream.p8135c;

import android.content.Context;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.proactive.C84170f;
import com.google.android.apps.gsa.search.core.p6519al.p6552ap.C84718a;
import com.google.android.apps.gsa.search.core.p6519al.p6634ca.C85051a;
import com.google.android.apps.gsa.search.core.p6519al.p6660cn.C85142a;
import com.google.android.apps.gsa.search.core.p6519al.p6729e.C85461a;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.C87379h;
import com.google.android.apps.gsa.shared.p7020bd.C89409b;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.sidekick.main.entry.C91351g;
import com.google.android.apps.gsa.sidekick.main.notifications.C91528bm;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91433o;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7206a.C91402a;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7207b.C91410b;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7210e.C91420a;
import com.google.android.apps.gsa.sidekick.main.p7205h.p7212g.C91425b;
import com.google.android.apps.gsa.sidekick.shared.cards.C91674ac;
import com.google.android.apps.gsa.sidekick.shared.cards.C91675ad;
import com.google.android.apps.gsa.sidekick.shared.cards.C91688c;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91833a;
import com.google.android.apps.gsa.sidekick.shared.overlay.NowStreamConfig;
import com.google.android.apps.gsa.sidekick.shared.p7230a.C91643a;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.p7234d.C91713a;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91727k;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.android.apps.gsa.staticplugins.nowcards.C104256ac;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.libraries.gsa.monet.service.C23050a;
import com.google.android.libraries.gsa.monet.service.C23060k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58885cv;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.d */
/* compiled from: PG */
public final class C105326d {

    /* renamed from: a */
    private final C86124t f293873a;

    /* renamed from: b */
    private final C86106b f293874b;

    /* renamed from: c */
    private final Context f293875c;

    /* renamed from: d */
    private final C91097g f293876d;

    /* renamed from: e */
    private final C91402a f293877e;

    /* renamed from: f */
    private final C91528bm f293878f;

    /* renamed from: g */
    private final C87379h f293879g;

    /* renamed from: h */
    private final C91728l f293880h;

    /* renamed from: i */
    private final C23060k f293881i;

    /* renamed from: j */
    private final C91727k f293882j;

    /* renamed from: k */
    private final C84718a f293883k;

    /* renamed from: l */
    private final C85142a f293884l;

    /* renamed from: m */
    private final C85051a f293885m;

    /* renamed from: n */
    private final C22871g f293886n;

    /* renamed from: o */
    private final C84170f f293887o;

    /* renamed from: p */
    private final C84170f f293888p;

    /* renamed from: q */
    private final C84170f f293889q;

    /* renamed from: r */
    private final C118827a f293890r;

    /* renamed from: s */
    private final C89409b f293891s;

    /* renamed from: t */
    private final C85461a f293892t;

    /* renamed from: u */
    private final C104256ac f293893u;

    public C105326d(C58833ax axVar, Context context, C91097g gVar, C91402a aVar, C91528bm bmVar, C86124t tVar, C86106b bVar, C87379h hVar, C91728l lVar, C84718a aVar2, C85142a aVar3, C85051a aVar4, C22871g gVar2, C23060k kVar, C84170f fVar, C84170f fVar2, C84170f fVar3, C91727k kVar2, C118827a aVar5, C89409b bVar2, C85461a aVar6) {
        this.f293893u = (C104256ac) axVar.mo56107c();
        this.f293873a = tVar;
        this.f293874b = bVar;
        this.f293875c = context;
        this.f293876d = gVar;
        this.f293877e = aVar;
        this.f293878f = bmVar;
        this.f293879g = hVar;
        this.f293880h = lVar;
        this.f293881i = kVar;
        this.f293882j = kVar2;
        this.f293883k = aVar2;
        this.f293884l = aVar3;
        this.f293885m = aVar4;
        this.f293886n = gVar2;
        this.f293887o = fVar;
        this.f293888p = fVar2;
        this.f293889q = fVar3;
        this.f293890r = aVar5;
        this.f293891s = bVar2;
        this.f293892t = aVar6;
    }

    /* renamed from: a */
    public final C23050a mo94724a(NowStreamConfig nowStreamConfig, CardRenderingContext cardRenderingContext, C91713a aVar, C91420a aVar2, C91410b bVar, C105419b bVar2, C91351g gVar, C91647a aVar3, C91833a aVar4, C91643a aVar5, boolean z) {
        C91713a aVar6 = aVar;
        C91647a aVar7 = aVar3;
        C91643a aVar8 = aVar5;
        C91674ac L = C91675ad.m150024L(C58836b.f156633a, this.f293875c);
        C91688c cVar = (C91688c) L;
        cVar.f255718b = new C58885cv(cardRenderingContext);
        if (aVar8 != null) {
            cVar.f255720d = aVar8;
            cVar.f255736t = C58833ax.m90834k(this.f293891s);
            L.mo86108b(aVar7);
            L.mo86111e(true);
            cVar.f255729m = C58833ax.m90834k(bVar2);
            L.mo86110d(z);
            L.mo86114h(nowStreamConfig);
            if (aVar6 != null) {
                cVar.f255733q = aVar6;
                L.mo86113g(this.f293880h);
                L.mo86112f(this.f293882j);
                try {
                    C91433o a = this.f293893u.mo94028a(this.f293875c, L.mo86107a());
                    C86124t tVar = this.f293873a;
                    C86106b bVar3 = this.f293874b;
                    C91425b bVar4 = r0;
                    aVar3.getClass();
                    C91425b bVar5 = new C91425b(aVar7);
                    return a.mo85786a(cardRenderingContext, tVar, bVar3, gVar, aVar2, bVar4, this.f293877e, this.f293878f, this.f293879g, this.f293876d, this.f293883k, this.f293884l, this.f293885m, this.f293886n, this.f293881i, bVar, aVar4, this.f293887o, this.f293888p, this.f293889q, this.f293890r, this.f293892t);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException("Unable to handle reflection errors in Monet", e);
                }
            } else {
                throw new NullPointerException("Null cardRefresher");
            }
        } else {
            throw new NullPointerException("Null actionIntentUtil");
        }
    }
}
