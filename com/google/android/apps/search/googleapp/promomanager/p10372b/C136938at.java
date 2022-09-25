package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.android.apps.search.googleapp.promomanager.p10374c.C137041j;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4880aq.C63715ad;
import com.google.protos.p4880aq.C63718ag;
import com.google.protos.p4880aq.C63733av;
import com.google.protos.p4880aq.C63734aw;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63908av;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.at */
/* compiled from: PG */
public final /* synthetic */ class C136938at implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C136958bm f372690a;

    /* renamed from: b */
    public final /* synthetic */ C137009dj f372691b;

    /* renamed from: c */
    public final /* synthetic */ C63734aw f372692c;

    /* renamed from: d */
    public final /* synthetic */ int f372693d;

    public /* synthetic */ C136938at(C136958bm bmVar, C137009dj djVar, C63734aw awVar, int i) {
        this.f372690a = bmVar;
        this.f372691b = djVar;
        this.f372692c = awVar;
        this.f372693d = i;
    }

    public final C60870cx apply(Object obj) {
        C136958bm bmVar = this.f372690a;
        C137009dj djVar = this.f372691b;
        C63734aw awVar = this.f372692c;
        int i = this.f372693d;
        C137041j jVar = (C137041j) obj;
        bmVar.mo113454k(C37182a.f97890cP.mo40779c());
        if (jVar.f372942b.contains(Integer.valueOf(i))) {
            bmVar.mo113465v(C37182a.f98112gZ.mo40806d(), i, jVar);
            return C60856cj.m92900i(C137007dh.f372869h);
        }
        C63718ag agVar = awVar.f172317c;
        if (agVar == null) {
            agVar = C63718ag.f172268k;
        }
        C136931am amVar = bmVar.f372754n;
        C63715ad adVar = agVar.f172271b;
        if (adVar == null) {
            adVar = C63715ad.f172262c;
        }
        C60870cx b = amVar.mo113440b(adVar, djVar);
        C137005df dfVar = (C137005df) C137007dh.f372869h.createBuilder();
        C63733av avVar = awVar.f172319f;
        if (avVar == null) {
            avVar = C63733av.f172308c;
        }
        dfVar.copyOnWrite();
        C137007dh dhVar = (C137007dh) dfVar.instance;
        avVar.getClass();
        dhVar.f372873c = avVar;
        dhVar.f372872b = 1;
        C63926bm a = C63926bm.m96318a(djVar.f372882b);
        if (a == null) {
            a = C63926bm.UNSPECIFIED;
        }
        dfVar.copyOnWrite();
        C137007dh dhVar2 = (C137007dh) dfVar.instance;
        dhVar2.f372874d = a.f172871h;
        dhVar2.f372871a |= 4;
        C63908av avVar2 = (C63908av) C63909aw.f172816e.createBuilder();
        avVar2.copyOnWrite();
        C63909aw awVar2 = (C63909aw) avVar2.instance;
        awVar2.f172818a = 1 | awVar2.f172818a;
        awVar2.f172819b = i;
        int i2 = awVar.f172316b;
        avVar2.copyOnWrite();
        C63909aw awVar3 = (C63909aw) avVar2.instance;
        awVar3.f172818a |= 2;
        awVar3.f172820c = i2;
        dfVar.copyOnWrite();
        C137007dh dhVar3 = (C137007dh) dfVar.instance;
        C63909aw awVar4 = (C63909aw) avVar2.build();
        awVar4.getClass();
        dhVar3.f372875e = awVar4;
        dhVar3.f372871a |= 8;
        boolean z = awVar.f172320g;
        dfVar.copyOnWrite();
        C137007dh dhVar4 = (C137007dh) dfVar.instance;
        dhVar4.f372871a |= 16;
        dhVar4.f372876f = z;
        boolean z2 = agVar.f172279j;
        dfVar.copyOnWrite();
        C137007dh dhVar5 = (C137007dh) dfVar.instance;
        dhVar5.f372871a |= 32;
        dhVar5.f372877g = z2;
        return C60922j.m93044g(b, C47810es.m84963c(new C136941aw(bmVar, i, jVar, (C137007dh) dfVar.build())), bmVar.f372748h);
    }
}
