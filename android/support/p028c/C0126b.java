package android.support.p028c;

import java.io.File;
import java.io.FileFilter;

/* renamed from: android.support.c.b */
/* compiled from: PG */
final class C0126b implements FileFilter {
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
