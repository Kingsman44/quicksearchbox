package com.google.android.libraries.notifications.platform.p2337h.p2338a;

import android.content.Context;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.phenotype.client.C31760t;

/* renamed from: com.google.android.libraries.notifications.platform.h.a.a */
/* compiled from: PG */
public final class C30144a {
    /* renamed from: a */
    public static final void m56002a(Context context) {
        try {
            C31760t.m59102i(context);
        } catch (IllegalStateException e) {
            C30058b.m55790b("GnpPhenotypeManager", e, "PhenotypeContext.setContext was called more than once", new Object[0]);
        }
    }
}
