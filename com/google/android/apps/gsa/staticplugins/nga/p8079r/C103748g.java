package com.google.android.apps.gsa.staticplugins.nga.p8079r;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80129bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80146bx;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80147by;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.g */
/* compiled from: PG */
public final /* synthetic */ class C103748g implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C103763v f288911a;

    /* renamed from: b */
    public final /* synthetic */ C80136bn f288912b;

    public /* synthetic */ C103748g(C103763v vVar, C80136bn bnVar) {
        this.f288911a = vVar;
        this.f288912b = bnVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C103763v vVar = this.f288911a;
        Exception exc = (Exception) obj;
        ((C58970a) ((C58970a) ((C58970a) C103763v.f288927a.mo56225c()).mo56382g(exc)).mo56372aa(21547)).mo56389s("One-off call failed (%s)", C80129bg.m128086a(this.f288912b.f219917a));
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        C80146bx bxVar = (C80146bx) C80147by.f219936c.createBuilder();
        String exc2 = exc.toString();
        bxVar.copyOnWrite();
        C80147by byVar = (C80147by) bxVar.instance;
        exc2.getClass();
        byVar.f219938a |= 1;
        byVar.f219939b = exc2;
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        C80147by byVar2 = (C80147by) bxVar.build();
        byVar2.getClass();
        ddVar.f220291b = byVar2;
        ddVar.f220290a = 1;
        vVar.mo93832n((C80275dd) buVar.build());
    }
}
