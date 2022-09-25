package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p770b.p771a.p772a;

import com.google.android.libraries.assistant.auto.tng.common.p926m.p927a.C13293a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.a.a.a */
/* compiled from: PG */
public final class C12199a extends C68247h {

    /* renamed from: a */
    private final C68283d f38915a;

    public C12199a(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C12199a.class), aVar);
        this.f38915a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C16730ar arVar;
        if (((C13293a) obj).mo21011a()) {
            arVar = C16730ar.ASSUMING_GOOD_NETWORK;
        } else {
            arVar = C16730ar.OFFLINE;
        }
        C57987f fVar = new C57987f();
        fVar.f155056f.mo54591h(arVar);
        fVar.f155056f.mo54589f(false);
        return C60856cj.m92900i(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f38915a.mo60297gq();
    }
}
