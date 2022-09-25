package com.google.android.apps.gsa.shared.util.p7159c.p7161b;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90815bg;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90818bj;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90854n;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90855o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58836b;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.gsa.shared.util.c.b.d */
/* compiled from: PG */
public final class C90897d implements C68220f {
    /* renamed from: a */
    public static C90854n m148494a(C90855o oVar) {
        String str = oVar.f254047b;
        C21370a aVar = oVar.f254046a;
        C58836b bVar = C58836b.f156633a;
        C90476a aVar2 = oVar.f254049d;
        C90815bg bgVar = new C90815bg("User-Facing Blocking", str, aVar, bVar, false, 5);
        synchronized (oVar.f254051f) {
            oVar.f254051f.add(bgVar);
        }
        return new C90854n(oVar, new C90818bj(oVar.f254048c, 25), bgVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
