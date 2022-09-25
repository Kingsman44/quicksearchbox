package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i;

import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95515ae;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95518ah;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.e */
/* compiled from: PG */
final class C95681e implements Comparator {

    /* renamed from: a */
    private final long f267856a;

    public C95681e(long j) {
        this.f267856a = j;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C95515ae aeVar = (C95515ae) obj;
        C95515ae aeVar2 = (C95515ae) obj2;
        long t = C95682f.m158413t(aeVar);
        long t2 = C95682f.m158413t(aeVar2);
        long j = this.f267856a;
        if (t < j) {
            t = 0;
        }
        if (t2 < j) {
            t2 = 0;
        }
        int i = -Long.valueOf(t).compareTo(Long.valueOf(t2));
        if (i != 0) {
            return i;
        }
        return -Long.valueOf(C95518ah.m158012b(aeVar)).compareTo(Long.valueOf(C95518ah.m158012b(aeVar2)));
    }
}
