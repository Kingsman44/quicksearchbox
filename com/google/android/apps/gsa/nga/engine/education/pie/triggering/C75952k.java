package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80216bj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80217bk;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80249d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.k */
/* compiled from: PG */
public final /* synthetic */ class C75952k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C75953l f210736a;

    /* renamed from: b */
    public final /* synthetic */ C75933as f210737b;

    /* renamed from: c */
    public final /* synthetic */ String f210738c;

    public /* synthetic */ C75952k(C75953l lVar, C75933as asVar, String str) {
        this.f210736a = lVar;
        this.f210737b = asVar;
        this.f210738c = str;
    }

    public final void accept(Object obj) {
        C75953l lVar = this.f210736a;
        C75933as asVar = this.f210737b;
        String str = this.f210738c;
        Map.Entry entry = (Map.Entry) obj;
        C80248co coVar = (C80248co) entry.getKey();
        C80213bg bgVar = (C80213bg) entry.getValue();
        C80216bj bjVar = (C80216bj) C80217bk.f220088c.createBuilder();
        C80249d dVar = C80249d.f220172a;
        bjVar.copyOnWrite();
        C80217bk bkVar = (C80217bk) bjVar.instance;
        dVar.getClass();
        bkVar.f220091b = dVar;
        bkVar.f220090a = 1;
        new C90873ag(lVar.mo71969e(coVar, bgVar, (C80217bk) bjVar.build()), lVar.f210740b, "[NGA] Notifiying Coordinator of satisfied condition", new C75949h(lVar, asVar, coVar, bgVar, str)).mo85223a(C75950i.f210733a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
