package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.am.h.bb;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.am.h.f;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80307bb;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4152bb.p4153a.C55421x;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.r */
/* compiled from: PG */
public final /* synthetic */ class C77360r implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C76795ay f213341a;

    /* renamed from: b */
    public final /* synthetic */ df f213342b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f213343c;

    /* renamed from: d */
    public final /* synthetic */ C80303ay f213344d;

    public /* synthetic */ C77360r(C76795ay ayVar, df dfVar, C74965n nVar, C80303ay ayVar2) {
        this.f213341a = ayVar;
        this.f213342b = dfVar;
        this.f213343c = nVar;
        this.f213344d = ayVar2;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C76795ay ayVar = this.f213341a;
        f fVar = this.f213342b;
        C74965n nVar = this.f213343c;
        C80303ay ayVar2 = this.f213344d;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            ((C58970a) ((C58970a) C76795ay.f212177a.mo56226d()).mo56372aa(3658)).mo56386p("Punt, contact id list is empty");
            ayVar.f212190l.mo76648a(nVar.mo71336k(), C82835ce.NO_CONTACT_CAN_BE_CALLED, C83044e.f226656a);
            return C80913i.m128772a(C118826c.f331423b);
        }
        C55421x xVar = bb.b.e;
        ayVar2.copyOnWrite();
        C80307bb bbVar = (C80307bb) ayVar2.instance;
        C80307bb bbVar2 = C80307bb.f220382e;
        bbVar.f220386c = xVar.f146230cP;
        bbVar.f220384a |= 2;
        ayVar2.copyOnWrite();
        C80307bb bbVar3 = (C80307bb) ayVar2.instance;
        bbVar3.f220385b = 2;
        bbVar3.f220384a |= 1;
        return C80913i.m128774c(ayVar.f212188j.c(bb.b, df.c(fVar.a, guVar), nVar.mo71336k(), ayVar2));
    }
}
