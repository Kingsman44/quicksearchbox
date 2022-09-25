package com.google.android.apps.search.googleapp.recents;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58528ij;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.recents.m */
/* compiled from: PG */
public final class C137179m {

    /* renamed from: a */
    private static final C58528ij f373277a = C58528ij.m90013M("amp_r", "amp_js_v", "amp_gsa", "usqp");

    /* renamed from: a */
    public static Optional m222964a(String str) {
        String str2;
        String str3;
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        String str4 = "https://";
        if (path != null && path.startsWith("/amp/")) {
            String authority = parse.getAuthority();
            if (!TextUtils.isEmpty(authority)) {
                List i = C58869cf.m90936b(new C58903m('.')).mo56155i(authority.toLowerCase(Locale.US));
                String[] strArr = {"google.com", "google.com.hk"};
                int i2 = 0;
                while (i2 < 2) {
                    List i3 = C58869cf.m90936b(new C58903m('.')).mo56155i(strArr[i2]);
                    if (i.size() < i3.size() || !i.subList(i.size() - i3.size(), i.size()).equals(i3)) {
                        i2++;
                    } else {
                        Optional b = m222965b(parse);
                        if (b.isPresent()) {
                            return b;
                        }
                        String c = m222966c(parse.getPath(), "/amp/");
                        if (c != null && c.startsWith("story/")) {
                            c = c.substring(6);
                        }
                        String c2 = m222966c(c, "s/");
                        if (c2 != null) {
                            str3 = str4.concat(c2);
                        } else {
                            str3 = "http://".concat(String.valueOf(c));
                        }
                        return Optional.m71637of(str3);
                    }
                }
            }
        }
        Matcher matcher = C137158a.f373217a.matcher(str);
        if (!matcher.matches()) {
            return Optional.empty();
        }
        Optional b2 = m222965b(parse);
        if (b2.isPresent()) {
            return b2;
        }
        if (matcher.group(2) == null) {
            str4 = "http://";
        }
        Uri.Builder clearQuery = Uri.parse(str4.concat(String.valueOf(matcher.group(3)))).buildUpon().fragment((String) null).clearQuery();
        if (parse.getEncodedQuery() != null) {
            ArrayList arrayList = new ArrayList(r4);
            for (String str5 : parse.getEncodedQuery().split("&", -1)) {
                int indexOf = str5.indexOf(61);
                if (indexOf == -1) {
                    str2 = str5;
                } else {
                    str2 = str5.substring(0, indexOf);
                }
                if (!f373277a.contains(str2)) {
                    arrayList.add(str5);
                }
            }
            if (!arrayList.isEmpty()) {
                clearQuery.encodedQuery(TextUtils.join("&", arrayList));
            }
        }
        return Optional.m71637of(clearQuery.toString());
    }

    /* renamed from: b */
    private static Optional m222965b(Uri uri) {
        String encodedFragment = uri.getEncodedFragment();
        Uri.Builder builder = new Uri.Builder();
        if (encodedFragment != null) {
            builder.encodedQuery(encodedFragment);
        }
        String queryParameter = builder.build().getQueryParameter("ampshare");
        if (!TextUtils.isEmpty(queryParameter)) {
            return Optional.m71637of(queryParameter);
        }
        return Optional.empty();
    }

    /* renamed from: c */
    private static String m222966c(String str, String str2) {
        if (str == null || !str.startsWith(str2)) {
            return null;
        }
        return str.substring(str2.length());
    }
}
