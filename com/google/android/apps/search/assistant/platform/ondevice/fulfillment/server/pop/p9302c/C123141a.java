package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122462q;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122463r;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122464s;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122465t;
import com.google.apps.tiktok.experiments.C46897i;
import p5304e.p5305a.p5306a.p5307a.p5308a.p5309a.p5310a.p5311a.p5312a.C68334g;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.c.a */
/* compiled from: PG */
public final class C123141a {

    /* renamed from: a */
    private final boolean f340807a;

    /* renamed from: b */
    private C122463r f340808b;

    /* renamed from: c */
    private final C68334g f340809c;

    public C123141a(C68334g gVar, boolean z) {
        this.f340809c = gVar;
        this.f340807a = z;
    }

    /* renamed from: a */
    public final synchronized C122463r mo105894a() {
        if (this.f340808b == null) {
            C122462q qVar = (C122462q) C122463r.f339493g.createBuilder();
            qVar.copyOnWrite();
            ((C122463r) qVar.instance).f339495a = true;
            boolean f = ((C46897i) this.f340809c.f184680a.mo17428b()).mo50901a("googledata.experiments.mobile.assistant.client_packages.component.nlu_ff.device 45361023").mo50907f();
            qVar.copyOnWrite();
            ((C122463r) qVar.instance).f339497c = f;
            C122464s sVar = (C122464s) C122465t.f339501d.createBuilder();
            boolean z = this.f340807a;
            sVar.copyOnWrite();
            ((C122465t) sVar.instance).f339505c = z;
            C122465t tVar = (C122465t) sVar.build();
            qVar.copyOnWrite();
            tVar.getClass();
            ((C122463r) qVar.instance).f339496b = tVar;
            this.f340808b = (C122463r) qVar.build();
        }
        return this.f340808b;
    }

    /* renamed from: b */
    public final synchronized void mo105895b(C122463r rVar) {
        this.f340808b = rVar;
    }
}
