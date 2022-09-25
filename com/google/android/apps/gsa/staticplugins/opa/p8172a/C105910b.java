package com.google.android.apps.gsa.staticplugins.opa.p8172a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.p8400n.C109725c;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.a.b */
/* compiled from: PG */
public final class C105910b implements C105916h {

    /* renamed from: a */
    private static final C58528ij f295713a = new C58759qy("ui.SHOW_RENDERED_CARD");

    /* renamed from: b */
    private final C68214a f295714b;

    public C105910b(C68214a aVar) {
        this.f295714b = aVar;
    }

    /* renamed from: b */
    public final boolean mo95178b(C52081en enVar) {
        if (!C113987f.m188691b((C86124t) this.f295714b.mo27525b())) {
            return false;
        }
        for (C52083ep epVar : enVar.f136684d) {
            if (epVar.f136692b == 4) {
                C58528ij ijVar = f295713a;
                C51809dy dyVar = ((C52076ei) epVar.f136693c).f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                if (((C58759qy) ijVar).f156534a.equals(dyVar.f135936b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final int mo95179c() {
        return 1;
    }

    /* renamed from: d */
    public final C51809dy mo95180d() {
        return C109725c.m182678b("stay_in_half_shelf", new C52232kc[0]);
    }
}
