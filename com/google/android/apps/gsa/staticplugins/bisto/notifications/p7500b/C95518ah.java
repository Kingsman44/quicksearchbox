package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ah */
/* compiled from: PG */
public final class C95518ah implements Comparator {
    /* renamed from: a */
    static int m158011a(C95515ae aeVar, C95515ae aeVar2) {
        return -(m158012b(aeVar) > m158012b(aeVar2) ? 1 : (m158012b(aeVar) == m158012b(aeVar2) ? 0 : -1));
    }

    /* renamed from: b */
    public static long m158012b(C95515ae aeVar) {
        long j = -2147483648L;
        for (C90421b bVar : aeVar.mo89414r()) {
            j = Math.max(j, bVar.f252592m);
        }
        return j;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C95515ae aeVar = (C95515ae) obj;
        C95515ae aeVar2 = (C95515ae) obj2;
        if (!aeVar.mo89405R()) {
            if (!aeVar2.mo89405R()) {
                if (aeVar.mo89400D()) {
                    if (!aeVar2.mo89400D()) {
                        return -1;
                    }
                    return m158011a(aeVar, aeVar2);
                } else if (!aeVar2.mo89400D()) {
                    return m158011a(aeVar, aeVar2);
                }
            }
            return 1;
        } else if (!aeVar2.mo89405R()) {
            return -1;
        } else {
            return m158011a(aeVar, aeVar2);
        }
    }
}
