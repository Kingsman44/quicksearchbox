package com.google.android.apps.search.p8936a.p8937a;

import android.net.Uri;
import android.text.TextUtils;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.a.a.p */
/* compiled from: PG */
public final class C119180p {
    /* renamed from: a */
    public static final Optional m197878a(String str, Uri uri) {
        String queryParameter = uri.getQueryParameter(str);
        return TextUtils.isEmpty(queryParameter) ? Optional.empty() : Optional.m71637of(queryParameter);
    }
}
