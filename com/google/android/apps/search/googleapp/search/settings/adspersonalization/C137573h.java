package com.google.android.apps.search.googleapp.search.settings.adspersonalization;

import android.net.Uri;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.libraries.web.contrib.requestblock.C43714a;
import com.google.android.libraries.web.p3353c.C43367l;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.adspersonalization.h */
/* compiled from: PG */
public final /* synthetic */ class C137573h implements C43714a {

    /* renamed from: a */
    public final /* synthetic */ C137574i f374194a;

    public /* synthetic */ C137573h(C137574i iVar) {
        this.f374194a = iVar;
    }

    /* renamed from: a */
    public final void mo32340a(C43367l lVar) {
        C137574i iVar = this.f374194a;
        C139795f fVar = iVar.f374201g;
        Uri parse = Uri.parse(lVar.f113296b);
        C139798i iVar2 = (C139798i) C139823j.f380066m.createBuilder();
        String uri = iVar.f374202h.mo113405k().build().toString();
        iVar2.copyOnWrite();
        C139823j jVar = (C139823j) iVar2.instance;
        uri.getClass();
        jVar.f380068a |= 256;
        jVar.f380077j = uri;
        C139851q qVar = C139851q.SETTINGS;
        iVar2.copyOnWrite();
        C139823j jVar2 = (C139823j) iVar2.instance;
        jVar2.f380069b = qVar.f380143m;
        jVar2.f380068a |= 1;
        fVar.mo115250a(parse, (C139823j) iVar2.build());
    }
}
