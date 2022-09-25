package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9719c.C128426a;
import com.google.android.libraries.assistant.p1533o.C18460aw;
import com.google.android.libraries.assistant.p1533o.C18465ba;
import com.google.android.libraries.assistant.p1533o.C18466bb;
import com.google.android.libraries.assistant.p1533o.C18475bk;
import com.google.android.libraries.assistant.p1533o.C18479bo;
import com.google.android.libraries.assistant.p1533o.C18482br;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.v */
/* compiled from: PG */
public final /* synthetic */ class C128452v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C128455y f353295a;

    /* renamed from: b */
    public final /* synthetic */ C18482br f353296b;

    public /* synthetic */ C128452v(C128455y yVar, C18482br brVar) {
        this.f353295a = yVar;
        this.f353296b = brVar;
    }

    public final void run() {
        C18479bo boVar;
        C128455y yVar = this.f353295a;
        C18482br brVar = this.f353296b;
        int i = brVar.f52417a;
        int a = C18475bk.m35945a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            if (i == 1) {
                boVar = (C18479bo) brVar.f52418b;
            } else {
                boVar = C18479bo.f52410b;
            }
            if (yVar.f353304f != null) {
                yVar.f353303e.mo108414c(C128416ak.m209548a(Status.f186915m, C18465ba.VOICE_QUERY_ALREADY_STARTED));
                yVar.f353302d.mo108425c(C34819a.m63580c(C18466bb.f52404a, C18465ba.VOICE_QUERY_ALREADY_STARTED));
                return;
            }
            C128436f fVar = yVar.f353300b;
            C128416ak akVar = yVar.f353303e;
            C18460aw awVar = boVar.f52412a;
            if (awVar == null) {
                awVar = C18460aw.f52380h;
            }
            C128426a aVar = yVar.f353302d;
            C69664n.m101061g(awVar, "configuration");
            C69664n.m101061g(aVar, "appFlowLogger");
            yVar.f353304f = C60922j.m93045h(C71663i.m104692e(fVar.f353229e, (C71424ay) null, new C128428d(aVar, fVar, awVar, (C69577g) null), 3), C47810es.m84966f(new C128385a(fVar, akVar, awVar, aVar)), fVar.f353228d);
        } else if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new AssertionError();
            }
        } else if (yVar.f353304f == null) {
            yVar.f353303e.mo108414c(C128416ak.m209548a(Status.f186915m, C18465ba.VOICE_QUERY_NOT_STARTED));
            yVar.f353302d.mo108425c(C34819a.m63580c(C18466bb.f52404a, C18465ba.VOICE_QUERY_ALREADY_STARTED));
        } else {
            C128426a aVar2 = yVar.f353302d;
            C37258g gVar = C37176a.f96853aX;
            C69664n.m101060f(gVar, "MAIN_ASSISTANT_RECEIVED_STOP_LISTENING");
            aVar2.mo108429g(gVar);
            C60856cj.m92911t(C60922j.m93045h(yVar.f353304f, C47810es.m84966f(C128450t.f353292a), yVar.f353301c), C47810es.m84974n(new C128454x()), yVar.f353301c);
        }
    }
}
