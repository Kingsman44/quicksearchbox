package com.google.android.apps.gsa.shared.util.p7191w;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.w.a */
/* compiled from: PG */
public final class C91144a {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r2 = r2.buildUpon().encodedQuery(r0).fragment(com.evernote.android.state.BuildConfig.FLAVOR).build().getQueryParameter(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m148924a(android.net.Uri r2, java.lang.String r3) {
        /*
            java.lang.String r0 = r2.getFragment()
            java.lang.String r1 = r2.getQueryParameter(r3)
            if (r0 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.encodedQuery(r0)
            java.lang.String r0 = ""
            android.net.Uri$Builder r2 = r2.fragment(r0)
            android.net.Uri r2 = r2.build()
            java.lang.String r2 = r2.getQueryParameter(r3)
            if (r2 == 0) goto L_0x0024
            return r2
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.p7191w.C91144a.m148924a(android.net.Uri, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static boolean m148925b(Uri uri, String... strArr) {
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            return false;
        }
        List i = C58869cf.m90936b(new C58903m('.')).mo56155i(authority.toLowerCase(Locale.US));
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            if (!TextUtils.isEmpty(str)) {
                List i3 = C58869cf.m90936b(new C58903m('.')).mo56155i(str.toLowerCase(Locale.US));
                if (i.size() >= i3.size() && i.subList(i.size() - i3.size(), i.size()).equals(i3)) {
                    return true;
                }
                i2++;
            } else {
                throw new IllegalArgumentException();
            }
        }
        return false;
    }
}
