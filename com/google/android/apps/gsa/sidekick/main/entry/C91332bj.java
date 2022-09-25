package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.proactive.p6475b.C84163f;
import com.google.android.apps.gsa.proactive.p6475b.C84164g;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.shared.p6996ar.C89284a;
import com.google.android.apps.gsa.sidekick.main.p7219n.C91480f;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.bj */
/* compiled from: PG */
abstract class C91332bj extends C89284a implements C68288b {

    /* renamed from: a */
    private volatile C68326i f254882a;

    /* renamed from: b */
    private final Object f254883b = new Object();

    /* renamed from: c */
    private boolean f254884c = false;

    public C91332bj() {
        super("EntriesRefreshIntentSer");
    }

    /* renamed from: a */
    public final C68326i mo85657a() {
        if (this.f254882a == null) {
            synchronized (this.f254883b) {
                if (this.f254882a == null) {
                    this.f254882a = new C68326i(this);
                }
            }
        }
        return this.f254882a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo85657a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f254884c) {
            this.f254884c = true;
            EntriesRefreshIntentService entriesRefreshIntentService = (EntriesRefreshIntentService) this;
            amb amb = (amb) mo85657a().mo17653jN();
            entriesRefreshIntentService.f254796a = (C84160c) amb.f197807b.a.f202739ck.mo17428b();
            entriesRefreshIntentService.f254797b = (C91320ay) amb.f197807b.a.f202749cu.mo17428b();
            entriesRefreshIntentService.f254798c = (C84163f) amb.f197807b.b.f200259gH.mo17428b();
            entriesRefreshIntentService.f254799d = (C85651bb) amb.f197807b.a.f202740cl.mo17428b();
            entriesRefreshIntentService.f254800e = (C91480f) amb.f197807b.a.f202791dj.mo17428b();
            entriesRefreshIntentService.f254801f = (C84164g) amb.f197807b.b.f200298gu.mo17428b();
        }
        super.onCreate();
    }
}
