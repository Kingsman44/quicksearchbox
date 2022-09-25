package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.C58837ba;
import com.google.common.base.C58866cc;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import java.util.Map;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.UriUtilities */
/* compiled from: PG */
public final class UriUtilities {
    private static final String UTM_SOURCE_PARAMETER = "utm_source";
    private static final String UTM_SOURCE_VALUE = "arcore_sceneviewer";

    private UriUtilities() {
    }

    public static Uri appendQueryParametersString(Uri uri, String str) {
        if (str != null && !str.isEmpty()) {
            for (Map.Entry entry : C58866cc.m90931a(str, C58869cf.m90936b(new C58903m('&')), C58869cf.m90936b(new C58903m('='))).entrySet()) {
                if (!C58837ba.m90859h((String) entry.getKey()) && !C58837ba.m90859h((String) entry.getValue())) {
                    uri = upsertQueryParameter(uri, (String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return uri;
    }

    public static Uri copyQueryParameters(Uri uri, Uri uri2) {
        Uri.Builder clearQuery = uri2.buildUpon().clearQuery();
        if (uri.isHierarchical()) {
            for (String next : uri.getQueryParameterNames()) {
                clearQuery.appendQueryParameter(next, uri.getQueryParameter(next));
            }
        }
        return clearQuery.build();
    }

    public static String getHost(Uri uri) {
        Uri outboundLink = getOutboundLink(uri);
        if (outboundLink == null || TextUtils.isEmpty(outboundLink.getHost())) {
            return null;
        }
        String host = outboundLink.getHost();
        host.getClass();
        return host.startsWith("www.") ? host.substring(4) : host;
    }

    public static Uri getOutboundLink(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.buildUpon().appendQueryParameter(UTM_SOURCE_PARAMETER, UTM_SOURCE_VALUE).build();
    }

    public static Uri upsertQueryParameter(Uri uri, String str, String str2) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        clearQuery.appendQueryParameter(str, str2);
        for (String next : uri.getQueryParameterNames()) {
            if (!next.equals(str)) {
                clearQuery.appendQueryParameter(next, uri.getQueryParameter(next));
            }
        }
        return clearQuery.build();
    }
}
