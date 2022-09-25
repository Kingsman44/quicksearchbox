package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6260x.C79878z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80388r;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82837cg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82841ck;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82988hw;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C76478ag implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C77426t f211657a;

    /* renamed from: b */
    public final /* synthetic */ C80386p f211658b;

    /* renamed from: c */
    public final /* synthetic */ C80388r f211659c;

    public /* synthetic */ C76478ag(C77426t tVar, C80386p pVar, C80388r rVar) {
        this.f211657a = tVar;
        this.f211658b = pVar;
        this.f211659c = rVar;
    }

    public final Object get() {
        C77426t tVar = this.f211657a;
        C80386p pVar = this.f211658b;
        C80388r rVar = this.f211659c;
        C82837cg cgVar = (C82837cg) tVar.mo72527d().toBuilder();
        C82988hw a = C81442m.m129539a(tVar.mo72528e());
        C79877y yVar = C79878z.f218943a;
        C82841ck ckVar = (C82841ck) C82843cm.f225889f.createBuilder();
        if (a != null) {
            ckVar.copyOnWrite();
            ((C82843cm) ckVar.instance).f225895e = a;
        }
        C82843cm cmVar = (C82843cm) ckVar.build();
        cgVar.copyOnWrite();
        C82838ch chVar = (C82838ch) cgVar.instance;
        cmVar.getClass();
        chVar.f225882g = cmVar;
        chVar.f225876a |= 32;
        cgVar.copyOnWrite();
        C82838ch chVar2 = (C82838ch) cgVar.instance;
        pVar.getClass();
        chVar2.f225881f = pVar;
        chVar2.f225876a |= 16;
        cgVar.copyOnWrite();
        C82838ch chVar3 = (C82838ch) cgVar.instance;
        rVar.getClass();
        chVar3.f225880e = rVar;
        chVar3.f225876a |= 8;
        return (C82838ch) cgVar.build();
    }
}
