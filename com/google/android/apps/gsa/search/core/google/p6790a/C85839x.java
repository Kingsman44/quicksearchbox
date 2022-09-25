package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21680j;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.x */
/* compiled from: PG */
final class C85839x implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58872ci f232089a;

    /* renamed from: b */
    final /* synthetic */ C85841z f232090b;

    public C85839x(C85841z zVar, C58872ci ciVar) {
        this.f232090b = zVar;
        this.f232089a = ciVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58872ci ciVar = this.f232089a;
        if (ciVar.f156708a) {
            ciVar.mo56162g();
            this.f232090b.f232099e.mo97773c(this.f232089a.mo56158a(TimeUnit.MILLISECONDS));
        }
        this.f232090b.f232099e.mo97771a();
        this.f232090b.f232099e.mo97772b("ERROR");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C21680j jVar = (C21680j) obj;
        C58872ci ciVar = this.f232089a;
        if (ciVar.f156708a) {
            ciVar.mo56162g();
            this.f232090b.f232099e.mo97773c(this.f232089a.mo56158a(TimeUnit.MILLISECONDS));
        }
        this.f232090b.f232099e.mo97772b(Long.toString(jVar.mo27047a()));
    }
}
