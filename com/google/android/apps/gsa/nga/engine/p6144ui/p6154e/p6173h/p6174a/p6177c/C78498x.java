package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78518aa;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78530am;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78565t;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.x */
/* compiled from: PG */
public final /* synthetic */ class C78498x implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C78356af f216187a;

    public /* synthetic */ C78498x(C78356af afVar) {
        this.f216187a = afVar;
    }

    public final void accept(Object obj) {
        C78356af afVar = this.f216187a;
        C78537at atVar = (C78537at) obj;
        if (!atVar.equals(C78537at.f216290a)) {
            C78530am amVar = afVar.f215718a;
            atVar.getClass();
            ((C78518aa) amVar).f216259c = new C78565t(atVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
