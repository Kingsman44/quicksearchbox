package com.google.android.apps.gsa.nga.engine.understanding.p6238e;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77388am;
import com.google.android.apps.gsa.nga.engine.understanding.C78978ae;
import com.google.android.apps.gsa.nga.engine.understanding.C78985al;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82827bx;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82828by;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.e.s */
/* compiled from: PG */
public final /* synthetic */ class C79105s implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C79086ak f217488a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f217489b;

    /* renamed from: c */
    public final /* synthetic */ C77388am f217490c;

    public /* synthetic */ C79105s(C79086ak akVar, C74965n nVar, C77388am amVar) {
        this.f217488a = akVar;
        this.f217489b = nVar;
        this.f217490c = amVar;
    }

    public final void accept(Object obj, Object obj2) {
        C79086ak akVar = this.f217488a;
        C74965n nVar = this.f217489b;
        C77388am amVar = this.f217490c;
        C78978ae aeVar = (C78978ae) obj;
        C83320io k = nVar.mo71336k();
        C83334w wVar = akVar.f217449e;
        C82887ec ecVar = C82887ec.FILTERED_UNDERSTANDING_SENSITIVE;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82827bx bxVar = (C82827bx) C82828by.f225698e.createBuilder();
        C80386p b = ((C78985al) aeVar.mo73732b()).mo73750b();
        bxVar.copyOnWrite();
        C82828by byVar = (C82828by) bxVar.instance;
        b.getClass();
        byVar.f225701b = b;
        byVar.f225700a |= 1;
        C80388r c = amVar.mo72539c(((C78985al) obj2).mo73750b());
        bxVar.copyOnWrite();
        C82828by byVar2 = (C82828by) bxVar.instance;
        c.getClass();
        byVar2.f225703d = c;
        byVar2.f225700a |= 4;
        C80388r c2 = amVar.mo72539c(((C78985al) aeVar.mo73732b()).mo73750b());
        bxVar.copyOnWrite();
        C82828by byVar3 = (C82828by) bxVar.instance;
        c2.getClass();
        byVar3.f225702c = c2;
        byVar3.f225700a |= 2;
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C82828by byVar4 = (C82828by) bxVar.build();
        byVar4.getClass();
        eaVar.f225980b = byVar4;
        eaVar.f225979a = 33;
        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), k);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
