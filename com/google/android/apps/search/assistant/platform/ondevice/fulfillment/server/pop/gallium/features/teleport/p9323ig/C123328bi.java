package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.evernote.android.state.BuildConfig;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4850an.C63618g;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4883as.p4884a.C63772a;
import com.google.protos.p4883as.p4884a.C63775d;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.bi */
/* compiled from: PG */
public final class C123328bi {
    /* renamed from: a */
    public static C61752n m202699a(String str, String str2, boolean z, boolean z2) {
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = "FindOnApp";
        C123327bh.m202698b("query", str2, mVar);
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        gVar.copyOnWrite();
        C61746h hVar = (C61746h) gVar.instance;
        hVar.f166793a |= 2;
        hVar.f166796d = "app";
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        C63618g gVar2 = (C63618g) C63624h.f172070b.createBuilder();
        C63772a aVar = (C63772a) C63775d.f172518h.createBuilder();
        aVar.copyOnWrite();
        C63775d dVar = (C63775d) aVar.instance;
        dVar.f172520a |= 2;
        dVar.f172522c = BuildConfig.FLAVOR;
        aVar.copyOnWrite();
        C63775d dVar2 = (C63775d) aVar.instance;
        str.getClass();
        dVar2.f172520a |= 4;
        dVar2.f172523d = str;
        gVar2.mo59221b(aVar);
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        C63624h hVar2 = (C63624h) gVar2.build();
        hVar2.getClass();
        jVar.f166803b = hVar2;
        jVar.f166802a = 15;
        gVar.copyOnWrite();
        C61746h hVar3 = (C61746h) gVar.instance;
        C61748j jVar2 = (C61748j) iVar.build();
        jVar2.getClass();
        hVar3.f166797e = jVar2;
        hVar3.f166793a |= 4;
        mVar.mo58185d((C61746h) gVar.build());
        C123327bh.m202697a("isAssistedBrowse", z, mVar);
        C123327bh.m202697a("isQueryPatternMatched", z2, mVar);
        return (C61752n) mVar.build();
    }

    /* renamed from: b */
    public static C61752n m202700b(String str, String str2, boolean z, boolean z2, boolean z3) {
        C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        nVar.f166810a |= 4;
        nVar.f166811b = "FindOnSite";
        C123327bh.m202698b("query", str2, mVar);
        C123327bh.m202698b("website", str, mVar);
        C123327bh.m202697a("isAssistedBrowse", z2, mVar);
        C123327bh.m202697a("isSiteInForeground", z, mVar);
        C123327bh.m202697a("isQueryPatternMatched", z3, mVar);
        return (C61752n) mVar.build();
    }
}
