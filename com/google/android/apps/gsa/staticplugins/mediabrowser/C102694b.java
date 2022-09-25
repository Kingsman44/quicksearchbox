package com.google.android.apps.gsa.staticplugins.mediabrowser;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.staticplugins.mediabrowser.b */
/* compiled from: PG */
class C102694b extends C102692a implements C68288b {

    /* renamed from: j */
    private volatile C68326i f286654j;

    /* renamed from: k */
    private final Object f286655k = new Object();

    /* renamed from: l */
    private boolean f286656l = false;

    public C102694b() {
        super("OpaMBService", "opa_media_player");
    }

    /* renamed from: i */
    public final C68326i mo93390i() {
        if (this.f286654j == null) {
            synchronized (this.f286655k) {
                if (this.f286654j == null) {
                    this.f286654j = new C68326i(this);
                }
            }
        }
        return this.f286654j;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93390i().mo17653jN();
    }

    public void onCreate() {
        if (!this.f286656l) {
            this.f286656l = true;
            OpaMediaBrowserService opaMediaBrowserService = (OpaMediaBrowserService) this;
            amb amb = (amb) mo93390i().mo17653jN();
            opaMediaBrowserService.f286646h = (C87677ae) amb.f197807b.a.f202634al.mo17428b();
            opaMediaBrowserService.f286647i = (Random) amb.f197807b.bh.mo17428b();
        }
        super.onCreate();
    }
}
