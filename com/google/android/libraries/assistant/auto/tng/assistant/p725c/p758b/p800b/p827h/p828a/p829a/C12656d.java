package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.p799a.C12394a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.p799a.C12395b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.recognizer.p5233a.C67451at;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.d */
/* compiled from: PG */
public final class C12656d extends C68247h {

    /* renamed from: a */
    private final C68283d f39681a;

    public C12656d(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C12656d.class), aVar);
        this.f39681a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        int intValue = ((Integer) obj).intValue();
        C12394a aVar = (C12394a) C12395b.f39242e.createBuilder();
        aVar.copyOnWrite();
        C12395b bVar = (C12395b) aVar.instance;
        bVar.f39244a |= 2;
        bVar.f39246c = 16000;
        C67451at atVar = C67451at.LINEAR16;
        aVar.copyOnWrite();
        C12395b bVar2 = (C12395b) aVar.instance;
        bVar2.f39245b = atVar.f183321p;
        bVar2.f39244a |= 1;
        aVar.copyOnWrite();
        C12395b bVar3 = (C12395b) aVar.instance;
        bVar3.f39244a |= 4;
        bVar3.f39247d = intValue;
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i((C12395b) aVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f39681a.mo60297gq();
    }
}
