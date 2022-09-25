package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75786o;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75788q;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75891l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80204ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80205az;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80256k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80257l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.bi */
/* compiled from: PG */
public final class C75835bi implements C75786o {

    /* renamed from: a */
    public static final C58974d f210449a = C58974d.m91136j();

    /* renamed from: b */
    private final C75830bd f210450b;

    public C75835bi(C75830bd bdVar) {
        this.f210450b = bdVar;
    }

    /* renamed from: a */
    private final void m122241a(boolean z) {
        C75830bd bdVar = this.f210450b;
        C80204ay ayVar = (C80204ay) C80205az.f220051c.createBuilder();
        C80256k kVar = (C80256k) C80257l.f220192c.createBuilder();
        kVar.copyOnWrite();
        C80257l lVar = (C80257l) kVar.instance;
        lVar.f220194a = 3;
        lVar.f220195b = Boolean.valueOf(z);
        ayVar.copyOnWrite();
        C80205az azVar = (C80205az) ayVar.instance;
        C80257l lVar2 = (C80257l) kVar.build();
        lVar2.getClass();
        azVar.f220054b = lVar2;
        azVar.f220053a = 1;
        C60856cj.m92911t(bdVar.mo71917a((C80205az) ayVar.build()), new C75834bh(), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo71889d(C75788q qVar, int i, C80265t tVar) {
        m122241a(false);
    }

    /* renamed from: e */
    public final void mo71890e(C75788q qVar, int i, C75891l lVar) {
        m122241a(true);
    }

    /* renamed from: f */
    public final void mo71891f(C75788q qVar) {
        m122241a(false);
    }
}
