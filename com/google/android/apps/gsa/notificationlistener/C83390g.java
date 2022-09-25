package com.google.android.apps.gsa.notificationlistener;

import com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36600c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.notificationlistener.g */
/* compiled from: PG */
public final class C83390g {

    /* renamed from: a */
    private final C36599b f227271a;

    /* renamed from: b */
    private final AtomicBoolean f227272b = new AtomicBoolean(true);

    public C83390g(C36599b bVar) {
        this.f227271a = bVar;
    }

    /* renamed from: a */
    public final GsaNotificationListenerService mo76690a() {
        GsaNotificationListenerService a;
        if (this.f227272b.get() && (a = C83391h.m132722a()) != null) {
            return a;
        }
        throw new C36600c();
    }

    /* renamed from: b */
    public final void mo76691b() {
        if (!this.f227272b.getAndSet(false)) {
            C59071e eVar = C83391h.f227273a;
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C83391h hVar = (C83391h) C83391h.f227274b.get();
        if (hVar != null) {
            hVar.f227277e.remove(this.f227271a);
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
    }
}
