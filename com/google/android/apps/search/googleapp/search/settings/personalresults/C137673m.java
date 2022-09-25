package com.google.android.apps.search.googleapp.search.settings.personalresults;

import android.net.Uri;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.personalresults.m */
/* compiled from: PG */
public final /* synthetic */ class C137673m implements C43714a {

    /* renamed from: a */
    public final /* synthetic */ C137674n f374467a;

    public /* synthetic */ C137673m(C137674n nVar) {
        this.f374467a = nVar;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        C139795f fVar = this.f374467a.f374473f;
        Uri parse = Uri.parse(lVar.f113296b);
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        C139851q qVar = C139851q.SETTINGS;
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        fVar.mo115250a(parse, (C139823j) iVar.build());
    }
}
