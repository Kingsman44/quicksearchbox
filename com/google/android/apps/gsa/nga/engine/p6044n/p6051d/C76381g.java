package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82875dr;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82876ds;
import com.google.assistant.p3897e.p3917i.p3918a.C51544lq;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.g */
/* compiled from: PG */
public final /* synthetic */ class C76381g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82875dr f211514a;

    public /* synthetic */ C76381g(C82875dr drVar) {
        this.f211514a = drVar;
    }

    public final void accept(Object obj) {
        C82875dr drVar = this.f211514a;
        C51544lq lqVar = (C51544lq) obj;
        C58974d dVar = C76390p.f211523a;
        drVar.copyOnWrite();
        C82876ds dsVar = (C82876ds) drVar.instance;
        C82876ds dsVar2 = C82876ds.f225961e;
        lqVar.getClass();
        dsVar.f225966d = lqVar;
        dsVar.f225963a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
