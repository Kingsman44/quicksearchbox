package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.p794a.p795a.p796a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.C12393a;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13901e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67171p;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a.a.g */
/* compiled from: PG */
public final class C12363g extends C68247h {

    /* renamed from: a */
    private final C68283d f39184a;

    public C12363g(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C12363g.class), aVar);
        this.f39184a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C12393a aVar = (C12393a) obj;
        boolean z = false;
        if (aVar.mo20571a().mo56113h()) {
            C67073ka kaVar = ((C13901e) aVar.mo20571a().mo56107c()).f42333b;
            if (kaVar == null) {
                kaVar = C67073ka.f182324f;
            }
            C67171p pVar = kaVar.f182327b;
            if (pVar == null) {
                pVar = C67171p.f182575e;
            }
            if ((pVar.f182577a & 1) != 0) {
                z = true;
            }
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f39184a.mo60297gq();
    }
}
