package com.google.android.libraries.assistant.soda.p1611f;

import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67147mu;
import com.google.speech.p5218j.C67148mv;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.soda.f.l */
/* compiled from: PG */
final class C19332l implements C19347o {

    /* renamed from: a */
    final /* synthetic */ C70862aj f54100a;

    /* renamed from: b */
    final /* synthetic */ C19335o f54101b;

    public C19332l(C19335o oVar, C70862aj ajVar) {
        this.f54101b = oVar;
        this.f54100a = ajVar;
    }

    /* renamed from: t */
    public final void mo23782t(C67087ko koVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f54101b.mo24467d(this.f54100a, koVar);
    }

    /* renamed from: u */
    public final /* synthetic */ void mo23783u() {
    }

    /* renamed from: v */
    public final void mo23784v(C19243af afVar) {
        C58976aa aaVar = C58975e.f156826a;
        afVar.name();
        C19335o oVar = this.f54101b;
        C70862aj ajVar = this.f54100a;
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        C62940bt btVar = C67148mv.f182519e;
        C67147mu muVar = (C67147mu) C67148mv.f182518d.createBuilder();
        muVar.copyOnWrite();
        C67148mv mvVar = (C67148mv) muVar.instance;
        int i = 3;
        mvVar.f182522b = 3;
        mvVar.f182521a |= 1;
        int ordinal = afVar.ordinal();
        if (ordinal == 0) {
            i = 1;
        } else if (ordinal == 1) {
            i = 2;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                i = 4;
            } else if (ordinal == 4) {
                i = 5;
            } else {
                throw new IllegalStateException(String.format("Unknown SodaStopReason %s", new Object[]{afVar.name()}));
            }
        }
        muVar.copyOnWrite();
        C67148mv mvVar2 = (C67148mv) muVar.instance;
        mvVar2.f182523c = i;
        mvVar2.f182521a |= 2;
        knVar.mo58885m(btVar, (C67148mv) muVar.build());
        oVar.mo24467d(ajVar, (C67087ko) knVar.build());
    }
}
