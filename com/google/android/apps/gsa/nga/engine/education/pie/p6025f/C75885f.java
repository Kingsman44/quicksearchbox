package com.google.android.apps.gsa.nga.engine.education.pie.p6025f;

import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.education.pie.C75871f;
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
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80251f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4552o.p4553a.C59485bi;
import com.google.common.p4552o.p4553a.C59486bj;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.f */
/* compiled from: PG */
public final class C75885f extends C75891l implements C75155d, C75909j {

    /* renamed from: a */
    private final String f210543a;

    /* renamed from: b */
    private final C75050a f210544b;

    /* renamed from: c */
    private final C75158f f210545c;

    /* renamed from: d */
    private final C75910k f210546d;

    /* renamed from: e */
    private final C75871f f210547e;

    /* renamed from: f */
    private final C91142g f210548f;

    public C75885f(C75892m mVar, String str, C75050a aVar, C75158f fVar, C75910k kVar, C75871f fVar2, C91142g gVar) {
        super(mVar);
        this.f210543a = str;
        this.f210544b = aVar;
        this.f210545c = fVar;
        this.f210546d = kVar;
        this.f210547e = fVar2;
        this.f210548f = gVar;
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        if (boVar.mo71470p()) {
            mo71951k();
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final void mo71916c(C80203ax axVar) {
        if (axVar.f220049a == 1 && ((Boolean) axVar.f220050b).booleanValue()) {
            mo71950j(C80265t.HOTWORD_INVOCATION_TRYSAYING_DISMISSED);
        }
        if (axVar.f220049a == 3 && ((Boolean) axVar.f220050b).booleanValue()) {
            mo71950j(C80265t.UI_EXIT_CLICKED);
        }
    }

    /* renamed from: d */
    public final C80244ck mo71937d() {
        C80243cj cjVar = (C80243cj) C80244ck.f220137i.createBuilder();
        C80246cm cmVar = C80246cm.LIGHTWEIGHT_INVOCATION;
        cjVar.copyOnWrite();
        C80244ck ckVar = (C80244ck) cjVar.instance;
        ckVar.f220140b = cmVar.f220162n;
        ckVar.f220139a |= 1;
        cjVar.copyOnWrite();
        C80244ck ckVar2 = (C80244ck) cjVar.instance;
        ckVar2.f220142d = 4;
        ckVar2.f220139a = 4 | ckVar2.f220139a;
        String str = this.f210543a;
        cjVar.copyOnWrite();
        C80244ck ckVar3 = (C80244ck) cjVar.instance;
        ckVar3.f220139a |= 2;
        ckVar3.f220141c = str;
        return (C80244ck) cjVar.build();
    }

    /* renamed from: e */
    public final void mo71938e() {
        this.f210545c.mo71507c(this);
        super.mo71938e();
        this.f210546d.mo71911c(this);
    }

    /* renamed from: f */
    public final int mo71939f() {
        if (!this.f210547e.mo71920a().contains(C80251f.HOTWORD) || this.f210544b.mo71417a().mo71470p()) {
            return 2;
        }
        this.f210545c.mo71506b(this);
        this.f210546d.mo71909a(this);
        return 1;
    }

    /* renamed from: g */
    public final C59486bj mo71944g() {
        C59485bi biVar = (C59485bi) C59486bj.f157824d.createBuilder();
        biVar.copyOnWrite();
        C59486bj bjVar = (C59486bj) biVar.instance;
        bjVar.f157828c = 4;
        bjVar.f157826a |= 2;
        if (this.f210548f.mo85405j(C90126fx.f251348hC)) {
            String str = this.f210543a;
            biVar.copyOnWrite();
            C59486bj bjVar2 = (C59486bj) biVar.instance;
            bjVar2.f157826a |= 1;
            bjVar2.f157827b = str;
        }
        return (C59486bj) biVar.build();
    }
}
