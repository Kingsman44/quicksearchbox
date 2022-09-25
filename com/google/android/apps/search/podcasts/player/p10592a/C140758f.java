package com.google.android.apps.search.podcasts.player.p10592a;

import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.C140660ai;
import com.google.android.apps.search.podcasts.p10588n.C140665an;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140649a;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140650b;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140651c;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.player.a.f */
/* compiled from: PG */
final class C140758f extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140787e f382220a;

    /* renamed from: b */
    final /* synthetic */ C140770r f382221b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140758f(C140787e eVar, C140770r rVar) {
        super(1);
        this.f382220a = eVar;
        this.f382221b = rVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C60870cx cxVar;
        C140660ai aiVar = (C140660ai) obj;
        C69664n.m101061g(aiVar, "queueData");
        C140641b bVar = (C140641b) C69540x.m100821C(aiVar.f382036a);
        if (bVar != null || this.f382220a.f382286g == C140509u.AUTOPLAY_DEFAULT) {
            return C60856cj.m92900i(new C140753a(bVar, C140509u.AUTOPLAY_DEFAULT));
        }
        C140787e eVar = this.f382220a;
        if (eVar.f382286g == C140509u.AUTOPLAY_SHOW) {
            C140665an anVar = this.f382221b.f382250e;
            C140646b bVar2 = eVar.f382282c.f381974a;
            if (bVar2 == null) {
                bVar2 = C140646b.f381993r;
            }
            String str = bVar2.f381995a;
            C69664n.m101060f(str, "playerInfo.episode.show.feedUrl");
            C140650b bVar3 = (C140650b) C140651c.f382022c.createBuilder();
            C140649a aVar = C140649a.PUBLICATION_DATE_ASC;
            bVar3.copyOnWrite();
            ((C140651c) bVar3.instance).f382024a = aVar.getNumber();
            C62942bv build = bVar3.build();
            C69664n.m101060f(build, "newBuilder().setSortOrde…ICATION_DATE_ASC).build()");
            cxVar = anVar.mo115818a(str, (C140651c) build);
        } else {
            cxVar = this.f382221b.f382251f.mo115814a();
        }
        return C140989k.m228944b(cxVar, new C140757e(this.f382220a));
    }
}
