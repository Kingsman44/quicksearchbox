package com.google.android.apps.gsa.sidekick.shared.p7232c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89861k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1864f.p1865a.C22804a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.C21383f;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58541iw;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59599aw;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59770f;
import com.google.common.p4552o.C60548tz;
import com.google.p375ai.p378b.C8142xb;
import java.util.Date;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.c.g */
/* compiled from: PG */
public final class C91658g extends C89861k implements C90991b {

    /* renamed from: a */
    private static final C59071e f255633a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.c.g");

    /* renamed from: b */
    private final C21370a f255634b;

    /* renamed from: c */
    private final Queue f255635c = new C58781rt(new C58425eo(10));

    public C91658g(C21370a aVar, C91022f fVar) {
        this.f255634b = aVar;
        fVar.mo85301a(this);
    }

    /* renamed from: c */
    public final void mo77940c(C58541iw iwVar, C60548tz tzVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (((C22804a) iwVar.first()).f62786a == C89849ae.FEED_LAUNCH_START) {
            this.f255635c.add((C22804a) iwVar.last());
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("FeedLaunchStateDumper");
        synchronized (this.f255635c) {
            for (C22804a aVar : this.f255635c) {
                fVar.mo85279c("FeedLaunchSurfaceType").mo85276a(C90752i.m148229c(C8142xb.SEARCH_NOW_MONET.name()));
                C91006f e = fVar.mo85281e((Object) null);
                C89849ae aeVar = aVar.f62786a;
                e.mo85279c("FeedLaunchResult").mo85276a(C90752i.m148229c(aeVar.name()));
                e.mo85279c("FeedLaunchEventTimestamp").mo85276a(C90752i.m148229c(new Date(C21383f.m40448a(this.f255634b, TimeUnit.NANOSECONDS.toMillis(aVar.f62787b))).toString()));
                switch (aeVar.ordinal()) {
                    case 860:
                    case 861:
                        C59687cb cbVar = aVar.f62792g;
                        if (cbVar != null && cbVar.f160125f.size() > 0) {
                            int i = ((C59770f) cbVar.f160125f.get(0)).f161505c;
                            C89885b a = C89885b.m146362a(i);
                            if (a == null) {
                                C59104x d = f255633a.mo56226d();
                                d.mo56378ag(C58975e.f156826a, "FeedLaunchStateDumper");
                                ((C59052c) ((C59052c) d).mo56372aa(11817)).mo56387q("Invalid feed launch error code: %d", i);
                                break;
                            } else {
                                e.mo85279c(aeVar == C89849ae.FEED_LAUNCH_DISABLED ? "FeedLaunchDisabledReason" : "FeedLaunchErrorReason").mo85276a(C90752i.m148229c(a.name()));
                                break;
                            }
                        }
                    case 862:
                    case 863:
                        C59687cb cbVar2 = aVar.f62792g;
                        if (!(cbVar2 == null || (cbVar2.f160115b & 8) == 0)) {
                            int b = C59599aw.m92466b(cbVar2.f160041F);
                            if (b == 0) {
                                b = 1;
                            }
                            e.mo85279c("FeedLaunchCancelReason").mo85276a(C90752i.m148229c(C59599aw.m92465a(b)));
                            break;
                        }
                }
            }
        }
    }
}
