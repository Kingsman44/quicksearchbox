package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.common.base.C58890d;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ga */
/* compiled from: PG */
final class C112883ga {
    /* renamed from: a */
    public static CharSequence m186805a(int i, String str, int i2) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, i2, 17);
        return spannableString;
    }

    /* renamed from: b */
    static CharSequence m186806b(int i, String str, String str2) {
        int i2;
        String replaceAll = str.replaceAll("\\s+", " ");
        String trim = str2.replaceAll("\\s+", " ").trim();
        String[] split = TextUtils.split(replaceAll, " ");
        String[] split2 = TextUtils.split(trim, " ");
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (int i4 = 0; i4 < split2.length; i4++) {
            String str3 = split2[i4];
            while (true) {
                if (i3 >= split.length) {
                    break;
                }
                i2 = i3 + 1;
                String str4 = split[i3];
                if (i4 == split2.length - 1 && str4.toLowerCase(Locale.getDefault()).startsWith(str3.toLowerCase(Locale.getDefault()))) {
                    arrayList.add(m186805a(i, str4, str3.length()));
                    break;
                } else if (C58890d.m90990e(str4, str3)) {
                    arrayList.add(m186805a(i, str4, str4.length()));
                    break;
                } else {
                    arrayList.add(str4);
                    i3 = i2;
                }
            }
            i3 = i2;
        }
        while (i3 < split.length) {
            arrayList.add(split[i3]);
            i3++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            spannableStringBuilder.append((CharSequence) arrayList.get(i5));
            if (i5 < arrayList.size() - 1) {
                spannableStringBuilder.append(" ");
            }
        }
        return spannableStringBuilder;
    }
}
