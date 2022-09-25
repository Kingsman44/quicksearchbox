package com.google.android.gms.location.p10842a;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.google.android.gms.location.a.a */
/* compiled from: PG */
public final class C144869a {

    /* renamed from: a */
    public static final StringBuilder f391808a = new StringBuilder(33);

    static {
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ROOT);
        new SimpleDateFormat("MM-dd HH:mm:ss", Locale.ROOT);
    }

    /* renamed from: a */
    public static void m235460a(long j, StringBuilder sb) {
        if (j == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z = false;
        if (j < 0) {
            sb.append("-");
            if (j != Long.MIN_VALUE) {
                j = -j;
            } else {
                j = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j >= 86400000) {
            sb.append(j / 86400000);
            sb.append("d");
            j %= 86400000;
        }
        if (z) {
            j = 25975808;
        }
        if (j >= 3600000) {
            sb.append(j / 3600000);
            sb.append(C19618h.f54585a);
            j %= 3600000;
        }
        if (j >= 60000) {
            sb.append(j / 60000);
            sb.append("m");
            j %= 60000;
        }
        if (j >= 1000) {
            sb.append(j / 1000);
            sb.append(C59002s.f156871a);
            j %= 1000;
        }
        if (j > 0) {
            sb.append(j);
            sb.append("ms");
        }
    }
}
