package com.google.android.apps.gsa.publicsearch;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.publicsearch.b */
/* compiled from: PG */
abstract class C84202b extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f229199a;

    /* renamed from: b */
    private final Object f229200b = new Object();

    /* renamed from: c */
    private boolean f229201c = false;

    /* renamed from: a */
    public final C68326i mo77676a() {
        if (this.f229199a == null) {
            synchronized (this.f229200b) {
                if (this.f229199a == null) {
                    this.f229199a = new C68326i(this);
                }
            }
        }
        return this.f229199a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo77676a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f229201c) {
            this.f229201c = true;
            PublicSearchService publicSearchService = (PublicSearchService) this;
            amb amb = (amb) mo77676a().mo17653jN();
            publicSearchService.f229190c = (C22871g) amb.f197807b.aT.mo17428b();
            publicSearchService.f229191d = (C87677ae) amb.f197807b.a.f202634al.mo17428b();
        }
        super.onCreate();
    }
}
