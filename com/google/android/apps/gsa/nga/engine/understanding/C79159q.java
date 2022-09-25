package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80512a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4985f.p5030q.C65184er;
import com.google.protos.p4985f.p5030q.C65195fb;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.q */
/* compiled from: PG */
public final /* synthetic */ class C79159q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C78983aj f217609a;

    public /* synthetic */ C79159q(C78983aj ajVar) {
        this.f217609a = ajVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C78983aj ajVar = this.f217609a;
        C65184er erVar = (C65184er) obj;
        C65195fb a = C65195fb.m96585a(erVar.f176402c);
        if (a == null) {
            a = C65195fb.UNRECOGNIZED;
        }
        if (a != C65195fb.NO_ERROR) {
            return C58485gu.m89846n(ajVar);
        }
        C58480gp e = C58485gu.m89837e();
        float f = 0.0f;
        for (C61752n nVar : erVar.f176403d) {
            C80513b bVar = (C80513b) ajVar.mo73747b().get();
            C78982ai c = ajVar.mo73748c();
            C80512a aVar = (C80512a) bVar.toBuilder();
            aVar.copyOnWrite();
            nVar.getClass();
            ((C80513b) aVar.instance).f221016a = nVar;
            float f2 = bVar.f221018c;
            aVar.copyOnWrite();
            ((C80513b) aVar.instance).f221018c = f2 - f;
            ((C79074e) c).f217428a = Optional.m71637of((C80513b) aVar.build());
            e.mo55395g(c.mo73744a());
            f += 1.0E-5f;
        }
        return e.mo55394f();
    }
}
