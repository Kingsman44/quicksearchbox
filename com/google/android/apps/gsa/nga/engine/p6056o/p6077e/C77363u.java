package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.aj.y;
import com.google.android.apps.gsa.nga.engine.am.h.bb;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80912h;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80913i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.u */
/* compiled from: PG */
public final /* synthetic */ class C77363u implements C80912h {

    /* renamed from: a */
    public final /* synthetic */ C76795ay f213355a;

    /* renamed from: b */
    public final /* synthetic */ df f213356b;

    /* renamed from: c */
    public final /* synthetic */ long f213357c;

    /* renamed from: d */
    public final /* synthetic */ y f213358d;

    /* renamed from: e */
    public final /* synthetic */ C83320io f213359e;

    /* renamed from: f */
    public final /* synthetic */ C80303ay f213360f;

    public /* synthetic */ C77363u(C76795ay ayVar, df dfVar, long j, y yVar, C83320io ioVar, C80303ay ayVar2) {
        this.f213355a = ayVar;
        this.f213356b = dfVar;
        this.f213357c = j;
        this.f213358d = yVar;
        this.f213359e = ioVar;
        this.f213360f = ayVar2;
    }

    /* renamed from: a */
    public final Object mo72387a(Object obj) {
        C76795ay ayVar = this.f213355a;
        df dfVar = this.f213356b;
        long j = this.f213357c;
        y yVar = this.f213358d;
        C83320io ioVar = this.f213359e;
        C80303ay ayVar2 = this.f213360f;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            ((C58970a) ((C58970a) C76795ay.f212177a.mo56226d()).mo56372aa(3656)).mo56386p("Can't make phone call, because phone number is empty.");
            ayVar.f212190l.mo76648a(ioVar, C82835ce.EMPTY_PHONE_NUMBER, C83044e.f226656a);
            return C80913i.m128773b(Optional.empty());
        }
        return C80913i.m128774c(ayVar.f212188j.e(bb.b, dfVar, j, yVar.b(), guVar, ioVar, ayVar2));
    }
}
