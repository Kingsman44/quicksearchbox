package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119800av;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119804az;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32510c;
import com.google.android.libraries.search.assistant.p2511d.p2512a.C32512e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.i */
/* compiled from: PG */
final class C119995i implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C119996j f334118a;

    public C119995i(C119996j jVar) {
        this.f334118a = jVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f334118a.mo104613a((Throwable) null);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
        this.f334118a.mo104613a(th);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C32510c cVar;
        C119800av avVar;
        C32512e eVar;
        C119804az azVar = (C119804az) obj;
        C58976aa aaVar = C58975e.f156826a;
        int i = azVar.f333705a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 1) {
            C120000n nVar = (C120000n) this.f334118a.f334123e.mo27525b();
            if (azVar.f333705a == 2) {
                cVar = (C32510c) azVar.f333706b;
            } else {
                cVar = C32510c.f87086e;
            }
            nVar.f334134b.mo38128b(cVar);
        } else if (i3 == 2) {
            C119944aa aaVar2 = (C119944aa) this.f334118a.f334119a.mo27525b();
            if (azVar.f333705a == 3) {
                avVar = (C119800av) azVar.f333706b;
            } else {
                avVar = C119800av.f333693d;
            }
            aaVar2.f334027b.execute(C47810es.m84977q(new C120006t(aaVar2, avVar)));
        } else if (i3 == 3) {
            C119985bl blVar = (C119985bl) this.f334118a.f334122d.mo27525b();
            if (azVar.f333705a == 4) {
                eVar = (C32512e) azVar.f333706b;
            } else {
                eVar = C32512e.f87093e;
            }
            blVar.f334101a.mo38121c(eVar);
        }
    }
}
