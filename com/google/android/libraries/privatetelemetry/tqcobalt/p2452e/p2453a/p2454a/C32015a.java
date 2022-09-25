package com.google.android.libraries.privatetelemetry.tqcobalt.p2452e.p2453a.p2454a;

import androidx.work.C4396at;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2450c.C32006a;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2452e.C32021d;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2452e.C32022e;
import com.google.common.p4522b.C58759qy;
import java.util.Set;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.e.a.a.a */
/* compiled from: PG */
public final class C32015a {
    /* renamed from: a */
    public static C32006a m59639a(C4396at atVar, Set set, int i) {
        C32021d a = C32022e.m59659a(set, new C58759qy("200001-" + i));
        if (a != null) {
            return new C32006a(atVar, a);
        }
        throw new IllegalStateException(String.format("Couldn't find the config for customerId = %d, projectId = %d", new Object[]{200001, Integer.valueOf(i)}));
    }
}
