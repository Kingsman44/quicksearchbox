package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.ZonedDateTime;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.au */
/* compiled from: PG */
public final /* synthetic */ class C77168au implements C77183bi {

    /* renamed from: a */
    public final /* synthetic */ C77170aw f212963a;

    public /* synthetic */ C77168au(C77170aw awVar) {
        this.f212963a = awVar;
    }

    /* renamed from: a */
    public final C58485gu mo72465a(C76590bg bgVar, C58485gu guVar) {
        C77170aw awVar = this.f212963a;
        ZonedDateTime g = awVar.f212966b.mo74015g();
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(C77276w.m123999c(bgVar)).collect(C58370cn.f155946a);
        C58485gu guVar3 = (C58485gu) Collection.EL.stream(guVar2).filter(awVar.f212967c.mo72488b(bgVar, g, true)).collect(C58370cn.f155946a);
        return guVar3.isEmpty() ? (C58485gu) Collection.EL.stream(guVar2).filter(awVar.f212967c.mo72488b(bgVar, g, false)).collect(C58370cn.f155946a) : guVar3;
    }
}
