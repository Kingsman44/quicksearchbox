package androidx.core.content;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* renamed from: androidx.core.content.c */
/* compiled from: PG */
public final class C1877c {
    /* renamed from: a */
    public static Drawable m5125a(Context context, int i) {
        return context.getDrawable(i);
    }

    /* renamed from: b */
    static File m5126b(Context context) {
        return context.getCodeCacheDir();
    }

    /* renamed from: c */
    public static File m5127c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
