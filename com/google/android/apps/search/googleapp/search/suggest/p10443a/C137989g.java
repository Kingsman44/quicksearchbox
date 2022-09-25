package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138130l;
import com.google.android.apps.search.googleapp.search.suggest.C138131m;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138134p;
import com.google.android.apps.search.googleapp.search.suggest.C138542t;
import com.google.android.apps.search.googleapp.search.suggest.C138680x;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.g */
/* compiled from: PG */
public final /* synthetic */ class C137989g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138001s f375413a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f375414b;

    public /* synthetic */ C137989g(C138001s sVar, C138133o oVar) {
        this.f375413a = sVar;
        this.f375414b = oVar;
    }

    public final C60870cx apply(Object obj) {
        C138001s sVar = this.f375413a;
        C138133o oVar = this.f375414b;
        if (((C138680x) obj).f377205b) {
            return sVar.mo114072a(oVar);
        }
        C46459k.m82829b(sVar.f375440l.mo46039a(C137939b.f375286a, C60826bg.f164896a), "Failed to set that the incognito signpost has been displayed", new Object[0]);
        C138130l lVar = (C138130l) C138131m.f375814f.createBuilder();
        lVar.copyOnWrite();
        C138131m mVar = (C138131m) lVar.instance;
        oVar.getClass();
        mVar.f375820e = oVar;
        mVar.f375816a |= 4;
        C138134p pVar = (C138134p) C138542t.f376811i.createBuilder();
        pVar.copyOnWrite();
        C138542t tVar = (C138542t) pVar.instance;
        tVar.f376813a |= 2;
        tVar.f376815c = true;
        C138542t tVar2 = (C138542t) pVar.build();
        lVar.copyOnWrite();
        C138131m mVar2 = (C138131m) lVar.instance;
        tVar2.getClass();
        mVar2.f375819d = tVar2;
        mVar2.f375816a |= 2;
        return C60856cj.m92900i((C138131m) lVar.build());
    }
}
