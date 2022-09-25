package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.C1882h;
import androidx.core.p094f.C1888a;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: androidx.core.app.g */
/* compiled from: PG */
public final class C1820g extends C1882h {
    /* renamed from: a */
    public static void m4991a(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 >= length) {
                int size = hashSet.size();
                String[] strArr2 = size > 0 ? new String[(length - size)] : strArr;
                if (size > 0) {
                    if (size != length) {
                        int i3 = 0;
                        for (int i4 = 0; i4 < strArr.length; i4++) {
                            if (!hashSet.contains(Integer.valueOf(i4))) {
                                strArr2[i3] = strArr[i4];
                                i3++;
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (activity instanceof C1819f) {
                    ((C1819f) activity).mo542g();
                }
                C1810b.m4978b(activity, strArr, i);
                return;
            } else if (!TextUtils.isEmpty(strArr[i2])) {
                if (!C1888a.m5150d() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
                i2++;
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
    }

    /* renamed from: b */
    public static boolean m4992b(Activity activity, String str) {
        if (!C1888a.m5150d() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 32) {
            return C1818e.m4989a(activity, str);
        }
        if (Build.VERSION.SDK_INT == 31) {
            return C1817d.m4988b(activity, str);
        }
        return C1810b.m4979c(activity, str);
    }
}
