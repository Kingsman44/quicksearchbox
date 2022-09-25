package com.google.common.p4541l;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4536h.C59236ac;
import java.io.File;
import java.io.IOException;

/* renamed from: com.google.common.l.ad */
/* compiled from: PG */
public final class C59316ad {

    /* renamed from: a */
    public static final C59236ac f157487a = new C59313aa();

    /* renamed from: a */
    public static String m92161a(String str) {
        str.getClass();
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return BuildConfig.FLAVOR;
        }
        return name.substring(lastIndexOf + 1);
    }

    /* renamed from: b */
    public static void m92162b(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                new StringBuilder("Unable to create parent directories of ").append(file);
                throw new IOException("Unable to create parent directories of ".concat(file.toString()));
            }
        }
    }
}
