package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.discover.fullcoverage.C134315b;
import com.google.android.apps.search.googleapp.discover.fullcoverage.C134316c;
import com.google.android.apps.search.googleapp.discover.fullcoverage.C134326m;
import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134724d;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134759j;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57062ad;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64184af;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.p5496d.C69819a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C134374ae implements C69819a {

    /* renamed from: a */
    public final /* synthetic */ C134375af f366026a;

    /* renamed from: b */
    public final /* synthetic */ C64184af f366027b;

    public /* synthetic */ C134374ae(C134375af afVar, C64184af afVar2) {
        this.f366026a = afVar;
        this.f366027b = afVar2;
    }

    /* renamed from: a */
    public final void mo25795a() {
        C134375af afVar = this.f366026a;
        C64184af afVar2 = this.f366027b;
        C133939b bVar = afVar.f366028a;
        C57062ad adVar = afVar2.f173539a;
        if (adVar == null) {
            adVar = C57062ad.f152328c;
        }
        C69664n.m101061g(adVar, "data");
        bVar.f364810s.mo111908d(C134720e.FULL_COVERAGE_ICON_TAPPED);
        C134724d dVar = bVar.f364798g;
        C69664n.m101061g(adVar, "openStoryData");
        C57315dp dpVar = adVar.f152330a;
        if (dpVar == null) {
            dpVar = C57315dp.f152986c;
        }
        C69664n.m101060f(dpVar, "openStoryData.token");
        dVar.mo111913a(new C134759j(dpVar));
        Fragment fragment = bVar.f364794c;
        C134326m mVar = bVar.f364804m;
        C69664n.m101061g(adVar, "openStoryData");
        C134315b bVar2 = (C134315b) C134316c.f365851d.createBuilder();
        C69664n.m101060f(bVar2, "newBuilder()");
        C69664n.m101061g(bVar2, "builder");
        C69664n.m101061g(adVar, "value");
        bVar2.copyOnWrite();
        C134316c cVar = (C134316c) bVar2.instance;
        adVar.getClass();
        cVar.f365854b = adVar;
        cVar.f365853a |= 1;
        boolean a = C133933a.m217248a(mVar.f365882a.getContext());
        bVar2.copyOnWrite();
        C134316c cVar2 = (C134316c) bVar2.instance;
        cVar2.f365853a |= 2;
        cVar2.f365855c = a;
        C62942bv build = bVar2.build();
        C69664n.m101060f(build, "_builder.build()");
        Intent a2 = mVar.f365884c.mo51344a((C134316c) build);
        C45963aa.m82131a(a2, mVar.f365883b);
        C69664n.m101060f(a2, "navigationIntents.create…tAccount(it, accountId) }");
        C47709i.m84861a(fragment, a2);
    }
}
