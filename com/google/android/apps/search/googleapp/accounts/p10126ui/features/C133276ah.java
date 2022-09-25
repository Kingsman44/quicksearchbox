package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.onegoogle.accountmanagement.p2349a.C30254a;
import com.google.android.libraries.onegoogle.accountmenu.features.C30495a;
import com.google.android.libraries.onegoogle.accountmenu.features.C30518b;
import com.google.android.libraries.onegoogle.accountmenu.features.C30522c;
import com.google.android.libraries.onegoogle.accountmenu.features.C30629l;
import com.google.android.libraries.onegoogle.accountmenu.features.C30631n;
import com.google.android.libraries.onegoogle.accountmenu.features.C30633p;
import com.google.android.libraries.onegoogle.accountmenu.features.C30635r;
import com.google.android.libraries.onegoogle.accountmenu.features.C30639v;
import com.google.android.libraries.onegoogle.accountmenu.features.C30641x;
import com.google.android.libraries.onegoogle.accountmenu.features.p2359a.C30496a;
import com.google.android.libraries.onegoogle.accountmenu.features.p2359a.C30507d;
import com.google.android.libraries.onegoogle.accountmenu.features.p2359a.C30508e;
import com.google.android.libraries.onegoogle.accountmenu.features.p2364e.C30545a;
import com.google.android.libraries.onegoogle.accountmenu.features.p2370f.p2372b.C30605a;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.ah */
/* compiled from: PG */
public final class C133276ah implements C68220f {
    /* renamed from: a */
    public static C30518b m216310a(Fragment fragment, C30545a aVar, C30633p pVar, C30629l lVar, C30631n nVar, C30464e eVar, C30464e eVar2, C30464e eVar3, C30631n nVar2, C30631n nVar3, C30641x xVar, C30631n nVar4, C30631n nVar5, C30639v vVar, C30254a aVar2, C30631n nVar6, C30631n nVar7, Optional optional, boolean z, boolean z2) {
        C30495a a = C30518b.m56960a();
        if (z2) {
            ((C30522c) a).f82439i = new C30605a();
        }
        if (optional.isPresent()) {
            C30635r rVar = (C30635r) optional.get();
            if (rVar != null) {
                ((C30522c) a).f82437g = rVar;
            } else {
                throw new NullPointerException("Null educationManager");
            }
        }
        C30507d a2 = C30508e.m56929a();
        if (!C133338z.m216406a(fragment)) {
            ((C30496a) a2).f82364a = C58833ax.m90834k(lVar);
        }
        a2.mo36139b(C58485gu.m89852t(nVar, nVar6, nVar7, nVar2, nVar3, nVar4, nVar5));
        if (z) {
            ((C30522c) a).f82431a = C58833ax.m90834k(aVar2);
        }
        a.mo36131c(C58485gu.m89848p(eVar, eVar2, eVar3));
        a.mo36134f(a2.mo36138a());
        C30522c cVar = (C30522c) a;
        cVar.f82432b = C58833ax.m90834k(aVar);
        cVar.f82433c = C58833ax.m90834k(pVar);
        cVar.f82435e = C58833ax.m90834k(xVar);
        a.mo36135g(fragment.getActivity() == null);
        cVar.f82434d = vVar;
        C30518b a3 = a.mo36129a();
        C68225k.m98532d(a3);
        return a3;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
