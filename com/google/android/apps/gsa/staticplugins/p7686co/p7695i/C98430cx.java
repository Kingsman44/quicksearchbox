package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.apps.gsa.proactive.p6475b.C84164g;
import com.google.android.apps.gsa.sidekick.main.p7219n.C91480f;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.cx */
/* compiled from: PG */
public final class C98430cx implements C118549h {

    /* renamed from: a */
    static final C118522by f274798a = C118522by.PROACTIVE_RUN_REQUEST_MANAGER;

    /* renamed from: b */
    static final C118522by f274799b = C118522by.PROACTIVE_NET_RECOVERY_RUN_REQUEST_MANAGER;

    /* renamed from: c */
    static final C118522by f274800c = C118522by.PROACTIVE_DELAYED_RUN_REQUEST_MANAGER;

    /* renamed from: d */
    static final long f274801d = TimeUnit.DAYS.toMillis(1);

    /* renamed from: e */
    public static final C59071e f274802e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.i.cx");

    /* renamed from: f */
    private final C91480f f274803f;

    /* renamed from: g */
    private final C84164g f274804g;

    /* renamed from: h */
    private final C22871g f274805h;

    public C98430cx(C91480f fVar, C84164g gVar, C22871g gVar2) {
        this.f274803f = fVar;
        this.f274804g = gVar;
        this.f274805h = gVar2;
    }

    /* renamed from: b */
    static C118472ag m162997b(long j) {
        long max = Math.max(0, j);
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = max;
        return (C118472ag) afVar.build();
    }

    /* renamed from: c */
    static C118472ag m162998c() {
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328824d = 1;
        agVar.f328821a |= 4;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328821a = 1 | agVar2.f328821a;
        agVar2.f328822b = 5000;
        long j = f274801d;
        afVar.copyOnWrite();
        C118472ag agVar3 = (C118472ag) afVar.instance;
        agVar3.f328821a |= 2;
        agVar3.f328823c = j;
        return (C118472ag) afVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f274803f.mo85823b();
        C60870cx a = this.f274804g.mo77613a();
        this.f274805h.mo28211k(a, "RunRequestManagerBackgroundTask#perform(..)", new C98429cw());
        return a;
    }
}
