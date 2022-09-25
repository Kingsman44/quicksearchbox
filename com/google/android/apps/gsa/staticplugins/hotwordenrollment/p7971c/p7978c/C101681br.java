package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.assistant.settings.features.av.cq;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3861at.adk;
import com.google.assistant.p3861at.adl;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.br */
/* compiled from: PG */
public final /* synthetic */ class C101681br implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C101687bx f283715a;

    public /* synthetic */ C101681br(C101687bx bxVar) {
        this.f283715a = bxVar;
    }

    public final void run() {
        acx acx;
        C101687bx bxVar = this.f283715a;
        dn dnVar = bxVar.f283725e;
        bh bhVar = bxVar.f283722b;
        C58485gu n = C58485gu.m89846n(bhVar.a == 2 ? (String) bhVar.b : BuildConfig.FLAVOR);
        if (n.isEmpty()) {
            acx = null;
        } else {
            acw acw = (acw) acx.f128971H.createBuilder();
            adk adk = (adk) adl.f129046c.createBuilder();
            adk.copyOnWrite();
            adl adl = (adl) adk.instance;
            C62971cq cqVar = adl.f129049b;
            if (!cqVar.mo58948c()) {
                adl.f129049b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) n, (List) adl.f129049b);
            acw.copyOnWrite();
            acx acx2 = (acx) acw.instance;
            adl adl2 = (adl) adk.build();
            adl2.getClass();
            acx2.f128975C = adl2;
            acx2.f128985b |= 16384;
            acx = (acx) acw.build();
        }
        C60922j.m93045h(dnVar.h(acx, ar.f), C47810es.m84966f(new cq(dnVar)), C60826bg.f164896a);
        bxVar.f283729i.mo83702b(C89849ae.VOICE_MATCH_INTRO_SCREEN_EXIT);
        bxVar.mo92494b();
    }
}
