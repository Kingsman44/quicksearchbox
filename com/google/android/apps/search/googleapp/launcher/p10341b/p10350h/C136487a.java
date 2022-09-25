package com.google.android.apps.search.googleapp.launcher.p10341b.p10350h;

import com.google.android.apps.search.googleapp.launcher.p10341b.C136423a;
import com.google.android.apps.search.googleapp.launcher.p10341b.C136443b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10343b.C136445b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10345d.p10346a.C136459b;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4561g.C59801b;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.h.a */
/* compiled from: PG */
public final /* synthetic */ class C136487a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136488b f371592a;

    public /* synthetic */ C136487a(C136488b bVar) {
        this.f371592a = bVar;
    }

    public final Object apply(Object obj) {
        C136488b bVar = this.f371592a;
        C136459b bVar2 = (C136459b) obj;
        if (bVar2 == null || Duration.between(Instant.ofEpochMilli(bVar2.f371518b), Instant.ofEpochMilli(bVar.f371594b.mo26870b())).compareTo(C136488b.f371593a) >= 0) {
            C136445b bVar3 = bVar.f371595c;
            if (bVar3.f371479a) {
                bVar3.mo113049a().mo41590b(C59743a.ACETONE_SERVICE_NOT_RUNNING, C59801b.f161611d, C59801b.f161610c);
            }
        } else {
            int i = bVar2.f371519c;
            int i2 = bVar2.f371520d;
            C136423a b = C136443b.m221737b();
            b.mo113003i(bVar2.f371523g);
            b.mo113005k(bVar2.f371522f);
            b.mo113002h(bVar2.f371521e);
            b.mo113006l(bVar2.f371524h);
            b.mo113001g(bVar2.f371525i);
            bVar.f371595c.mo113050b(i2, i, b.mo112996b());
        }
        return true;
    }
}
