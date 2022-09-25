package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119870dk;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119871dl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119873dn;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119874do;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119896o;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120692g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60904dr;
import com.google.protobuf.C62912at;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.bg */
/* compiled from: PG */
public final class C119979bg {

    /* renamed from: a */
    public static final C59071e f334089a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.b.d.a.bg");

    /* renamed from: b */
    public static final C119873dn f334090b;

    /* renamed from: c */
    public final C120692g f334091c;

    /* renamed from: d */
    public final Executor f334092d;

    /* renamed from: e */
    public final Executor f334093e;

    /* renamed from: f */
    public final C60836bq f334094f = new C60836bq();

    /* renamed from: g */
    public Optional f334095g;

    /* renamed from: h */
    private final C119996j f334096h;

    /* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.bg$a */
    /* compiled from: PG */
    interface C119980a {
        /* renamed from: c */
        C119966aw mo104598c();
    }

    static {
        C119871dl dlVar = (C119871dl) C119873dn.f333836c.createBuilder();
        C119896o oVar = (C119896o) C119904w.f333909c.createBuilder();
        C62912at atVar = C62912at.f169862a;
        oVar.copyOnWrite();
        C119904w wVar = (C119904w) oVar.instance;
        atVar.getClass();
        wVar.f333912b = atVar;
        wVar.f333911a = 1;
        dlVar.copyOnWrite();
        C119873dn dnVar = (C119873dn) dlVar.instance;
        C119904w wVar2 = (C119904w) oVar.build();
        wVar2.getClass();
        dnVar.f333839b = wVar2;
        dnVar.f333838a = 1;
        f334090b = (C119873dn) dlVar.build();
    }

    public C119979bg(C120692g gVar, C119996j jVar, Executor executor) {
        this.f334091c = gVar;
        this.f334096h = jVar;
        this.f334092d = new C60904dr(executor);
        this.f334093e = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo104597a(C119873dn dnVar) {
        C58976aa aaVar = C58975e.f156826a;
        C119996j jVar = this.f334096h;
        C119870dk dkVar = (C119870dk) C119874do.f333841c.createBuilder();
        dkVar.copyOnWrite();
        C119874do doVar = (C119874do) dkVar.instance;
        dnVar.getClass();
        doVar.f333844b = dnVar;
        doVar.f333843a = 2;
        jVar.mo104614b((C119874do) dkVar.build());
    }
}
