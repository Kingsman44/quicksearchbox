package com.google.android.apps.search.googleapp.saves.savefeature.p10398c;

import com.google.android.apps.search.googleapp.saves.savefeature.p10398c.p10399a.C137285a;
import com.google.android.apps.search.googleapp.saves.savefeature.p10398c.p10399a.C137286b;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.c.g */
/* compiled from: PG */
final class C137293g implements C47352j {

    /* renamed from: a */
    private static final C59071e f373493a = C59071e.m91332i("com.google.android.apps.search.googleapp.saves.savefeature.c.g");

    /* renamed from: b */
    private final C137286b f373494b;

    public C137293g(C137286b bVar) {
        C59104x b = f373493a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SavesShareReceiver");
        ((C59052c) ((C59052c) b).mo56372aa(40952)).mo56386p("#SavesShareReceiverSynclet()");
        this.f373494b = bVar;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        C59104x b = f373493a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SavesShareReceiver");
        ((C59052c) ((C59052c) b).mo56372aa(40951)).mo56386p("#SavesShareReceiverSynclet.update()");
        C137286b bVar = this.f373494b;
        C59104x b2 = C137286b.f373483a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SavesShareReceiver");
        ((C59052c) ((C59052c) b2).mo56372aa(40956)).mo56389s("enableSavesSharesheet: %b", bVar.f373486d);
        return bVar.f373485c.mo19399b(C47810es.m84978r(new C137285a(bVar)));
    }
}
