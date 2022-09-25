package com.google.android.apps.gsa.nga.engine.education.pie.p6019a;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.C75871f;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75872a;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75879ag;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75880ah;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75881b;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75893n;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75894o;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75158f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80243cj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.a.ah */
/* compiled from: PG */
public final class C75771ah extends C75770ag {

    /* renamed from: a */
    private final C75880ah f210272a;

    /* renamed from: b */
    private final C75894o f210273b;

    /* renamed from: c */
    private final C75881b f210274c;

    public C75771ah(Bundle bundle, C75880ah ahVar, C75894o oVar, C75881b bVar) {
        super(bundle, C80267v.SWIPE_EDUCATION);
        this.f210272a = ahVar;
        this.f210273b = oVar;
        this.f210274c = bVar;
    }

    /* renamed from: b */
    public final C80244ck mo71873b() {
        C80243cj cjVar = (C80243cj) C80244ck.f220137i.createBuilder();
        C80246cm cmVar = C80246cm.SUCCESS;
        cjVar.copyOnWrite();
        C80244ck ckVar = (C80244ck) cjVar.instance;
        ckVar.f220140b = cmVar.f220162n;
        ckVar.f220139a |= 1;
        return (C80244ck) cjVar.build();
    }

    /* renamed from: c */
    public final C58485gu mo71874c() {
        C75879ag a = this.f210272a.mo71943a(this);
        C75894o oVar = this.f210273b;
        C75050a aVar = (C75050a) oVar.f210576a.mo17428b();
        aVar.getClass();
        C75158f fVar = (C75158f) oVar.f210577b.mo17428b();
        fVar.getClass();
        C75910k kVar = (C75910k) oVar.f210578c.mo17428b();
        kVar.getClass();
        C75871f fVar2 = (C75871f) oVar.f210579d.mo17428b();
        fVar2.getClass();
        C75893n nVar = new C75893n(this, aVar, fVar, kVar, fVar2);
        C75881b bVar = this.f210274c;
        C75050a aVar2 = (C75050a) bVar.f210536a.mo17428b();
        aVar2.getClass();
        C75158f fVar3 = (C75158f) bVar.f210537b.mo17428b();
        fVar3.getClass();
        C75910k kVar2 = (C75910k) bVar.f210538c.mo17428b();
        kVar2.getClass();
        return C58485gu.m89848p(a, nVar, new C75872a(this, aVar2, fVar3, kVar2));
    }

    /* renamed from: d */
    public final int mo71888d() {
        return 3;
    }
}
