package com.google.android.apps.search.fedora.p10093b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.C60790c;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.b.d */
/* compiled from: PG */
public final class C132723d {
    /* renamed from: a */
    public static Optional m215735a(Context context, Uri uri) {
        if (uri == null || uri.getPath() == null) {
            return Optional.empty();
        }
        String str = (String) Objects.requireNonNull(uri.getPath());
        if ("appfiles".equals(uri.getScheme())) {
            return Optional.m71637of(C60790c.m92793a(context.getFilesDir().getAbsolutePath(), str));
        } else if ("appcache".equals(uri.getScheme())) {
            return Optional.m71637of(C60790c.m92793a(context.getCacheDir().getAbsolutePath(), str));
        } else if (!"appdir".equals(uri.getScheme())) {
            return Optional.empty();
        } else {
            Object[] objArr = new Object[2];
            String absolutePath = context.getDir("foo", 0).getAbsolutePath();
            objArr[0] = absolutePath.substring(0, absolutePath.length() - 3);
            if (!TextUtils.isEmpty(str) && str.startsWith("/")) {
                str = str.substring(1);
            }
            objArr[1] = str;
            return Optional.m71637of(String.format("%s%s", objArr));
        }
    }
}
