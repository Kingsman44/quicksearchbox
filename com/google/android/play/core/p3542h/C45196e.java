package com.google.android.play.core.p3542h;

import com.evernote.android.state.BuildConfig;
import java.io.File;

/* renamed from: com.google.android.play.core.h.e */
/* compiled from: PG */
public final class C45196e {
    /* renamed from: a */
    public static String m80474a(File file) {
        if (file.getName().endsWith(".apk")) {
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", BuildConfig.FLAVOR);
            if (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) {
                return BuildConfig.FLAVOR;
            }
            if (replaceFirst.startsWith("base-")) {
                return replaceFirst.replace("base-", "config.");
            }
            return replaceFirst.replace("-", ".config.").replace(".config.master", BuildConfig.FLAVOR).replace(".config.main", BuildConfig.FLAVOR);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }
}
