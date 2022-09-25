package com.google.android.apps.gsa.staticplugins.p7890ec.p7892b.p7893a.p7894a;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66667eg;
import com.google.speech.p5208h.C66671ek;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ec.b.a.a.v */
/* compiled from: PG */
public final class C100406v extends C68247h {

    /* renamed from: a */
    private final C68283d f280717a;

    public C100406v(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C100406v.class), aVar);
        this.f280717a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C66667eg egVar;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            egVar = C66667eg.m97298a(((C66671ek) axVar.mo56107c()).f181365b);
            if (egVar == null) {
                egVar = C66667eg.UNKNOWN_ENROLLMENT_VALIDATION_RESULT;
            }
        } else {
            C59104x c = C100405u.f280716a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ValidationResultModule");
            ((C59052c) ((C59052c) c).mo56372aa(33396)).mo56386p("No validation result returned from audio-logging pipeline!");
            egVar = C66667eg.UNKNOWN_ENROLLMENT_VALIDATION_RESULT;
        }
        return C60856cj.m92900i(egVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f280717a.mo60297gq();
    }
}
