package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import com.google.android.apps.gsa.shared.p6971ac.p6972a.C89084b;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4580v.C60948g;
import com.google.common.p4580v.C60949h;
import com.google.p4479cg.C58075g;
import com.google.p4479cg.p4480a.C58068e;
import p3186j$.time.LocalDateTime;
import p3186j$.time.ZoneId;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.m */
/* compiled from: PG */
public final /* synthetic */ class C99416m implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99403at f278205a;

    public /* synthetic */ C99416m(C99403at atVar) {
        this.f278205a = atVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99403at atVar = this.f278205a;
        C89084b bVar = (C89084b) obj;
        LocalDateTime b = C60949h.m93108b(C60948g.f165068a, ZoneId.systemDefault());
        try {
            if (bVar.f241423c != 0) {
                long j = atVar.f278107b;
                ChronoUnit chronoUnit = ChronoUnit.DAYS;
                C58075g gVar = bVar.f241424d;
                if (gVar == null) {
                    gVar = C58075g.f155227j;
                }
                if (j <= chronoUnit.between(C58068e.m88827e(gVar), b)) {
                    if (atVar.f278108c <= ((long) bVar.f241423c)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            atVar.f278131z.mo78470e(C58068e.m88824b(b));
            atVar.f278131z.mo78468c(bVar.f241423c + 1);
            ((C23251a) atVar.f278110e.mo91445k()).mo28730f(Boolean.valueOf(!bVar.f241422b), false);
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) C99403at.f278080a.mo56226d()).mo56382g(e)).mo56372aa(32621)).mo56386p("Conversion from proto datetime to java LocalDateTime failed");
        }
    }
}
