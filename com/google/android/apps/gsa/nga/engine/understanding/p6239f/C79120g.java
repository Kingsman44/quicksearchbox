package com.google.android.apps.gsa.nga.engine.understanding.p6239f;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f.g */
/* compiled from: PG */
public final /* synthetic */ class C79120g implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ int f217511a;

    /* renamed from: b */
    public final /* synthetic */ C61746h f217512b;

    /* renamed from: c */
    public final /* synthetic */ Optional f217513c;

    public /* synthetic */ C79120g(int i, C61746h hVar, Optional optional) {
        this.f217511a = i;
        this.f217512b = hVar;
        this.f217513c = optional;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        int i = this.f217511a;
        C61746h hVar = this.f217512b;
        Optional optional = this.f217513c;
        C61751m mVar = (C61751m) obj;
        C61745g gVar = (C61745g) hVar.toBuilder();
        C61748j jVar = (C61748j) optional.get();
        gVar.copyOnWrite();
        C61746h hVar2 = (C61746h) gVar.instance;
        jVar.getClass();
        hVar2.f166797e = jVar;
        hVar2.f166793a |= 4;
        mVar.mo58187f(i, gVar);
        return mVar;
    }
}
