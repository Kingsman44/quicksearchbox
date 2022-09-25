package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8198b;

import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82398ds;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8197a.C106225c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.b.s */
/* compiled from: PG */
final class C106259s implements C106260t {

    /* renamed from: a */
    final /* synthetic */ C106261u f296465a;

    /* renamed from: b */
    private final ServiceConnection f296466b;

    /* renamed from: c */
    private final C106225c f296467c;

    public C106259s(C106261u uVar, ServiceConnection serviceConnection, C106225c cVar) {
        this.f296465a = uVar;
        this.f296466b = serviceConnection;
        this.f296467c = cVar;
    }

    /* renamed from: f */
    private final void m177047f() {
        C59071e eVar = C106261u.f296468a;
        C58976aa aaVar = C58975e.f156826a;
        this.f296465a.f296478k.size();
        for (C106258r rVar : this.f296465a.f296478k) {
            try {
                this.f296467c.mo95458e(rVar.mo95461b().toByteArray(), rVar.mo95460a());
                this.f296465a.f296474g.mo75579d(new C82398ds("NGA_OPA_EVENT_ENQUEUE_DELAY_TIME", Double.valueOf((double) Duration.between(rVar.mo95462c(), this.f296465a.f296475h.mo57444a()).toMillis())));
            } catch (RemoteException e) {
                C59104x c = C106261u.f296468a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NgaEntryPointEventSendr");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25191)).mo56386p("Couldn't send NgaEventData");
            }
        }
        this.f296465a.f296478k.clear();
    }

    /* renamed from: a */
    public final String mo95471a() {
        return "Ready";
    }

    /* renamed from: b */
    public final void mo95472b() {
        m177047f();
    }

    /* renamed from: c */
    public final void mo95473c(String str) {
        this.f296465a.mo95476a(this.f296466b, str);
    }

    /* renamed from: d */
    public final void mo95474d() {
        m177047f();
    }

    /* renamed from: e */
    public final void mo95475e() {
        this.f296465a.mo95476a(this.f296466b, "onOpaDisconnected");
    }
}
