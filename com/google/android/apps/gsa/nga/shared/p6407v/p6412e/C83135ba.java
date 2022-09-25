package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80433m;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80434n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.ba */
/* compiled from: PG */
public final /* synthetic */ class C83135ba implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80433m f226745a;

    public /* synthetic */ C83135ba(C80433m mVar) {
        this.f226745a = mVar;
    }

    public final void accept(Object obj) {
        C80433m mVar = this.f226745a;
        String str = (String) obj;
        mVar.copyOnWrite();
        C80434n nVar = (C80434n) mVar.instance;
        C80434n nVar2 = C80434n.f220756h;
        str.getClass();
        nVar.f220758a |= 2;
        nVar.f220760c = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
