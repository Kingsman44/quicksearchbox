package com.google.android.apps.gsa.staticplugins.search.session.p8716f;

import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91030n;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116781ic;
import com.google.common.p4522b.C58539iu;
import com.google.common.p4522b.C58541iw;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.f.c */
/* compiled from: PG */
public final class C116543c implements C68220f {
    /* renamed from: a */
    public static C58541iw m193302a(Set set, C90476a aVar) {
        if (aVar.mo84225b()) {
            C91030n.m148695a("SearchSessionEventBus.sortSessionStateList", aVar);
        }
        C58539iu iuVar = new C58539iu(new C116781ic());
        iuVar.mo55535n(set);
        C58541iw k = iuVar.mo55486f();
        if (aVar.mo84225b()) {
            C91030n.m148696b(aVar);
        }
        C68225k.m98532d(k);
        return k;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
