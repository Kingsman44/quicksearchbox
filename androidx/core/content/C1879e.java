package androidx.core.content;

import android.content.Context;
import java.io.File;

/* renamed from: androidx.core.content.e */
/* compiled from: PG */
public final class C1879e {
    /* renamed from: a */
    public static Context m5131a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    /* renamed from: b */
    public static File m5132b(Context context) {
        return context.getDataDir();
    }

    /* renamed from: c */
    static boolean m5133c(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
