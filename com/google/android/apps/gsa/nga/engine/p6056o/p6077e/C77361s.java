package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.x;
import com.google.android.apps.gsa.nga.engine.aj.y;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.s */
/* compiled from: PG */
public final /* synthetic */ class C77361s implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C76795ay f213345a;

    /* renamed from: b */
    public final /* synthetic */ C80913i f213346b;

    /* renamed from: c */
    public final /* synthetic */ Optional f213347c;

    /* renamed from: d */
    public final /* synthetic */ C76590bg f213348d;

    /* renamed from: e */
    public final /* synthetic */ df f213349e;

    /* renamed from: f */
    public final /* synthetic */ C74965n f213350f;

    /* renamed from: g */
    public final /* synthetic */ C80303ay f213351g;

    /* renamed from: h */
    public final /* synthetic */ C80399l f213352h;

    public /* synthetic */ C77361s(C76795ay ayVar, C80913i iVar, Optional optional, C76590bg bgVar, df dfVar, C74965n nVar, C80303ay ayVar2, C80399l lVar) {
        this.f213345a = ayVar;
        this.f213346b = iVar;
        this.f213347c = optional;
        this.f213348d = bgVar;
        this.f213349e = dfVar;
        this.f213350f = nVar;
        this.f213351g = ayVar2;
        this.f213352h = lVar;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        boolean z;
        C74965n nVar;
        C60870cx cxVar;
        C22871g gVar;
        C60870cx cxVar2;
        C76795ay ayVar = this.f213345a;
        C80913i iVar = this.f213346b;
        Optional optional = this.f213347c;
        C76590bg bgVar = this.f213348d;
        df dfVar = this.f213349e;
        C74965n nVar2 = this.f213350f;
        C80303ay ayVar2 = this.f213351g;
        C80399l lVar = this.f213352h;
        C58485gu guVar = (C58485gu) obj;
        y yVar = (y) ((Optional) iVar.mo74714i()).get();
        boolean booleanValue = ((Boolean) optional.map(C77366x.f213369a).orElse(Boolean.valueOf(x.a == yVar.a()))).booleanValue();
        Optional g = bgVar.mo72265g(C76564ah.f211801a, "label");
        C83320io k = nVar2.mo71336k();
        if (guVar.size() != 1) {
            ((C58970a) ((C58970a) C76795ay.f212177a.mo56224b()).mo56372aa(3665)).mo56386p("AUM failed to resolve candidate contact ID");
            ayVar.f212190l.mo76648a(k, C82835ce.AUM_CONTACT_NOT_RESOLVED, C83044e.f226656a);
            return C118826c.f331423b;
        }
        long longValue = ((Long) guVar.get(0)).longValue();
        if (booleanValue) {
            cxVar = ayVar.f212189k.mo28209i(ayVar.f212189k.mo28209i(yVar.d(longValue, x.a), "[NGA] createVideoCallArgs", new C76778ah(yVar)), "[NGA] createVideoCallClientOp", new C77368z(ayVar));
            nVar = nVar2;
            z = booleanValue;
        } else {
            C22871g gVar2 = ayVar.f212189k;
            if (yVar.f()) {
                C80913i g2 = C80913i.m128777f(ayVar.f212189k, ayVar.f212182d.q(longValue, Optional.empty())).mo74712g("[NGA] filter phone infos", new C77362t(ayVar, g));
                C76795ay ayVar3 = ayVar;
                C77363u uVar = r1;
                df dfVar2 = dfVar;
                nVar = nVar2;
                z = booleanValue;
                gVar = gVar2;
                long j = longValue;
                long j2 = longValue;
                y yVar2 = yVar;
                C83320io ioVar = k;
                C83320io ioVar2 = k;
                C80303ay ayVar4 = ayVar2;
                C77363u uVar2 = new C77363u(ayVar3, dfVar2, j, yVar2, ioVar, ayVar4);
                cxVar2 = g2.mo74712g("[NGA] disambiguate phone label", uVar).mo74712g("[NGA] disambiguate phone number", new C77364v(ayVar3, dfVar2, j2, yVar2, ioVar2, ayVar4)).mo74713h("[NGA] log phone number disambiguation result", new C77365w(ayVar, ioVar2));
            } else {
                nVar = nVar2;
                z = booleanValue;
                gVar = gVar2;
                cxVar2 = yVar.d(longValue, x.b);
            }
            cxVar = gVar.mo28209i(gVar.mo28209i(cxVar2, "[NGA] post getCallId", new C76774ad(yVar)), "[NGA] post createCallArgs", new C76791au(ayVar));
        }
        return ayVar.f212189k.mo28209i(cxVar, "[NGA] post createClientOp", new C76779ai(ayVar, lVar, nVar, dfVar, z));
    }
}
