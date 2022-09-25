package com.google.android.apps.search.googleapp.homescreen;

import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.C134744f;
import com.google.android.apps.search.googleapp.homescreen.searchbox.C136198a;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139701a;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139764e;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139769j;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.C137399c;
import com.google.android.apps.search.googleapp.search.C137404d;
import com.google.android.apps.search.googleapp.search.C137411e;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.p */
/* compiled from: PG */
final class C136194p implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C136193o f370932a;

    public C136194p(C136193o oVar) {
        this.f370932a = oVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C136193o oVar = this.f370932a;
        C69664n.m101061g((C136198a) bVar, "searchboxClickEvent");
        C139701a aVar = oVar.f370921p;
        aVar.mo115171b();
        aVar.f379694a.mo19974a(C37182a.f97874c);
        aVar.f379697d.mo41723l("TNG");
        aVar.f379695b = true;
        oVar.f370915j.mo111645f(106);
        C134744f a = oVar.mo112824a();
        if (a != null) {
            a.mo111956j(C134720e.SEARCH_BOX_TAPPED);
        }
        if (oVar.f370917l.mo113716a()) {
            C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
            C69664n.m101060f(fVar, "newBuilder()");
            C139764e a2 = C69664n.m101061g(fVar, "builder");
            a2.mo115227c(C139779t.SEARCH);
            a2.mo115228d();
            C139769j jVar = (C139769j) C139770k.f379882c.createBuilder();
            C69664n.m101060f(jVar, "newBuilder()");
            C69664n.m101061g(jVar, "builder");
            C137404d dVar = (C137404d) C137411e.f373755g.createBuilder();
            C69664n.m101060f(dVar, "newBuilder()");
            C137399c a3 = C69664n.m101061g(dVar, "builder");
            a3.mo113704b(C139704d.HOME_SCREEN);
            C137411e a4 = a3.mo113703a();
            C69664n.m101061g(a4, "value");
            jVar.copyOnWrite();
            C139770k kVar = (C139770k) jVar.instance;
            a4.getClass();
            kVar.f379885b = a4;
            kVar.f379884a = 2;
            C62942bv build = jVar.build();
            C69664n.m101060f(build, "_builder.build()");
            a2.mo115226b((C139770k) build);
            return C47392e.m84229a(new C139760a(a2.mo115225a()));
        } else if (oVar.f370903P) {
            return C47392e.f123116b;
        } else {
            oVar.f370903P = true;
            C46439e eVar = oVar.f370916k;
            C47633f a5 = oVar.f370909d.a.a(3);
            eVar.mo50428h(C46438d.m82809a(a5).f121541a, (Object) null, oVar.f370900M);
            return C47392e.f123115a;
        }
    }
}
