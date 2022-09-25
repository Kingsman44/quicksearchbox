package com.google.android.apps.gsa.shared.util.p7173k;

import android.text.TextUtils;
import com.google.common.p4575r.C60757n;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.shared.util.k.b */
/* compiled from: PG */
public final class C91047b {
    /* renamed from: a */
    public static Integer[] m148722a(TextUtils.StringSplitter stringSplitter, String str) {
        Integer n;
        Integer[] numArr = new Integer[4];
        stringSplitter.setString(str);
        Iterator it = stringSplitter.iterator();
        int i = 0;
        while (it.hasNext() && (n = C60757n.m92753n((String) it.next())) != null) {
            if (n.intValue() >= 0) {
                numArr[i] = n;
                i++;
                if (i >= 4) {
                    break;
                }
            } else {
                throw new IllegalArgumentException("Invalid version string format: ".concat(String.valueOf(str)));
            }
        }
        if (numArr[0] != null && numArr[1] != null) {
            return numArr;
        }
        throw new IllegalArgumentException("Invalid version string format: ".concat(String.valueOf(str)));
    }
}
