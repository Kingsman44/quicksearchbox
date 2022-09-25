package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143912ba;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.mobiledataplan.a */
/* compiled from: PG */
public final class C145511a {
    /* renamed from: a */
    public static int m236574a(Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        Set<String> keySet = bundle.keySet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : keySet) {
            linkedHashSet.add(bundle.get(str));
        }
        return Arrays.hashCode(new Object[]{keySet, linkedHashSet});
    }

    /* renamed from: b */
    public static boolean m236575b(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null) != (bundle2 == null) || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!(obj2 instanceof Bundle) || !m236575b((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                    return false;
                }
                for (int i = 0; i < length; i++) {
                    if (!C143912ba.m233950b(Array.get(obj, i), Array.get(obj2, i))) {
                        return false;
                    }
                }
                continue;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }
}
