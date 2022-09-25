package com.google.android.remotesearch;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.remotesearch.a */
/* compiled from: PG */
abstract class C45215a extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f118007a;

    /* renamed from: b */
    private final Object f118008b = new Object();

    /* renamed from: c */
    private boolean f118009c = false;

    /* renamed from: a */
    public final C68326i mo49067a() {
        if (this.f118007a == null) {
            synchronized (this.f118008b) {
                if (this.f118007a == null) {
                    this.f118007a = new C68326i(this);
                }
            }
        }
        return this.f118007a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo49067a().mo17653jN();
    }

    public final void onCreate() {
        if (!this.f118009c) {
            this.f118009c = true;
            RemoteSearchService remoteSearchService = (RemoteSearchService) this;
            amb amb = (amb) mo49067a().mo17653jN();
            remoteSearchService.f117991c = (C21370a) amb.f197807b.i.mo17428b();
            remoteSearchService.f117992d = (C85651bb) amb.f197807b.a.f202740cl.mo17428b();
            remoteSearchService.f117993e = (C22871g) amb.f197807b.aT.mo17428b();
            remoteSearchService.f117994f = C68219e.m98518a(amb.f197807b.d.f201781fb);
            remoteSearchService.f117995g = C68219e.m98518a(amb.f197807b.a.f202902fo);
            remoteSearchService.f117996h = (C91097g) amb.f197807b.b.f200085ct.mo17428b();
            remoteSearchService.f117997i = (C87677ae) amb.f197807b.a.f202634al.mo17428b();
            remoteSearchService.f118000l = amb.mo65941e();
            remoteSearchService.f118001m = (Query) amb.f197807b.hm.mo17428b();
        }
        super.onCreate();
    }
}
