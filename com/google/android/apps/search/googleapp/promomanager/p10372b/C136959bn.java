package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.common.p4522b.C58334be;
import com.google.common.p4522b.C58371co;
import com.google.common.p4522b.C58723pp;
import com.google.protobuf.C62963cj;
import com.google.protos.p4880aq.C63718ag;
import com.google.protos.p4880aq.C63732au;
import com.google.protos.p4880aq.C63733av;
import com.google.protos.p4880aq.C63734aw;
import com.google.protos.p4880aq.C63739ba;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.bn */
/* compiled from: PG */
public final class C136959bn {

    /* renamed from: a */
    public static final C58334be f372761a;

    static {
        C63739ba baVar = C63739ba.HOME_SCREEN;
        C63926bm bmVar = C63926bm.HOME;
        C63739ba baVar2 = C63739ba.SEARCH;
        C63926bm bmVar2 = C63926bm.SEARCH;
        C63739ba baVar3 = C63739ba.COLLECTIONS;
        C63926bm bmVar3 = C63926bm.COLLECTIONS;
        C63739ba baVar4 = C63739ba.TABS;
        C63926bm bmVar4 = C63926bm.TABS;
        C63739ba baVar5 = C63739ba.MINUS_ONE;
        C63926bm bmVar5 = C63926bm.MINUS_ONE;
        C63739ba baVar6 = C63739ba.GOOGLE_APP_BROWSER;
        C63926bm bmVar6 = C63926bm.GOOGLE_APP_BROWSER;
        C58371co.m89406a(baVar, bmVar);
        C58371co.m89406a(baVar2, bmVar2);
        C58371co.m89406a(baVar3, bmVar3);
        C58371co.m89406a(baVar4, bmVar4);
        C58371co.m89406a(baVar5, bmVar5);
        C58371co.m89406a(baVar6, bmVar6);
        f372761a = new C58723pp(new Object[]{baVar, bmVar, baVar2, bmVar2, baVar3, bmVar3, baVar4, bmVar4, baVar5, bmVar5, baVar6, bmVar6}, 6);
    }

    /* renamed from: a */
    public static C63739ba m222628a(C63926bm bmVar) {
        return (C63739ba) Map.EL.getOrDefault(((C58723pp) f372761a).f156468c, bmVar, C63739ba.UNSET_TAB_TYPE);
    }

    /* renamed from: b */
    public static boolean m222629b(C63734aw awVar, boolean z) {
        int i = awVar.f172315a;
        if (!((i & 2) == 0 || (i & 1) == 0 || new C62963cj(awVar.f172318d, C63734aw.f172312e).isEmpty())) {
            C63733av avVar = awVar.f172319f;
            if (avVar == null) {
                avVar = C63733av.f172308c;
            }
            if (C63732au.m96291a(avVar.f172310a) != C63732au.CONTENT_NOT_SET) {
                C63718ag agVar = awVar.f172317c;
                if (agVar == null) {
                    agVar = C63718ag.f172268k;
                }
                return agVar.f172279j == z;
            }
        }
        return false;
    }
}
