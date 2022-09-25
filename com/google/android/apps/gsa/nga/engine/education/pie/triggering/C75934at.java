package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.engine.education.pie.C75909j;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75830bd;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80204ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80205az;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80217bk;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80262q;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80263r;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.at */
/* compiled from: PG */
public abstract class C75934at implements C75864b, C75909j {

    /* renamed from: a */
    private final C75910k f210682a;

    /* renamed from: b */
    private final C75830bd f210683b;

    public C75934at(C75910k kVar, C75830bd bdVar) {
        this.f210682a = kVar;
        this.f210683b = bdVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C60870cx mo71969e(C80248co coVar, C80213bg bgVar, C80217bk bkVar) {
        C75830bd bdVar = this.f210683b;
        C80204ay ayVar = (C80204ay) C80205az.f220051c.createBuilder();
        C80262q qVar = (C80262q) C80263r.f220202e.createBuilder();
        qVar.copyOnWrite();
        C80263r rVar = (C80263r) qVar.instance;
        bgVar.getClass();
        rVar.f220205b = bgVar;
        rVar.f220204a |= 1;
        qVar.copyOnWrite();
        C80263r rVar2 = (C80263r) qVar.instance;
        rVar2.f220207d = coVar.f220171g;
        rVar2.f220204a |= 4;
        qVar.copyOnWrite();
        C80263r rVar3 = (C80263r) qVar.instance;
        bkVar.getClass();
        rVar3.f220206c = bkVar;
        rVar3.f220204a |= 2;
        ayVar.copyOnWrite();
        C80205az azVar = (C80205az) ayVar.instance;
        C80263r rVar4 = (C80263r) qVar.build();
        rVar4.getClass();
        azVar.f220054b = rVar4;
        azVar.f220053a = 3;
        return bdVar.mo71917a((C80205az) ayVar.build());
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        this.f210682a.mo71909a(this);
        return C118826c.f331423b;
    }

    /* renamed from: gI */
    public final void mo71907gI() {
        this.f210682a.mo71911c(this);
    }
}
