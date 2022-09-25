package com.google.android.libraries.componentview.p1699f;

import android.util.Log;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20599bz;
import com.google.android.libraries.componentview.services.application.C20601ca;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.libraries.componentview.f.h */
/* compiled from: PG */
public final class C20520h {
    /* renamed from: a */
    protected static String m38496a(String str, Object... objArr) {
        if (str == null) {
            return "null";
        }
        if (objArr.length == 0) {
            return str;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{objArr[i]});
                objArr[i] = deepToString.substring(1, deepToString.length() - 1);
            }
        }
        try {
            return String.format(Locale.US, str, objArr);
        } catch (IllegalFormatException unused) {
            return str.concat(String.valueOf(Arrays.toString(objArr)));
        }
    }

    /* renamed from: b */
    public static void m38497b(int i, String str, Throwable th, String str2, Object... objArr) {
        if (str.length() > 23) {
            String substring = str.substring(0, 23);
            m38497b(5, substring, (Throwable) null, "Tag [%s] is too long; truncated to [%s]", str, substring);
            str = substring;
        }
        if (Log.isLoggable(str, i)) {
            String a = m38496a(str2, objArr);
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (th != null) {
                            Log.e(str, a, th);
                        } else {
                            Log.e(str, a);
                        }
                    } else if (th != null) {
                        Log.w(str, a, th);
                    } else {
                        Log.w(str, a);
                    }
                } else if (th != null) {
                    Log.i(str, a, th);
                } else {
                    Log.i(str, a);
                }
            } else if (th != null) {
                Log.d(str, a, th);
            } else {
                Log.d(str, a);
            }
        }
    }

    /* renamed from: c */
    public static void m38498c(String str, C20599bz bzVar, C20601ca caVar, Object... objArr) {
        if (caVar != null) {
            if (C20482m.m38447o(bzVar.mo25539c())) {
                C20598by b = bzVar.mo25538b();
                b.mo25533c(str);
                bzVar = b.mo25531a();
            }
            caVar.mo25487b(bzVar);
        }
        String e = bzVar.mo25541e();
        if (bzVar.mo25540d() != null) {
            e = e + "\n" + bzVar.mo25540d();
        }
        m38497b(5, str, bzVar.mo25543g(), e, objArr);
    }

    /* renamed from: d */
    public static void m38499d(boolean z, String str, C20599bz bzVar, C20601ca caVar, Object... objArr) {
        if (!z) {
            m38498c(str, bzVar, caVar, objArr);
            return;
        }
        throw new RuntimeException(bzVar.mo25543g());
    }
}
