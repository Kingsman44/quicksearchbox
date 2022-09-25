package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c.C128426a;
import com.google.android.libraries.assistant.p1533o.C18465ba;
import com.google.android.libraries.assistant.p1533o.C18466bb;
import com.google.android.libraries.assistant.p1533o.C18483bs;
import com.google.android.libraries.assistant.p1533o.C18484bt;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.ag */
/* compiled from: PG */
final class C128412ag implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C128414ai f353156a;

    public C128412ag(C128414ai aiVar) {
        this.f353156a = aiVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C128414ai aiVar = this.f353156a;
        C34819a c = C34819a.m63580c(C18466bb.f52404a, C18465ba.CONVERSATION_API_START_INTERACTION_FAILED);
        aiVar.mo108412m(C37176a.f96856aa.mo40803a(c.mo39520a(), c.mo39522e()), th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C119834cb cbVar = (C119834cb) obj;
        this.f353156a.f353163g = Optional.m71637of(cbVar);
        String str = cbVar.f333767a;
        C128426a aVar = this.f353156a.f353158b;
        aVar.f353194b = str;
        C37258g gVar = C37176a.f96820R;
        C69664n.m101060f(gVar, "MAIN_ASSISTANT_START_INTERACTION");
        aVar.mo108429g(gVar);
        C128416ak akVar = this.f353156a.f353160d;
        if (akVar.f353179e.equals(C128415aj.COMPLETED)) {
            ((C59052c) ((C59052c) C128416ak.f353175a.mo56226d()).mo56372aa(38859)).mo56386p("Cannot send request ID, the connection is closed.");
            return;
        }
        C70862aj ajVar = akVar.f353176b;
        C18483bs bsVar = (C18483bs) C18484bt.f52419c.createBuilder();
        bsVar.copyOnWrite();
        C18484bt btVar = (C18484bt) bsVar.instance;
        str.getClass();
        btVar.f52421a = 2;
        btVar.f52422b = str;
        ajVar.mo20123c((C18484bt) bsVar.build());
    }
}
