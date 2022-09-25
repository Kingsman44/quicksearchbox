package com.google.android.apps.search.googleapp.p10257g.p10259b;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.google.android.apps.search.googleapp.g.b.b */
/* compiled from: PG */
public final class C135427b {
    /* renamed from: a */
    public static Uri m219590a(String str) {
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri.Builder scheme = parse.buildUpon().scheme("https");
        if (TextUtils.isEmpty(parse.getAuthority())) {
            scheme.authority("www.google.com");
        }
        return scheme.build();
    }
}
