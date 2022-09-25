package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.q */
/* compiled from: PG */
final class C93285q implements FileFilter {
    public final boolean accept(File file) {
        return file.isFile() && file.length() > 102400;
    }
}
