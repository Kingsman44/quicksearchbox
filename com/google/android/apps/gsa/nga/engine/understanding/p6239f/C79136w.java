package com.google.android.apps.gsa.nga.engine.understanding.p6239f;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.knowledge.p4661a.p4662a.C61752n;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f.w */
/* compiled from: PG */
public final /* synthetic */ class C79136w implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C79137x f217535a;

    /* renamed from: b */
    public final /* synthetic */ C79131r f217536b;

    /* renamed from: c */
    public final /* synthetic */ C80515d f217537c;

    /* renamed from: d */
    public final /* synthetic */ C74965n f217538d;

    public /* synthetic */ C79136w(C79137x xVar, C79131r rVar, C80515d dVar, C74965n nVar) {
        this.f217535a = xVar;
        this.f217536b = rVar;
        this.f217537c = dVar;
        this.f217538d = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C79137x xVar = this.f217535a;
        C79131r rVar = this.f217536b;
        C80515d dVar = this.f217537c;
        C74965n nVar = this.f217538d;
        C58485gu guVar = (C58485gu) obj;
        C58480gp e = C58485gu.m89837e();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            e.mo55395g(rVar.mo73807c((C61752n) guVar.get(i), dVar, nVar));
        }
        return xVar.f217540b.mo28209i(C60856cj.m92906o(e.mo55394f()), "[NGA] Resolvers.applyResolver", C79135v.f217534a);
    }
}
