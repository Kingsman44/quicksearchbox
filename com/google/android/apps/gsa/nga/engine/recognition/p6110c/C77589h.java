package com.google.android.apps.gsa.nga.engine.recognition.p6110c;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22870f;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c.h */
/* compiled from: PG */
public final /* synthetic */ class C77589h implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C77595n f213752a;

    /* renamed from: b */
    public final /* synthetic */ Duration f213753b;

    public /* synthetic */ C77589h(C77595n nVar, Duration duration) {
        this.f213752a = nVar;
        this.f213753b = duration;
    }

    public final void run() {
        C77595n nVar = this.f213752a;
        Duration duration = this.f213753b;
        if (!nVar.f213781k.mo74010c()) {
            duration.toMillis();
            nVar.f213772b.a(C89849ae.NGA_PAUSED_SEARCH_PROCESS_DEAD, C83016y.SEARCH_PROCESS_DEAD);
        }
    }
}
