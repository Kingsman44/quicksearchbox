package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.ba */
/* compiled from: PG */
public final class C143912ba {
    /* renamed from: a */
    public static boolean m233949a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!m233950b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m233950b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
