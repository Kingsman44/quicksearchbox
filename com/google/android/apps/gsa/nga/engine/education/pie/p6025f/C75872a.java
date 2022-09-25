package com.google.android.apps.gsa.nga.engine.education.pie.p6025f;

import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.education.pie.C75909j;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p5964av.C75158f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80243cj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.a */
/* compiled from: PG */
public final class C75872a extends C75891l implements C75155d, C75909j {

    /* renamed from: a */
    private final C75050a f210511a;

    /* renamed from: b */
    private final C75158f f210512b;

    /* renamed from: c */
    private final C75910k f210513c;

    public C75872a(C75892m mVar, C75050a aVar, C75158f fVar, C75910k kVar) {
        super(mVar);
        this.f210511a = aVar;
        this.f210512b = fVar;
        this.f210513c = kVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71137a(C75077bo boVar, C75077bo boVar2) {
    }

    /* renamed from: b */
    public final void mo71138b(bl blVar) {
        if (blVar != bl.a) {
            mo71951k();
        }
    }

    /* renamed from: c */
    public final void mo71916c(C80203ax axVar) {
        if (axVar.f220049a == 1 && ((Boolean) axVar.f220050b).booleanValue()) {
            mo71951k();
        }
    }

    /* renamed from: d */
    public final C80244ck mo71937d() {
        C80243cj cjVar = (C80243cj) C80244ck.f220137i.createBuilder();
        C80246cm cmVar = C80246cm.ASSISTANT_IS_ACTIVE;
        cjVar.copyOnWrite();
        C80244ck ckVar = (C80244ck) cjVar.instance;
        ckVar.f220140b = cmVar.f220162n;
        ckVar.f220139a |= 1;
        return (C80244ck) cjVar.build();
    }

    /* renamed from: e */
    public final void mo71938e() {
        super.mo71938e();
        this.f210512b.mo71507c(this);
        this.f210513c.mo71911c(this);
    }

    /* renamed from: f */
    public final int mo71939f() {
        if (!this.f210511a.mo71417a().mo71470p()) {
            return 2;
        }
        this.f210512b.mo71506b(this);
        this.f210513c.mo71909a(this);
        return 1;
    }
}
