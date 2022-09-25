package com.google.android.apps.gsa.nga.shared.p6407v.p6412e;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82912fa;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82914fc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82915fd;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.by */
/* compiled from: PG */
public final /* synthetic */ class C83159by implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82912fa f226770a;

    public /* synthetic */ C83159by(C82912fa faVar) {
        this.f226770a = faVar;
    }

    public final void accept(Object obj) {
        C82912fa faVar = this.f226770a;
        faVar.copyOnWrite();
        C82915fd fdVar = (C82915fd) faVar.instance;
        C82915fd fdVar2 = C82915fd.f226204f;
        fdVar.f226207b = ((C82914fc) obj).f226203t;
        fdVar.f226206a |= 1;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
