package com.google.android.apps.search.googleapp.p10536x.p10538b;

import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.h.r.a;
import com.google.android.apps.gsa.h.r.c;
import com.google.android.apps.gsa.h.r.d;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139141e;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139144h;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139145i;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139146j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.x.b.a */
/* compiled from: PG */
public final class C139866a {

    /* renamed from: a */
    private static final C59071e f380173a = C59071e.m91331h();

    /* renamed from: b */
    private final Fragment f380174b;

    /* renamed from: c */
    private final AccountId f380175c;

    /* renamed from: d */
    private final boolean f380176d;

    /* renamed from: e */
    private final boolean f380177e;

    /* renamed from: f */
    private final C139146j f380178f;

    /* renamed from: g */
    private final a f380179g;

    public C139866a(Fragment fragment, AccountId accountId, boolean z, boolean z2, C139146j jVar, a aVar) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(accountId, "accountId");
        this.f380174b = fragment;
        this.f380175c = accountId;
        this.f380176d = z;
        this.f380177e = z2;
        this.f380178f = jVar;
        this.f380179g = aVar;
    }

    /* renamed from: a */
    public final void mo115320a(C139873i iVar, boolean z) {
        String str;
        String str2;
        if (this.f380177e) {
            Fragment fragment = this.f380174b;
            C139146j jVar = this.f380178f;
            C139141e eVar = (C139141e) C139143g.f378433c.createBuilder();
            C69664n.m101060f(eVar, "newBuilder()");
            C69664n.m101061g(eVar, "builder");
            C139144h hVar = (C139144h) C139145i.f378437d.createBuilder();
            C69664n.m101060f(hVar, "newBuilder()");
            C69664n.m101061g(hVar, "builder");
            if (iVar == null || (str2 = iVar.name()) == null) {
                str2 = BuildConfig.FLAVOR;
            }
            C69664n.m101061g(str2, "value");
            hVar.copyOnWrite();
            C139145i iVar2 = (C139145i) hVar.instance;
            str2.getClass();
            iVar2.f378439a = 1 | iVar2.f378439a;
            iVar2.f378440b = str2;
            hVar.copyOnWrite();
            C139145i iVar3 = (C139145i) hVar.instance;
            iVar3.f378439a |= 2;
            iVar3.f378441c = z;
            C62942bv build = hVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C139145i iVar4 = (C139145i) build;
            C69664n.m101061g(iVar4, "value");
            eVar.copyOnWrite();
            C139143g gVar = (C139143g) eVar.instance;
            iVar4.getClass();
            gVar.f378436b = iVar4;
            gVar.f378435a = 5;
            C62942bv build2 = eVar.build();
            C69664n.m101060f(build2, "_builder.build()");
            C47709i.m84861a(fragment, jVar.mo114780a((C139143g) build2, this.f380175c));
            return;
        }
        if (this.f380176d) {
            C59052c cVar = (C59052c) f380173a.mo56226d();
            cVar.mo56379ah(new C59094n(41353));
            cVar.mo56386p("This is a standalone app. Settings can only be launched from AGSA.");
        }
        a aVar = this.f380179g;
        if (iVar != C139873i.DISCOVER_ENABLED || z) {
            str = (iVar == C139873i.BROWSER_PAGE_LINK && z) ? "GOOGLE_APP_BROWSER" : "NONE";
        } else {
            str = "SHOW_FEED";
        }
        c createBuilder = d.c.createBuilder();
        createBuilder.copyOnWrite();
        d dVar = createBuilder.instance;
        dVar.a = 1 | dVar.a;
        dVar.b = str;
        aVar.mo41490e(createBuilder.build());
    }
}
