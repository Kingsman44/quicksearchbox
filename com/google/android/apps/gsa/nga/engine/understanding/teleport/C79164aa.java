package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.engine.understanding.p6241h.C79142a;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.aa */
/* compiled from: PG */
public final class C79164aa {
    /* renamed from: a */
    public static C61752n m127114a(String str, String str2, boolean z, boolean z2) {
        C79142a aVar = new C79142a();
        C61751m mVar = aVar.f217552a;
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        C61752n nVar2 = C61752n.f166808f;
        nVar.f166810a |= 4;
        nVar.f166811b = "FindOnApp";
        aVar.mo73813c("query", str2);
        aVar.mo73815e(str);
        aVar.mo73812b("isAssistedBrowse", z);
        aVar.mo73812b("isQueryPatternMatched", z2);
        return aVar.mo73811a();
    }

    /* renamed from: b */
    public static C61752n m127115b(String str, String str2, boolean z, boolean z2, boolean z3) {
        C79142a aVar = new C79142a();
        C61751m mVar = aVar.f217552a;
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        C61752n nVar2 = C61752n.f166808f;
        nVar.f166810a |= 4;
        nVar.f166811b = "FindOnSite";
        aVar.mo73813c("query", str2);
        aVar.mo73813c("website", str);
        aVar.mo73812b("isAssistedBrowse", z2);
        aVar.mo73812b("isSiteInForeground", z);
        aVar.mo73812b("isQueryPatternMatched", z3);
        return aVar.mo73811a();
    }

    /* renamed from: c */
    public static C61752n m127116c(String str, Optional optional, Optional optional2) {
        C79142a aVar = new C79142a();
        C61751m mVar = aVar.f217552a;
        mVar.copyOnWrite();
        C61752n nVar = (C61752n) mVar.instance;
        C61752n nVar2 = C61752n.f166808f;
        nVar.f166810a |= 4;
        nVar.f166811b = "OnDeviceDeeplink";
        aVar.mo73812b("assisted_browse", true);
        aVar.mo73815e(str);
        optional.ifPresent(new C79327y(aVar));
        optional2.ifPresent(new C79328z(aVar));
        return aVar.mo73811a();
    }
}
