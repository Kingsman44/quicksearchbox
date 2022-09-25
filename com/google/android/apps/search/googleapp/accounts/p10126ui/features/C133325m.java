package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.libraries.onegoogle.account.p2345a.C30156a;
import com.google.apps.tiktok.account.data.C46108a;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.m */
/* compiled from: PG */
public final /* synthetic */ class C133325m implements C30156a {

    /* renamed from: a */
    public final /* synthetic */ C139795f f363302a;

    public /* synthetic */ C133325m(C139795f fVar) {
        this.f363302a = fVar;
    }

    /* renamed from: a */
    public final void mo17832a(View view, Object obj) {
        C139795f fVar = this.f363302a;
        C46108a aVar = (C46108a) obj;
        Uri parse = Uri.parse("https://www.google.com/policies/privacy");
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        C139851q qVar = C139851q.MENU;
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        fVar.mo115250a(parse, (C139823j) iVar.build());
    }
}
