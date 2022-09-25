package com.google.android.libraries.assistant.trainingcache.p1618c;

import android.content.Context;
import android.net.Uri;
import com.google.common.base.C58837ba;
import java.io.File;

/* renamed from: com.google.android.libraries.assistant.trainingcache.c.d */
/* compiled from: PG */
public final class C19443d {
    /* renamed from: a */
    public static File m37133a(Context context, Uri uri) {
        String scheme = uri.getScheme();
        String path = uri.getPath();
        if (C58837ba.m90859h(scheme) || C58837ba.m90859h(path)) {
            throw new IllegalArgumentException("Invalid uri.");
        } else if ("appfiles".equals(scheme)) {
            return new File(context.getFilesDir(), path);
        } else {
            if ("appcache".equals(scheme)) {
                return new File(context.getCacheDir(), path);
            }
            if ("appdir".equals(scheme)) {
                while (path.startsWith("/")) {
                    path = path.substring(1);
                }
                String[] split = path.split("/", 2);
                int length = split.length;
                if (length == 1) {
                    return context.getDir(split[0], 0);
                }
                if (length == 2) {
                    return new File(context.getDir(split[0], 0), split[1]);
                }
                throw new IllegalArgumentException("Invalid uri of APP_DIR_SCHEME.");
            }
            throw new IllegalArgumentException("Invalid uri scheme.");
        }
    }
}
