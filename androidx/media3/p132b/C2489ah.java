package androidx.media3.p132b;

import android.text.TextUtils;
import androidx.media3.common.p136b.C2633u;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.b.ah */
/* compiled from: PG */
public final class C2489ah {

    /* renamed from: a */
    private static final Pattern f6835a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b */
    private static final Pattern f6836b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: a */
    public static long m6552a(String str, String str2) {
        long j = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                C2633u.m7048c("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j;
        }
        Matcher matcher = f6835a.matcher(str2);
        if (!matcher.matches()) {
            return j;
        }
        try {
            String group = matcher.group(2);
            group.getClass();
            long parseLong = Long.parseLong(group);
            String group2 = matcher.group(1);
            group2.getClass();
            long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
            if (j < 0) {
                return parseLong2;
            }
            if (j == parseLong2) {
                return j;
            }
            C2633u.m7050e("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j, parseLong2);
        } catch (NumberFormatException unused2) {
            C2633u.m7048c("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j;
        }
    }

    /* renamed from: b */
    public static long m6553b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        Matcher matcher = f6836b.matcher(str);
        if (!matcher.matches()) {
            return -1;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    /* renamed from: c */
    public static String m6554c(long j, long j2) {
        if (j == 0) {
            if (j2 == -1) {
                return null;
            }
            j = 0;
        }
        StringBuilder sb = new StringBuilder("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }
}
