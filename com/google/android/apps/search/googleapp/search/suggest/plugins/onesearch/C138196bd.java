package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bd */
/* compiled from: PG */
public final class C138196bd {

    /* renamed from: a */
    private final C138183ar f376026a;

    public C138196bd(C138183ar arVar) {
        this.f376026a = arVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C138186au mo114188a() {
        C62942bv build = this.f376026a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C138186au) build;
    }

    /* renamed from: b */
    public final void mo114189b(C138185at atVar) {
        C69664n.m101061g(atVar, "value");
        C138183ar arVar = this.f376026a;
        arVar.copyOnWrite();
        C138186au auVar = (C138186au) arVar.instance;
        C138186au auVar2 = C138186au.f375981d;
        auVar.f375985c = atVar.f375980e;
        auVar.f375983a |= 2;
    }

    /* renamed from: c */
    public final void mo114190c(String str) {
        C69664n.m101061g(str, "value");
        C138183ar arVar = this.f376026a;
        arVar.copyOnWrite();
        C138186au auVar = (C138186au) arVar.instance;
        C138186au auVar2 = C138186au.f375981d;
        str.getClass();
        auVar.f375983a |= 1;
        auVar.f375984b = str;
    }
}
