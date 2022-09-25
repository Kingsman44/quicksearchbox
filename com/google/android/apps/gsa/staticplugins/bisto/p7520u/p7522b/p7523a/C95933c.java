package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.c */
/* compiled from: PG */
final class C95933c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Intent f268616a;

    /* renamed from: b */
    final /* synthetic */ C95937g f268617b;

    public C95933c(C95937g gVar, Intent intent) {
        this.f268617b = gVar;
        this.f268616a = intent;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C95937g.f268622a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoClassicManager");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(15719)).mo56386p("Failed to get connected BT devices");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        for (C124539a e : (Collection) obj) {
            this.f268617b.mo89862d(this.f268616a, this.f268617b.f268624c.mo89302e(e).mo89270k());
            this.f268617b.mo89863e();
        }
    }
}
