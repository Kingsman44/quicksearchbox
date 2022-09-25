package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.search.shared.service.p6934a.C87672g;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.common.base.C58833ax;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.search.core.service.u */
/* compiled from: PG */
abstract class C86778u extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f234405a;

    /* renamed from: b */
    private final Object f234406b = new Object();

    /* renamed from: c */
    private boolean f234407c = false;

    /* renamed from: a */
    public final C68326i mo80394a() {
        if (this.f234405a == null) {
            synchronized (this.f234406b) {
                if (this.f234405a == null) {
                    this.f234405a = new C68326i(this);
                }
            }
        }
        return this.f234405a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo80394a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f234407c) {
            this.f234407c = true;
            SearchService searchService = (SearchService) this;
            amb amb = (amb) mo80394a().mo17653jN();
            searchService.f233938d = (C91022f) amb.f197807b.a.f202649b.mo17428b();
            searchService.f233939e = (C90476a) amb.f197807b.r.mo17428b();
            searchService.f233943i = (C87672g) amb.f197807b.cO.mo17428b();
            searchService.f233940f = (C58833ax) amb.f197807b.b.f200017be.mo17428b();
            searchService.f233941g = (C38802e) amb.f197807b.b.f200020bh.mo17428b();
            searchService.f233942h = (C21370a) amb.f197807b.i.mo17428b();
        }
        super.onCreate();
    }
}
