package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82875dr;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82876ds;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.f */
/* compiled from: PG */
public final /* synthetic */ class C76380f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82875dr f211513a;

    public /* synthetic */ C76380f(C82875dr drVar) {
        this.f211513a = drVar;
    }

    public final void accept(Object obj) {
        C82875dr drVar = this.f211513a;
        C51536li liVar = (C51536li) obj;
        C58974d dVar = C76390p.f211523a;
        drVar.copyOnWrite();
        C82876ds dsVar = (C82876ds) drVar.instance;
        C82876ds dsVar2 = C82876ds.f225961e;
        liVar.getClass();
        dsVar.f225965c = liVar;
        dsVar.f225963a |= 2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
