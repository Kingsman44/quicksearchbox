package com.google.android.apps.gsa.sidekick.main.p7202e;

import com.google.android.apps.gsa.location.z;
import com.google.android.apps.gsa.shared.util.C91057n;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.gms.location.C144877ah;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;
import com.google.android.libraries.search.location.C38716v;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.sidekick.main.e.b */
/* compiled from: PG */
public final class C91286b {

    /* renamed from: a */
    public static final C59071e f254767a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.e.b");

    /* renamed from: b */
    public final z f254768b;

    /* renamed from: c */
    public final C90932cb f254769c;

    /* renamed from: d */
    public final boolean f254770d;

    public C91286b(z zVar, C90932cb cbVar, boolean z) {
        this.f254768b = zVar;
        this.f254769c = cbVar;
        this.f254770d = z;
    }

    /* renamed from: a */
    public final void mo85560a(List list, C38716v vVar) {
        try {
            C91285a aVar = new C91285a("register geofence");
            if (this.f254770d) {
                C91018d.m148680c();
                try {
                    z zVar = this.f254768b;
                    ArrayList arrayList = new ArrayList();
                    C144877ah.m235474a(list, arrayList);
                    aVar.mo17709a((C21551h) C90877ak.m148472f(zVar.a(C144877ah.m235475b(arrayList, 5), vVar, C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO)));
                } catch (InterruptedException | ExecutionException e) {
                    ((C59052c) ((C59052c) ((C59052c) f254767a.mo56225c()).mo56382g(e)).mo56372aa(11561)).mo56386p("can't register geofences");
                }
            } else {
                z zVar2 = this.f254768b;
                ArrayList arrayList2 = new ArrayList();
                C144877ah.m235474a(list, arrayList2);
                C91057n.m148759a(zVar2.a(C144877ah.m235475b(arrayList2, 5), vVar, C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO), aVar, this.f254769c, "handleAddGeofences");
            }
        } catch (Exception e2) {
            ((C59052c) ((C59052c) ((C59052c) f254767a.mo56226d()).mo56382g(e2)).mo56372aa(11560)).mo56386p("Failed to register geofence");
        }
    }
}
