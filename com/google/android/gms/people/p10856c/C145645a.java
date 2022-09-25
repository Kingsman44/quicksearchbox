package com.google.android.gms.people.p10856c;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C143919bh;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.people.c.a */
/* compiled from: PG */
public final class C145645a {

    /* renamed from: a */
    public static final C145645a f393872a = new C145645a();

    /* renamed from: b */
    private Pattern[] f393873b = new Pattern[0];

    /* renamed from: c */
    private String[] f393874c = new String[0];

    private C145645a() {
    }

    /* renamed from: a */
    public final synchronized String mo121683a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i = 0;
        while (true) {
            Pattern[] patternArr = this.f393873b;
            if (i >= patternArr.length) {
                return str;
            }
            str = patternArr[i].matcher(str).replaceAll(this.f393874c[i]);
            i++;
        }
    }

    /* renamed from: b */
    public final synchronized void mo121684b(String[] strArr, String[] strArr2) {
        int length = strArr.length;
        C143919bh.m233959b(length == strArr2.length);
        this.f393873b = new Pattern[length];
        this.f393874c = strArr2;
        for (int i = 0; i < strArr.length; i++) {
            this.f393873b[i] = Pattern.compile(strArr[i]);
        }
    }
}
