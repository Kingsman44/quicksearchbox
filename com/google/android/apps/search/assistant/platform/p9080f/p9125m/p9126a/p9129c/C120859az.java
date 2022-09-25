package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.android.libraries.search.p3055n.C39651ce;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65798cb;
import com.google.protos.p5129p.p5131b.C65806cj;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.az */
/* compiled from: PG */
public final class C120859az implements C120852as {

    /* renamed from: b */
    private static final C59071e f336058b = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.m.a.c.az");

    /* renamed from: a */
    public final C39651ce f336059a;

    /* renamed from: c */
    private final C38469m f336060c;

    /* renamed from: d */
    private final Executor f336061d;

    public C120859az(C39651ce ceVar, C38469m mVar, Executor executor) {
        this.f336059a = ceVar;
        this.f336060c = mVar;
        this.f336061d = executor;
    }

    /* renamed from: b */
    private final C60870cx m200055b(C65806cj cjVar) {
        C60870cx b = this.f336060c.mo41431b(C65753ak.PRIVACY_SETTINGS, cjVar.name(), C63662ac.f172144a, C65798cb.f178854e);
        C120855av avVar = C120855av.f336055a;
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(avVar), this.f336061d);
        C120856aw awVar = C120856aw.f336056a;
        return C60846c.m92878g(g, GellerException.class, C47810es.m84963c(awVar), this.f336061d);
    }

    /* renamed from: a */
    public final void mo104951a(String str, String str2) {
        ((C59052c) ((C59052c) f336058b.mo56224b()).mo56372aa(35638)).mo56386p("Send Fulfillment Signal to Soda.");
        C60870cx b = m200055b(C65806cj.WEB_AND_APP_ACTIVITY);
        C60870cx b2 = m200055b(C65806cj.VOICE_AND_AUDIO_ACTIVITY);
        C60870cx a = C47638k.m84753d(b, b2).mo51520a(new C120854au(b, b2, str, str2), this.f336061d);
        C120858ay ayVar = new C120858ay(this);
        C60856cj.m92911t(a, C47810es.m84974n(ayVar), this.f336061d);
    }
}
