package com.google.android.gms.car.p10750a.p10751a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.gms.car.C143111aw;
import com.google.android.gms.car.p10760f.p10762b.C143264a;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.common.p4552o.p4556c.C59682i;
import com.google.common.p4552o.p4556c.C59683j;
import com.google.common.p4552o.p4556c.C59684k;
import com.google.common.p4552o.p4556c.C59685l;
import com.google.common.util.concurrent.C60845bz;
import com.google.frameworks.client.p4624a.p4625a.C61301b;

/* renamed from: com.google.android.gms.car.a.a.bn */
/* compiled from: PG */
final class C143017bn implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C143000ax f388067a;

    /* renamed from: b */
    final /* synthetic */ int f388068b;

    /* renamed from: c */
    final /* synthetic */ C143019bp f388069c;

    public C143017bn(C143019bp bpVar, C143000ax axVar, int i) {
        this.f388069c = bpVar;
        this.f388067a = axVar;
        this.f388068b = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (C143316a.m232515e("CAR.TOKEN", 4)) {
            C143316a.m232514d(4, "CAR.TOKEN", (Throwable) null, "Failed to connect %s using %s (cx attempt %s)", C61301b.m93812a(this), C61301b.m93812a(this.f388067a), C61301b.m93812a(Integer.valueOf(this.f388068b)));
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C143000ax axVar = (C143000ax) obj;
        if (C143316a.m232515e("CAR.TOKEN", 4)) {
            C143316a.m232514d(4, "CAR.TOKEN", (Throwable) null, "Successfully connected %s using %s (cx attempt %s)", C61301b.m93812a(this), C61301b.m93812a(this.f388067a), C61301b.m93812a(Integer.valueOf(this.f388068b)));
        }
        if (!this.f388069c.mo117964b()) {
            C143316a.m232514d(5, "CAR.TOKEN", (Throwable) null, "Reached connection callbacks, but token not currently connected!", new Object[0]);
            return;
        }
        new C144861c(this.f388069c.f388076f).post(new C143016bm(this.f388069c));
        this.f388067a.mo117930l(this.f388069c.f388075e);
        C143019bp bpVar = this.f388069c;
        if (!bpVar.mo117963a().mo117934p(C143264a.SHOULD_LOG_CAR_CLIENT_TOKEN_CONNECTION_EVENT)) {
            C143316a.m232514d(5, "CAR.TOKEN", (Throwable) null, "Not allowing logging client connection event", new Object[0]);
            return;
        }
        C59682i iVar = (C59682i) C59683j.f160017d.createBuilder();
        iVar.copyOnWrite();
        C59683j jVar = (C59683j) iVar.instance;
        jVar.f160019a |= 1;
        jVar.f160020b = 3;
        iVar.copyOnWrite();
        C59683j jVar2 = (C59683j) iVar.instance;
        jVar2.f160019a = 4 | jVar2.f160019a;
        jVar2.f160021c = true;
        C59683j jVar3 = (C59683j) iVar.build();
        C59684k kVar = (C59684k) C59685l.f160022c.createBuilder();
        kVar.copyOnWrite();
        C59685l lVar = (C59685l) kVar.instance;
        jVar3.getClass();
        lVar.f160025b = jVar3;
        lVar.f160024a |= C89885b.NOW_VALUE;
        try {
            bpVar.mo117963a().mo117919f(((C59685l) kVar.build()).toByteArray());
        } catch (C143111aw unused) {
            C143316a.m232512b("CAR.TOKEN", (Throwable) null, "Failed to log connection event.");
        }
    }
}
