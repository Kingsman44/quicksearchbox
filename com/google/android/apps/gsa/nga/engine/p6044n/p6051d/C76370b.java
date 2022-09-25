package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.android.apps.gsa.nga.engine.p5897ae.C74801q;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82875dr;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82876ds;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.b */
/* compiled from: PG */
public final /* synthetic */ class C76370b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82875dr f211491a;

    public /* synthetic */ C76370b(C82875dr drVar) {
        this.f211491a = drVar;
    }

    public final void accept(Object obj) {
        C82875dr drVar = this.f211491a;
        C58974d dVar = C76390p.f211523a;
        String j = ((C74801q) obj).mo71192j();
        drVar.copyOnWrite();
        C82876ds dsVar = (C82876ds) drVar.instance;
        C82876ds dsVar2 = C82876ds.f225961e;
        j.getClass();
        dsVar.f225963a |= 1;
        dsVar.f225964b = j;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
