package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.google.ads.interactivemedia.v3.internal.apk */
/* compiled from: PG */
public final class apk {

    /* renamed from: a */
    private final String f21355a = "ad.doubleclick.net";

    /* renamed from: b */
    private final String[] f21356b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c */
    private final apd f21357c;

    public apk(apd apd) {
        this.f21357c = apd;
    }

    /* renamed from: d */
    private final Uri m19234d(Uri uri, Context context) {
        boolean z;
        uri.getClass();
        try {
            z = uri.getHost().equals(this.f21355a);
        } catch (NullPointerException unused) {
            z = false;
        }
        if (z) {
            try {
                if (uri.toString().contains("dc_ms=")) {
                    throw new apl("Parameter already exists: dc_ms");
                }
            } catch (UnsupportedOperationException unused2) {
                throw new apl("Provided Uri is not in a valid state");
            }
        } else if (uri.getQueryParameter("ms") != null) {
            throw new apl("Query parameter already exists: ms");
        }
        String a = this.f21357c.mo15136a(context);
        if (z) {
            String uri2 = uri.toString();
            int indexOf = uri2.indexOf(";adurl");
            if (indexOf != -1) {
                int i = indexOf + 1;
                return Uri.parse(uri2.substring(0, i) + "dc_ms=" + a + ";" + uri2.substring(i));
            }
            String encodedPath = uri.getEncodedPath();
            int indexOf2 = uri2.indexOf(encodedPath);
            return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + a + ";" + uri2.substring(indexOf2 + encodedPath.length()));
        }
        String uri3 = uri.toString();
        int indexOf3 = uri3.indexOf("&adurl");
        if (indexOf3 == -1) {
            indexOf3 = uri3.indexOf("?adurl");
        }
        if (indexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", a).build();
        }
        int i2 = indexOf3 + 1;
        return Uri.parse(uri3.substring(0, i2) + "ms=" + a + "&" + uri3.substring(i2));
    }

    /* renamed from: a */
    public final boolean mo15144a(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f21356b;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: b */
    public final apd mo15145b() {
        return this.f21357c;
    }

    /* renamed from: c */
    public final Uri mo15146c(Uri uri, Context context) {
        return m19234d(uri, context);
    }
}
