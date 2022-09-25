package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.google.android.apps.search.assistant.libraries.p8959d.C119259a;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120694i;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120698m;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120700o;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120701p;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60904dr;
import com.google.speech.p5218j.C67083kk;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.z */
/* compiled from: PG */
public final class C120686z implements C120701p {

    /* renamed from: a */
    public static final C59071e f335667a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.g.a.z");

    /* renamed from: b */
    public final C119259a f335668b = new C119259a(C120700o.f335704b);

    /* renamed from: c */
    public final C119259a f335669c;

    /* renamed from: d */
    private final Executor f335670d;

    public C120686z(Executor executor, C120648ab abVar, C33447g gVar) {
        C120698m mVar;
        this.f335670d = new C60904dr(executor);
        int a = C120694i.m199841a(abVar.f335590a.f335682b);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                mVar = C120698m.OPENING_MICROPHONE;
            } else if (i == 1 || i == 2) {
                mVar = C120698m.EXECUTING;
            } else {
                throw new AssertionError();
            }
            this.f335669c = new C119259a(mVar);
            gVar.mo38849b(new C120684x(this));
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final C119259a mo104886a() {
        return this.f335669c;
    }

    /* renamed from: b */
    public final C119259a mo104887b() {
        return this.f335668b;
    }

    /* renamed from: d */
    public final void mo104889d(C120698m mVar) {
        this.f335670d.execute(C47810es.m84977q(new C120683w(this, mVar)));
    }

    /* renamed from: e */
    public final void mo104890e(C120700o oVar) {
        this.f335670d.execute(C47810es.m84977q(new C120685y(this, oVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo104888c(C67083kk kkVar) {
        int i = kkVar.f182354b;
        if (i == 2) {
            C59104x b = f335667a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConvEng.Interaction");
            ((C59052c) ((C59052c) b).mo56372aa(35556)).mo56386p("Transcription update from partial recognition");
            mo104890e(C120700o.m199847e(kkVar));
        } else if (i == 1) {
            C59104x b2 = f335667a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ConvEng.Interaction");
            ((C59052c) ((C59052c) b2).mo56372aa(35555)).mo56386p("Transcription update from final recognition");
            mo104890e(C120700o.m199846d(kkVar));
        } else {
            C59104x b3 = f335667a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "ConvEng.Interaction");
            ((C59052c) ((C59052c) b3).mo56372aa(35554)).mo56386p("Transcription NOT update for prefetch result");
        }
    }
}
