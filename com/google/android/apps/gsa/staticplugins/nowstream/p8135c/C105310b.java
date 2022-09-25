package com.google.android.apps.gsa.staticplugins.nowstream.p8135c;

import com.google.android.apps.gsa.proactive.C84170f;
import com.google.android.apps.gsa.sidekick.main.entry.C91314as;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91732b;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91737g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.b */
/* compiled from: PG */
public final class C105310b implements C91737g {

    /* renamed from: a */
    public final C84170f f293834a;

    /* renamed from: b */
    public final C84170f f293835b;

    /* renamed from: c */
    public final C84170f f293836c;

    /* renamed from: d */
    public final C84170f f293837d;

    /* renamed from: e */
    public final C84170f f293838e;

    /* renamed from: f */
    public final C84170f f293839f;

    /* renamed from: g */
    public final C84170f f293840g;

    /* renamed from: h */
    public boolean f293841h;

    /* renamed from: i */
    private final C91314as f293842i;

    /* renamed from: j */
    private final C22871g f293843j;

    public C105310b(C91314as asVar, C22871g gVar, C84170f fVar, C84170f fVar2, C84170f fVar3, C84170f fVar4, C84170f fVar5, C84170f fVar6, C84170f fVar7) {
        this.f293842i = asVar;
        this.f293843j = gVar;
        this.f293834a = fVar;
        this.f293835b = fVar2;
        this.f293836c = fVar3;
        this.f293837d = fVar4;
        this.f293838e = fVar5;
        this.f293839f = fVar6;
        this.f293840g = fVar7;
    }

    /* renamed from: a */
    public final void mo94713a() {
        if (!this.f293841h) {
            C58976aa aaVar = C58975e.f156826a;
            this.f293842i.registerObserver(this);
            this.f293841h = true;
        }
    }

    /* renamed from: b */
    public final void mo94714b() {
        if (this.f293841h) {
            C58976aa aaVar = C58975e.f156826a;
            this.f293842i.unregisterObserver(this);
            this.f293841h = false;
        }
    }

    /* renamed from: i */
    public final void mo85844i(C91732b bVar) {
        this.f293843j.mo28212l("LobbyEntryProviderObserver.processEntryChange", new C105175a(this, bVar));
    }
}
