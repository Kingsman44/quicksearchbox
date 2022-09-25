package com.google.android.apps.search.googleapp.accounts.p10124b;

import android.app.Activity;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46010bu;
import com.google.apps.tiktok.account.api.controller.C46012bw;
import com.google.apps.tiktok.account.api.controller.C46013bx;
import com.google.apps.tiktok.nav.gateway.C47494a;
import com.google.apps.tiktok.nav.gateway.C47502h;
import com.google.apps.tiktok.nav.gateway.C47503i;
import com.google.common.base.C58833ax;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.googleapp.accounts.b.a */
/* compiled from: PG */
final class C133153a implements C32158h {

    /* renamed from: a */
    private final C133158f f362969a;

    public C133153a(C133158f fVar) {
        this.f362969a = fVar;
    }

    /* renamed from: a */
    public final C58833ax mo37970a() {
        C133158f fVar = this.f362969a;
        C47502h d = C47503i.m84541d();
        d.mo51352b(fVar.mo111000b());
        ((C47494a) d).f123319b = fVar.mo110999a();
        return C58833ax.m90834k(d.mo51351a());
    }

    /* renamed from: b */
    public final void mo37971b(Activity activity, C45987ay ayVar, C45989b bVar) {
        C133158f fVar = this.f362969a;
        C46012bw e = C46013bx.m82201e(activity);
        Stream stream = Collection.EL.stream(fVar.mo111000b());
        Objects.requireNonNull(e);
        stream.forEach(new C133157e(e));
        ((C46010bu) e).f120853a = fVar.mo110999a();
        bVar.mo50083f(e.mo50146a());
        bVar.mo50082e(ayVar);
    }

    /* renamed from: c */
    public final void mo37972c(C45989b bVar) {
        bVar.mo50081d(this.f362969a.mo111000b());
    }
}
