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
import com.google.common.p4522b.C58528ij;
import com.google.common.p4552o.p4553a.C59485bi;
import com.google.common.p4552o.p4553a.C59486bj;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.h */
/* compiled from: PG */
public final class C75887h extends C75891l implements C75155d, C75909j {

    /* renamed from: a */
    private final C75050a f210554a;

    /* renamed from: b */
    private final C75158f f210555b;

    /* renamed from: c */
    private final C75910k f210556c;

    /* renamed from: d */
    private final C75871f f210557d;

    /* renamed from: e */
    private C80265t f210558e = C80265t.FAILURE_CAUSE_UNKNOWN;

    /* renamed from: f */
    private int f210559f = 1;

    public C75887h(C75892m mVar, C75050a aVar, C75158f fVar, C75910k kVar, C75871f fVar2) {
        super(mVar);
        this.f210554a = aVar;
        this.f210555b = fVar;
        this.f210556c = kVar;
        this.f210557d = fVar2;
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
            mo71950j(this.f210558e);
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
        int i = this.f210559f;
        cjVar.copyOnWrite();
        C80244ck ckVar2 = (C80244ck) cjVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            ckVar2.f220142d = i2;
            ckVar2.f220139a |= 4;
            return (C80244ck) cjVar.build();
        }
        throw null;
    }

    /* renamed from: e */
    public final void mo71938e() {
        this.f210555b.mo71507c(this);
        super.mo71938e();
        this.f210556c.mo71911c(this);
    }

    /* renamed from: f */
    public final int mo71939f() {
        C58528ij a = this.f210557d.mo71920a();
        if (a.contains(C80251f.CORNER_SWIPE)) {
            this.f210559f = 2;
            if (a.contains(C80251f.HOTWORD)) {
                this.f210559f = 3;
            }
            if (mo71949h().mo71897e() == 7) {
                this.f210559f = 4;
            }
            this.f210558e = C80265t.LIGHTWEIGHT_SWIPE_INVOCATION_DISMISSED;
        } else if (a.contains(C80251f.HOME_BUTTON)) {
            this.f210559f = 6;
            if (a.contains(C80251f.HOTWORD)) {
                this.f210559f = 7;
            }
            if (mo71949h().mo71897e() == 7) {
                this.f210559f = 8;
            }
            this.f210558e = C80265t.LIGHTWEIGHT_LONG_PRESS_HOME_INVOCATION_DISMISSED;
        }
        if (this.f210559f == 1 || this.f210554a.mo71417a().mo71470p()) {
            return 2;
        }
        this.f210555b.mo71506b(this);
        this.f210556c.mo71909a(this);
        return 1;
    }

    /* renamed from: g */
    public final C59486bj mo71944g() {
        C59485bi biVar = (C59485bi) C59486bj.f157824d.createBuilder();
        int i = this.f210559f;
        biVar.copyOnWrite();
        C59486bj bjVar = (C59486bj) biVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            bjVar.f157828c = i2;
            bjVar.f157826a |= 2;
            return (C59486bj) biVar.build();
        }
        throw null;
    }
}
