package com.google.android.libraries.storage.p3304a.p3305a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.storage.p3304a.p3307c.C42764q;
import com.google.common.base.C58869cf;
import com.google.common.p4541l.C59326i;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.a.a.l */
/* compiled from: PG */
public final class C42725l {

    /* renamed from: a */
    public static final /* synthetic */ int f111984a = 0;

    /* renamed from: b */
    private static final C58869cf f111985b = C58869cf.m90938d(".");

    /* renamed from: a */
    static long m75485a(Uri uri) {
        String query = uri.getQuery();
        if (!TextUtils.isEmpty(query)) {
            String queryParameter = uri.getQueryParameter("expiryDateSecs");
            if (queryParameter != null) {
                return Long.parseLong(queryParameter);
            }
            throw new C42764q(String.format("The uri query is malformed, expected %s but found %s", new Object[]{"expiryDateSecs=<expiryDateSecs>", query}));
        }
        throw new C42764q(String.format("The uri query is null or empty, expected %s", new Object[]{"expiryDateSecs=<expiryDateSecs>"}));
    }

    /* renamed from: b */
    public static void m75486b(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            String str = pathSegments.get(0);
            if (f111985b.mo56155i(str).size() == 1) {
                return;
            }
            if (str.endsWith(".lease") && !TextUtils.equals(str, ".lease")) {
                return;
            }
        }
        throw new C42764q(String.format("The uri is malformed, expected %s or %s but found %s", new Object[]{"<non_empty_checksum>", "<non_empty_checksum>.lease", uri.getPath()}));
    }

    /* renamed from: c */
    public static void m75487c(Uri uri) {
        if (!TextUtils.isEmpty(uri.getQuery())) {
            if (uri.getQueryParameterNames().size() != 1 || uri.getQueryParameter("expiryDateSecs") == null) {
                throw new C42764q(String.format("The uri query is malformed, expected %s but found query %s", new Object[]{"expiryDateSecs=<expiryDateSecs>", uri.getQuery()}));
            }
        }
    }

    /* renamed from: d */
    static boolean m75488d(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return TextUtils.equals(str, "*.lease");
    }

    /* renamed from: e */
    static boolean m75489e(String str) {
        return str.endsWith(".lease");
    }

    /* renamed from: f */
    static byte[] m75490f(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return C59326i.f157519g.mo56825e().mo56836k((CharSequence) f111985b.mo56155i(str).get(0));
    }
}
