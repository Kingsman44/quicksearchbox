package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import com.google.android.apps.gsa.shared.p7023bg.p7024a.C89425a;
import com.google.android.apps.gsa.shared.p7023bg.p7024a.C89426b;
import com.google.android.apps.gsa.shared.p7023bg.p7024a.C89428d;
import com.google.android.apps.gsa.shared.p7066m.C90115fm;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.w */
/* compiled from: PG */
public final /* synthetic */ class C99426w implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99403at f278215a;

    /* renamed from: b */
    public final /* synthetic */ String f278216b;

    public /* synthetic */ C99426w(C99403at atVar, String str) {
        this.f278215a = atVar;
        this.f278216b = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99403at atVar = this.f278215a;
        String str = this.f278216b;
        C89428d dVar = (C89428d) obj;
        LocalDateTime b = C60949h.m93108b(C60948g.f165068a, ZoneId.systemDefault());
        long a = atVar.f278112g.mo79743a(C90115fm.f250737d);
        try {
            if (atVar.mo91429q() && !dVar.f242420b) {
                int i = dVar.f242421c;
                if (i != 0) {
                    if (((long) i) < atVar.f278112g.mo79743a(C90115fm.f250740g)) {
                        ChronoUnit chronoUnit = ChronoUnit.DAYS;
                        C58075g gVar = dVar.f242422d;
                        if (gVar == null) {
                            gVar = C58075g.f155227j;
                        }
                        if (a > chronoUnit.between(C58068e.m88827e(gVar), b)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (!str.isEmpty()) {
                    C89425a aVar = (C89425a) atVar.f278085E.toBuilder();
                    aVar.copyOnWrite();
                    C89426b bVar = (C89426b) aVar.instance;
                    bVar.f242412a |= 1;
                    bVar.f242413b = true;
                    atVar.f278085E = (C89426b) aVar.build();
                    ((C23251a) atVar.f278110e.mo91446l()).mo28730f(atVar.f278085E, false);
                }
            }
        } catch (IllegalArgumentException e) {
            ((C59052c) ((C59052c) ((C59052c) C99403at.f278080a.mo56225c()).mo56382g(e)).mo56372aa(32618)).mo56386p("Failed to check constraints");
        }
    }
}
