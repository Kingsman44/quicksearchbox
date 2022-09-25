package com.google.android.libraries.social.p3267c.p3268a;

import android.net.Uri;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: com.google.android.libraries.social.c.a.d */
/* compiled from: PG */
public final class C41922d {

    /* renamed from: a */
    private static final Pattern f109367a = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");

    /* renamed from: b */
    private static int f109368b;

    /* renamed from: a */
    static String m73455a(int i, int i2, String str) {
        Set<String> set;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        String str3 = null;
        if (str2 == null) {
            return null;
        }
        if (!f109367a.matcher(str2).find()) {
            str3 = str2;
            str2 = "https://images" + m73456b() + "-esmobile-opensocial.googleusercontent.com/gadgets/proxy";
        }
        Uri parse = Uri.parse(str2);
        Uri.Builder buildUpon = Uri.EMPTY.buildUpon();
        buildUpon.authority(parse.getAuthority());
        buildUpon.scheme(parse.getScheme());
        buildUpon.path(parse.getPath());
        if (!(i3 == -1 || i4 == -1)) {
            buildUpon.appendQueryParameter("resize_w", Integer.toString(i));
            buildUpon.appendQueryParameter("resize_h", Integer.toString(i2));
            buildUpon.appendQueryParameter("no_expand", "1");
        }
        Uri build = buildUpon.build();
        if (!parse.isOpaque()) {
            String encodedQuery = parse.getEncodedQuery();
            if (encodedQuery == null) {
                set = Collections.emptySet();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i5 = 0;
                do {
                    int indexOf = encodedQuery.indexOf(38, i5);
                    if (indexOf == -1) {
                        indexOf = encodedQuery.length();
                    }
                    int indexOf2 = encodedQuery.indexOf(61, i5);
                    if (indexOf2 > indexOf || indexOf2 == -1) {
                        indexOf2 = indexOf;
                    }
                    linkedHashSet.add(Uri.decode(encodedQuery.substring(i5, indexOf2)));
                    i5 = indexOf + 1;
                } while (i5 < encodedQuery.length());
                set = Collections.unmodifiableSet(linkedHashSet);
            }
            for (String str4 : set) {
                if (build.getQueryParameter(str4) == null) {
                    boolean z = true;
                    boolean z2 = "resize_w".equals(str4) || "resize_h".equals(str4) || "no_expand".equals(str4);
                    if (!(i3 == -1 || i4 == -1)) {
                        z = false;
                    }
                    Uri.Builder buildUpon2 = build.buildUpon();
                    if ("url".equals(str4)) {
                        buildUpon2.appendQueryParameter("url", parse.getQueryParameter("url"));
                    } else if (!z || !z2) {
                        for (String appendQueryParameter : parse.getQueryParameters(str4)) {
                            buildUpon2.appendQueryParameter(str4, appendQueryParameter);
                        }
                    }
                    build = buildUpon2.build();
                }
            }
            if (str3 != null && build.getQueryParameter("url") == null) {
                Uri.Builder buildUpon3 = build.buildUpon();
                buildUpon3.appendQueryParameter("url", str3);
                build = buildUpon3.build();
            }
            if (build.getQueryParameter("container") == null) {
                Uri.Builder buildUpon4 = build.buildUpon();
                buildUpon4.appendQueryParameter("container", "esmobile");
                build = buildUpon4.build();
            }
            if (build.getQueryParameter("gadget") == null) {
                Uri.Builder buildUpon5 = build.buildUpon();
                buildUpon5.appendQueryParameter("gadget", "a");
                build = buildUpon5.build();
            }
            if (build.getQueryParameter("rewriteMime") == null) {
                Uri.Builder buildUpon6 = build.buildUpon();
                buildUpon6.appendQueryParameter("rewriteMime", "image/*");
                build = buildUpon6.build();
            }
            return build.toString();
        }
        throw new UnsupportedOperationException("This isn't a hierarchical URI.");
    }

    /* renamed from: b */
    private static synchronized int m73456b() {
        int i;
        synchronized (C41922d.class) {
            i = f109368b + 1;
            f109368b = i % 3;
        }
        return i;
    }
}
