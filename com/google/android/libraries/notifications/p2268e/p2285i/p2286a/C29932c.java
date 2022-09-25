package com.google.android.libraries.notifications.p2268e.p2285i.p2286a;

import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.p2268e.p2283h.C29897a;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55522ab;

/* renamed from: com.google.android.libraries.notifications.e.i.a.c */
/* compiled from: PG */
public final class C29932c {

    /* renamed from: a */
    public final C29897a f81058a;

    public C29932c(C29897a aVar) {
        this.f81058a = aVar;
    }

    /* renamed from: a */
    public final void mo35221a(C29820k kVar, Long l, C55522ab abVar) {
        long longValue = kVar.mo35008g().longValue();
        if (longValue == 0) {
            C30058b.m55794f("ChimeSyncHelperImpl", "SYNC request falled back to FULL_SYNC for account [%s]. Account never synced before.", kVar.mo35009h());
            mo35222b(kVar, abVar);
        } else if (l == null || longValue < l.longValue()) {
            C30058b.m55794f("ChimeSyncHelperImpl", "Sending SYNC request for account [%s], current sync version [%d], for reason [%s].", kVar.mo35009h(), kVar.mo35008g(), abVar.name());
            this.f81058a.mo35207b(kVar, longValue, abVar);
        } else {
            C30058b.m55794f("ChimeSyncHelperImpl", "SYNC request ignored for account [%s]. Current version [%d]. Requested version [%d].", kVar.mo35009h(), kVar.mo35008g(), l);
        }
    }

    /* renamed from: b */
    public final void mo35222b(C29820k kVar, C55522ab abVar) {
        this.f81058a.mo35209d(kVar, abVar);
    }
}
