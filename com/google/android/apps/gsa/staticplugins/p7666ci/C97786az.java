package com.google.android.apps.gsa.staticplugins.p7666ci;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.az */
/* compiled from: PG */
public final /* synthetic */ class C97786az implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C97811bv f273022a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f273023b;

    /* renamed from: c */
    public final /* synthetic */ C123777f f273024c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f273025d;

    /* renamed from: e */
    public final /* synthetic */ List f273026e;

    /* renamed from: f */
    public final /* synthetic */ List f273027f;

    /* renamed from: g */
    public final /* synthetic */ C58833ax f273028g;

    /* renamed from: h */
    public final /* synthetic */ C71207aq f273029h;

    /* renamed from: i */
    public final /* synthetic */ C58833ax f273030i;

    public /* synthetic */ C97786az(C97811bv bvVar, C60870cx cxVar, C123777f fVar, C53306j jVar, List list, List list2, C58833ax axVar, C71207aq aqVar, C58833ax axVar2) {
        this.f273022a = bvVar;
        this.f273023b = cxVar;
        this.f273024c = fVar;
        this.f273025d = jVar;
        this.f273026e = list;
        this.f273027f = list2;
        this.f273028g = axVar;
        this.f273029h = aqVar;
        this.f273030i = axVar2;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C97811bv bvVar = this.f273022a;
        C60870cx cxVar = this.f273023b;
        C123777f fVar = this.f273024c;
        C53306j jVar = this.f273025d;
        List list = this.f273026e;
        List list2 = this.f273027f;
        C58833ax axVar = this.f273028g;
        C71207aq aqVar = this.f273029h;
        C58833ax axVar2 = this.f273030i;
        C97811bv bvVar2 = bvVar;
        C53306j jVar2 = jVar;
        C22871g gVar = bvVar.f273126g;
        C97790ba baVar = new C97790ba(bvVar2, fVar, jVar, list, list2, axVar, aqVar, cxVar, axVar2, cVar);
        new C90873ag(cxVar, gVar, "#getOnDeviceMediaProactiveData()", baVar).mo85223a(new C97791bb(bvVar2, axVar, aqVar, jVar2, cVar));
        return "Get data from cache and new fetch";
    }
}
