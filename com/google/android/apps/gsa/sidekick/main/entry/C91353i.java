package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.i */
/* compiled from: PG */
public final /* synthetic */ class C91353i implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C91353i f254908a = new C91353i();

    private /* synthetic */ C91353i() {
    }

    public final Object apply(Object obj) {
        if (((Integer) obj).intValue() != -1) {
            return C118826c.f331422a;
        }
        throw new RuntimeException("Failed to schedule watchdog refresh");
    }
}
