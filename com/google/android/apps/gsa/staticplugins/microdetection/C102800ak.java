package com.google.android.apps.gsa.staticplugins.microdetection;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6680cx.C85247a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86798m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.ak */
/* compiled from: PG */
public final class C102800ak extends C86734a implements C85247a {

    /* renamed from: a */
    public final C86798m f287050a;

    /* renamed from: b */
    private final C22871g f287051b;

    public C102800ak(C86798m mVar, C22871g gVar) {
        super(C118575h.WORKER_MICRO_DETECTION, "sharedmicrodetection");
        this.f287050a = mVar;
        this.f287051b = gVar;
    }

    /* renamed from: a */
    public final void mo78821a(boolean z) {
        this.f287051b.mo28212l("set barge in enabled for query", new C102793ad(this, z));
    }

    /* renamed from: b */
    public final void mo78822b() {
        C22871g gVar = this.f287051b;
        C86798m mVar = this.f287050a;
        Objects.requireNonNull(mVar);
        gVar.mo28212l("set force update data manager", new C102798ai(mVar));
    }

    /* renamed from: c */
    public final void mo78823c(boolean z) {
        this.f287051b.mo28212l("set hotword available for query", new C102794ae(this, z));
    }

    /* renamed from: d */
    public final void mo78824d(boolean z) {
        this.f287051b.mo28212l("set hotword requested for by client", new C102795af(this, z));
    }

    /* renamed from: e */
    public final void mo78825e(boolean z) {
        this.f287051b.mo28212l("set hotword requested for seamless dialog", new C102796ag(this, z));
    }

    /* renamed from: f */
    public final void mo78826f(boolean z) {
        this.f287051b.mo28212l("set persist hint", new C102797ah(this, z));
    }

    /* renamed from: g */
    public final void mo78827g(boolean z) {
        this.f287051b.mo28212l("set should client handle hotword", new C102799aj(this, z));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
