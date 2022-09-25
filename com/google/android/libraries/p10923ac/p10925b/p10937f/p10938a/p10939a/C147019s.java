package com.google.android.libraries.p10923ac.p10925b.p10937f.p10938a.p10939a;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10944k.C147141ap;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147167a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.p4552o.p4566l.C60178cp;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64026ci;
import com.google.protos.p4895aw.p4902b.C64096n;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.ac.b.f.a.a.s */
/* compiled from: PG */
final class C147019s implements C147141ap {

    /* renamed from: a */
    public final C147020t f396972a;

    /* renamed from: b */
    public final C68214a f396973b;

    public C147019s(C147020t tVar) {
        this.f396972a = tVar;
        Objects.requireNonNull(tVar);
        this.f396973b = new C147017q(tVar);
    }

    /* renamed from: a */
    public final C60870cx mo123727a(C64098p pVar, Account account, boolean z, boolean z2) {
        this.f396972a.mo123824j();
        if (!C147266a.m240144o()) {
            return C60856cj.m92900i(C60178cp.f162787o);
        }
        C147020t tVar = this.f396972a;
        tVar.getClass();
        C64096n nVar = (C64096n) C64098p.f173292c.createBuilder();
        C64026ci ciVar = C64026ci.f173131a;
        nVar.copyOnWrite();
        C64098p pVar2 = (C64098p) nVar.instance;
        ciVar.getClass();
        pVar2.f173295b = ciVar;
        pVar2.f173294a = 3;
        return C60846c.m92879h(new C147016p(new C147167a(account, (C64098p) nVar.build()), tVar).f396946c.mo60297gq(), Exception.class, new C147018r(this), C60826bg.f164896a);
    }
}
