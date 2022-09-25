package com.google.android.libraries.lens.ondevice.p2024d;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62323cs;
import com.google.lens.p4701g.C62324ct;
import com.google.lens.p4705i.p4706a.C62377h;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.d.h */
/* compiled from: PG */
public final class C24414h extends C68247h {

    /* renamed from: a */
    private final C68283d f66849a;

    /* renamed from: c */
    private final C68283d f66850c;

    public C24414h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C24414h.class), aVar);
        this.f66849a = C68236af.m98549d(dVar);
        this.f66850c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        int a;
        C62324ct ctVar = (C62324ct) obj;
        C68283d dVar = this.f66850c;
        ((C58970a) ((C58970a) C24374d.f66761a.mo56224b()).mo56372aa(48761)).mo56386p("Executing: maybeRunRaidClassifier");
        if (ctVar.f168240b && ((a = C62323cs.m94766a(ctVar.f168241c)) == 0 || a != 2)) {
            return C60856cj.m92900i(C62377h.f168391c);
        }
        ((C58970a) ((C58970a) C24374d.f66761a.mo56224b()).mo56372aa(48762)).mo56386p("maybeRunRaidClassifier: not sensitive image or bypassed");
        return dVar.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f66849a.mo60297gq();
    }
}
