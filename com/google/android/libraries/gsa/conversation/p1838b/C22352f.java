package com.google.android.libraries.gsa.conversation.p1838b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.conversation.b.f */
/* compiled from: PG */
public final class C22352f {

    /* renamed from: a */
    private final List f61698a = new ArrayList(10);

    /* renamed from: b */
    private int f61699b;

    /* renamed from: a */
    public final synchronized C22351e mo27582a() {
        if (this.f61698a.isEmpty()) {
            return new C22347a(-1, -1, -1);
        }
        long j = 0;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MIN_VALUE;
        for (Long longValue : this.f61698a) {
            long longValue2 = longValue.longValue();
            if (longValue2 < j2) {
                j2 = longValue2;
            }
            if (longValue2 > j3) {
                j3 = longValue2;
            }
            j += longValue2;
        }
        return new C22347a(j2, j / ((long) this.f61698a.size()), j3);
    }

    /* renamed from: b */
    public final synchronized void mo27583b(long j) {
        int i = this.f61699b;
        if (i < 10) {
            this.f61698a.add(Long.valueOf(j));
        } else {
            this.f61698a.set(i % 10, Long.valueOf(j));
        }
        this.f61699b++;
    }
}
