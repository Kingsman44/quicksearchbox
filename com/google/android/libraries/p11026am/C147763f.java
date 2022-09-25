package com.google.android.libraries.p11026am;

import android.net.Uri;
import android.webkit.URLUtil;
import com.google.common.base.C58837ba;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.am.f */
/* compiled from: PG */
final class C147763f {

    /* renamed from: a */
    public static final Pattern f398708a = Pattern.compile("^data:[-\\w]+/[-+\\w]+;(charset=(utf|UTF)-8;)?base64,");

    /* renamed from: a */
    static Uri m240840a(Uri uri) {
        Uri.Builder encodedFragment = uri.buildUpon().encodedFragment((String) null);
        if (uri.isHierarchical()) {
            encodedFragment.clearQuery();
        }
        return encodedFragment.build();
    }

    /* renamed from: b */
    static void m240841b(Uri uri) {
        if (uri != null) {
            String trim = uri.toString().trim();
            if (trim.isEmpty() || C58837ba.m90859h(uri.getScheme())) {
                return;
            }
            if (!URLUtil.isNetworkUrl(trim)) {
                String.format("%s:%s", new Object[]{uri.getScheme(), "<REDACTED>"});
                return;
            }
            uri.getScheme();
            if (!C58837ba.m90859h(uri.getHost())) {
                uri.getHost();
            }
            if (uri.getPort() != -1) {
                uri.getPort();
            }
        }
    }
}
