package com.google.android.apps.search.assistant.surfaces.dictation.service.p9483u;

import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p4986a.C64692bs;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.u.d */
/* compiled from: PG */
public final /* synthetic */ class C126361d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126366i f348054a;

    public /* synthetic */ C126361d(C126366i iVar) {
        this.f348054a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C126366i iVar = this.f348054a;
        Optional optional = (Optional) obj;
        if (!optional.isEmpty()) {
            return C47633f.m84733g(((C38469m) optional.get()).mo41431b(C65753ak.ASSISTANT_CONTACT_AFFINITY, (String) null, C63662ac.f172144a, C64692bs.f175353d)).mo51513e(GellerException.class, C126365h.f348058a, iVar.f348060b);
        }
        ((C59052c) ((C59052c) C126366i.f348059a.mo56224b()).mo56372aa(37021)).mo56386p("Personal response is disabled. [SD]");
        return C60856cj.m92900i(C58485gu.m89845m());
    }
}
