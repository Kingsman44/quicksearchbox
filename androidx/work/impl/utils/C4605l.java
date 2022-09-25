package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p207b.C4496e;

/* renamed from: androidx.work.impl.utils.l */
/* compiled from: PG */
public final class C4605l {
    /* renamed from: a */
    public static final int m12997a(WorkDatabase workDatabase, String str) {
        Long a = workDatabase.mo9359A().mo9456a(str);
        int i = 0;
        int longValue = a != null ? (int) a.longValue() : 0;
        if (longValue != Integer.MAX_VALUE) {
            i = longValue + 1;
        }
        m12998b(workDatabase, str, i);
        return longValue;
    }

    /* renamed from: b */
    public static final void m12998b(WorkDatabase workDatabase, String str, int i) {
        workDatabase.mo9359A().mo9457b(new C4496e(str, Long.valueOf((long) i)));
    }
}
