package com.google.android.apps.gsa.staticplugins.p7649cf;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6600bm.C84904a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cf.c */
/* compiled from: PG */
public final class C97594c extends C86734a implements C84904a {

    /* renamed from: a */
    public final C86610af f272613a;

    /* renamed from: b */
    private final C22871g f272614b;

    public C97594c(C22871g gVar, C22871g gVar2, C86610af afVar, C68214a aVar) {
        super(C118575h.WORKER_NOW_SERVICE, "nowservice");
        this.f272614b = gVar;
        this.f272613a = afVar;
        gVar2.mo28212l("Start Now services", new C97593b(aVar));
    }

    /* renamed from: a */
    public final C60870cx mo78576a() {
        return C118826c.m197213c(this.f272614b.mo28207g("Start Now services", new C97592a(this)));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NowServiceWorker");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
