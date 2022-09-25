package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import android.databinding.C0118a;
import com.google.android.libraries.assistant.p1533o.C18465ba;
import com.google.android.libraries.assistant.p1533o.C18466bb;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.w */
/* compiled from: PG */
final class C128453w implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Throwable f353297a;

    /* renamed from: b */
    final /* synthetic */ C128455y f353298b;

    public C128453w(C128455y yVar, Throwable th) {
        this.f353298b = yVar;
        this.f353297a = th;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C0118a.m116x(C128455y.f353299a.mo56226d(), "VoiceSearchAssistantBackend failed to obtain session after error", 38817, th, C38505d.f101864b, 196211705);
        this.f353298b.f353303e.mo108414c(th);
        this.f353298b.f353302d.mo108425c(C34819a.m63580c(C18466bb.f52404a, C18465ba.CONVERSATION_API_DISCONNECTING_FAILED_AFTER_ERROR));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C128418am amVar = (C128418am) obj;
        Throwable th = this.f353297a;
        if (!(th instanceof C70761fa) || !((C70761fa) th).f188571a.getCode().equals(Status.Code.CANCELLED)) {
            C128414ai b = amVar.mo108420b();
            C62722b bVar = C62722b.ABORTED;
            b.mo108412m(C37176a.f96856aa.mo40805c(bVar), this.f353297a);
            return;
        }
        C128414ai b2 = amVar.mo108420b();
        b2.f353161e.execute(C47810es.m84977q(new C128411af(b2)));
    }
}
