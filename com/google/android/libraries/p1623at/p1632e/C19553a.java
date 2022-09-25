package com.google.android.libraries.p1623at.p1632e;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Set;

/* renamed from: com.google.android.libraries.at.e.a */
/* compiled from: PG */
public final class C19553a {
    /* renamed from: a */
    public static int m37293a(Bundle bundle) {
        int i;
        int i2 = 0;
        if (bundle == null) {
            return 0;
        }
        Set<String> keySet = bundle.keySet();
        int size = keySet.size();
        int[] iArr = new int[(size + size)];
        for (String str : keySet) {
            int i3 = i2 + 1;
            iArr[i2] = C19555c.m37296a(str, 17);
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                i = m37293a((Bundle) obj);
            } else {
                i = C19555c.m37296a(obj, 17);
            }
            iArr[i3] = i;
            i2 = i3 + 1;
        }
        return Arrays.hashCode(iArr);
    }

    /* renamed from: b */
    public static boolean m37294b(Bundle bundle, Bundle bundle2) {
        boolean z;
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null || bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle)) {
                if (obj != null) {
                    if (obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            z = Arrays.deepEquals((Object[]) obj, (Object[]) obj2);
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            z = Arrays.equals((boolean[]) obj, (boolean[]) obj2);
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            z = Arrays.equals((byte[]) obj, (byte[]) obj2);
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            z = Arrays.equals((char[]) obj, (char[]) obj2);
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            z = Arrays.equals((double[]) obj, (double[]) obj2);
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            z = Arrays.equals((float[]) obj, (float[]) obj2);
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            z = Arrays.equals((int[]) obj, (int[]) obj2);
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            z = Arrays.equals((long[]) obj, (long[]) obj2);
                        } else if (!(obj instanceof short[]) || !(obj2 instanceof short[])) {
                            z = obj.equals(obj2);
                        } else {
                            z = Arrays.equals((short[]) obj, (short[]) obj2);
                        }
                        if (!z) {
                        }
                    }
                    return false;
                } else if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!m37294b((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
        }
        return true;
    }
}
