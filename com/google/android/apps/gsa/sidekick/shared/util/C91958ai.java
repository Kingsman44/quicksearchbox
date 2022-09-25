package com.google.android.apps.gsa.sidekick.shared.util;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.C90759bc;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58570jy;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.ai */
/* compiled from: PG */
public final class C91958ai {

    /* renamed from: a */
    private static final C58827ar f256453a = new C58827ar("/");

    /* renamed from: b */
    private static final Pattern f256454b = Pattern.compile(String.format("^%s", new Object[]{"((http(s)?):)?\\/\\/((((lh[3-6](-tt|-d[a-g,z]|-testonly)?\\.((ggpht)|(googleusercontent)|(google)|(sandbox\\.google)))|(([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))|(ccp-lh\\.googleusercontent)|((((cp|ci|gp)[3-6])|(ap[1-2]))\\.(ggpht|googleusercontent))|(gm[1-4]\\.ggpht)|(play-(ti-)?lh\\.googleusercontent)|(gz0\\.googleusercontent)|(((yt[3-4])|(sp[1-3]))\\.(ggpht|googleusercontent)))\\.com)|(dp[3-6]\\.googleusercontent\\.cn)|(lh[3-6]\\.(googleadsserving\\.cn|xn--9kr7l\\.com))|(photos\\-image\\-(dev|qa)(-auth)?\\.corp\\.google\\.com)|((dev|dev2|dev3|qa|qa2|qa3|qa-red|qa-blue|canary)[-.]lighthouse\\.sandbox\\.google\\.com\\/image)|(image\\-(dev|qa)\\-lighthouse(-auth)?\\.sandbox\\.google\\.com(\\/image)?))\\/"}));

    /* renamed from: a */
    public static Uri m150911a(String str, Uri uri) {
        boolean z;
        C90759bc a = C90759bc.m148247a(uri.getPath(), '/');
        ArrayList arrayList = new ArrayList();
        C58570jy.m90163o(arrayList, a);
        int size = arrayList.size();
        boolean z2 = true;
        if (arrayList.size() > 1 && ((String) arrayList.get(0)).equals("image")) {
            size--;
        }
        if (size >= 4 && size <= 6) {
            String path = uri.getPath();
            C90759bc a2 = C90759bc.m148247a(path, '/');
            ArrayList arrayList2 = new ArrayList();
            C58570jy.m90163o(arrayList2, a2);
            if (arrayList2.isEmpty() || !((String) arrayList2.get(0)).equals("image")) {
                z = false;
            } else {
                arrayList2.remove(0);
                z = true;
            }
            int size2 = arrayList2.size();
            boolean endsWith = path.endsWith("/");
            if (endsWith || size2 != 5) {
                z2 = false;
            } else {
                size2 = 5;
            }
            if (z2) {
                arrayList2.add((String) arrayList2.get(4));
            }
            if (size2 == 4) {
                arrayList2.add(str);
            } else {
                arrayList2.set(4, str);
            }
            if (z) {
                arrayList2.add(0, "image");
            }
            if (endsWith) {
                arrayList2.add(BuildConfig.FLAVOR);
            }
            return uri.buildUpon().path("/".concat(f256453a.mo56097d(arrayList2))).build();
        } else if (size != 1 && size != 2) {
            return uri;
        } else {
            C90759bc a3 = C90759bc.m148247a(uri.getPath(), '=');
            ArrayList arrayList3 = new ArrayList();
            C58570jy.m90163o(arrayList3, a3);
            return uri.buildUpon().path(((String) arrayList3.get(0)) + "=" + str).build();
        }
    }

    /* renamed from: b */
    public static Uri m150912b(int i, int i2, String str) {
        return m150911a(String.format(Locale.US, "w%d-h%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), Uri.parse(str));
    }

    /* renamed from: c */
    public static Uri m150913c(String str, String str2) {
        return m150911a(str, Uri.parse(str2));
    }

    /* renamed from: d */
    public static boolean m150914d(String str) {
        if (str == null) {
            return false;
        }
        return f256454b.matcher(str).find();
    }
}
