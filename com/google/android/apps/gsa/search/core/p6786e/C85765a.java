package com.google.android.apps.gsa.search.core.p6786e;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.shared.p6919a.C87393a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* renamed from: com.google.android.apps.gsa.search.core.e.a */
/* compiled from: PG */
public final class C85765a {

    /* renamed from: a */
    private static final C58528ij f231921a = C58528ij.m90013M("amp_r", "amp_js_v", "amp_gsa", "usqp");

    /* renamed from: b */
    private final C85923cq f231922b;

    public C85765a(C85923cq cqVar) {
        this.f231922b = cqVar;
    }

    /* renamed from: c */
    private static C58833ax m137811c(Uri uri) {
        String queryParameter = new Uri.Builder().encodedQuery(uri.getEncodedFragment()).build().getQueryParameter("ampshare");
        return !TextUtils.isEmpty(queryParameter) ? C58833ax.m90834k(queryParameter) : C58836b.f156633a;
    }

    /* renamed from: d */
    private static String m137812d(String str, String str2) {
        if (str == null || !str.startsWith(str2)) {
            return null;
        }
        return str.substring(str2.length());
    }

    /* renamed from: a */
    public final C58833ax mo79421a(String str) {
        String str2;
        String str3;
        Uri parse = Uri.parse(str);
        String str4 = "https://";
        if (mo79422b(parse)) {
            C58833ax c = m137811c(parse);
            if (c.mo56113h()) {
                return c;
            }
            String d = m137812d(parse.getPath(), "/amp/");
            if (d == null) {
                return C58836b.f156633a;
            }
            if (d.startsWith("story/")) {
                d = d.substring(6);
            }
            String d2 = m137812d(d, "s/");
            if (d2 != null) {
                str3 = str4.concat(d2);
            } else {
                str3 = "http://".concat(String.valueOf(d));
            }
            return C58833ax.m90834k(str3);
        }
        Matcher matcher = C87393a.f235981a.matcher(str);
        if (!matcher.matches()) {
            return C58836b.f156633a;
        }
        C58833ax c2 = m137811c(parse);
        if (c2.mo56113h()) {
            return c2;
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
                if (!f231921a.contains(str2)) {
                    arrayList.add(str5);
                }
            }
            if (!arrayList.isEmpty()) {
                clearQuery.encodedQuery(TextUtils.join("&", arrayList));
            }
        }
        return C58833ax.m90834k(clearQuery.toString());
    }

    /* renamed from: b */
    public final boolean mo79422b(Uri uri) {
        String path = uri.getPath();
        return path != null && path.startsWith("/amp/") && this.f231922b.mo79555f(uri);
    }
}
