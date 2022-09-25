package com.google.android.gms.common.p10780c;

import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;
import java.util.Locale;

/* renamed from: com.google.android.gms.common.c.a */
/* compiled from: PG */
public class C143858a {

    /* renamed from: a */
    public final String f389952a;

    /* renamed from: b */
    public final int f389953b;

    /* renamed from: c */
    private final String f389954c;

    public C143858a(String str, String str2) {
        this.f389954c = str2;
        this.f389952a = str;
        int i = 2;
        C143919bh.m233961d(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i <= 7 && !Log.isLoggable(this.f389952a, i)) {
            i++;
        }
        this.f389953b = i;
    }

    /* renamed from: a */
    public static String m233840a(String... strArr) {
        if (strArr.length == 0) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i <= 0; i++) {
            String str = strArr[i];
            if (sb.length() > 1) {
                sb.append(",");
            }
            sb.append(str);
        }
        sb.append("] ");
        return sb.toString();
    }

    /* renamed from: b */
    public final String mo119305b(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f389954c.concat(str);
    }

    /* renamed from: c */
    public final void mo119306c(String str, Throwable th, Object... objArr) {
        Log.e(this.f389952a, mo119305b(str, objArr), th);
    }

    /* renamed from: d */
    public final void mo119307d(String str, Object... objArr) {
        Log.w(this.f389952a, mo119305b(str, objArr));
    }

    /* renamed from: e */
    public final void mo119308e(String str, Throwable th, Object... objArr) {
        Log.w(this.f389952a, mo119305b(str, objArr), th);
    }
}
