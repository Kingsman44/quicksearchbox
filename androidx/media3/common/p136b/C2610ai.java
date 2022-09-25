package androidx.media3.common.p136b;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;

/* renamed from: androidx.media3.common.b.ai */
/* compiled from: PG */
public final class C2610ai {
    /* renamed from: a */
    public static String m6915a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        int[] b = m6916b(str2);
        if (b[0] != -1) {
            sb.append(str2);
            m6917c(sb, b[1], b[2]);
            return sb.toString();
        }
        int[] b2 = m6916b(str);
        if (b[3] == 0) {
            sb.append(str, 0, b2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (b[2] == 0) {
            sb.append(str, 0, b2[2]);
            sb.append(str2);
            return sb.toString();
        } else if (b[1] != 0) {
            int i = b2[0] + 1;
            sb.append(str, 0, i);
            sb.append(str2);
            return m6917c(sb, b[1] + i, i + b[2]);
        } else if (str2.charAt(0) == '/') {
            sb.append(str, 0, b2[1]);
            sb.append(str2);
            int i2 = b2[1];
            return m6917c(sb, i2, b[2] + i2);
        } else {
            int i3 = b2[0];
            int i4 = b2[1];
            if (i3 + 2 >= i4 || i4 != b2[2]) {
                int lastIndexOf = str.lastIndexOf(47, b2[2] - 1);
                int i5 = lastIndexOf == -1 ? b2[1] : lastIndexOf + 1;
                sb.append(str, 0, i5);
                sb.append(str2);
                return m6917c(sb, b2[1], i5 + b[2]);
            }
            sb.append(str, 0, i4);
            sb.append('/');
            sb.append(str2);
            int i6 = b2[1];
            return m6917c(sb, i6, b[2] + i6 + 1);
        }
    }

    /* renamed from: b */
    public static int[] m6916b(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    /* renamed from: c */
    private static String m6917c(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }
}
