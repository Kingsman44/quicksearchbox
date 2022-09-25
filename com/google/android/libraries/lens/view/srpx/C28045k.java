package com.google.android.libraries.lens.view.srpx;

import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.lens.view.srpx.k */
/* compiled from: PG */
public final class C28045k {

    /* renamed from: a */
    private static final Uri f76321a = Uri.parse("https://www.google.com/search");

    /* renamed from: b */
    private final String f76322b;

    public C28045k(String str) {
        this.f76322b = str;
    }

    /* renamed from: b */
    public static String m52256b(Uri uri) {
        return uri.getQueryParameter("q");
    }

    /* renamed from: d */
    public static boolean m52257d(Uri uri) {
        String queryParameter;
        String authority = uri.getAuthority();
        if (authority == null) {
            return false;
        }
        String replaceFirst = authority.replaceFirst("^www\\.", BuildConfig.FLAVOR);
        if (replaceFirst.startsWith("google.") && replaceFirst.substring(7).equals("com.hk") && (queryParameter = uri.getQueryParameter("pref")) != null) {
            return queryParameter.equals("hkredirect");
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m52258f(Uri uri) {
        return "/sorry/index".equals(uri.getPath());
    }

    /* renamed from: a */
    public final Uri mo33498a() {
        if (!mo33499c()) {
            return f76321a;
        }
        String str = this.f76322b;
        return Uri.parse("https://" + str + "/search");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo33499c() {
        return !TextUtils.isEmpty(this.f76322b);
    }

    /* renamed from: e */
    public final boolean mo33500e(Uri uri) {
        Uri a = mo33498a();
        return TextUtils.equals(a.getAuthority(), uri.getAuthority()) && TextUtils.equals(a.getPath(), uri.getPath());
    }
}
