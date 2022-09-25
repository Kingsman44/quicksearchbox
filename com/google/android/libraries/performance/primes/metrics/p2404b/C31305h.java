package com.google.android.libraries.performance.primes.metrics.p2404b;

import com.google.android.libraries.performance.primes.transmitter.C31620l;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.performance.primes.metrics.b.h */
/* compiled from: PG */
public final /* synthetic */ class C31305h implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C31305h f84296a = new C31305h();

    private /* synthetic */ C31305h() {
    }

    public final int compare(Object obj, Object obj2) {
        char c;
        C31620l lVar = (C31620l) obj;
        C31620l lVar2 = (C31620l) obj2;
        char c2 = 9;
        if (lVar.mo37276a() != null) {
            int i = lVar.mo37276a().f85091a;
            c = 9;
        } else {
            c = 0;
        }
        if (lVar2.mo37276a() != null) {
            int i2 = lVar2.mo37276a().f85091a;
        } else {
            c2 = 0;
        }
        if (c == c2) {
            return 0;
        }
        return c <= c2 ? 1 : -1;
    }
}
