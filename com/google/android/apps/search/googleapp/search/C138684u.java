package com.google.android.apps.search.googleapp.search;

import android.net.Uri;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138582g;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.googleapp.search.u */
/* compiled from: PG */
final class C138684u implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C137553n f377208a;

    public C138684u(C137553n nVar) {
        this.f377208a = nVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C137553n nVar = this.f377208a;
        Uri uri = ((C138582g) bVar).f376912a;
        C139795f fVar = nVar.f374142k;
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        C139851q qVar = C139851q.SUGGEST;
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        iVar.copyOnWrite();
        C139823j jVar2 = (C139823j) iVar.instance;
        jVar2.f380068a |= 1024;
        jVar2.f380079l = true;
        fVar.mo115250a(uri, (C139823j) iVar.build());
        return C47392e.f123115a;
    }
}
