package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77402o;
import com.google.android.apps.gsa.nga.engine.understanding.C78979af;
import com.google.android.apps.gsa.nga.engine.understanding.C78984ak;
import com.google.android.apps.gsa.nga.engine.understanding.C79138g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80371a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80382l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80383m;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.g */
/* compiled from: PG */
public final /* synthetic */ class C79093g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C77402o f217470a;

    /* renamed from: b */
    public final /* synthetic */ C78979af f217471b;

    public /* synthetic */ C79093g(C77402o oVar, C78979af afVar) {
        this.f217470a = oVar;
        this.f217471b = afVar;
    }

    public final Object apply(Object obj) {
        C77402o oVar = this.f217470a;
        C78979af afVar = this.f217471b;
        C80371a aVar = (C80371a) oVar.mo72543d((C74757n) obj, Optional.empty()).toBuilder();
        C80382l lVar = (C80382l) C80383m.f220568e.createBuilder();
        lVar.copyOnWrite();
        ((C80383m) lVar.instance).f220571b = 1.0d;
        C80517f a = afVar.mo73736a();
        lVar.copyOnWrite();
        ((C80383m) lVar.instance).f220570a = a.getNumber();
        aVar.copyOnWrite();
        C80383m mVar = (C80383m) lVar.build();
        mVar.getClass();
        ((C80386p) aVar.instance).f220582c = mVar;
        return new C79138g((C80386p) aVar.build(), C78984ak.REWRITING);
    }
}
