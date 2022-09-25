package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90433n;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7503e.C95635d;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7504f.C95638b;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95695a;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95699e;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95705k;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.n */
/* compiled from: PG */
public final class C95618n implements C95599at {

    /* renamed from: a */
    public final C95706l f267607a;

    /* renamed from: b */
    public final C95635d f267608b;

    /* renamed from: c */
    public final C95638b f267609c;

    /* renamed from: d */
    public final C21370a f267610d;

    /* renamed from: e */
    public C95627w f267611e;

    public C95618n(C95706l lVar, C95635d dVar, C95638b bVar, C21370a aVar) {
        this.f267607a = lVar;
        this.f267608b = dVar;
        this.f267609c = bVar;
        this.f267610d = aVar;
    }

    /* renamed from: a */
    public final void mo89550a(C90421b bVar) {
        C95706l lVar = this.f267607a;
        C90433n nVar = bVar.f252594o;
        if (nVar == null) {
            C89655j.m145957a("No playback state");
        } else if (nVar.f252643c != null) {
            C89655j.m145957a("Playback type is already set");
        } else {
            C95705k g = lVar.mo89665g(bVar);
            C59104x b = C95706l.f267942a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "EngagementTracker");
            C95695a aVar = (C95695a) g;
            ((C59052c) ((C59052c) b).mo56372aa(16500)).mo56393w("Set playback type->%d(%d)", aVar.f267916a, aVar.f267917b);
            if (nVar.mo84174j(aVar.f267916a)) {
                lVar.f267948f.mo89592o(new C95699e(lVar, nVar));
            }
        }
    }
}
