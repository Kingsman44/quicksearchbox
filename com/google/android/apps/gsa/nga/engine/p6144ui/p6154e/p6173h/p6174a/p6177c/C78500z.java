package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78518aa;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78554i;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.z */
/* compiled from: PG */
public final /* synthetic */ class C78500z implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C78356af f216189a;

    public /* synthetic */ C78500z(C78356af afVar) {
        this.f216189a = afVar;
    }

    public final void accept(Object obj) {
        C78356af afVar = this.f216189a;
        C78537at atVar = (C78537at) obj;
        if (!atVar.equals(C78537at.f216290a)) {
            ((C78518aa) afVar.f215718a).f216258b = C78554i.m126208c(atVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
