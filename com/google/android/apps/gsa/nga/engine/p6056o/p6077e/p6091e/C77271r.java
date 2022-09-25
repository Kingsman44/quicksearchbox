package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.common.base.C58817ah;
import com.google.common.base.C58835az;
import p3186j$.time.LocalTime;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.r */
/* compiled from: PG */
public final /* synthetic */ class C77271r implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C77271r f213124a = new C77271r();

    private /* synthetic */ C77271r() {
    }

    public final Object apply(Object obj) {
        LocalTime localTime = (LocalTime) obj;
        return new C58835az(Integer.valueOf(localTime.getHour() % 12), Integer.valueOf(localTime.getMinute()));
    }
}
