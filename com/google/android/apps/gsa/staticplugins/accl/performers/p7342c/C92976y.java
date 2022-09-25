package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21680j;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.y */
/* compiled from: PG */
final class C92976y implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58872ci f259347a;

    /* renamed from: b */
    final /* synthetic */ C92977z f259348b;

    public C92976y(C92977z zVar, C58872ci ciVar) {
        this.f259348b = zVar;
        this.f259347a = ciVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58872ci ciVar = this.f259347a;
        if (ciVar.f156708a) {
            ciVar.mo56162g();
            this.f259348b.f259354f.mo97773c(this.f259347a.mo56158a(TimeUnit.MILLISECONDS));
        }
        this.f259348b.f259354f.mo97771a();
        this.f259348b.f259354f.mo97772b("ERROR");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C21680j jVar = (C21680j) obj;
        C58872ci ciVar = this.f259347a;
        if (ciVar.f156708a) {
            ciVar.mo56162g();
            this.f259348b.f259354f.mo97773c(this.f259347a.mo56158a(TimeUnit.MILLISECONDS));
        }
        this.f259348b.f259354f.mo97772b(Long.toString(jVar.mo27047a()));
    }
}
