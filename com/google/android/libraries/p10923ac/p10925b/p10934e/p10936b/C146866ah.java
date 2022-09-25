package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import com.google.android.libraries.p10923ac.p10925b.p10944k.C147148h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64085en;
import com.google.protos.p4895aw.p4902b.C64086eo;
import com.google.protos.p4895aw.p4902b.C64087ep;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.b.ah */
/* compiled from: PG */
public final class C146866ah extends C68247h {

    /* renamed from: a */
    private final C68283d f396443a;

    /* renamed from: c */
    private final C68283d f396444c;

    public C146866ah(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C146866ah.class), aVar);
        this.f396443a = C68236af.m98549d(dVar);
        this.f396444c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C64087ep epVar = (C64087ep) obj;
        C68283d dVar = this.f396444c;
        int i = 0;
        for (C64086eo eoVar : epVar.f173263d) {
            C64085en a = C64085en.m96348a(eoVar.f173256c);
            if (a == null) {
                a = C64085en.UNKNOWN;
            }
            if (a == C64085en.DELTA_FAILURE) {
                i++;
            }
        }
        if (i <= 0) {
            return C60856cj.m92900i(epVar);
        }
        if (i == epVar.f173263d.size()) {
            return dVar.mo60297gq();
        }
        throw new C147148h("If server fails to decode deltas, it should reject all changes with DELTA_FAILURE!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f396443a.mo60297gq();
    }
}
