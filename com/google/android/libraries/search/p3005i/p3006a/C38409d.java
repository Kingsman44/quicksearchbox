package com.google.android.libraries.search.p3005i.p3006a;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.protos.p5124m.p5125a.C65599b;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.i.a.d */
/* compiled from: PG */
public final class C38409d implements C38406a {

    /* renamed from: a */
    public static final /* synthetic */ int f101663a = 0;

    /* renamed from: b */
    private static final C58528ij f101664b = C58528ij.m90015O(C65753ak.AOG_APP_USER_CONTEXT, C65753ak.ASSISTANT_ARBITRATION_HOST_IP, C65753ak.ASSISTANT_DEVICE_YOUTUBE_SETTINGS, C65753ak.ASSISTANT_ON_DEVICE_DISCOVERY, C65753ak.ASSISTANT_REMINDER_USER_PROFILE, C65753ak.ASSISTANT_USAGE_STATISTICS, C65753ak.ASSISTANT_USER_DISPLAY_NAME, C65753ak.ASSISTANT_WHOLE_HOME_STATE_UPLOAD, C65753ak.HOME_GRAPH, C65753ak.LAUNCHER_DEEPLINKS, C65753ak.LOCAL_NETWORK_SYNC_METADATA, C65753ak.PLAYBACK, C65753ak.PORTABLE_PROVIDER, C65753ak.SEARCH_CONSOLE_INSIGHTS);

    /* renamed from: c */
    private final C58528ij f101665c;

    public C38409d(C65599b bVar, C65599b bVar2, C65599b bVar3, boolean z) {
        C58526ih ihVar = new C58526ih();
        ihVar.mo55489i(bVar.f178301a);
        ihVar.mo55489i(bVar2.f178301a);
        ihVar.mo55489i(bVar3.f178301a);
        if (z) {
            ihVar.mo55373c(Integer.valueOf(C65753ak.GELLER_CONFIG.f178757bE));
            ihVar.mo55373c(Integer.valueOf(C65753ak.PRIVACY_SETTINGS.f178757bE));
        }
        this.f101665c = (C58528ij) Collection.EL.stream(ihVar.mo55486f()).map(C38407b.f101661a).filter(C38408c.f101662a).collect(C58370cn.f155947b);
    }

    /* renamed from: b */
    static C65753ak m67678b(int i) {
        C65753ak b = C65753ak.m96797b(i);
        return b == null ? C65753ak.UNKNOWN : b;
    }

    /* renamed from: a */
    public final int mo41413a(C65753ak akVar) {
        return (f101664b.contains(akVar) || this.f101665c.contains(akVar)) ? 2 : 1;
    }
}
