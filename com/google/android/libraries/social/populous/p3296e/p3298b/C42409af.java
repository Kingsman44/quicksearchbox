package com.google.android.libraries.social.populous.p3296e.p3298b;

import com.google.android.libraries.social.populous.p3296e.C42549n;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.social.populous.e.b.af */
/* compiled from: PG */
public final /* synthetic */ class C42409af implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ C42549n f111232a;

    public /* synthetic */ C42409af(C42549n nVar) {
        this.f111232a = nVar;
    }

    public final int compare(Object obj, Object obj2) {
        C42549n nVar = this.f111232a;
        boolean d = C42415al.m74701d((C42405ab) obj, nVar);
        boolean d2 = C42415al.m74701d((C42405ab) obj2, nVar);
        if (d) {
            if (!d2) {
                return -1;
            }
            d2 = true;
        }
        return (d || !d2) ? 0 : 1;
    }
}
