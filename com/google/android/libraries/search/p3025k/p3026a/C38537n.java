package com.google.android.libraries.search.p3025k.p3026a;

import com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32007a;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32009c;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2451d.C32011e;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.search.k.a.n */
/* compiled from: PG */
public abstract class C38537n implements C32011e {
    /* renamed from: a */
    public final C32009c mo37774a() {
        return new C32007a(200001, 3, 6);
    }

    /* renamed from: c */
    public final long mo37776c() {
        return mo41460d();
    }

    /* renamed from: d */
    public abstract long mo41460d();

    /* renamed from: e */
    public abstract int mo41461e();

    /* renamed from: f */
    public abstract int mo41463f();

    /* renamed from: b */
    public final List mo37775b() {
        Integer[] numArr = new Integer[2];
        int f = mo41463f();
        int i = f - 1;
        if (f != 0) {
            numArr[0] = Integer.valueOf(i);
            int e = mo41461e();
            if (e != 0) {
                numArr[1] = Integer.valueOf(e);
                return Arrays.asList(numArr);
            }
            throw null;
        }
        throw null;
    }
}
