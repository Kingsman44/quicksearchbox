package com.android.p275j.p276a;

import com.android.p275j.C5188ab;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.android.j.a.h */
/* compiled from: PG */
public final class C5178h {
    /* renamed from: a */
    public static long m14136a(String str) {
        try {
            return m14137b("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                C5188ab.m14150e("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            C5188ab.m14149d(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: b */
    public static SimpleDateFormat m14137b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
