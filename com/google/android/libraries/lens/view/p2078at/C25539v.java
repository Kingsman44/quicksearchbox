package com.google.android.libraries.lens.view.p2078at;

import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.common.base.C58881cr;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62505ea;
import com.google.lens.p4711m.C62632i;

/* renamed from: com.google.android.libraries.lens.view.at.v */
/* compiled from: PG */
public final /* synthetic */ class C25539v implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C25540w f69522a;

    public /* synthetic */ C25539v(C25540w wVar) {
        this.f69522a = wVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        int a;
        C25540w wVar = this.f69522a;
        if (wVar.f69523a == C25543z.LIVE_VIEWFINDER && (C28130s.m52410a(wVar.f69524b.mo32717v()) != C25980d.AUTO_FILTER || (a = wVar.f69524b.mo32694a()) == C62433bj.LENS_IN_TRANSLATE_ONEBOX.f168594ao || a == C62433bj.MARKETING.f168594ao || a == C62433bj.SEARCH_EDU_MATH_SOLVER.f168594ao || a == C62433bj.SEARCH_EDU_HOMEWORK_QA.f168594ao || C62632i.m94816a((String) wVar.f69524b.mo32701h().mo56111f()) == C62505ea.CAMERA)) {
            return C25538u.LVF_STARTUP;
        }
        if (!wVar.f69525c.mo33016a()) {
            return C25538u.GALLERY_STARTUP;
        }
        C25504aj ajVar = wVar.f69526d;
        if (ajVar.mo30536f(ajVar.mo30532b())) {
            return C25538u.GALLERY_STARTUP;
        }
        if (wVar.f69526d.mo30536f("android.permission.CAMERA")) {
            return C25538u.LVF_STARTUP;
        }
        return C25538u.GALLERY_STARTUP;
    }
}
