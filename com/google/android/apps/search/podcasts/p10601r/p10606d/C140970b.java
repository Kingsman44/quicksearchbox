package com.google.android.apps.search.podcasts.p10601r.p10606d;

import com.google.android.apps.search.podcasts.p10576l.C140444af;
import com.google.android.apps.search.podcasts.p10576l.C140445ag;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.common.util.concurrent.C60870cx;
import p5462h.C69677g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.r.d.b */
/* compiled from: PG */
public final class C140970b extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140975g f382743a;

    /* renamed from: b */
    final /* synthetic */ C140971c f382744b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140970b(C140975g gVar, C140971c cVar) {
        super(1);
        this.f382743a = gVar;
        this.f382744b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C60870cx cxVar;
        C140445ag agVar = ((C140450al) obj).f381527m;
        if (agVar == null) {
            agVar = C140445ag.f381495f;
        }
        C69664n.m101060f(agVar, "preferences.playStorePromotionPreference");
        int i = agVar.f381497a;
        C140969a aVar = this.f382743a.f382759a;
        C140969a aVar2 = C140969a.DISMISS_PLAY_STORE_CARD;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            C140459au auVar = this.f382744b.f382746b;
            C140444af afVar = (C140444af) agVar.toBuilder();
            long b = this.f382744b.f382747c.mo26870b();
            afVar.copyOnWrite();
            ((C140445ag) afVar.instance).f381501e = b;
            afVar.copyOnWrite();
            ((C140445ag) afVar.instance).f381497a = i + 1;
            cxVar = auVar.mo115686k((C140445ag) afVar.build());
        } else if (ordinal == 1) {
            C140459au auVar2 = this.f382744b.f382746b;
            C140444af afVar2 = (C140444af) agVar.toBuilder();
            long b2 = this.f382744b.f382747c.mo26870b();
            afVar2.copyOnWrite();
            ((C140445ag) afVar2.instance).f381499c = b2;
            afVar2.copyOnWrite();
            ((C140445ag) afVar2.instance).f381497a = i + 1;
            cxVar = auVar2.mo115686k((C140445ag) afVar2.build());
        } else if (ordinal == 2) {
            C140459au auVar3 = this.f382744b.f382746b;
            C140444af afVar3 = (C140444af) agVar.toBuilder();
            long b3 = this.f382744b.f382747c.mo26870b();
            afVar3.copyOnWrite();
            ((C140445ag) afVar3.instance).f381500d = b3;
            afVar3.copyOnWrite();
            ((C140445ag) afVar3.instance).f381497a = i + 1;
            cxVar = auVar3.mo115686k((C140445ag) afVar3.build());
        } else {
            throw new C69677g();
        }
        C69664n.m101060f(cxVar, "when (event.action) {\n  …ild()\n          )\n      }");
        return cxVar;
    }
}
