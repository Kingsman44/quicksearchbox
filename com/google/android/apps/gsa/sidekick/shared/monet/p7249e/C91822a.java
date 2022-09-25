package com.google.android.apps.gsa.sidekick.shared.monet.p7249e;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collections;
import java.util.Set;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.e.a */
/* compiled from: PG */
public final class C91822a {

    /* renamed from: b */
    private static final C59071e f256087b = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.monet.e.a");

    /* renamed from: a */
    public final Set f256088a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: a */
    public final void mo86298a(C91823b bVar) {
        if (this.f256088a.contains(bVar)) {
            C59104x d = f256087b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RVRenderingMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(11915)).mo56386p("Observers can only be added once to RecyclerViewRenderingMonitor.");
            int i = C90755l.f253831a;
            return;
        }
        this.f256088a.add(bVar);
    }

    /* renamed from: b */
    public final void mo86299b(C91823b bVar) {
        if (!this.f256088a.contains(bVar)) {
            C59104x d = f256087b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RVRenderingMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(11916)).mo56386p("Attempting to remove observer which has not been added.");
            int i = C90755l.f253831a;
            return;
        }
        this.f256088a.remove(bVar);
    }
}
