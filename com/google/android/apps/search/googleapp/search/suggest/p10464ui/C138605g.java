package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.view.View;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.g */
/* compiled from: PG */
final class C138605g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C138611m f376957a;

    /* renamed from: b */
    final /* synthetic */ View f376958b;

    public C138605g(C138611m mVar, View view) {
        this.f376957a = mVar;
        this.f376958b = view;
    }

    public final void onClick(View view) {
        this.f376957a.f376977h.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f376958b));
        this.f376957a.mo114402c();
        C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
        C139779t tVar = C139779t.HOME_SCREEN;
        fVar.copyOnWrite();
        C139767h hVar = (C139767h) fVar.instance;
        hVar.f379872b = tVar.f379907i;
        hVar.f379871a |= 1;
        fVar.copyOnWrite();
        C139767h hVar2 = (C139767h) fVar.instance;
        hVar2.f379871a |= 2;
        hVar2.f379873c = true;
        C47393f.m84237h(new C139760a((C139767h) fVar.build()), this.f376958b);
    }
}
