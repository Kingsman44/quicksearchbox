package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19414r;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19415s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.x */
/* compiled from: PG */
final class C101011x implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C19415s f282102a;

    /* renamed from: b */
    final /* synthetic */ C19414r f282103b;

    public C101011x(C19415s sVar, C19414r rVar) {
        this.f282102a = sVar;
        this.f282103b = rVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        try {
            this.f282102a.mo24606d(this.f282103b, false);
        } catch (Throwable th2) {
            C59104x d = C101012y.f282104a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TrainCommBinder");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th2)).mo56372aa(19607)).mo56389s("Failed to log p13n training scheduling failure for session %s.", this.f282103b.mo24572g());
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        try {
            this.f282102a.mo24606d(this.f282103b, true);
        } catch (Throwable th) {
            C59104x d = C101012y.f282104a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TrainCommBinder");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(19608)).mo56389s("Failed to log p13n training scheduling success for session %s.", this.f282103b.mo24572g());
        }
    }
}
