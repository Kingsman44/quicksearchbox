package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.cc */
/* compiled from: PG */
public final /* synthetic */ class C78407cc implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C78407cc f215856a = new C78407cc();

    private /* synthetic */ C78407cc() {
    }

    public final void accept(Object obj) {
        C78394bq bqVar = (C78394bq) obj;
        bqVar.f215839q.mo76661a();
        ArrayList arrayList = bqVar.f215842t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C60870cx) arrayList.get(i)).cancel(false);
        }
        bqVar.mo73324c();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
