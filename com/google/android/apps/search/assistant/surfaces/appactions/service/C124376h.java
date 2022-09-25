package com.google.android.apps.search.assistant.surfaces.appactions.service;

import com.google.android.libraries.geller.portable.GellerException;
import com.google.assistant.p3825an.p3830c.p3831a.C49312cd;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.appactions.service.h */
/* compiled from: PG */
public final class C124376h extends C68247h {

    /* renamed from: a */
    private final C68283d f343301a;

    public C124376h(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C124376h.class), aVar);
        this.f343301a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        if (guVar != null && !guVar.isEmpty()) {
            return C60856cj.m92900i((C49312cd) guVar.get(0));
        }
        throw new GellerException(C62722b.NOT_FOUND, "No data in Geller.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f343301a.mo60297gq();
    }
}
