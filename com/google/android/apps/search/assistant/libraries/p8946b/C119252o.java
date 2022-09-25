package com.google.android.apps.search.assistant.libraries.p8946b;

import com.google.android.libraries.search.p3005i.p3007b.C38433j;
import com.google.apps.tiktok.p3663j.C47355m;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import com.google.protobuf.C62910ar;
import com.google.protos.p5124m.p5125a.C65599b;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.o */
/* compiled from: PG */
public final class C119252o {

    /* renamed from: a */
    public static final /* synthetic */ int f332559a = 0;

    /* renamed from: b */
    private static final C58528ij f332560b = C58528ij.m90015O(C65753ak.AOG_APP_USER_CONTEXT, C65753ak.ASSISTANT_ARBITRATION_HOST_IP, C65753ak.ASSISTANT_DEVICE_YOUTUBE_SETTINGS, C65753ak.ASSISTANT_ON_DEVICE_DISCOVERY, C65753ak.ASSISTANT_REMINDER_USER_PROFILE, C65753ak.ASSISTANT_USAGE_STATISTICS, C65753ak.ASSISTANT_USER_DISPLAY_NAME, C65753ak.ASSISTANT_WHOLE_HOME_STATE_UPLOAD, C65753ak.GELLER_CONFIG, C65753ak.HOME_GRAPH, C65753ak.LAUNCHER_DEEPLINKS, C65753ak.LOCAL_NETWORK_SYNC_METADATA, C65753ak.PLAYBACK, C65753ak.PORTABLE_PROVIDER);

    /* renamed from: c */
    private static final C58528ij f332561c = new C58759qy(C65753ak.GELLER_CONFIG);

    /* renamed from: a */
    public static C47355m m197942a(C38433j jVar, C62910ar arVar, boolean z) {
        C58528ij ijVar;
        if (z) {
            ijVar = C58733pz.f156496a;
        } else {
            ijVar = f332561c;
        }
        return jVar.mo41419a("assistantCoreCorporaSync", "assistant", ijVar, arVar);
    }

    /* renamed from: b */
    public static C47355m m197943b(C38433j jVar, C62910ar arVar, boolean z) {
        C58528ij ijVar;
        if (z) {
            ijVar = C58733pz.f156496a;
        } else {
            ijVar = f332561c;
        }
        return jVar.mo41420b("assistantCoreCorporaRelaxedSync", "assistant", ijVar, arVar, C58733pz.f156496a);
    }

    /* renamed from: c */
    public static C47355m m197944c(C38433j jVar, C62910ar arVar, C58528ij ijVar) {
        return jVar.mo41419a("assistantSharedCorporaSync", "assistant", ijVar, arVar);
    }

    /* renamed from: d */
    public static C58528ij m197945d(C65599b bVar) {
        return (C58528ij) Collection.EL.stream(bVar.f178301a).map(C119250m.f332557a).filter(C119251n.f332558a).collect(C58370cn.f155947b);
    }

    /* renamed from: e */
    public static C58528ij m197946e(C65599b bVar) {
        C58526ih ihVar = new C58526ih();
        for (Integer intValue : bVar.f178301a) {
            ihVar.mo55373c(C65753ak.m96797b(intValue.intValue()));
        }
        ihVar.mo55489i(f332560b);
        return ihVar.mo55486f();
    }

    /* renamed from: f */
    static C65753ak m197947f(int i) {
        C65753ak b = C65753ak.m96797b(i);
        return b == null ? C65753ak.UNKNOWN : b;
    }
}
