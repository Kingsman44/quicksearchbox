package com.google.android.libraries.lens.view.filters.p2097a;

import android.location.Location;
import com.google.android.libraries.places.api.p2437b.C31861q;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.android.libraries.search.location.C38692aj;
import com.google.android.libraries.search.location.C38693ak;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.libraries.lens.view.filters.a.w */
/* compiled from: PG */
final class C25890w implements C60845bz {

    /* renamed from: a */
    private final WeakReference f70326a;

    public C25890w(C25876i iVar) {
        this.f70326a = new WeakReference(iVar);
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C25891x.f70327a.mo56226d()).mo56382g(th)).mo56372aa(49363)).mo56386p("Unable to access latest user location.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        C25876i iVar = (C25876i) this.f70326a.get();
        if (iVar != null && axVar.mo56113h() && iVar.isAdded()) {
            C58974d dVar = C25891x.f70327a;
            C25891x a = iVar.mo17754z();
            Location location = (Location) axVar.mo56107c();
            Location location2 = a.f70348l;
            boolean z = false;
            if (location2 != null && location2.distanceTo(location) >= 100.0f) {
                z = true;
            }
            if (a.f70348l == null || z) {
                a.f70348l = location;
                C31861q c = C31861q.m59267c(C25891x.f70329c).mo37449c();
                C38693ak akVar = a.f70358v;
                C31863s sVar = a.f70357u;
                String b = C39227c.m68658b(C39226b.TAG_CLASSIC_LENS_LO);
                C60870cx a2 = akVar.f102169a.mo41547a();
                C38692aj ajVar = new C38692aj(sVar, c, b);
                C60870cx h = C60922j.m93045h(a2, C47810es.m84966f(ajVar), C60826bg.f164896a);
                C25889v vVar = new C25889v(a);
                C60856cj.m92911t(h, C47810es.m84974n(vVar), a.f70360x);
            }
        }
    }
}
