package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.p */
/* compiled from: PG */
final class C102820p implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58833ax f287098a;

    public C102820p(C58833ax axVar) {
        this.f287098a = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C102821q.f287099a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(21178)).mo56386p("Error when dumping MDD hotword models");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(C102817m.f287095a).map(C102818n.f287096a).collect(C58370cn.f155946a);
        C58485gu guVar3 = (C58485gu) Collection.EL.stream(guVar).filter(C102819o.f287097a).map(C102818n.f287096a).collect(C58370cn.f155946a);
        C59104x b = C102821q.f287099a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) b).mo56372aa(21179)).mo56354G("Hotword models associated with downloaded MDD filegroups: %s, pending groups: %s", guVar2, guVar3);
        C58833ax axVar = this.f287098a;
        if (axVar.mo56113h()) {
            ((C91006f) axVar.mo56107c()).mo85291r("HotwordModelDownloadController");
            ((C91006f) this.f287098a.mo56107c()).mo85279c("Downloaded MDD FileGroups").mo85276a(C90752i.m148231e(guVar2));
            ((C91006f) this.f287098a.mo56107c()).mo85279c("Pending MDD FileGroups").mo85276a(C90752i.m148231e(guVar3));
        }
    }
}
