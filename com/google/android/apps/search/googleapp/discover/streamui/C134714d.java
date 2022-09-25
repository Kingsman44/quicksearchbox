package com.google.android.apps.search.googleapp.discover.streamui;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.discover.streamui.impl.C134903l;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134725e;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134727g;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134732l;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134735o;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134758i;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.concurrent.ConcurrentMap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.d */
/* compiled from: PG */
public final class C134714d {

    /* renamed from: a */
    private final C134727g f366833a;

    /* renamed from: b */
    private final C37215b f366834b;

    public C134714d(C134727g gVar, C37215b bVar) {
        C69664n.m101061g(gVar, "discoverPerSurfaceLaunchStatus");
        C69664n.m101061g(bVar, "appFlowLogger");
        this.f366833a = gVar;
        this.f366834b = bVar;
    }

    /* renamed from: a */
    public final Fragment mo111903a(AccountId accountId, C134749h hVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(hVar, "args");
        C134766q a = C134758i.m218593a(hVar);
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(this.f366833a.f366882a, a, new C134702c(a));
        C69664n.m101060f(computeIfAbsent, "surface: TngDiscoverSurf…erLaunchStatus(surface) }");
        C134725e eVar = (C134725e) computeIfAbsent;
        synchronized (eVar) {
            if (eVar.f366878d instanceof C134732l) {
                eVar.mo111915a();
            }
            if (eVar.mo111917c()) {
                this.f366834b.mo19974a(C37182a.f97750I);
                eVar.f366878d = new C134735o(true);
            }
        }
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(hVar, "args");
        C134903l lVar = new C134903l();
        C68324h.m98669f(lVar);
        C47247a.m84047b(lVar, accountId);
        C47243l.m84039a(lVar, hVar);
        C69664n.m101061g(hVar, "args");
        ProtoParsers.m95532o(lVar.getArguments(), "fragment_arg_key", hVar);
        return lVar;
    }
}
