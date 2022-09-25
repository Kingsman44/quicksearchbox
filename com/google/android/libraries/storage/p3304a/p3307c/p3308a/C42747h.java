package com.google.android.libraries.storage.p3304a.p3307c.p3308a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.C58827ar;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.storage.a.c.a.h */
/* compiled from: PG */
public final class C42747h {

    /* renamed from: a */
    private static final Pattern f112007a = Pattern.compile("(\\w+).*");

    /* renamed from: a */
    public static C58485gu m75524a(Uri uri) {
        C58485gu guVar;
        C58480gp e = C58485gu.m89837e();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            guVar = C58485gu.m89845m();
        } else {
            guVar = C58485gu.m89841i(C58869cf.m90938d("+").mo56151a().mo56153g(encodedFragment.substring(10)));
        }
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            String str = (String) guVar.get(i);
            Matcher matcher = f112007a.matcher(str);
            if (matcher.matches()) {
                e.mo55395g(matcher.group(1));
                i++;
            } else {
                throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(str)));
            }
        }
        return e.mo55394f();
    }

    /* renamed from: b */
    public static String m75525b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return "transform=".concat(new C58827ar("+").mo56097d(list));
    }
}
