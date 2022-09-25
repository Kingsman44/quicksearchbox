package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8460k;

import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85299b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.k.g */
/* compiled from: PG */
public final class C110722g {

    /* renamed from: a */
    public static final C59071e f308507a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.k.g");

    /* renamed from: b */
    public static final long f308508b = TimeUnit.HOURS.toMillis(24);

    /* renamed from: c */
    public static final long f308509c = TimeUnit.HOURS.toMillis(12);

    /* renamed from: d */
    public static final long f308510d = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: e */
    public final C22871g f308511e;

    /* renamed from: f */
    public final C22871g f308512f;

    /* renamed from: g */
    public final C21370a f308513g;

    /* renamed from: h */
    public final C110724i f308514h;

    /* renamed from: i */
    public final C83794j f308515i;

    /* renamed from: j */
    public final C85299b f308516j;

    /* renamed from: k */
    public final u f308517k;

    /* renamed from: l */
    private final C86124t f308518l;

    /* renamed from: m */
    private final C118561t f308519m;

    public C110722g(C22871g gVar, C21370a aVar, C118561t tVar, C110724i iVar, C83794j jVar, C86124t tVar2, C85299b bVar, C22871g gVar2, u uVar) {
        this.f308511e = gVar;
        this.f308513g = aVar;
        this.f308516j = bVar;
        this.f308518l = tVar2;
        this.f308519m = tVar;
        this.f308514h = iVar;
        this.f308515i = jVar;
        this.f308512f = gVar2;
        this.f308517k = uVar;
    }

    /* renamed from: a */
    public final long mo98862a() {
        if (this.f308515i.mo77157A()) {
            return TimeUnit.MINUTES.toMillis(this.f308515i.mo77167c());
        }
        return TimeUnit.MINUTES.toMillis(this.f308518l.mo79743a(C90014bt.f247655lJ));
    }

    /* renamed from: b */
    public final void mo98863b(long j) {
        long b = j - this.f308513g.mo26870b();
        if (b < 0) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        this.f308519m.mo103752c(C118522by.SMARTSPACE_REMINDER_UPDATE);
        C58976aa aaVar2 = C58975e.f156826a;
        C118561t tVar = this.f308519m;
        C118522by byVar = C118522by.SMARTSPACE_REMINDER_UPDATE;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = b;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328821a |= 2;
        agVar2.f328823c = 2000;
        tVar.mo103754e(byVar, (C118472ag) afVar.build());
    }
}
