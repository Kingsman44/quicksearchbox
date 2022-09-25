package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100770ai;
import com.google.android.apps.gsa.staticplugins.fedass.p7950i.C100926i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60917ed;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63261f;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63267l;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63269n;
import dagger.C68214a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.ap */
/* compiled from: PG */
public final class C100733ap implements C90991b {

    /* renamed from: a */
    public static final C59071e f281622a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.a.ap");

    /* renamed from: b */
    public final C100926i f281623b;

    /* renamed from: c */
    public final C68214a f281624c;

    /* renamed from: d */
    public final C100770ai f281625d;

    /* renamed from: e */
    public final Executor f281626e;

    public C100733ap(C68214a aVar, C100770ai aiVar, Executor executor, C100926i iVar) {
        this.f281624c = aVar;
        this.f281625d = aiVar;
        this.f281626e = executor;
        this.f281623b = iVar;
    }

    /* renamed from: a */
    public static void m166929a(C63261f fVar, C91006f fVar2) {
        C91005e c = fVar2.mo85279c("Speech Learning Task Name");
        int a = C63267l.m96216a(fVar.f170955e);
        c.mo85276a(C90752i.m148229c((a == 0 || a == 1) ? "TASK_NAME_UNKNOWN" : a != 2 ? a != 3 ? a != 4 ? "TASK_NAME_LANGUAGE_MODEL_EVALUATION" : "TASK_NAME_FEDERATED_SPEECH" : "TASK_NAME_LANGUAGE_MODEL_FINE_TUNING" : "TASK_NAME_JOINT_LAYER_FINE_TUNING"));
        C91005e c2 = fVar2.mo85279c("Speech Learning Task Phase");
        int a2 = C63269n.m96217a(fVar.f170956f);
        c2.mo85276a(C90752i.m148229c((a2 == 0 || a2 == 1) ? "TASK_PHASE_UNKNOWN" : a2 != 2 ? a2 != 3 ? "TASK_PHASE_TRAINING" : "TASK_PHASE_PRECOMPUTE" : "TASK_PHASE_CONSOLIDATED"));
        fVar2.mo85279c("Language Pack Locale").mo85276a(C90752i.m148229c(fVar.f170952b));
        fVar2.mo85279c("Language Pack Version").mo85276a(C90752i.m148230d(Integer.valueOf(fVar.f170953c)));
        fVar2.mo85279c("Task Plan Crc32").mo85276a(C90752i.m148230d(Integer.valueOf(fVar.f170954d)));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("FedAssDump");
        C47633f i = C47633f.m84733g(C60922j.m93045h(C60856cj.m92905n(C47810es.m84965e(new C100725ah(this)), this.f281626e), C47810es.m84966f(new C100726ai(this, fVar)), this.f281626e)).mo51516i(new C100727aj(this, fVar), this.f281626e).mo51516i(new C100728ak(this, fVar), this.f281626e);
        C100742h.m166945g(i, C100729al.f281618a, this.f281626e);
        try {
            C60917ed.m93035b(i, 3, TimeUnit.SECONDS);
        } catch (ExecutionException | TimeoutException e) {
            fVar.mo85292s(C90752i.m148231e(e.getStackTrace()));
        }
    }
}
