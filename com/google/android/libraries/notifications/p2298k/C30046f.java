package com.google.android.libraries.notifications.p2298k;

import com.google.android.libraries.notifications.platform.p2309c.C30071a;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.notifications.k.f */
/* compiled from: PG */
public final class C30046f {

    /* renamed from: a */
    private final C30075e f81300a;

    public C30046f(C30075e eVar) {
        this.f81300a = eVar;
    }

    /* renamed from: a */
    public final int mo35384a(Long l, int i) {
        long j;
        if (l != null) {
            j = l.longValue();
            boolean z = true;
            C58838bb.m90872g(j >= 0, "accountId must be >= 0, got: %s.", j);
            if (j > 998) {
                z = false;
            }
            C58838bb.m90872g(z, "accountId must be <= 998, got: %s.", j);
        } else {
            j = 999;
        }
        C58838bb.m90866a(((C30071a) this.f81300a).f81362h, "JobSchedulerAllowedIDsRange must be provided.");
        return ((C30071a) this.f81300a).f81362h.intValue() + (i * 1000) + ((int) j);
    }
}
