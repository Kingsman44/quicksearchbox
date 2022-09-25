package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.y */
/* compiled from: PG */
public final /* synthetic */ class C75969y implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C75970z f210771a;

    public /* synthetic */ C75969y(C75970z zVar) {
        this.f210771a = zVar;
    }

    public final void accept(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C75915aa aaVar = this.f210771a.f210772a;
        C80248co coVar = (C80248co) entry.getKey();
        C80213bg bgVar = (C80213bg) entry.getValue();
        coVar.name();
        new C90873ag(aaVar.f210625d.mo28203c("[NGA] Waiting for few seconds for Pie to become Eligible again after Maps usage", C75915aa.f210623b.toMillis(), new C75965u(aaVar, coVar, bgVar)), aaVar.f210625d, "[NGA] Notifiying Coordinator of satisfied condition", new C75966v(aaVar, coVar, bgVar)).mo85223a(C75967w.f210768a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
