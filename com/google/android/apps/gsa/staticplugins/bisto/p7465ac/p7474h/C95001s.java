package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e.C94960u;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95130w;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.s */
/* compiled from: PG */
public final /* synthetic */ class C95001s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95005w f265779a;

    /* renamed from: b */
    public final /* synthetic */ C95455a f265780b;

    /* renamed from: c */
    public final /* synthetic */ C95007y f265781c;

    /* renamed from: d */
    public final /* synthetic */ boolean f265782d;

    /* renamed from: e */
    public final /* synthetic */ int f265783e;

    /* renamed from: f */
    public final /* synthetic */ C94960u f265784f;

    public /* synthetic */ C95001s(C95005w wVar, C95455a aVar, C95007y yVar, boolean z, int i, C94960u uVar) {
        this.f265779a = wVar;
        this.f265780b = aVar;
        this.f265781c = yVar;
        this.f265782d = z;
        this.f265783e = i;
        this.f265784f = uVar;
    }

    public final void run() {
        C95005w wVar = this.f265779a;
        C95455a aVar = this.f265780b;
        C95007y yVar = this.f265781c;
        boolean z = this.f265782d;
        int i = this.f265783e;
        C94960u uVar = this.f265784f;
        C94983ab abVar = wVar.f265809c;
        abVar.f265719h = new C95003u(wVar, yVar);
        abVar.f265722k = uVar;
        C58976aa aaVar = C58975e.f156826a;
        abVar.f265720i = null;
        abVar.f265721j = null;
        abVar.f265718g = true;
        abVar.f265716e = true;
        abVar.f265717f = true;
        C95008z zVar = abVar.f265714c;
        zVar.f266156a.mo81940l(abVar, C94983ab.f265713b);
        Bundle b = C95130w.m157241b(aVar.f267099b);
        b.putInt("com.google.android.apps.gsa.shared.bisto.AUDIO_SAMPLING_RATE", i);
        long a = abVar.f265714c.mo88916a(aVar.f267098a, b);
        C95007y yVar2 = abVar.f265719h;
        if (yVar2 == null) {
            C59104x c = C94983ab.f265712a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
            ((C59052c) ((C59052c) c).mo56372aa(17857)).mo56386p("No callback!");
            return;
        }
        yVar2.mo88822m(a, z);
    }
}
