package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80432l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80433m;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80434n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.ax */
/* compiled from: PG */
public final /* synthetic */ class C83131ax implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80433m f226742a;

    public /* synthetic */ C83131ax(C80433m mVar) {
        this.f226742a = mVar;
    }

    public final void accept(Object obj) {
        C80433m mVar = this.f226742a;
        C80432l lVar = (C80432l) obj;
        mVar.copyOnWrite();
        C80434n nVar = (C80434n) mVar.instance;
        C80434n nVar2 = C80434n.f220756h;
        lVar.getClass();
        nVar.f220761d = lVar;
        nVar.f220758a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
