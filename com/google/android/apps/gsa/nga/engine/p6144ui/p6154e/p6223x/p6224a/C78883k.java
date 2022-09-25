package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6223x.p6224a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78253d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78256f;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.C78636ao;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6228f.p6229a.C78897a;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83363m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.x.a.k */
/* compiled from: PG */
public final class C78883k implements C78256f {

    /* renamed from: a */
    public final C78253d f217065a;

    /* renamed from: b */
    public final C83358h f217066b;

    /* renamed from: c */
    public final C83358h f217067c;

    /* renamed from: d */
    public final C83363m f217068d = new C83363m();

    /* renamed from: e */
    public final C83358h f217069e;

    /* renamed from: f */
    public final C78897a f217070f;

    /* renamed from: g */
    public final C78636ao f217071g;

    /* renamed from: h */
    private final C22871g f217072h;

    public C78883k(C78253d dVar, C83358h hVar, C83358h hVar2, C83358h hVar3, C22871g gVar, C78636ao aoVar, C78897a aVar) {
        this.f217065a = dVar;
        this.f217066b = hVar;
        this.f217069e = hVar2;
        this.f217067c = hVar3;
        this.f217072h = gVar;
        this.f217071g = aoVar;
        this.f217070f = aVar;
    }

    /* renamed from: a */
    public static boolean m126757a(C78245d dVar, boolean z) {
        if (dVar.mo73180b().mo73172e()) {
            return z;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo73230b() {
        C22871g gVar = this.f217072h;
        C83363m mVar = this.f217068d;
        Objects.requireNonNull(mVar);
        gVar.mo28212l("[NGA] onAssistantDisabled", new C78881i(mVar));
    }

    /* renamed from: c */
    public final void mo73231c() {
        this.f217072h.mo28212l("[NGA] onAssistantEnabled", new C78882j(this));
    }

    /* renamed from: f */
    public final /* synthetic */ void mo73232f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo73233g() {
    }
}
