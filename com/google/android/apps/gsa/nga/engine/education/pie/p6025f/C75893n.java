package com.google.android.apps.gsa.nga.engine.education.pie.p6025f;

import com.google.android.apps.gsa.assistant.shared.l.e;
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

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.n */
/* compiled from: PG */
public final class C75893n extends C75891l implements C75155d, C75909j {

    /* renamed from: a */
    private final C75050a f210572a;

    /* renamed from: b */
    private final C75158f f210573b;

    /* renamed from: c */
    private final C75910k f210574c;

    /* renamed from: d */
    private final C75871f f210575d;

    public C75893n(C75892m mVar, C75050a aVar, C75158f fVar, C75910k kVar, C75871f fVar2) {
        super(mVar);
        this.f210572a = aVar;
        this.f210573b = fVar;
        this.f210574c = kVar;
        this.f210575d = fVar2;
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        if (!boVar.mo71470p()) {
            return;
        }
        if (((e) boVar.mo71467m().orElse(e.a)).equals(e.ax)) {
            mo71951k();
        } else {
            mo71950j(C80265t.GESTURE_NOT_SWIPE);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final void mo71916c(C80203ax axVar) {
        if (axVar.f220049a == 1 && ((Boolean) axVar.f220050b).booleanValue()) {
            mo71950j(C80265t.SWIPE_INVOCATION_DISMISSED);
        }
        if (axVar.f220049a == 3 && ((Boolean) axVar.f220050b).booleanValue()) {
            mo71950j(C80265t.UI_EXIT_CLICKED);
        }
    }

    /* renamed from: d */
    public final C80244ck mo71937d() {
        C80243cj cjVar = (C80243cj) C80244ck.f220137i.createBuilder();
        C80246cm cmVar = C80246cm.SWIPE_INVOCATION;
        cjVar.copyOnWrite();
        C80244ck ckVar = (C80244ck) cjVar.instance;
        ckVar.f220140b = cmVar.f220162n;
        ckVar.f220139a |= 1;
        return (C80244ck) cjVar.build();
    }

    /* renamed from: e */
    public final void mo71938e() {
        this.f210573b.mo71507c(this);
        this.f210574c.mo71911c(this);
    }

    /* renamed from: f */
    public final int mo71939f() {
        if (!this.f210575d.mo71920a().contains(C80251f.CORNER_SWIPE) || this.f210572a.mo71417a().mo71470p()) {
            return 2;
        }
        this.f210573b.mo71506b(this);
        this.f210574c.mo71909a(this);
        return 1;
    }
}
