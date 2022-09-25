package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77402o;
import com.google.android.apps.gsa.nga.engine.understanding.C78981ah;
import com.google.android.apps.gsa.nga.engine.understanding.C78984ak;
import com.google.android.apps.gsa.nga.engine.understanding.C79138g;
import com.google.android.apps.gsa.nga.engine.understanding.C79162t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80371a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80376f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80377g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.t */
/* compiled from: PG */
public final /* synthetic */ class C79106t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C77402o f217491a;

    /* renamed from: b */
    public final /* synthetic */ C79162t f217492b;

    public /* synthetic */ C79106t(C77402o oVar, C79162t tVar) {
        this.f217491a = oVar;
        this.f217492b = tVar;
    }

    public final Object apply(Object obj) {
        C77402o oVar = this.f217491a;
        C79162t tVar = this.f217492b;
        C80371a aVar = (C80371a) oVar.mo72541b((C78981ah) obj).toBuilder();
        C80376f fVar = (C80376f) C80377g.f220548e.createBuilder();
        fVar.copyOnWrite();
        ((C80377g) fVar.instance).f220550a = true;
        fVar.copyOnWrite();
        ((C80377g) fVar.instance).f220552c = 1.0d;
        C80515d a = tVar.mo73713a();
        fVar.copyOnWrite();
        ((C80377g) fVar.instance).f220551b = a.getNumber();
        C80377g gVar = (C80377g) fVar.build();
        aVar.copyOnWrite();
        gVar.getClass();
        ((C80386p) aVar.instance).f220583d = gVar;
        return new C79138g((C80386p) aVar.build(), C78984ak.GENERATING_INTENTS);
    }
}
