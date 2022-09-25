package com.google.android.libraries.searchbox.shared.p3202c;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.searchbox.shared.c.a */
/* compiled from: PG */
public class C41643a {

    /* renamed from: c */
    public static final Pattern f108856c = Pattern.compile("<(/?b)>");

    /* renamed from: a */
    private final void m73037a(SpannableStringBuilder spannableStringBuilder, String str, boolean z, boolean z2) {
        if (!str.isEmpty()) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(str);
            spannableStringBuilder.setSpan(mo44235b(z, z2), length, spannableStringBuilder.length(), 0);
            spannableStringBuilder.setSpan(mo44236c(z), length, spannableStringBuilder.length(), 0);
        }
    }

    /* renamed from: g */
    public static final String m73038g(String str) {
        String obj = Html.fromHtml(str).toString();
        return str.startsWith(" ") ? " ".concat(String.valueOf(obj)) : obj;
    }

    /* renamed from: b */
    public ForegroundColorSpan mo44235b(boolean z, boolean z2) {
        return new ForegroundColorSpan(true != z ? -9013642 : -14606047);
    }

    /* renamed from: c */
    public StyleSpan mo44236c(boolean z) {
        return new StyleSpan(0);
    }

    /* renamed from: d */
    public final Spanned mo44237d(String str, String str2, boolean z) {
        int i;
        ArrayList arrayList;
        boolean z2;
        int i2;
        char c;
        String str3 = str;
        boolean z3 = z;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sb = new StringBuilder();
        ArrayList c2 = C58597ky.m90212c(str3.split("[\\s\\_\\.\\/\\'\",]"));
        ArrayList c3 = C58597ky.m90212c(str2.split("[\\s\\_\\.\\/\\'\",]"));
        int size = c2.size();
        int i3 = 0;
        int i4 = 0;
        boolean z4 = false;
        int i5 = 0;
        while (i4 < size) {
            String str4 = (String) c2.get(i4);
            if (TextUtils.isEmpty(str4)) {
                arrayList = c2;
                i = size;
            } else {
                if (str3.charAt(i5) != str4.charAt(i3)) {
                    int i6 = i5;
                    while (str3.charAt(i6) != str4.charAt(i3)) {
                        i6++;
                    }
                    sb.append(str3.substring(i5, i6));
                    i5 = i6;
                }
                i5 += str4.length();
                int i7 = -1;
                int i8 = 0;
                char c4 = 0;
                while (true) {
                    arrayList = c2;
                    if (i8 >= c3.size()) {
                        break;
                    }
                    String str5 = (String) c3.get(i8);
                    if (!TextUtils.isEmpty(str5)) {
                        String lowerCase = str4.toLowerCase(Locale.US);
                        i2 = size;
                        String lowerCase2 = str5.toLowerCase(Locale.US);
                        if (lowerCase.equals(lowerCase2)) {
                            c = 2;
                        } else {
                            c = lowerCase.startsWith(lowerCase2) ? (char) 1 : 0;
                        }
                        if (c > c4) {
                            c4 = c;
                            i7 = i8;
                        }
                    } else {
                        i2 = size;
                    }
                    i8++;
                    c2 = arrayList;
                    size = i2;
                }
                i = size;
                if ((c4 == 0) != z4) {
                    m73037a(spannableStringBuilder, sb.toString(), z4, z3);
                    z2 = false;
                    sb.setLength(0);
                } else {
                    z2 = false;
                }
                if (c4 == 2) {
                    sb.append(str4);
                    c3.remove(i7);
                    z4 = false;
                } else {
                    if (c4 == 1) {
                        int length = ((String) c3.get(i7)).length();
                        sb.append(str4, z2 ? 1 : 0, length);
                        m73037a(spannableStringBuilder, sb.toString(), z2, z3);
                        sb.setLength(z2);
                        sb.append(str4, length, str4.length());
                        c3.remove(i7);
                    } else {
                        sb.append(str4);
                    }
                    z4 = true;
                }
            }
            i4++;
            c2 = arrayList;
            size = i;
            i3 = 0;
        }
        m73037a(spannableStringBuilder, sb.toString(), z4, z3);
        if (i5 < str.length()) {
            m73037a(spannableStringBuilder, str3.substring(i5, str.length()), true, z3);
        }
        return spannableStringBuilder;
    }

    /* renamed from: e */
    public final Spanned mo44238e(String str) {
        return mo44239f(str, true, false);
    }

    /* renamed from: f */
    public final Spanned mo44239f(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = f108856c.matcher(str);
        int i = 0;
        boolean z3 = false;
        while (matcher.find()) {
            if (z) {
                str3 = m73038g(str.substring(i, matcher.start()));
            } else {
                str3 = str.substring(i, matcher.start());
            }
            m73037a(spannableStringBuilder, str3, z3, z2);
            i = matcher.end();
            z3 = !z3;
        }
        if (z) {
            str2 = m73038g(str.substring(i));
        } else {
            str2 = str.substring(i);
        }
        m73037a(spannableStringBuilder, str2, z3, z2);
        return spannableStringBuilder;
    }
}
