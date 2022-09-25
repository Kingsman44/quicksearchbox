package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.accounts.Account;
import android.app.Application;
import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2366bn;
import com.google.common.base.C58838bb;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55915a;
import com.google.p4184bj.p4193c.p4197c.C55960bg;
import com.google.p4184bj.p4193c.p4197c.C55968d;
import com.google.p4184bj.p4193c.p4197c.C55969e;
import com.google.p4184bj.p4193c.p4197c.C55977m;
import com.google.p5274y.p5275a.p5276a.C67966c;

/* renamed from: com.google.android.libraries.j.a.b.s */
/* compiled from: PG */
final class C23969s extends C2366bn {

    /* renamed from: a */
    private final Application f65542a;

    /* renamed from: b */
    private final Account f65543b;

    /* renamed from: e */
    private final C55960bg f65544e;

    /* renamed from: f */
    private final C55912b f65545f;

    public C23969s(Application application, Account account, C55912b bVar, C55960bg bgVar) {
        this.f65542a = application;
        this.f65543b = account;
        this.f65545f = bVar;
        this.f65544e = bgVar;
    }

    /* renamed from: a */
    public final C2358bf mo634a(Class cls) {
        C23948af afVar = new C23948af();
        C58838bb.m90868c(cls.isAssignableFrom(C23971u.class));
        C23971u uVar = new C23971u(this.f65542a, this.f65543b, this.f65545f, this.f65544e, afVar);
        C23953c cVar = uVar.f65548c;
        C55915a aVar = (C55915a) C55977m.f149067g.createBuilder();
        aVar.copyOnWrite();
        C55977m mVar = (C55977m) aVar.instance;
        mVar.f149070b = 3;
        mVar.f149069a |= 1;
        C55968d dVar = (C55968d) C55969e.f149044e.createBuilder();
        int a = C67966c.m98222a();
        dVar.copyOnWrite();
        C55969e eVar = (C55969e) dVar.instance;
        eVar.f149046a |= 4;
        eVar.f149049d = a;
        C55912b bVar = uVar.f65552g;
        dVar.copyOnWrite();
        C55969e eVar2 = (C55969e) dVar.instance;
        eVar2.f149048c = bVar.f148826V;
        eVar2.f149046a |= 2;
        C55960bg bgVar = uVar.f65553h;
        dVar.copyOnWrite();
        C55969e eVar3 = (C55969e) dVar.instance;
        eVar3.f149047b = bgVar.f149026ao;
        eVar3.f149046a |= 1;
        aVar.copyOnWrite();
        C55977m mVar2 = (C55977m) aVar.instance;
        C55969e eVar4 = (C55969e) dVar.build();
        eVar4.getClass();
        mVar2.f149071c = eVar4;
        mVar2.f149069a |= 2;
        cVar.mo29365a((C55977m) aVar.build());
        uVar.mo29380a(C23968r.CONSENT_DATA_LOADING);
        return uVar;
    }
}
