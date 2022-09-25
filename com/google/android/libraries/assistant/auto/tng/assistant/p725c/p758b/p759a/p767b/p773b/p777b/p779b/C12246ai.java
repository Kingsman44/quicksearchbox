package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p779b;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.b.ai */
/* compiled from: PG */
public final class C12246ai extends C68247h {

    /* renamed from: a */
    private final C69464a f38998a;

    /* renamed from: c */
    private final C68283d f38999c;

    public C12246ai(C69464a aVar, C69464a aVar2, C69464a aVar3, C68283d dVar) {
        super(aVar2, new C68277d(C12246ai.class), aVar);
        this.f38998a = aVar3;
        this.f38999c = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        boolean z;
        C12989g gVar = (C12989g) obj;
        C69464a aVar = this.f38998a;
        if (gVar == C12989g.MORRIS) {
            C59104x b = C12244ag.f38995a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PopOrchestration");
            ((C59052c) ((C59052c) b).mo56372aa(44160)).mo56386p("POP stack is NOT enabled on MORRIS surface.");
            z = false;
        } else {
            z = ((Boolean) aVar.mo17428b()).booleanValue();
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f38999c.mo60297gq();
    }
}
