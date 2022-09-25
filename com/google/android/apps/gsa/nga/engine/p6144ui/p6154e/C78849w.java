package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78256f;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.C78636ao;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.w */
/* compiled from: PG */
public final class C78849w implements C78256f {

    /* renamed from: a */
    public static final C59071e f217000a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.w");

    /* renamed from: b */
    public final C83357g f217001b;

    /* renamed from: c */
    public final C58485gu f217002c;

    /* renamed from: d */
    public final C90919bp f217003d = new C78762q(this);

    /* renamed from: e */
    public final C83358h f217004e;

    /* renamed from: f */
    private final C22871g f217005f;

    public C78849w(C22871g gVar, C78636ao aoVar, Map map) {
        C83361k kVar = new C83361k(false, C78263m.class);
        this.f217001b = kVar;
        this.f217005f = gVar;
        this.f217002c = (C58485gu) Collection.EL.stream(map.entrySet()).sorted(C78769r.f216839a).map(C78774s.f216851a).collect(C58370cn.f155946a);
        this.f217004e = C83349aj.m132656k(kVar, aoVar.mo73560a(), C78818t.f216933a);
    }

    /* renamed from: b */
    public final void mo73230b() {
        this.f217005f.mo28212l("[NGA] UiStateLifecycleController.onAssistantDisabled", new C78839v(this));
    }

    /* renamed from: c */
    public final void mo73231c() {
        this.f217005f.mo28212l("[NGA] UiStateLifecycleController.onAssistantEnabled", new C78746p(this));
    }

    /* renamed from: f */
    public final void mo73232f() {
        this.f217005f.mo28212l("[NGA] UiStateLifecycleController.onAssistantInitialized", new C78825u(this));
    }

    /* renamed from: g */
    public final void mo73233g() {
        this.f217005f.mo28212l("[NGA] UiStateLifecycleController.onAssistantInitializing", new C78741o(this));
    }
}
