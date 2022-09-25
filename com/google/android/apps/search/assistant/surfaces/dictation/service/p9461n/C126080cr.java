package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cr */
/* compiled from: PG */
public final /* synthetic */ class C126080cr implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126081cs f347461a;

    /* renamed from: b */
    public final /* synthetic */ C125112cm f347462b;

    public /* synthetic */ C126080cr(C126081cs csVar, C125112cm cmVar) {
        this.f347461a = csVar;
        this.f347462b = cmVar;
    }

    public final void run() {
        C60870cx cxVar;
        C126081cs csVar = this.f347461a;
        C125112cm cmVar = this.f347462b;
        csVar.mo107316v();
        C126106dq dqVar = csVar.f347469g;
        C69664n.m101061g(cmVar, "event");
        dqVar.mo107340e(new C126098di(cmVar));
        C125112cm cmVar2 = C125112cm.UNKNOWN_DONT_SEND;
        int ordinal = cmVar.ordinal();
        if (ordinal == 4 || ordinal == 8) {
            csVar.mo107315u();
        } else if (ordinal != 12) {
            csVar.f347474l.mo107357a();
        } else {
            csVar.mo107314t();
        }
        C126114dy dyVar = csVar.f347474l;
        C126038bc bcVar = csVar.f347470h;
        if (!cmVar.equals(C125112cm.CANDIDATE_SELECTED) || !bcVar.f347378x.getAndSet(false)) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            C60870cx a = bcVar.f347362h.mo46039a(C125956an.f347176a, bcVar.f347360f);
            C125957ao aoVar = C125957ao.f347177a;
            cxVar = C60922j.m93044g(a, C47810es.m84963c(aoVar), C60826bg.f164896a);
        }
        dyVar.mo107358b(cxVar);
    }
}
