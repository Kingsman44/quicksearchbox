package com.google.android.libraries.social.populous.p3296e.p3302f;

import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.social.populous.e.f.b */
/* compiled from: PG */
public final /* synthetic */ class C42521b implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C42521b f111505a = new C42521b();

    private /* synthetic */ C42521b() {
    }

    public final int compare(Object obj, Object obj2) {
        C42405ab abVar = (C42405ab) obj;
        C42405ab abVar2 = (C42405ab) obj2;
        boolean e = C42524e.m74975e(abVar);
        double a = C42524e.m74971a(abVar);
        double b = C42524e.m74972b(abVar);
        boolean e2 = C42524e.m74975e(abVar2);
        double a2 = C42524e.m74971a(abVar2);
        double b2 = C42524e.m74972b(abVar2);
        if (true != e2) {
            a2 = b2;
        }
        if (true != e) {
            a = b;
        }
        int compare = Double.compare(a2, a);
        return compare == 0 ? Double.compare(b2, b) : compare;
    }
}
