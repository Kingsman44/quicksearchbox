package com.google.android.libraries.gsa.p1859d.p1861b;

import android.os.Bundle;
import com.google.common.base.C58832aw;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.libraries.gsa.d.b.e */
/* compiled from: PG */
public final class C22759e {
    /* renamed from: a */
    public static boolean m42470a(Bundle bundle, Bundle bundle2, String... strArr) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null || bundle2 == null) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.equals(bundle2.keySet())) {
            return false;
        }
        List asList = Arrays.asList(strArr);
        for (String str : keySet) {
            if (!asList.contains(str) && !C58832aw.m90831a(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }
}
