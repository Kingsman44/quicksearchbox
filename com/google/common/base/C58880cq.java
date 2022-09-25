package com.google.common.base;

import com.evernote.android.state.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.base.cq */
/* compiled from: PG */
public final class C58880cq {
    /* renamed from: c */
    public static String m90967c(String str, int i) {
        str.getClass();
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        for (int length = str.length(); length < i; length++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m90966b(String str, int i) {
        str.getClass();
        boolean z = true;
        if (i <= 1) {
            if (i < 0) {
                z = false;
            }
            C58838bb.m90871f(z, "invalid count: %s", i);
            return i == 0 ? BuildConfig.FLAVOR : str;
        }
        int length = str.length();
        long j = ((long) length) * ((long) i);
        int i2 = (int) j;
        if (((long) i2) == j) {
            char[] cArr = new char[i2];
            str.getChars(0, length, cArr, 0);
            while (true) {
                int i3 = i2 - length;
                if (length < i3) {
                    System.arraycopy(cArr, 0, cArr, length, length);
                    length += length;
                } else {
                    System.arraycopy(cArr, 0, cArr, length, i3);
                    return new String(cArr);
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j);
        }
    }

    /* renamed from: a */
    public static String m90965a(String str, Object... objArr) {
        int length;
        int indexOf;
        String str2;
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    str2 = "null";
                } else {
                    try {
                        str2 = obj.toString();
                    } catch (Exception e) {
                        String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), e);
                        str2 = "<" + str3 + " threw " + e.getClass().getName() + ">";
                    }
                }
                objArr[i2] = str2;
            }
        }
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i3)) == -1) {
                sb.append(str, i3, str.length());
            } else {
                sb.append(str, i3, indexOf);
                sb.append(objArr[i]);
                i3 = indexOf + 2;
                i++;
            }
        }
        sb.append(str, i3, str.length());
        if (i < length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
