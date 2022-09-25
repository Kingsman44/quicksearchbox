package com.google.android.apps.search.assistant.surfaces.roti.home;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32881e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.an */
/* compiled from: PG */
public final /* synthetic */ class C126776an implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126778ap f349117a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f349118b;

    public /* synthetic */ C126776an(C126778ap apVar, Throwable th) {
        this.f349117a = apVar;
        this.f349118b = th;
    }

    public final void run() {
        C126778ap apVar = this.f349117a;
        Throwable th = this.f349118b;
        if (th != null) {
            C59071e eVar = C126780ar.f349122a;
            C58976aa aaVar = C58975e.f156826a;
            if (apVar.f349121a.f349133l.isPresent()) {
                String message = th.getMessage();
                message.getClass();
                ((C2164c) apVar.f349121a.f349133l.get()).mo5439d(new C126847h(message));
                apVar.f349121a.f349133l = Optional.empty();
            } else if (apVar.f349121a.f349134m.isPresent()) {
                String message2 = th.getMessage();
                message2.getClass();
                ((C2164c) apVar.f349121a.f349134m.get()).mo5439d(new C126847h(message2));
                apVar.f349121a.f349134m = Optional.empty();
            } else {
                C126786ax axVar = apVar.f349121a.f349129h;
                axVar.f349153h.set(th);
                axVar.f349150e.mo50787a(C60866ct.f164955a, C126786ax.f349148c);
            }
        }
        C32881e eVar2 = apVar.f349121a.f349138q;
        if (eVar2 != null) {
            eVar2.close();
        }
        apVar.f349121a.f349128g = null;
    }
}
