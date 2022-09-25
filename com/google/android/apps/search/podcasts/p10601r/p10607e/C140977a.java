package com.google.android.apps.search.podcasts.p10601r.p10607e;

import android.net.Uri;
import android.util.Base64;
import com.google.p4225bm.p4226a.p4227a.C56109b;
import com.google.p4225bm.p4229c.C56113b;

/* renamed from: com.google.android.apps.search.podcasts.r.e.a */
/* compiled from: PG */
public final class C140977a {

    /* renamed from: a */
    private static final C56109b f382760a = C56109b.f149462g;

    /* renamed from: a */
    public static Uri m228932a(C56113b bVar, String str, String str2) {
        C56109b bVar2 = f382760a;
        Uri.Builder appendQueryParameter = Uri.parse(bVar2.f149464a).buildUpon().appendPath(bVar2.f149466c).appendPath(m228933b(str)).appendQueryParameter(bVar2.f149465b, Integer.toString(bVar.f149497u));
        if (str2 != null) {
            appendQueryParameter.appendPath(bVar2.f149467d).appendPath(m228933b(str2));
        }
        return appendQueryParameter.build();
    }

    /* renamed from: b */
    public static String m228933b(String str) {
        return Base64.encodeToString(str.getBytes(), 11);
    }
}
