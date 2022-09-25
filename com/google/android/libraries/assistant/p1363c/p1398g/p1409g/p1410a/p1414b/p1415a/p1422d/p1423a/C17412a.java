package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.p1422d.p1423a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1414b.p1415a.C17404a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.b.a.d.a.a */
/* compiled from: PG */
public final class C17412a extends C68247h {

    /* renamed from: a */
    private final C68283d f50310a;

    public C17412a(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C17412a.class), aVar);
        this.f50310a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Optional optional;
        C17485au auVar = (C17485au) obj;
        if (auVar.f50484b == 3) {
            C67187ae aeVar = (C67187ae) ((C67190ah) auVar.f50485c).toBuilder();
            aeVar.copyOnWrite();
            C67190ah ahVar = (C67190ah) aeVar.instance;
            ahVar.f182622a |= 512;
            ahVar.f182629h = true;
            C58976aa aaVar = C58975e.f156826a;
            optional = Optional.m71637of(new C17404a(Optional.m71637of((C67190ah) aeVar.build()), C67190ah.f182620r));
        } else {
            optional = Optional.empty();
        }
        return C60856cj.m92900i(optional);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f50310a.mo60297gq();
    }
}
