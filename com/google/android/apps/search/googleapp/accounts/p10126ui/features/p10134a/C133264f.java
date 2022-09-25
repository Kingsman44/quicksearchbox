package com.google.android.apps.search.googleapp.accounts.p10126ui.features.p10134a;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.a.f */
/* compiled from: PG */
final class C133264f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C133262d f363209a;

    public C133264f(C133262d dVar) {
        this.f363209a = dVar;
    }

    public final void onClick(View view) {
        C139795f fVar = this.f363209a.f363204d;
        Uri parse = Uri.parse("https://support.google.com/chrome/?p=incognito");
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        C139851q qVar = C139851q.MENU;
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        fVar.mo115250a(parse, (C139823j) iVar.build());
    }
}
