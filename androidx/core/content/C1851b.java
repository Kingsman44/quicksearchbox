package androidx.core.content;

import android.content.Context;
import java.io.File;

/* renamed from: androidx.core.content.b */
/* compiled from: PG */
public final class C1851b {
    /* renamed from: a */
    public static File[] m5071a(Context context) {
        return context.getExternalCacheDirs();
    }

    /* renamed from: b */
    public static File[] m5072b(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    /* renamed from: c */
    static File[] m5073c(Context context) {
        return context.getObbDirs();
    }
}
